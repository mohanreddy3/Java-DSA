package Array_List;

import java.util.*;

public class Al1 {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        Scanner ip = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        //input
        for(int i=0; i<5;i++){
            list.add(ip.nextInt());
        } 
        //output
        for(int i=0; i<5; i++){
            System.out.print(list.get(i) + " ");

        }
        System.out.println(list);  //-> [, , ,]

        ip.close();


    }
    
}
