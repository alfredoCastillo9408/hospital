package com.personal.castillo.hospital.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.castillo.hospital.dto.AppointmentDTO;
import com.personal.castillo.hospital.iservice.IAppointmentService;
import com.personal.castillo.hospital.model.Appointment;
import com.personal.castillo.hospital.repository.AppointmentRepository;

@Service
public class AppointmentService implements IAppointmentService{

    @Autowired
    AppointmentRepository _repository;

    @Override
    public List<AppointmentDTO> getAllAppointments() {
        Iterable<Appointment> app = _repository.findAll();

        return new ArrayList<>();
    }

    @Override
    public List<AppointmentDTO> getAppointmentsBySchedule(LocalDateTime dateToSearch) {
        throw new UnsupportedOperationException("Unimplemented method 'getAppointmentsBySchedule'");
    }

    @Override
    public List<AppointmentDTO> getAppointmentsByDoctoroOffice(int officeNumber) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getAppointmentsByDoctoroOffice'");
    }

    @Override
    public List<AppointmentDTO> getAppointmentsByDoctorsName(String doctorsName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAppointmentsByDoctorsName'");
    }

    @Override
    public boolean deleteAppointment(long idAppointment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAppointment'");
    }
    
}
