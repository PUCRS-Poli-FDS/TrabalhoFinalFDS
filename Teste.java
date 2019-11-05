import static org.junit.Assert.*;
import org.junit.Test;

public class Teste {
	
	@Test // testar a idade
	public void idadeTeste() {
		Irpf temer = new Irpf ("12312312-00", "Michel Miguel Elias Temer Lulia");
		temer.setIdade(77);
		assertEquals(77, temer.getIdade());
		
		Irpf jorge = new Irpf ("54684232-59", "Jorge Vieira");
		jorge.setIdade(-27);
		assertEquals(-27, jorge.getIdade());
		
		Irpf fabiano = new Irpf ("78564562-78", "Fabiano Moura");
		fabiano.setIdade(1542);
		assertEquals(1542, fabiano.getIdade());
    }
}