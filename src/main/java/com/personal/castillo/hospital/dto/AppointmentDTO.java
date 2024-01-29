package com.personal.castillo.hospital.dto;

public class AppointmentDTO {
    String pacientName;
    String dateSchedule;
    String doctorName;
    String officeNumber;
    String floorOffice;

    public AppointmentDTO() {
    }

    public AppointmentDTO(String pacientName, String dateSchedule, String doctorName, String officeNumber,
            String floorOffice) {
        this.pacientName = pacientName;
        this.dateSchedule = dateSchedule;
        this.doctorName = doctorName;
        this.officeNumber = officeNumber;
        this.floorOffice = floorOffice;
    }

    public String getPacientName() {
        return pacientName;
    }

    public void setPacientName(String pacientName) {
        this.pacientName = pacientName;
    }

    public String getDateSchedule() {
        return dateSchedule;
    }

    public void setDateSchedule(String dateSchedule) {
        this.dateSchedule = dateSchedule;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getFloorOffice() {
        return floorOffice;
    }

    public void setFloorOffice(String floorOffice) {
        this.floorOffice = floorOffice;
    }

    @Override
    public String toString() {
        return "AppointmentDTO [pacientName=" + pacientName + ", dateSchedule=" + dateSchedule + ", doctorName="
                + doctorName + ", officeNumber=" + officeNumber + ", floorOffice=" + floorOffice + "]";
    }

}
