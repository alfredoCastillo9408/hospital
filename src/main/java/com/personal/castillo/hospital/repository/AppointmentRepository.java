package com.personal.castillo.hospital.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.personal.castillo.hospital.model.Appointment;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long>{
    
    List<Appointment> findBySchedule(LocalDateTime dateToSearch);
    
    @Query("Select a from Appointment a JOIN a.idDoctorOffice do where do.officeNumber = ?1")
    List<Appointment> getAppointmentsByDoctorOffice(int officeNumber);
    
    @Query("Select a from Appointment a JOIN a.idDoctor d where d.name = ?1")
    List<Appointment> getAppointmentsByDoctor(String doctorName);


    void deleteAppointment(long idAppointment);

}
