public class ATMTester
{
    public static void main (String [] args)
    {
        ATM bank = new ATM ();
        bank.openAccount("newDude", 100);
        bank.openAccount ("newDude", 10); //should throw error; works
        bank.closeAccount ("newDude"); //should throw error
    }
}