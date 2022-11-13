package citahospitalbc.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import citahospitalbc.demo.dao.PacienteDAO;
import citahospitalbc.demo.dto.PacienteDTO;

@Service
public class PacienteServiceImpl implements PacienteService {

    private final PacienteDAO pacienteDAO;

    public PacienteServiceImpl(PacienteDAO pacienteDAO) {
        this.pacienteDAO = pacienteDAO;
    }

    @Override
    public List<PacienteDTO> getAll() {
        return pacienteDAO.getAll();
    }

    @Override
    public int crear(PacienteDTO pacienteDTO) {
        return pacienteDAO.crear(pacienteDTO);
    }

}
