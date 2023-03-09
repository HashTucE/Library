package com.mediscreen.library.dto;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public class PatientDto {


    private int id;

    @NotBlank(message = "Last Name is mandatory")
    private String lastName;

    @NotBlank(message = "First Name is mandatory")
    private String firstName;

    @NotNull(message = "Birthday is mandatory")
    private LocalDate birthdate;

    @Pattern(regexp = "^[M|F]$", message = "M for Male or F for Female")
    private String sex;

    private String address;

    private String phone;


    public PatientDto(String lastName, String firstName, LocalDate birthdate, String sex, String address, String phone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthdate = birthdate;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }

    public PatientDto(String lastName, String firstName, LocalDate birthdate, String sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthdate = birthdate;
        this.sex = sex;
    }

    public PatientDto(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public PatientDto() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
