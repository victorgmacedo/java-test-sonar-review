package br.com.test.operations;

import java.util.stream.Stream;

public class Calc {

	public Integer calcular(Integer... values) {
		return Stream.of(values).reduce(0, (valor, acc) -> valor += acc);
	}
	
}
