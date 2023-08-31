import java.util.HashMap;

public class ATM
{
    private HashMap <String, Double> atmMachine;

    public ATM ()
    {
        atmMachine = new HashMap <String, Double> ();
    }
    public void openAccount (String userID, double amount)
    {
        //if user already exists, throw error
        if (atmMachine.containsKey (userID))
        {
            System.out.println ("Error: User already exists.");
        }
        else
        {
            atmMachine.put (userID, amount);
        }
    }
    public void closeAccount (String userID)
    {
        if (atmMachine.get (userID) > 0)
        {
            System.out.println ("Error: Please withdraw your money before closing your account.");
        }
        else
        {
            atmMachine.remove (userID);
        }
    }
    public double checkBalance (String userID)
    {

    }
    public double depositMoney (String userID, double amount)
    {

    }
    public double withdrawMoney (String userID, double amount)
    {

    }
    public boolean transferMoney (String fromAccount, String toAccount,double amount)
    {

    }
    public void audit ()
    {

    }
}