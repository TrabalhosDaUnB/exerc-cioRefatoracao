package aplicacao;

public class Imposto {
	float baseCalculo;
	
	float impostoFaixa1, 
		  impostoFaixa2, 
	      impostoFaixa3, 
	      impostoFaixa4, 
	      impostoFaixa5;
	
	float aliqFaixa1 = 0.0f,
		  aliqFaixa2 = 7.5f/100f,
		  aliqFaixa3 = 15.0f/100f,
		  aliqFaixa4 = 22.5f/100f,
		  aliqFaixa5 = 27.5f/100f;
	
	public Imposto(float baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	public void calcularImposto() {
		new CalcularImposto(this).computar();
	}

	public float getFaixa1() {
		return impostoFaixa1;
	}

	public float getFaixa2() {
		return impostoFaixa2;
	}

	public float getFaixa3() {
		return impostoFaixa3;
	}

	public float getFaixa4() {
		return impostoFaixa4;
	}

	public float getFaixa5() {
		return impostoFaixa5;
	}
	
	

}
