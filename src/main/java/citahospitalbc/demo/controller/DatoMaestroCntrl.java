package citahospitalbc.demo.controller;

import citahospitalbc.demo.dto.DatoMaestroDTO;
import citahospitalbc.demo.service.DatoMaestroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/datomaestro")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class DatoMaestroCntrl {
    private final DatoMaestroService datoMaestroService;

    public DatoMaestroCntrl(DatoMaestroService datoMaestroService) {
        this.datoMaestroService = datoMaestroService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<DatoMaestroDTO>> getAll(){
        return ResponseEntity.ok(datoMaestroService.getAll());
    };
}
