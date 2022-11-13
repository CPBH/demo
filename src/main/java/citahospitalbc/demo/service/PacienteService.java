package citahospitalbc.demo.service;

import java.util.List;

import citahospitalbc.demo.dto.PacienteDTO;

public interface PacienteService {
    List<PacienteDTO> getAll();

    int crear(PacienteDTO pacienteDTO);
}
