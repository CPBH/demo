package citahospitalbc.demo.service;

import citahospitalbc.demo.dao.DatoMaestroDAO;
import citahospitalbc.demo.dto.DatoMaestroDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatoMaestroServiceImpl implements DatoMaestroService{
    private final DatoMaestroDAO datoMaestroDAO;

    public DatoMaestroServiceImpl(DatoMaestroDAO datoMaestroDAO) {
        this.datoMaestroDAO = datoMaestroDAO;
    }

    @Override
    public List<DatoMaestroDTO> getAll(){
        return datoMaestroDAO.getAll();
    };
}
