package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.COmpany;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		System.out.println("Entre com o numero de comtribuintes:");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Comtribuinte #"+i+"data:");
			System.out.println("Individual or company (i/c)?");
			char type = sc.next().charAt(0);
			System.out.println("nome:");
			String nome = sc.next();
			System.out.println("renda Anual");
			double renda = sc.nextDouble();
			if(type == 'i') {
				System.out.println("gastos com saude: ");
				double he = sc.nextDouble();
				Individual x = new Individual(nome,renda,he);
				list.add(x);
			}else {
				System.out.println("numero de funcionarios:");
				Integer numeroDeFuncionarios = sc.nextInt();
				list.add(new COmpany(nome,renda,numeroDeFuncionarios));
			}
		}
		System.out.println("");
		System.out.println("TAXES PAID:");
		for(TaxPayer tp :list){
			System.out.println(tp.getNome()+" :$ "+ String.format("%.2f", tp.tax()));
			System.out.println();
		}
		System.out.println();
		double sum = 0.0;
		for(TaxPayer tp :list) {
			sum += tp.tax();
		}
		System.out.println("total de taxas" + String.format("%.2f", sum));
		
		
		
		sc.close();
	}

}
