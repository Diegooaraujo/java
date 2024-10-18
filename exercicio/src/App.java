
import java.util.Date;
import entitiesEnums.OrderStatus;
import pedidos.Order;
public class App {
    public static void main(String[] args) throws Exception {
        //enumeração
        Order order = new Order(1080,new Date (), OrderStatus.Aguardando_Pagamento);

        System.out.println(order);
        OrderStatus os1 = OrderStatus.Entregue;
        OrderStatus os2 = OrderStatus.valueOf("entregue");
    }
}
