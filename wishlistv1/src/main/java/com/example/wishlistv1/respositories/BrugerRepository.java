package com.example.wishlistv1.respositories;

import com.example.wishlistv1.domain.model.Bruger;
import com.example.wishlistv1.domain.servives.LoginSampleException;

public interface BrugerRepository {

  public Bruger login(String email, String kodeord) throws LoginSampleException;

  public  Bruger opretBruger(Bruger bruger) throws LoginSampleException;
}
