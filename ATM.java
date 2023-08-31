import java.util.HashMap;

public class ATM
{
    private HashMap <String, Double> atmMachine;

    public ATM ()
    {
        atmMachine = new HashMap <String, Double> ();
    }
    public void openAccount (String userID, double amount) throws Exception
    {
        //if user already exists, throw error
        if (atmMachine.containsKey (userID))
        {
            throw new Exception ("Error: User already exists.");
        }
        else
        {
            atmMachine.put (userID, amount);
        }
    }
    public void closeAccount (String userID) throws Exception
    {
        if (atmMachine.get (userID) > 0)
        {
            throw new Exception ("Error: Please withdraw your money before closing your account.");
        }
        else
        {
            atmMachine.remove (userID);
        }
    }
    public double checkBalance (String userID) throws Exception
    {
        if (atmMachine.containsKey (userID))
        {
            return atmMachine.get(userID);
        }
        throw new Exception ("Error: Account does not exist");
    }
    public double depositMoney (String userID, double amount) throws Exception
    {
        if (atmMachine.containsKey (userID))
        {
            double originalMoney = atmMachine.get (userID); //balance before deposit
            atmMachine.put (userID, amount + originalMoney);
            return amount;
        }
        throw new Exception ("Error: You are broke brother");

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