package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.constraints.*;

public class RegistrationForm {
    @NotBlank
    private String jmeno;
    @NotBlank
    private String prijmeni;
    @NotBlank
    private String birthDate;
    @NotBlank
    private String pohlavi;
    @NotBlank
    private String turnus;
    @Email
    private String email;
    private String telephone;

    public RegistrationForm() {
    }

    public @NotBlank String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(@NotBlank String birthDate) {
        this.birthDate = birthDate;
    }

    public @Email String getEmail() {
        return email;
    }

    public void setEmail(@Email String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public @NotBlank String getJmeno() {
        return jmeno;
    }

    public void setJmeno(@NotBlank String jmeno) {
        this.jmeno = jmeno;
    }

    public @NotBlank String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(@NotBlank String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public @NotBlank String getPohlavi() {
        return pohlavi;
    }

    public void setPohlavi(@NotBlank String pohlavi) {
        this.pohlavi = pohlavi;
    }

    public @NotBlank String getTurnus() {
        return turnus;
    }

    public void setTurnus(@NotBlank String turnus) {
        this.turnus = turnus;
    }
}
