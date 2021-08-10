package com.company.hacker.rank.interview.preparation.arrays.two.dimension.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> twoDimensionalArray) {
        int maxValue = sumOfArray(twoDimensionalArray, 1, 1);
        for (int x = 1; x < 5; x++) {
            for (int y = 1; y < 5; y++) {
                int nextValue = sumOfArray(twoDimensionalArray, x, y);
                if (nextValue > maxValue) {
                    maxValue = nextValue;
                }
            }
        }

        return maxValue;
    }

    public static int sumOfArray(List<List<Integer>> array, int x, int y) {
        return array.get(x - 1).get(y - 1) + array.get(x - 1).get(y) + array.get(x - 1).get(y + 1)
                + array.get(x).get(y)
                + array.get(x + 1).get(y - 1) + array.get(x + 1).get(y) + array.get(x + 1).get(y + 1);
    }

}

public class SoultionTwoDMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
