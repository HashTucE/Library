package com.mediscreen.library.dto;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class NoteDto {


    private int id;

    @NotNull(message = "Id of the patient is mandatory")
    private int patientId;

    @NotBlank(message = "Note is mandatory")
    private String note;

    private LocalDate date;


    public NoteDto() {
    }

    public NoteDto(int patientId, String note) {
        this.patientId = patientId;
        this.note = note;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
