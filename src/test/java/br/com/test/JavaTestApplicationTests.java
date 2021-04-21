package br.com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import br.com.test.operations.Calc;

class JavaTestApplicationTests {
	
	private Calc calc;
	
	@BeforeEach
	public void setup() {
		calc = new Calc();
	}

	@Test
	void first_test() {
		Integer total = calc.calcular(1,3,4);
		Assertions.assertEquals(8, total);
	}

	@Test
	void error_test(){
			Integer total = calc.calcular(3,1,4);
			Assertions.assertEquals(8, total);
	}

}
