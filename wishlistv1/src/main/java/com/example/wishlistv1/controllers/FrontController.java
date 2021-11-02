package com.example.wishlistv1.controllers;

import com.example.wishlistv1.domain.servives.LoginSampleException;
import com.example.wishlistv1.domain.servives.LoginService;
import com.example.wishlistv1.respositories.BrugerRepositoryImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

public class FrontController {

  private LoginService loginService = new LoginService(new BrugerRepositoryImpl);

  @GetMapping("/")
  public String startside (){
    return"index";
  }

  @GetMapping("/login")
  public String login(WebRequest request) throws LoginSampleException {
  String email = request.getParameter("email");
  String kodeord = request.getParameter("kodeord");

  return null;
  }


}
