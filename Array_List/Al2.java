//Multi Dimensional ArrayList
package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Al2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        // int size = ip.nextInt();
        ArrayList<ArrayList<Integer>>  list = new ArrayList<>();
        //intialization
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        } 

        //add elements
        for (int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                list.get(i).add(ip.nextInt());
            }
        }
        System.out.print(list);
        ip.close();
    }
    
}
//output:
// 1 2 3 4 5 6 7 8 9 10 11 12
// [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
