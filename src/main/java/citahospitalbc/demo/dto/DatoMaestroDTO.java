package citahospitalbc.demo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class DatoMaestroDTO implements Serializable {
    private int iddatomaestro;
    private String dsdato_maestro;
    private int idmaestro;
}
