package com.example.wishlistv1.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class FrontController {

  @GetMapping("/")
  public String index() { return "index"; }

  @GetMapping("/Oenskeliste")
  public String oenskeliste() { return "oenskeliste"; }

  @GetMapping("/blank1")
  public String blank1() { return "blank1"; }
}
