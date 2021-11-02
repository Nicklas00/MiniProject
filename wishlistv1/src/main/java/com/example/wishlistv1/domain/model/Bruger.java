package com.example.wishlistv1.domain.model;

public class Bruger {
  private String fornavn;
  private String efternavn;
  private String email;
  private String kodeord;
  private int id;

  public Bruger(String fornavn, String efternavn, String email, String kodeord, int id) {
    this.fornavn = fornavn;
    this.efternavn = efternavn;
    this.email = email;
    this.kodeord = kodeord;
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFornavn() {
    return fornavn;
  }

  public void setFornavn(String fornavn) {
    this.fornavn = fornavn;
  }

  public String getEfternavn() {
    return efternavn;
  }

  public void setEfternavn(String efternavn) {
    this.efternavn = efternavn;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getKodeord() {
    return kodeord;
  }

  public void setKodeord(String kodeord) {
    this.kodeord = kodeord;
  }
}
