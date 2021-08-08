package com.company.hacker.rank.interview.preparation.beginner.cloudjumping;

import java.util.List;

public class Result {
    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        System.out.println("jumpingOnClouds");
        int n = 0;
        int jumps = 0;
        while (n < c.size()-1) {
            //check whether the cloud is t
            if (c.get(n) == 0 && (n + 1 < c.size())) {
                if (n + 2 < c.size() && c.get(n + 2) == 0) {
                    n = n+ 2;
                    jumps++;

                } else {
                    n++;
                    jumps++;
                }
            }
        }
        System.out.println("jumps:"+jumps);
        return jumps;
    }
}
