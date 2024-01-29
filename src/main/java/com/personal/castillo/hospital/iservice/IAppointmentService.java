package com.personal.castillo.hospital.iservice;

import java.time.LocalDateTime;
import java.util.List;

import com.personal.castillo.hospital.dto.AppointmentDTO;

public interface IAppointmentService {
    
    public List<AppointmentDTO> getAllAppointments();

    public List<AppointmentDTO> getAppointmentsBySchedule(LocalDateTime dateToSearch);

    public List<AppointmentDTO> getAppointmentsByDoctoroOffice(int officeNumber);

    public List<AppointmentDTO> getAppointmentsByDoctorsName(String doctorsName);

    public boolean deleteAppointment(long idAppointment);

}
