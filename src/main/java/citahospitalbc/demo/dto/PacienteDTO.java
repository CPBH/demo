package citahospitalbc.demo.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class PacienteDTO implements Serializable {
    private int pac_id;
    private String nombre_pac;
    private String apellidos_pac;
    private Date fecha_nacimiento_pac;
    private String telefono_pac;
    private String correo_pac;
    private String contrasena;
    private int tipo_documento_pac;
}