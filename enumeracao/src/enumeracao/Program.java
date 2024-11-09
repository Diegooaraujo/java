package enumeracao;

import java.util.Date;

import entities.enuns.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(1080,new Date(),OrderStatus.AGUARDANDO_PAGAMENTO);
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.AGUARDANDO_PAGAMENTO;
		
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
