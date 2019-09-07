package br.com.estudo.veiculo.service;

import br.com.estudo.veiculo.controller.json.VeiculoRequest;
import br.com.estudo.veiculo.controller.json.VeiculoResponse;
import br.com.estudo.veiculo.model.Veiculo;

import java.util.List;

public interface VeiculoService {

    VeiculoResponse save(VeiculoRequest request);

    Veiculo translatorToVeiculo(VeiculoRequest request);

    VeiculoResponse translatorToResponse(Veiculo veiculo);

    List<VeiculoResponse> findByUserId(String requestMock);

    List<VeiculoResponse> findAll();
}
