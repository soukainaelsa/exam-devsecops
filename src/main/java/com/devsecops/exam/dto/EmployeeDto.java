package com.devsecops.exam.dto;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EmployeeDto {
    private int id;
    private String  nom;

    private String email;

    private String CIN;
    private String phone;

    public EmployeeDto(int id, String nom, String email, String CIN, String phone) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.CIN = CIN;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}