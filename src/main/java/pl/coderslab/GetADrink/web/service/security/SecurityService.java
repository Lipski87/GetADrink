package pl.coderslab.GetADrink.web.service.security;

import org.springframework.stereotype.Service;

@Service
public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
