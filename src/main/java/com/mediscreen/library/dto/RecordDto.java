package com.mediscreen.library.dto;

import java.time.LocalDate;
import java.util.List;

public class RecordDto {


    private int patientId;
    private String firstName;
    private String lastName;
    private String sex;
    private LocalDate birthdate;
    private String address;
    private String phone;
    private int age;
    private String assessment;
    private List<NoteDto> notes;



    public RecordDto() {
    }

    public RecordDto(int patientId, String firstName, String lastName, String sex, LocalDate birthdate, String address, String phone, int age, String assessment, List<NoteDto> notes) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthdate = birthdate;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.assessment = assessment;
        this.notes = notes;
    }



    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public List<NoteDto> getNotes() {
        return notes;
    }

    public void setNotes(List<NoteDto> notes) {
        this.notes = notes;
    }
}
