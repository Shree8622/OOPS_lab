package Practice;
class Demonetisation extends Exception{
    Demonetisation(int val)
    {
        System.out.println("Deposit of old currency of Rs "+val+" crosses Rs 5000 and cannot be deposited");
    }
}
class Account
{
    int bal;
    Account()
    {
        this.bal=500;
    }
    void deposit(int val,String type) throws Demonetisation
    {
        if(type.equals("OLD") && val>5000)
            throw new Demonetisation(val);
        else
        {
            bal+=val;
        }
    }
    void currBalance()
    {
        System.out.println("Current balance:"+bal);
    }
    void withdraw(int val)
    {
        if(bal-val<500)
        {
            System.out.println("Remaining balance <500, Invalid intransaction!");
        }
        else
        {
            bal-=val;
        }
    }
}
class Customer
{
    Account a;
    Customer()
    {
        a=null;
    }
}
public class Q6 {

}
