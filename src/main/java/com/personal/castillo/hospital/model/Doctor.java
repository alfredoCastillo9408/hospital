package com.personal.castillo.hospital.model;

import jakarta.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    @Column(name   = "id")
    private long id;
    @Column(name   = "name")
    private String name;
    @Column(name   = "lastname")
    private String lastName;
    @Column(name   = "middlename")
    private String middlename;
    @Column(name   = "specialty")
    private String specialty;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

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
        Doctor other = (Doctor) obj;
        if (id != other.id)
            return false;
        return true;
    }


    

    public String toString() {
        return "Doctor [id=" + id + ", name=" + name + ", lastName=" + lastName + ", middlename=" + middlename
                + ", specialty=" + specialty + "]";
    }

    
}
