import java.util.ArrayList;

public class Bank {
	
    public static void main(String[] args) {
       

        ArrayList<Object> accounts = new ArrayList<Object>();
        accounts.add(new AccountManager("Pearl", 1000, 1));
        accounts.add(new AccountManager("Lerato", 1200, 2));
        accounts.add(new AccountManager("Mosa", 500, 3));
        accounts.add(new AccountManager("Resego", 8000, 4));
        accounts.add(new AccountManager("Nana", 6000, 5));

        for(int x=0; x<accounts.size(); x++)
        {
            AccountManager transact = (AccountManager)accounts.get(x);
            transact.deposit(50);
            transact.withdraw(100);
            System.out.println(transact.toString());
            System.out.println(transact.getBalance());
            
        }

        
       
        
        
    }

    
}