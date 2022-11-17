package citahospitalbc.demo.dao;

import citahospitalbc.demo.dto.DatoMaestroDTO;
import citahospitalbc.demo.mapper.DatoMaestroMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DatoMaestroDAOImpl implements DatoMaestroDAO{

    private final JdbcTemplate jdbcTemplate;

    public DatoMaestroDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<DatoMaestroDTO> getAll(){
        return jdbcTemplate.query("SELECT * FROM datomaestro",new DatoMaestroMapper());
    };
}
