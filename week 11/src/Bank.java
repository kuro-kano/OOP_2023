
public class Bank {
    private Account acct[];
    private int numAcct;
    
    public Bank(){ acct = new Account[10]; }
    
    public void addAccount(Account ac){ acct[this.getNumAccount()] = ac; numAcct++;}
    
    public Account getAccount(int index){ return acct[index]; }
    
    public int getNumAccount(){ return acct.length; }
}
