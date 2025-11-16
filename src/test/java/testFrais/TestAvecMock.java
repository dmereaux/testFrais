package testFrais;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.easymock.EasyMock;
//import static org.easymock.EasyMock.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAvecMock {
	
	paramAppli mock;
	
	@BeforeEach
	public void setUp()
	{
		mock = EasyMock.createMock(paramAppli.class);
				
	}
	@Test
	public void test1() throws MonException
	{
		EasyMock.expect(mock.getLimit2()).andReturn(300.0);
		EasyMock.expect(mock.getLimit1()).andReturn(100.0);
		EasyMock.replay(mock);
		CalculFrais f = new CalculFrais(mock);
		assertEquals(f.montant(301.0),0.0,0.0001);

	}

}
