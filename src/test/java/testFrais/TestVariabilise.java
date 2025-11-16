package testFrais;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class TestVariabilise {

	@ParameterizedTest
	@CsvFileSource(resources="./donnees.csv",numLinesToSkip=1)
	void test(double total, double frais) throws MonException {
		CalculFrais f = new CalculFrais();
		assertEquals(f.montant(total),frais,0.0001);
	}

}
