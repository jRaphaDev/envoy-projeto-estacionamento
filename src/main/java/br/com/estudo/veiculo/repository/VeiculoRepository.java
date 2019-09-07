package br.com.estudo.veiculo.repository;

import br.com.estudo.veiculo.model.Veiculo;

import java.util.List;

public interface VeiculoRepository {
    Veiculo save();
    List<Veiculo> findByUserId(String userId);
    List<Veiculo> findAll();
}
