/*
 *  Shraddha Kapoorʼs professor suggested that she study hard and prepare 
well for the lesson on seasons. If her professor says month then, she has 
to tell the name of the season corresponding to that month. So write the 
program to get the solution to the above task?
 March to May - Spring Season
 June to August - Summer Season
 September to November - Autumn Season
 December to February - Winter Season
 Note: The entered month should be in the range of 1 to 12. If the user enters a 
month less than 1 or greater than 12 then the message “Invalid Month Enteredˮ 
should get displayed.
 Sample Input:
 Enter month: 6
 Sample Output:
 Season: Summer
 */



package CapgeminiQues;

import java.util.Scanner;

public class Cp4 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter month: ");
        int month = ip.nextInt();
        //egde case
        if(month < 1 || month > 12){
            System.out.println("Invalid Month Entered!");
        }
        else if(month <= 12 && month <=2 ){
            System.out.println("Winter is Coming!");
        }
       else  if(month <=5 && month >= 3){
            System.out.println("Spring Season");
        }
        else if(month <=8 && month >=6){
            System.out.println("Summer Season");
        }
        else if(month <=11 && month >=9){
            System.out.println("Autumn Season");
        }
        ip.close();
    }

    
}
