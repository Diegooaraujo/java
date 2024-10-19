import entities.BussinesAccount;
import entities.SavingsAccount;
import entities.Account;
public class App {
    public static void main(String[] args) throws Exception {
        //sobreposição é a implemetação de uma superclasse na subclasse
        //@override é usado em um metodo sobreposto

        //A opereção de saque possui uma taxa dno valor de 5.0. Entretanto, se a conta for do tipo poupança, esta taxa não deve ser cobrada. 

        //sobrescrevendo o metodo saque da classe Account

        Account acc1 = new Account(1001,"alex",1000.0);
        acc1.saque(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002,"Anna",1000.0,0.01);
        acc2.saque(200.0);
        System.out.println(acc2.getBalance());

        //super 
        // é possivel chamar a implementação da superclasse usando a palavra super.
        //BusinesAccount, a regra para saque seja realizar o saque normalmente da superclasse, e descontar mais 2.0;
        Account acc3 = new BussinesAccount(1003,"Diego",1000.0,500.0);
        acc3.saque(200.0);
        System.out.println(acc3.getBalance());

    }
}
