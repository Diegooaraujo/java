package entities;

public abstract class TaxPayer {
	private String nome;
	private Double anualIncome;
	
	public TaxPayer() {
		
	}

	public TaxPayer(String nome, Double anualIncome) {
		super();
		this.nome = nome;
		this.anualIncome = anualIncome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract double tax();
}
