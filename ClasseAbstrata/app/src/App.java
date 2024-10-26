import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        
       List<Account> list = new ArrayList<>();

       list.add(new SavingsAccount(1001,"alex",500.00,0.01));
       list.add(new BussinesAccount(1002,"maria",100.0,400.0));

       double soma = 0 ;
        for (Account acc :list ){
            soma += acc.getBalance();
        }
        System.out.printf("Total balance :%.2f%n ",soma);

        for(Account acc :list){
            acc.deposito(10.0);
        }
        for(Account acc:list){
            System.out.println(acc.getBalance());
        }
    }


}
