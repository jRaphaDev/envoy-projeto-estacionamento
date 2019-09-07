package br.com.estudo.veiculo.repository;

import br.com.estudo.veiculo.model.Veiculo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VeiculoFakeRepositoryImpl implements VeiculoRepository {

    @Override
    public Veiculo save() {
        return null;
    }

    @Override
    public List<Veiculo> findByUserId(String userId) {
        return null;
    }

    @Override
    public List<Veiculo> findAll() {
        Veiculo veiculo = new Veiculo();
        veiculo.setUserId("1");
        veiculo.setModelo("Honda Fit");
        veiculo.setId(1);

        List<Veiculo> veiculos = new ArrayList();
        veiculos.add(veiculo);

        return veiculos;
    }
}
