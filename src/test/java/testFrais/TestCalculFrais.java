package testFrais;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCalculFrais {
	// mon premier test
	@Test
	void test() throws MonException {
		CalculFrais f = new CalculFrais();
		assertEquals(f.montant(600.0),0.0,0.0001);
	}
	@Test
	void test3() throws MonException {
		CalculFrais f = new CalculFrais();
		assertEquals(f.montant(100.0),20.0,0.0001);
	}
	@Test()
	void test2() throws MonException {
			assertThrows(MonException.class, () -> {
				CalculFrais f = new CalculFrais();
				f.montant(-600.0);
		     });
		
	}
}
