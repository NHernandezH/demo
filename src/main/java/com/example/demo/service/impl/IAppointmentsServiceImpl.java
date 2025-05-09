package com.example.demo.service.impl;

import com.example.demo.model.dto.AppointmentDTO;
import com.example.demo.model.dto.AppointmentsFilterQueryDTO;
import com.example.demo.repository.AppointmentsRepository;
import com.example.demo.service.IAppointmentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class IAppointmentsServiceImpl implements IAppointmentsService {

    private final AppointmentsRepository appointmentsRepository;

    public IAppointmentsServiceImpl(AppointmentsRepository appointmentsRepository) {
        this.appointmentsRepository = appointmentsRepository;
    }

    @Override
    public void save(AppointmentDTO appointment) {
        System.out.println("guardando cita");
        appointmentsRepository.count();

    }

    @Override
    public void findByParams(AppointmentsFilterQueryDTO appointmentsFilterQuery) {

    }
}
