package com.company.hacker.rank.interview.preparation.beginner.repeated.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionRepeatedString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "repeatedString"+System.currentTimeMillis();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output/hackerrank/repeated.string/"+fileName));
        System.out.println("read string");
        String s = bufferedReader.readLine();
        System.out.println("length");
        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
