package entities;

public class COmpany extends TaxPayer {

	private Integer numberOfEmployees;


	public COmpany(String nome, Double anualIncome, Integer numberOfEmployees) {
		super(nome, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}


	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}


	@Override
	public double tax() {
		if(numberOfEmployees > 10) {
			return getAnualIncome()*0.14 ;
		}else {
			return getAnualIncome()*0.16;
		}
	}

}
