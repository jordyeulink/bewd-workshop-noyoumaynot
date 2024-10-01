package han.aim.se.noyoumaynot.movie.service;

import han.aim.se.noyoumaynot.movie.repository.UserToken;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthenticationService {
  ArrayList<UserToken> userTokens = new ArrayList<>();

  private final String username = "test";
  private final String password ="123";

  public String login(String username, String password) {
    if(username.equals(this.username)&&password.equals(this.password)){
      return "admin";
    }
    return null;
  }

  public boolean isValidToken(String token) {
    if(token.equals("admin")){
      return true;
    } else {
      return false;
    }
  }

  public String getUsername(String token) {
    return null;
  }
}
