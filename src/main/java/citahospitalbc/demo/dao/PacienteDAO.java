package citahospitalbc.demo.dao;

import java.util.List;

import citahospitalbc.demo.dto.PacienteDTO;

public interface PacienteDAO {
    List<PacienteDTO>getAll();

    int crear(PacienteDTO pacienteDTO);
    int getXId(PacienteDTO pacienteDTO);
    PacienteDTO xId(PacienteDTO id);
}
