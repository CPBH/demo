package citahospitalbc.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import citahospitalbc.demo.dto.PacienteDTO;

public class PacienteMapper implements RowMapper<PacienteDTO> {

    @Override
    @Nullable
    public PacienteDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setPac_id(rs.getInt("pac_id"));
        pacienteDTO.setNombre_pac(rs.getString("nombre_pac"));
        pacienteDTO.setApellidos_pac(rs.getString("apellidos_pac"));
        pacienteDTO.setFecha_nacimiento_pac(rs.getDate("fecha_nacimiento_pac"));
        pacienteDTO.setTelefono_pac(rs.getString("telefono_pac"));
        pacienteDTO.setCorreo_pac(rs.getString("correo_pac"));
        pacienteDTO.setContrasena(rs.getString("contrasena"));
        pacienteDTO.setTipo_documento_pac(rs.getInt("tipo_documento_pac"));
        return pacienteDTO;
    } 
    
}
