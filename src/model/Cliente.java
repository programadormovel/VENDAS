package model;

import java.text.NumberFormat;
import java.util.Locale;

public class Cliente extends Pessoa {
	public String realizarPagamento(double valorDeEntrada, Locale regiao) {
		super.realizarPagamento(valorDeEntrada);
		return super.getNome() + 
				" pagou " + 
				NumberFormat.getCurrencyInstance(regiao).format(valorDeEntrada);		
	}
}
