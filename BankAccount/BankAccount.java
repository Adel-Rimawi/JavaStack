public class BankAccount{
    private String accountNumber;
    private double checkingBalance;
    private double savingBalance;
    private static int accounts = 0;
    private static double totalAmount =0;
    

    public BankAccount(){
        this.accounts +=1;
        this.totalAmmount += savingBalance;
        this.accountNumber = generateAccountNumber();
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

        public double getsavingBalance(){
        return this.savingBalance;
    }

    public void deposit (String accountName, int depositAmount){
        
    }
}