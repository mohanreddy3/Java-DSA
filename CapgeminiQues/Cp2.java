
/*
 * Question 2 Problem Statement – Raj wants to know the maximum marks scored by him in each semester.
 *  The mark should be between 0 to 100 ,if it goes beyond the range display “You have entered invalid mark.”

Sample Input 1:
Enter no of semester:
3
Enter no of subjects in 1 semester:
3
Enter no of subjects in 2 semester:
4
Enter no of subjects in 3 semester:
2
Marks obtained in semester 1:
50
60
70
Marks obtained in semester 2:
90
98
76
67
Marks obtained in semester 3:
89
76
Sample Output 1:
Maximum mark in 1 semester:70
Maximum mark in 2 semester:98
Maximum mark in 3 semester:89

Sample Input 2:
Enter no of semester:
3
Enter no of subjects in 1 semester:
3
Enter no of subjects in 2 semester:
4
Enter no of subjects in 3 semester:
2
Marks obtained in semester 1:
55
67
98
Marks obtained in semester 2:
67
(-)98
Sample Output 2:
You have entered invalid mark.
 */

package CapgeminiQues;

import java.util.Scanner;

public class Cp2 {
    //main
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter no of semesters: ");
        int noOfSem = ip.nextInt();
        for(int i=1; i<=noOfSem; i++){
            System.out.println("Enter no of subjects in sem " + (i) + ": ");
            int noOfSub = ip.nextInt();
            System.out.println("Marks obatained in sem " + (i) + ":");
            int maxMark = -1;
            for(int j=1; j<=noOfSub; j++){
                int mark = ip.nextInt();
                //base case
                if(mark < 0 || mark > 100){
                    System.out.println("invalid mark");
                    return;
                }
                maxMark = Math.max(maxMark, mark );
                
            }
            //printing results
            System.out.println("Max marks in sem " + (i) + ":" +  maxMark);
        }
        ip.close();   
    }
    
}
