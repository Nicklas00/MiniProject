package com.example.wishlistv1.respositories;

import com.example.wishlistv1.domain.model.Bruger;

public interface BrugerRepository {

  public Bruger login(String email, String kodeord);

  public  Bruger opretBruger(String fornavn, String efternavn, String email, String kodeord);
}
