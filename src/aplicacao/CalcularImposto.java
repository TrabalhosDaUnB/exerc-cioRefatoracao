package aplicacao;

public class CalcularImposto {

	Imposto imposto;
	float valorFaixa5;
	float valorFaixa4;
	float valorFaixa3;
	float valorFaixa2;
	float valorFaixa1;
	
	final float maximoFaixa5 = 4664.68f;
	final float maximoFaixa4 = 3751.06f;
	final float maximoFaixa3 = 2826.66f;
	final float maximoFaixa2 = 1903.99f;
	
	
	CalcularImposto(Imposto imposto){
		this.imposto = imposto;
	}
	
	
	public void computar() {
		calculoFaixa5();
		calculoFaixa4();
		calculoFaixa3();
		calculoFaixa2();
		calculoFaixa1();
	}


	private void calculoFaixa1() {
		valorFaixa1 = calcularFaixa2() - valorFaixa2;
		if (valorFaixa1 > 0) {
			imposto.impostoFaixa1 = valorFaixa1 * imposto.aliqFaixa1;
		}
		else { 
			imposto.impostoFaixa1 = 0;
			valorFaixa1 = 0;
		}
	}


	private void calculoFaixa2() {
		valorFaixa2 = calcularFaixa3() - maximoFaixa2;
		if (valorFaixa2 > 0) {
			imposto.impostoFaixa2 = valorFaixa2 * imposto.aliqFaixa2;
		}
		else { 
			imposto.impostoFaixa2 = 0;
			valorFaixa2 = 0;
		}
	}


	private void calculoFaixa3() {
		valorFaixa3 = calcularFaixa4() - maximoFaixa3;
		if (valorFaixa3 > 0) {
			imposto.impostoFaixa3 = valorFaixa3 * imposto.aliqFaixa3;
		}
		else { 
			imposto.impostoFaixa3 = 0;
			valorFaixa3 = 0;
		}
	}


	private void calculoFaixa4() {
		valorFaixa4 = calcularFaixa5() - maximoFaixa4;
		if (valorFaixa4 > 0) {
			imposto.impostoFaixa4 = valorFaixa4 * imposto.aliqFaixa4;
		}
		else { 
			imposto.impostoFaixa4 = 0;
			valorFaixa4 = 0;
		}
	}


	private void calculoFaixa5() {
		valorFaixa5 = calcularValorFaixa5();
		if (valorFaixa5 > 0) {
			imposto.impostoFaixa5 = valorFaixa5 * imposto.aliqFaixa5;
		}
		else { 
			imposto.impostoFaixa5 = 0;
			valorFaixa5 = 0;
		}
	}
	
	private float calcularFaixa4() {
		return calcularFaixa5() - valorFaixa4;
	}

	private float calcularFaixa5() {
		return imposto.baseCalculo - valorFaixa5;
	}

	private float calcularValorFaixa5() {
		return imposto.baseCalculo - maximoFaixa5;
	}
	
	private float calcularFaixa3() {
		return calcularFaixa4() - valorFaixa3;
	}
	
	private float calcularFaixa2() {
		return calcularFaixa3() - valorFaixa3;
	}
	
}
