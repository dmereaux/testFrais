package testFrais;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCalculFrais {
	// mon premier test
	@Test
	void testNominal1() throws MonException {
		CalculFrais f = new CalculFrais();
		assertEquals(f.montant(600.0),0.0,0.0001,"message ne cas d'erreur");
	}


	
	@Test
	void testNominal2() throws MonException {
		CalculFrais f = new CalculFrais();
		assertEquals(f.montant(60.0),30.0,0.0001);
	}
	@Test
	void testNominal3() throws MonException {
		CalculFrais f = new CalculFrais();
		assertEquals(f.montant(300.0),20.0,0.0001);
	}
	@Test
	void testLimit1 () throws MonException {
		CalculFrais f = new CalculFrais();
		assertEquals(f.montant(200.0),20.0,0.0001);
	}
	@Test
	void testLimit2 () throws MonException {
		CalculFrais f = new CalculFrais();
		assertEquals(f.montant(199.99),30.0,0.0001);
	}
	@Test
	void testLimit3 () throws MonException {
		CalculFrais f = new CalculFrais();
		assertEquals(f.montant(500.00),0.0,0.0001);
	}
	@Test
	void testLimit4 () throws MonException {
		CalculFrais f = new CalculFrais();
		assertEquals(f.montant(499.99),20.0,0.0001);
	}
	@Test
	void testLimit5 () throws MonException {
		CalculFrais f = new CalculFrais();
		assertEquals(f.montant(0.01),30.0,0.0001);
	}

	@Test()
	void test1() throws MonException {
			assertThrows(MonException.class, () -> {
				CalculFrais f = new CalculFrais();
				f.montant(0.0);
		     });
		
	}
	@Test()
	void test2() throws MonException {
			assertThrows(MonException.class, () -> {
				CalculFrais f = new CalculFrais();
				f.montant(-600.0);
		     });
		
	}
}
