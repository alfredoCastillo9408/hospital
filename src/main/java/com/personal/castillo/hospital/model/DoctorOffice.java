package com.personal.castillo.hospital.model;

import jakarta.persistence.*;;

@Entity
@Table(name = "doctor")
public class DoctorOffice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "officenumber")
    private int officeNumber;
    @Column(name = "floor")
    private int floor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
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
        DoctorOffice other = (DoctorOffice) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DoctorOffice [id=" + id + ", officeNumber=" + officeNumber + ", floor=" + floor + "]";
    }

}
