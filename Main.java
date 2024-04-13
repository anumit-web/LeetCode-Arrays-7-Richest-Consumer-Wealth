/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Final Value of Variable After Performing Operations");

        Solution solution = new Solution();

        int[][] accounts1 = {{1,2,3},{3,2,1}};
        int  count1 = solution.maximumWealth(accounts1);
        System.out.println("Count = " + count1);

        int[][] accounts2 = {{1,5},{7,3},{3,5}};
        int  count2 = solution.maximumWealth(accounts2);
        System.out.println("Count = " + count2);


    }
}


