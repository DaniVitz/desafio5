package modulos.produtos;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import paginas.LoginPage;

import java.time.Duration;

@DisplayName("Teste web do modulo de produtos")
public class ProdutosTest {

    private WebDriver navegador;

    @BeforeEach
    public void beforeEach(){
        // abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
        this.navegador = new ChromeDriver();

        // maximizar a tela
        this.navegador.manage().window().maximize();

        // Vou definir um tempo de espera padrao de 10 segundos
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navegar para a pagina da Lojinha web
        this.navegador.get("https://www.petz.com.br/");

    }

    @Test
    @DisplayName("Validar Sul, Sudeste e Centro-Oeste: frete grátis nos pedidos acima de R$ 119")
    public void testeValidarFreteSSCOcomValor119(){
        this.navegador.findElement(By.cssSelector("div.log-in")).click();
        this.navegador.findElement(By.cssSelector("a[class=button-login]")).click();
        this.navegador.findElement(By.cssSelector("#loginEmail")).click();
        this.navegador.findElement(By.id("#loginEmail")).sendKeys("julianacarraroy@gmail.com");
    }


    @AfterEach
    public void afterEach(){
        // Vou fechar o navegador
        // navegador.quit();
    }
}
