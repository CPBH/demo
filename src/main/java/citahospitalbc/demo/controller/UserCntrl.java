package citahospitalbc.demo.controller;

import citahospitalbc.demo.dto.LoginDTO;
import citahospitalbc.demo.service.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UserCntrl {
    private final LoginService service;

    public UserCntrl(LoginService service) {
        this.service = service;
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO login){
        try {
            return new ResponseEntity<>(service.login(login), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

