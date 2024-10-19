import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        //upCasting 
        //Casting da subClasse para superclasse
        //uso comun:polimorfismo

        //downCasting
        //casting da superclasse para subclasse
        //plavra instanceof
        //usocomun:metodos que recebem parametros genericos(ex:equal:)
        Account acc = new Account(1001,"diego",0.0);
        BussinesAccount bacc = new BussinesAccount(1002,"joão",0.0,500.0);

        //upCasting
        //converter subclasse para superclasse
        Account acc1 = bacc;
        Account acc2 = new BussinesAccount(1003,"bob",0.0,600.0);

        Account acc3= new SavingsAccount(1004,"Anna",0.0,0.01);

        //DownCasting
        //converter superclasse para subclasse

        BussinesAccount acc4 = (BussinesAccount)acc2;
        acc4.loan(100.0);
        //sacc2.loan();//não existe
        if(acc3 instanceof BussinesAccount){
            BussinesAccount acc5 = (BussinesAccount)acc3;
            acc5.loan(200.0);
            System.out.println("emprestimo realizado!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("update!");
        }
        

    }

}
