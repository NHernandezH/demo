package com.example.demo.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class AppointmentDTO {

    private Date initDate;
    private Date endDate;
    private Integer doctorId;
    private Integer surgeryId;
    private String patientName;

}
