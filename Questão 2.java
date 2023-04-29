import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
  private ShoppingCart carrinho;
private Product produto1;
private Product produto2;

@BeforeEach
public void configuracaoInicial() {
    carrinho = new ShoppingCart();
    produto1 = new Product("Teclado", 100.00);
    produto2 = new Product("Monitor", 200.00);
}

@Test
public void testContagemDeItensDoCarrinhoAoCriar() {
    assertEquals(0, carrinho.getItemCount());
}

@Test
public void testContagemDeItensDoCarrinhoAoEsvaziar() {
    carrinho.empty();
    assertEquals(0, carrinho.getItemCount());
}

@Test
public void testContagemDeItensDoCarrinhoAposAdicionarProduto() {
    carrinho.addItem(produto1);
    assertEquals(1, carrinho.getItemCount());
}

@Test
public void testSaldoDoCarrinhoAposAdicionarProduto() {
    carrinho.addItem(produto1);
    assertEquals(100.00, carrinho.getBalance(), 0.001);
    carrinho.addItem(produto2);
    assertEquals(300.00, carrinho.getBalance(), 0.001);
}

@Test
public void testContagemDeItensDoCarrinhoAposRemoverProduto() throws ProductNotFoundException {
    carrinho.addItem(produto1);
    carrinho.addItem(produto2);
    carrinho.removeItem(produto1);
    assertEquals(1, carrinho.getItemCount());
}

@Test
public void testProductNotFoundExceptionAoRemoverProdutoInexistente() {
    assertThrows(ProductNotFoundException.class, () -> {
        carrinho.removeItem(produto1);
    });
}
}
