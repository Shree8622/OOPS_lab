package RVCE;
import CSE.*;
import java.lang.Thread;
public class Csedept extends Thirdsem {
    public void Welcomemsg()
    {
        System.out.println("Welcome to CSE");
    }
    public void a()
    {
        super.Welcomemsg();
    }
    public static void main(String args[])
    {
        Csedept t = new Csedept();
        t.Welcomemsg();
        t.a();
    }
}
