package com.example.wishlistv1.respositories;

import com.example.wishlistv1.domain.model.Bruger;
import com.example.wishlistv1.domain.servives.LoginSampleException;
import jdk.jpackage.internal.Log;

import java.sql.*;

public class BrugerRepositoryImpl implements BrugerRepository{

  @Override
  public Bruger login(String email, String kodeord) throws LoginSampleException {
    try {
      Connection connection = DBManager.getConnection();
      String SQL = "select id from Brugere " + "where email = ? and kodeord = ?";
      PreparedStatement preparedStatement = connection.prepareStatement(SQL);
      preparedStatement.setString(1, email);
      preparedStatement.setString(2, kodeord);
      ResultSet resultSet = preparedStatement.executeQuery();
      if (resultSet.next()){
        int id = resultSet.getInt("id");
        Bruger bruger = new Bruger(email, kodeord);
        bruger.setId(id);
        return bruger;
      } else {
        throw new LoginSampleException("kunne ikke ikke login");
      }

    } catch (SQLException ex) {
      throw new LoginSampleException(ex.getMessage());
    }

  }

  @Override
  public Bruger opretBruger(Bruger bruger) throws LoginSampleException {
    try {
      Connection connection = DBManager.getConnection();
      String SQL = "insert into Brugere (fornavn, efternavn, email, kodeord) values (?, ?, ?, ?) ";
      PreparedStatement preparedStatement = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
      preparedStatement.setString(1, bruger.getFornavn());
      preparedStatement.setString(2, bruger.getEfternavn());
      preparedStatement.setString(3, bruger.getEmail());
      preparedStatement.setString(4, bruger.getKodeord());
      preparedStatement.executeUpdate();
      ResultSet resultSet = preparedStatement.getGeneratedKeys();
      resultSet.next();
      int id = resultSet.getInt(1);
      bruger.setId(id);
      return bruger;

    } catch (SQLException er) {
      throw new LoginSampleException(er.getMessage());
    }

  }


}
