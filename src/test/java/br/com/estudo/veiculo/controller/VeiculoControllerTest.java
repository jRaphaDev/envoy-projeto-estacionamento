package br.com.estudo.veiculo.controller;

import br.com.estudo.veiculo.controller.json.VeiculoRequest;
import br.com.estudo.veiculo.controller.json.VeiculoResponse;
import br.com.estudo.veiculo.model.Veiculo;
import br.com.estudo.veiculo.service.VeiculoService;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

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
        this.veiculoController = new VeiculoController(veiculoService);
    }

    @Test
    public void Deve_Cadastrar_Um_Ou_Mais_Veiculos_De_Um_Usuario(){

        VeiculoRequest requestMock = new VeiculoRequest();

        Veiculo veiculoMock = new Veiculo();

        VeiculoResponse responseMock = new VeiculoResponse();

        when(this.veiculoService.translatorToVeiculo(requestMock)).thenReturn(veiculoMock);
        when(this.veiculoService.save(requestMock)).thenReturn(responseMock);
        when(this.veiculoService.translatorToResponse(veiculoMock)).thenReturn(responseMock);

        ResponseEntity veiculoResponse = this.veiculoController.create(requestMock);

        /**

        Asserts

         */

    }

    @Test
    public void Deve_Listar_Veiculos_De_Um_Usuario(){

        Veiculo veiculoMock = new Veiculo();
        List<Veiculo> listVeiculoMock = Stream.of(veiculoMock).collect(Collectors.toList());


        VeiculoResponse responseMock = new VeiculoResponse();
        List<VeiculoResponse> list = Stream.of(responseMock).collect(Collectors.toList());

        when(this.veiculoService.translatorToResponse(listVeiculoMock.get(0))).thenReturn(responseMock);
        when(this.veiculoService.findByUserId("1")).thenReturn(list);

        String userId = "1";
        ResponseEntity response = this.veiculoController.findByUserId(userId);

        /**

         Asserts

         */
    }

    @Test
    public void Deve_Listar_Todos_Veiculos() {

        Veiculo veiculoMock = new Veiculo();
        veiculoMock.setId(1);
        veiculoMock.setModelo("Honda Fit");
        veiculoMock.setUserId("1");
        List<Veiculo> listVeiculoMock = Stream.of(veiculoMock).collect(Collectors.toList());

        VeiculoResponse responseMock = new VeiculoResponse();
        responseMock.setId(veiculoMock.getId());
        responseMock.setModelo(veiculoMock.getModelo());

        List<VeiculoResponse> list = Stream.of(responseMock).collect(Collectors.toList());

        when(this.veiculoService.translatorToResponse(listVeiculoMock.get(0))).thenReturn(responseMock);
        when(this.veiculoService.findAll()).thenReturn(list);

        ResponseEntity<List<VeiculoResponse>> response = this.veiculoController.findAll();

        assertNotNull(response);
        assertNotNull(response.getBody());
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(1, response.getBody().size());
        assertEquals("Honda Fit", response.getBody().get(0).getModelo());

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
