package com.company.hacker.rank.interview.preparation.beginner.matching.socks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Result {
    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        AtomicInteger sockPairs = new AtomicInteger();
        getSockMap(ar).forEach((sock, sockList) -> {
            sockPairs.set(sockPairs.get() + sockList.size() / 2);
        });
        System.out.println("sock pairs :"+sockPairs.get());
        return sockPairs.get();
    }

    private static Map<Integer, List<Integer>> getSockMap(List<Integer> ar) {
        Map<Integer, List<Integer>> sockMap = new HashMap<>();

        ar.forEach(sock -> {
            List<Integer> sockList = sockMap.get(sock);
            if (Objects.isNull(sockList)) {
                sockList = new ArrayList<Integer>();
                sockList.add(sock);
                sockMap.put(sock, sockList);
            } else {
                sockList.add(sock);
                sockMap.put(sock, sockList);
            }
        });

        return sockMap;
    }
}
