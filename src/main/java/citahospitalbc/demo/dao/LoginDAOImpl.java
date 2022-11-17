package citahospitalbc.demo.dao;

import citahospitalbc.demo.dto.LoginDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAOImpl implements LoginDAO {

    private final JdbcTemplate jdbcTemplate;
    private static final String SQL = "SELECT COUNT(*) FROM paciente";

    public LoginDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public String login(LoginDTO login) {
        var respuesta = jdbcTemplate.queryForObject(SQL + " WHERE pac_id = ? AND contrasena = ?", Integer.class, new Object[]{login.getPac_id(), login.getContrasena()});
        if (respuesta > 0) {
            return "Paciente autenticado";
        }
        return "Datos paciente invalidos";
    }
}
