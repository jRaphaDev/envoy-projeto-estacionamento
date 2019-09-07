package br.com.estudo.veiculo.service;

import br.com.estudo.veiculo.repository.VeiculoFakeRepositoryImpl;
import br.com.estudo.veiculo.repository.VeiculoRepository;
import org.junit.Before;

import static org.mockito.Mockito.*;

public class VeiculoServiceTest {

    private VeiculoService veiculoService;
    private VeiculoRepository veiculoRepository;

    @Before
    public void setUP(){
        this.veiculoRepository = mock(VeiculoFakeRepositoryImpl.class);
        this.veiculoService = new VeiculoServiceImpl(veiculoRepository);
    }




}
