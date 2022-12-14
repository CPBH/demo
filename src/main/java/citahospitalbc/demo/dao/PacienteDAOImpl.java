package citahospitalbc.demo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import citahospitalbc.demo.dto.PacienteDTO;
import citahospitalbc.demo.mapper.PacienteMapper;

@Repository
public class PacienteDAOImpl implements PacienteDAO {
    private static final String SELECT = "SELECT * FROM paciente";

    @Autowired
    private JdbcTemplate jdbcTemplate; //creacion un objeto de una importacion

    @Override
    public List<PacienteDTO> getAll() {
        return jdbcTemplate.query(SELECT, new PacienteMapper());
    }

    @Override
    public int crear(PacienteDTO pacienteDTO) {
        return jdbcTemplate.update("INSERT INTO paciente (pac_id, nombre_pac, apellidos_pac, fecha_nacimiento_pac, telefono_pac, correo_pac, contrasena, tipo_documento_pac) VALUES(?,?,?,?,?,?,?,?)",
                new Object[] {
                        pacienteDTO.getPac_id(),
                        pacienteDTO.getNombre_pac(),
                        pacienteDTO.getApellidos_pac(),
                        pacienteDTO.getFecha_nacimiento_pac(),
                        pacienteDTO.getTelefono_pac(),
                        pacienteDTO.getCorreo_pac(),
                        pacienteDTO.getContrasena(),
                        pacienteDTO.getTipo_documento_pac() });
    }
    @Override
    public int getXId(PacienteDTO pacienteDTO){
            var xid = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM paciente WHERE pac_id = ?", Integer.class, new Object[]{pacienteDTO.getPac_id()});
            if(xid > 0){
                return 1;
            }
        return 0;

    }
    @Override
    public PacienteDTO xId(PacienteDTO id){
        return jdbcTemplate.queryForObject("SELECT * FROM paciente WHERE pac_id = ?", new PacienteMapper(), id.getPac_id());
    }
}