/*
public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swapWithoutTemp(a, b);
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Inside swapWithoutTemp: a = " + a + ", b = " + b);
    }
}

*/
/*
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ReverseArrayList {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        Iterator i = list.iterator();
        System.out.println("printing the list....");
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        Iterator i2 = list.iterator();
        Collections.reverse(list);
        System.out.println("printing list in reverse order....");
        while(i2.hasNext())
        {
            System.out.println(i2.next());
        }
    }
}*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(60);
        list.add(20);
        list.add(90);

        Iterator i = list.iterator();
        System.out.println("printing the list....");
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        Comparator cmp = Collections.reverseOrder();
        Collections.sort(list,cmp);
        System.out.println("printing list in descending order....");
        Iterator i2 = list.iterator();
        while(i2.hasNext())
        {
            System.out.println(i2.next());
        }

    }
}