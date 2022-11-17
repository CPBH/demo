package citahospitalbc.demo.service;

import citahospitalbc.demo.dao.LoginDAO;
import citahospitalbc.demo.dto.LoginDTO;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    private static LoginDAO dao;

    public LoginServiceImpl(LoginDAO dao) {
        this.dao = dao;
    }

    @Override
    public String login(LoginDTO login) {
        return dao.login(login);
    }
}
