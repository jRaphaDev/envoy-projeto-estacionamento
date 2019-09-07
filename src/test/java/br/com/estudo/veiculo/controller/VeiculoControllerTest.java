package br.com.estudo.veiculo.controller;

import br.com.estudo.veiculo.service.VeiculoService;
import org.junit.Before;
import org.junit.Test;

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

    }

    @Test
    public void Deve_Listar_Veiculos_De_Um_Usuario(){

    }

    @Test
    public void Deve_Listar_Todos_Veiculos() {

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
