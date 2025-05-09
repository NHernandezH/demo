package com.example.demo.controller;

import com.example.demo.model.dto.AppointmentDTO;
import com.example.demo.service.IAppointmentsService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/appointments")
public class appointments {

    private final IAppointmentsService appointmentsService;

    public appointments(IAppointmentsService appointmentsService) {
        this.appointmentsService = appointmentsService;
    }

    @GetMapping("/register")
    public String register(Model model){
        return "appointment/register :: content";
    }

    @GetMapping("/check")
    public String check(Model model){
        return "appointment/check :: content";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("appointment") AppointmentDTO appointment,
                                        BindingResult result,
                                        Model model) {
        if (result.hasErrors()) {
            System.out.println("hay errores");
            return "appointment/register :: content";
        }

        appointmentsService.save(appointment);
        model.addAttribute("message", "Cita guardada correctamente");
        model.addAttribute("appointment", new AppointmentDTO());
        return "appointment/register :: content";
    }
}
