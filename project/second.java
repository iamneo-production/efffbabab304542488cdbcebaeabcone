import java.util.Scanner;
import java.util.*;
public class second {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String>bookname = new ArrayList<>();
        List<Integer>price = new ArrayList<>();
        for(int i =0;i<5;i++)
        {
        System.out.println("enter the book name");
        bookname.add(s.next());
        System.out.println("enter the book price");
        price.add(s.nextInt());
        }   
        Collections.sort(price,Collections.reverseOrder());
        

    }
}
