package entidades;

public class PessoaFisica extends Contribuinte {
     
	private Double gastoSaude;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}


	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		if(rendaAnual < 20.000) {
			return rendaAnual *0.15 - (gastoSaude * 0.50);
		}else {
			return rendaAnual * 0.25 - (gastoSaude * 0.50);
		}
	}
   
	

}
