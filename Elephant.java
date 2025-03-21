/*An elephant wants to visit his friend, who lives at position X. 
The elephant starts at position 0 and can move in steps of 1, 2, 3, 4, or 5 units. 
You need to find the minimum number of steps the elephant needs to reach exactly at position X.

Input:
A single integer X (1 ≤ X ≤ 1,000,000), which represents the friend's house position.
Output:
A single integer, the minimum number of steps required.*/

import java.util.Scanner;
public class Elephant {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance to friend's house");
        int dist=sc.nextInt();
        System.out.println("Number of steps are-:");
        System.out.println((dist/5)+(dist%5!=0?1:0));
    }
}
