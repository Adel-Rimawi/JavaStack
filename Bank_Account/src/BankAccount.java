import java.util.Random;

public class BankAccount {
	private String accountNumber;
    private double checkingBalance;
    private double savingBalance;
    public static int accounts = 0;
    public static double totalAmount =0;
    

    public  BankAccount(){
    	BankAccount.accounts +=1;
    	this.checkingBalance = 0;
		this.savingBalance = 0;
        this.accountNumber = generateAccountNumber();
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

        public double getsavingBalance(){
        return this.savingBalance;
    }

        private String generateAccountNumber(){
        	Random r = new Random();
        	String str = "";
            for (int i =0; i<10; i++){
                str = str+r.nextInt(10);
            }
            return str;
        }
        public double checkinggetter() {
        	return this.checkingBalance;
        }
        public double savinggetter() {
        	return this.savingBalance;
        }
    public void deposit (String accountName, int depositAmount){
    	if (accountName =="saving") {
    		this.savingBalance+=depositAmount;
    	}
    	else if (accountName =="checking") {
    		this.checkingBalance+=depositAmount;
    	}this.totalAmount += depositAmount;
        
    }
}
