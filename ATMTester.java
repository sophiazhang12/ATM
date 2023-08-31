public class ATMTester
{
    public static void main (String [] args) throws Exception
    {
        ATM bank = new ATM ();
        bank.openAccount("newDude", 100);
        //bank.openAccount ("newDude", 10); //should throw error; works
        //bank.closeAccount ("newDude"); //should throw error; works
        //idk how to test the actual closing tho because i don't have the deposit method yet

        System.out.println (bank.checkBalance ("newDude")); //should return 100; works
        //bank.checkBalance ("n"); //should throw error; works

        bank.depositMoney ("newDude", 25);
        bank.depositMoney ("n", 20); //throw error
    }
}