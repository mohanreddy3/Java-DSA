/*
 * Weight of a hill pattern
Given,
the total levels in a hill pattern (input1),
the weight of the head level (input2), and
the weight increments of each subsequent level (input3),
you are expected to find the total weight of the hill pattern.
"Total levels" represents the number of rows in the pattern.
"Head level" represents the first row.
Weight of a level represents the value of each star (asterisk) in that row.
The hill patterns will always be of the below format, starting with 1 star at head level and increasing 1 
star at each level till level N.
*
**
***
****
*****
******
. . .and so on till level N.
Example2 -
Given,
the total levels in the hill pattern = 4
the weight of the head level = 1
the weight increments of each subsequent level = 5
Then, Total weight of the hill pattern will be = 1 + (6+6) + (11+11+11) + (16+16+16+16) = 1 + 12 + 33 + 64 
= 110

 */
package Cognizant_Problems;

public class pr3 {
    public static void main(String[] args) {
        int totalLevels =4;
        int headWeight = 1;
        int weightIncrement = 5;
        System.out.println(calculateTotalWeight(totalLevels , headWeight, weightIncrement));
    }
    //Function.
    public static int calculateTotalWeight(int totalLevels, int headWeight, int weightIncrement){
        int totalWeight = 0;
        int currentWeight = headWeight;
        //loop 
        for(int level = 1; level<=totalLevels; level++ ){
            int levelWeight = currentWeight * level;
            totalWeight += levelWeight;
            currentWeight += weightIncrement;
        }
        return totalWeight;
    }

    
}
