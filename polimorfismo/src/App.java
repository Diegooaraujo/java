
import entities.SavingsAccount;
import entities.Account;
public class App {
    public static void main(String[] args) throws Exception {
        //polismorfismo é recurso que permite que variaveis de um mesom tipo mais generico possam apontar para objetso de tipos especificos diferentes, tendo assim comportamentos diferentes conforme cada tipo especifico.

        //variaveis do mesmo tipo
        Account x = new Account(1020,"alex",1000.0);
        Account y = new SavingsAccount(1023,"anna",1000.0,0.01);

        x.saque(50.0);//945
        y.saque(50.0);//950

    }
}
