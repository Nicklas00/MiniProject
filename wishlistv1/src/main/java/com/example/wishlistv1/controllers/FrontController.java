package com.example.wishlistv1.controllers;

import com.example.wishlistv1.domain.servives.LoginService;
import com.example.wishlistv1.respositories.BrugerRepositoryImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

private LoginService loginService = new LoginService(new BrugerRepositoryImpl());

  @GetMapping("/")
  public String index() { return "index"; }

  @GetMapping("/Oenskeliste")
  public String oenskeliste() { return "oenskeliste"; }

  @GetMapping("/blank1")
  public String blank1() { return "blank1"; }
}
