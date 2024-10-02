package han.aim.se.noyoumaynot.movie.service;



import han.aim.se.noyoumaynot.movie.domain.Role;
import han.aim.se.noyoumaynot.movie.domain.User;
import han.aim.se.noyoumaynot.movie.repository.UserToken;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthenticationService {
  ArrayList<UserToken> userTokens = new ArrayList<>();

  private User beheerder = new User("test","123");
  private User gebruiker = new User("ben","123");

  private Role beheerderRole = new Role("beheerder", true);
  private Role gebruikerRole = new Role("gebruiker", false);

  public String login(User user) {
    if(user.getUsername().equals(beheerder.getUsername())&& user.getPassword().equals(beheerder.getPassword())){
      return "admin";
    }
    if(user.getUsername().equals(gebruiker.getUsername())&& user.getPassword().equals(gebruiker.getPassword())){
      return "gebruiker";
    }
    return null;
  }

  public boolean isValidToken(String token, String action) {
    if(token.equals("admin")){
      return true;
    } else if(token.equals("gebruiker") && action.equals("show")){
      return true;
    } else {
      return false;
    }
  }

  public String getUsername(String token) {
    return null;
  }
}
