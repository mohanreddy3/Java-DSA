// The thing is that we can't take Characters as Input in ArrayList (can't use Primitive Types) 
package Array_List;

import java.util.ArrayList;
import java.util.*;

public class accenturepbm1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the index: ");
        int num = ip.nextInt();
        ArrayList<String>  list = new ArrayList<>(2);
        //input
        System.out.println("Enter the string: ");
        for(int i=0; i<1; i++){
            list.add(ip.next());
        }
        //output
        for(int i=0; i<1; i++){
            System.out.print(list.get(i));
        }
        // System.out.print(list);
        // for(int i=0; i<1; i++){
        //     list.set(num, list.get(i));
        // }

    }
    
}
