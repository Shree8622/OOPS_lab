package Dump;

import java.lang.*;
import Dump.A1;
class Utility
{
    public void produce(int[] fruit_list,String name)
    {

        System.out.println(name+" is producing");
        for(int i=0;i<4;i++)
        {
            int t = (int)(Math.random()*100);
            if(t%2!=0)
                fruit_list[i]= fruit_list[i] + 1;
        }
    }
    public int select()
    {
        int t = (int)(Math.random()*10);
        return t%4;
    }
    public void consume(int i,int[] fruit_list,String name)
    {
        if(fruit_list[i]>0)
        {
            System.out.println(name+" is consuming");
            fruit_list[i] = fruit_list[i]-1;
        }
        else
            System.out.println(i+ " not available!");
    }
    public void view_list(int[] fruit_list)
    {
        System.out.println("Contents:- ");
        System.out.println("Apples: "+fruit_list[0]);
        System.out.println("Oranges: "+fruit_list[1]);
        System.out.println("Grapes: "+fruit_list[2]);
        System.out.println("Watermelons: "+fruit_list[3]);
    }
}
class List
{
    int fruit_list[] = new int[4];
}
public class Market extends Thread{
    List a;
    boolean isFarmer,isAccessed;
    String name;
    Utility call_obj;
    Market(boolean isFarmer,String name,Utility call_obj,List list)
    {
        this.isFarmer = isFarmer;
        this.name = name;
        this.isAccessed = false;
        this.call_obj = call_obj;
        this.a = list;
    }
    public void run()
    {
        super.run();
        int j=1;
        while(j>0)
        {
            System.out.println("Running Thread "+name);
            if(this.isFarmer)
            {
                synchronized (call_obj) {
                    call_obj.produce(a.fruit_list, name);
                    call_obj.view_list(a.fruit_list);
                }
            }
            else
            {
                try
                {
                    wait();
                }
                catch(Exception e)
                {
                    System.out.println(name + " wait interrupted");
                }

                synchronized (call_obj)
                {
                    int i = call_obj.select();
                    call_obj.consume(i,a.fruit_list,name);
                    call_obj.view_list(a.fruit_list);
                }
            }
            try
            {
                Thread.sleep(10);
            }
            catch(Exception e)
            {
                System.out.println(name + "interrupted");
            }
            j--;
        }

    }
    public static void main(String[] args) {
        List l = new List();
        Utility call_obj= new Utility();
        Market farmer1 = new Market(true,"Farm1",call_obj,l);

        Market usr1 = new Market(false,"Usr1",call_obj,l);

        farmer1.start();
        usr1.start();

        System.out.println("Main thread exiting...");

    }

}