package br.com.estudo.veiculo.service;

import br.com.estudo.veiculo.controller.json.VeiculoRequest;
import br.com.estudo.veiculo.controller.json.VeiculoResponse;
import br.com.estudo.veiculo.model.Veiculo;
import br.com.estudo.veiculo.repository.VeiculoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VeiculoServiceImpl implements VeiculoService {

    private Logger logger = LoggerFactory.getLogger(VeiculoServiceImpl.class);

    private VeiculoRepository repository;

    @Autowired
    public VeiculoServiceImpl(VeiculoRepository veiculoRepository) {
        this.repository = veiculoRepository;
    }


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
        VeiculoResponse response = new VeiculoResponse();
        response.setModelo(veiculo.getModelo());
        response.setId(veiculo.getId());
        return response;
    }

    @Override
    public List<VeiculoResponse> findByUserId(String requestMock) {
        return null;
    }

    @Override
    public List<VeiculoResponse> findAll() {
        logger.info("geting and transforming to response");
        return this.repository.findAll().stream()
                .map(this::translatorToResponse)
                .collect(Collectors.toList());
    }
}
