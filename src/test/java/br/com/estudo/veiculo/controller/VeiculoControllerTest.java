package br.com.estudo.veiculo.controller;

import br.com.estudo.veiculo.controller.json.VeiculoRequest;
import br.com.estudo.veiculo.controller.json.VeiculoResponse;
import br.com.estudo.veiculo.model.Veiculo;
import br.com.estudo.veiculo.service.VeiculoService;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.*;

public class VeiculoControllerTest {

    VeiculoController veiculoController;
    VeiculoService veiculoService;

    @Before
    public void setUp() {
        this.veiculoService = mock(VeiculoService.class);
        this.veiculoController = new VeiculoController();
    }

    @Test
    public void Deve_Cadastrar_Um_Ou_Mais_Veiculos_De_Um_Usuario(){

        VeiculoRequest requestMock = new VeiculoRequest();

        Veiculo veiculoMock = new Veiculo();

        VeiculoResponse response = new VeiculoResponse();

        when(this.veiculoService.translatorToVeiculo(requestMock)).thenReturn(veiculoMock);
        when(this.veiculoService.save(requestMock)).thenReturn(response);
        when(this.veiculoService.translatorToResponse(veiculoMock)).thenReturn(response);


    }

    @Test
    public void Deve_Listar_Veiculos_De_Um_Usuario(){

        Veiculo veiculoMock = new Veiculo();
        List<Veiculo> listVeiculoMock = Stream.of(veiculoMock).collect(Collectors.toList());


        VeiculoResponse response = new VeiculoResponse();
        List<VeiculoResponse> list = Stream.of(response).collect(Collectors.toList());

        when(this.veiculoService.translatorToResponse(listVeiculoMock.get(0))).thenReturn(response);
        when(this.veiculoService.findByUserId("1")).thenReturn(list);
    }

    @Test
    public void Deve_Listar_Todos_Veiculos() {

        Veiculo veiculoMock = new Veiculo();
        List<Veiculo> listVeiculoMock = Stream.of(veiculoMock).collect(Collectors.toList());


        VeiculoResponse response = new VeiculoResponse();
        List<VeiculoResponse> list = Stream.of(response).collect(Collectors.toList());

        when(this.veiculoService.translatorToResponse(listVeiculoMock.get(0))).thenReturn(response);
        when(this.veiculoService.findAll()).thenReturn(list);

    }

    @Test
    public void Deve_Validar_Se_Usuario_Existe_Se_Sim_Retornar_OK_200() {

    }

    @Test
    public void Deve_Validar_Se_Usuario_Existe_Se_Nao_Retornar_NOT_FOUND_404() {

    }

    @Test
    public void Deve_Editar_Um_Veiculo_De_Um_Usuario() {

    }

    @Test
    public void Deve_Deletar_Um_Veiculo_De_Um_Usuario() {

    }

}
