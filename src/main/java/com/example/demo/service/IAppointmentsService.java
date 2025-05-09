package com.example.demo.service;

import com.example.demo.model.dto.AppointmentDTO;
import com.example.demo.model.dto.AppointmentsFilterQueryDTO;

public interface IAppointmentsService {

    void save(AppointmentDTO appointment);

    void findByParams(AppointmentsFilterQueryDTO appointmentsFilterQuery);

}
