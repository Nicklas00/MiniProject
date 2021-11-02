package com.example.wishlistv1.domain.servives;

import com.example.wishlistv1.domain.model.Bruger;
import com.example.wishlistv1.respositories.BrugerRepository;

public class LoginService {

  private BrugerRepository brugerRepository = null;

  public Bruger login(String email, String kodeord) throws LoginSampleException{
    return brugerRepository.login(email, kodeord);
  }
  
  public Bruger opretBruger (String fornavn, String efternavn, String email, String kodeord) throws LoginSampleException{
    Bruger bruger = new Bruger(fornavn, efternavn, email, kodeord);

    return brugerRepository.opretBruger(bruger);
  }
}
