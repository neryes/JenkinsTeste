import org.junit.Assert;
import org.junit.Test;

public class testeJunit {
	
	int a = 1, b = 1;
	
	calculo c = new calculo();

	@Test
	public void testeConfiguracao(){
		Assert.assertEquals(2, c.soma(a, b), 0);
	}
	
	int a2 = 3, b2 = 1;
	
	calculo c2 = new calculo();

	@Test
	public void testeConfiguracao2(){
		Assert.assertEquals(2, c2.soma(a2, b2), 0);
	}		
}
