package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Q9 {
    ArrayList<Integer> a;
    Q9()
    {
        a = new ArrayList<Integer>();
    }
    void add(int val)
    {
        a.add(val);
    }
    void copy()
    {
        ArrayList<Integer> b = (ArrayList<Integer>) a.clone();
        System.out.println(b);
    }
    void rev()
    {
        ArrayList<Integer> rev = new ArrayList<>();
        for(int i=a.size()-1;i>-1;i--)
            rev.add(a.get(i));
        System.out.println(a);
    }
    void sort()
    {
        Collections.sort(a);
        System.out.println(a);
    }
    void getSubarr()
    {
        ArrayList<Integer> l= (ArrayList<Integer>) a.subList(2,3);
        System.out.println(l);
        String s = "";
//        s.spl
    }
    void toarr()
    {
        Integer arr[] = (Integer[]) a.toArray();
        for(int i=0;i< arr.length;i++)
            System.out.println(arr[i]);
    }
}
