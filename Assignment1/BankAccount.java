public class BankAccount
    {
        private String name ;
        private float balance;
        private int accNo;

        public BankAccount(String first, float bal, int accNumber)
        {
            name = first;
            balance = bal;
            accNo = accNumber;
        }
       
        public void deposit(float amount)
        {
            balance += amount;
        }

        public void withdraw(float amount)
        {
            if(amount > balance)
            {
                System.out.println("Insufficient funds");
            }
            else
            {
                balance -= amount;
            }
            
        }

        public float getBalance()
        {
            return balance;
        }



    }