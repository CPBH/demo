package citahospitalbc.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import citahospitalbc.demo.dto.PacienteDTO;
import citahospitalbc.demo.service.PacienteService;

@RestController
@RequestMapping("/api/paciente")
public class PacienteCntrl {
    private final PacienteService pacienteService;

    public PacienteCntrl(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping("/getAllPaciente")
    public ResponseEntity<List<PacienteDTO>> getAllPacientee() {
        return ResponseEntity.ok(pacienteService.getAll());
    }

    ;

    @PostMapping("/crear")
    public ResponseEntity<String> crear(@RequestBody PacienteDTO paciente) {
        try {
            pacienteService.crear(paciente);
            return new ResponseEntity<>("Paciente creado con exito", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
