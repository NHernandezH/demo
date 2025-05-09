package com.example.demo.model.dto;

import lombok.Data;

import java.util.Date;


public class AppointmentDTO {

    private Date initDate;
    private Date endDate;
    private Integer doctorId;
    private Integer surgeryId;
    private String patientName;

    public Date getInitDate() {
        return initDate;
    }

    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getSurgeryId() {
        return surgeryId;
    }

    public void setSurgeryId(Integer surgeryId) {
        this.surgeryId = surgeryId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
