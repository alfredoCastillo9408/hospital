package com.personal.castillo.hospital.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "schedule")
    private LocalDateTime schedule;
    @Column(name = "patient")
    private String patient;

    @ManyToOne
    @JoinColumn(name = "iddoctoroffice")
    private long idDoctorOffice;

    @ManyToOne
    @JoinColumn(name = "iddoctor")
    private long idDoctor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getSchedule() {
        return schedule;
    }

    public void setSchedule(LocalDateTime schedule) {
        this.schedule = schedule;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public long getIdDoctorOffice() {
        return idDoctorOffice;
    }

    public void setIdDoctorOffice(long idDoctorOffice) {
        this.idDoctorOffice = idDoctorOffice;
    }

    public long getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(long idDoctor) {
        this.idDoctor = idDoctor;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Appointment other = (Appointment) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Appointment [id=" + id + ", schedule=" + schedule + ", patient=" + patient + ", idDoctorOffice="
                + idDoctorOffice + ", idDoctor=" + idDoctor + "]";
    }

}
