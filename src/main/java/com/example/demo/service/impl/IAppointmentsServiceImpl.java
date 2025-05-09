package com.example.demo.service.impl;

import com.example.demo.model.dto.AppointmentDTO;
import com.example.demo.model.dto.AppointmentsFilterQueryDTO;
import com.example.demo.service.IAppointmentsService;
import org.springframework.stereotype.Service;

@Service
public class IAppointmentsServiceImpl implements IAppointmentsService {
    @Override
    public void save(AppointmentDTO appointment) {
        System.out.println("guardando cita");
    }

    @Override
    public void findByParams(AppointmentsFilterQueryDTO appointmentsFilterQuery) {

    }
}
