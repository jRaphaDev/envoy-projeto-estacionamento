package br.com.estudo.veiculo.controller;

import br.com.estudo.veiculo.controller.json.VeiculoRequest;
import br.com.estudo.veiculo.controller.json.VeiculoResponse;
import br.com.estudo.veiculo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VeiculoController {

    private VeiculoService veiculoService;

    @Autowired
    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @PostMapping(value = "v1/veiculo")
    public ResponseEntity create(VeiculoRequest request) {
        return ResponseEntity.created(null).build();
    }

    @GetMapping(value = "v1/veiculo/user-id/{userId}")
    public ResponseEntity findByUserId(@PathVariable("userId") String userId) {
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "v1/veiculo")
    public ResponseEntity findAll() {
        List<VeiculoResponse> response = this.veiculoService.findAll();
        return ResponseEntity.ok().body(response);
    }
}
