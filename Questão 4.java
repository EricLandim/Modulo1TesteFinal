//Classe 1 Pessoa

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void testGetNome() {
        Pessoa pessoa = new Pessoa("João", 30);
        Assertions.assertEquals("João", pessoa.getNome());
    }

    @Test
    void testGetIdade() {
        Pessoa pessoa = new Pessoa("João", 30);
        Assertions.assertEquals(30, pessoa.getIdade());
    }

    @Test
    void testSetNome() {
        Pessoa pessoa = new Pessoa("João", 30);
        pessoa.setNome("Maria");
        Assertions.assertEquals("Maria", pessoa.getNome());
    }

    @Test
    void testSetIdade() {
        Pessoa pessoa = new Pessoa("João", 30);
        pessoa.setIdade(25);
        Assertions.assertEquals(25, pessoa.getIdade());
    }
}


//Classe 2 Funcionario

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    @Test
    void testGetSalario() {
        Funcionario funcionario = new Funcionario("João", 30, 5000.0);
        Assertions.assertEquals(5000.0, funcionario.getSalario());
    }

    @Test
    void testSetSalario() {
        Funcionario funcionario = new Funcionario("João", 30, 5000.0);
        funcionario.setSalario(6000.0);
        Assertions.assertEquals(6000.0, funcionario.getSalario());
    }
}


//Classe 3 Gerente

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GerenteTest {

    @Test
    void testGetDepartamento() {
        Gerente gerente = new Gerente("João", 30, 5000.0, "TI");
        Assertions.assertEquals("TI", gerente.getDepartamento());
    }

    @Test
    void testSetDepartamento() {
        Gerente gerente = new Gerente("João", 30, 5000.0, "TI");
        gerente.setDepartamento("Marketing");
        Assertions.assertEquals("Marketing", gerente.getDepartamento());
    }
}

//Classe 4 Cliente

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    void testGetLimiteCredito() {
        Cliente cliente = new Cliente("João", 30, 5000.0);
        Assertions.assertEquals(5000.0, cliente.getLimiteCredito());
    }

    @Test
    void testSetLimiteCredito() {
        Cliente cliente = new Cliente("João", 30, 5000.0);
        cliente.setLimiteCredito(6000.0);
        Assertions.assertEquals(6000.0, cliente.getLimiteCredito());
    }
}


//Classe 5 Banco

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class BancoTest {

    @Test
    void testGetNome() {
        Banco banco = new Banco("Banco do Brasil");
        Assertions.assertEquals("Banco do Brasil", banco.getNome());
    }

@Test
void testSetNome() {
Banco banco = new Banco("Banco do Brasil");
banco.setNome("Itaú");
Assertions.assertEquals("Itaú", banco.getNome());
}

@Test
void testAddCliente() {
Banco banco = new Banco("Banco do Brasil");
Cliente cliente = new Cliente("João", 30, 5000.0);
banco.addCliente(cliente);
Assertions.assertEquals(1, banco.getClientes().size());
}

@Test
void testGetClientes() {
Banco banco = new Banco("Banco do Brasil");
Cliente cliente1 = new Cliente("João", 30, 5000.0);
Cliente cliente2 = new Cliente("Maria", 25, 10000.0);
banco.addCliente(cliente1);
banco.addCliente(cliente2);
List<Cliente> clientes = banco.getClientes();
Assertions.assertEquals(2, clientes.size());
Assertions.assertTrue(clientes.contains(cliente1));
Assertions.assertTrue(clientes.contains(cliente2));
}

}


public class RelatorioTest {
  @Test
void testImprimirClientes() {
    Banco banco = new Banco("Banco do Brasil");
    Cliente cliente1 = new Cliente("João", 30, 5000.0);
    Cliente cliente2 = new Cliente("Maria", 25, 10000.0);
    Cliente cliente3 = new Cliente("Pedro", 40, 15000.0);
    banco.addCliente(cliente1);
    banco.addCliente(cliente2);
    banco.addCliente(cliente3);
    Relatorio relatorio = new Relatorio(banco);
    String output = "Lista de clientes do Banco do Brasil:\n" +
            "João - Limite de crédito: R$5000.00\n" +
            "Maria - Limite de crédito: R$10000.00\n" +
            "Pedro - Limite de crédito: R$15000.00\n";
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    relatorio.imprimirClientes();
    Assertions.assertEquals(output, outputStream.toString());
}

  
  }
  

