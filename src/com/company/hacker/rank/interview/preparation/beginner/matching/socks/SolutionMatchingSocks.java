package com.company.hacker.rank.interview.preparation.beginner.matching.socks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SolutionMatchingSocks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "matching-socks"+System.currentTimeMillis()+".txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output/hackerrank/matching.socks/"+fileName));
        System.out.println("enter total number of socks:");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("enter socks array each number in array represents unique color of socks:");

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
