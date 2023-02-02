package contas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdministrarClientesPFTest {

	@Test
	public void testCadastrarClientePf() {
		AdministrarClientesPF clientePf = new AdministrarClientesPF();
		clientePf.cadastrar("E2E Treinamentos", "1234");
		assertEquals("Cadastro realizado com sucesso", clientePf.cadastrar("E2E Treinamentos", "123"));
	}
	
	@Test
	public void testCadastrarClienteNomeBranco () {
		AdministrarClientesPF clientePf = new AdministrarClientesPF();
		assertEquals("Cadastro não realizado", clientePf.cadastrar (" ", "123"));
	}

}
