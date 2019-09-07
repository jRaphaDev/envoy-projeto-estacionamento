package br.com.estudo.veiculo.service;

import br.com.estudo.veiculo.controller.json.VeiculoRequest;
import br.com.estudo.veiculo.controller.json.VeiculoResponse;
import br.com.estudo.veiculo.model.Veiculo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService {


    @Override
    public VeiculoResponse save(VeiculoRequest request) {
        return null;
    }

    @Override
    public Veiculo translatorToVeiculo(VeiculoRequest request) {
        return null;
    }

    @Override
    public VeiculoResponse translatorToResponse(Veiculo veiculo) {
        return null;
    }

    @Override
    public List<VeiculoResponse> findByUserId(String requestMock) {
        return null;
    }

    @Override
    public List<VeiculoResponse> findAll() {
        return null;
    }
}
