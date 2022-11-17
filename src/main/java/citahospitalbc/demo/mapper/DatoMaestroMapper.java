package citahospitalbc.demo.mapper;

import citahospitalbc.demo.dto.DatoMaestroDTO;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;


public class DatoMaestroMapper implements RowMapper<DatoMaestroDTO> {

    @Override
    @Nullable
    public DatoMaestroDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        DatoMaestroDTO datoMaestroDTO = new DatoMaestroDTO();
        datoMaestroDTO.setIddatomaestro(rs.getInt("iddatomaestro"));
        datoMaestroDTO.setDsdato_maestro(rs.getString("dsdato_maestro"));
        datoMaestroDTO.setIdmaestro(rs.getInt("idmaestro"));
        return datoMaestroDTO;
    }
}
