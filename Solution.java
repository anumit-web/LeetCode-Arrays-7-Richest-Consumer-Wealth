/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {

    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int s = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                s += accounts[i][j];
            }
            if (s > wealth) {
                wealth = s;
            }
        }
        return wealth;
    }

}
