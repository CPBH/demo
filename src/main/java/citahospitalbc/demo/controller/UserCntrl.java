package citahospitalbc.demo.controller;

import citahospitalbc.demo.dto.LoginDTO;
import citahospitalbc.demo.dto.Respuesta;
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
    public ResponseEntity<Respuesta> login(@RequestBody LoginDTO login){
        String mensaje = "";
        try {
            mensaje = service.login(login);
        } catch (Exception e) {
            return new ResponseEntity<>(new Respuesta(e.getMessage(), null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(new Respuesta(mensaje, null), HttpStatus.CREATED);
    }
}

