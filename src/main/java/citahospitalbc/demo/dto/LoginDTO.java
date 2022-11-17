package citahospitalbc.demo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class LoginDTO implements Serializable {
    private String pac_id;
    private String contrasena;
}
