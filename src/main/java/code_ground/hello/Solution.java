package code_ground.hello;

import java.util.Scanner;

public class Solution {
    private static int Answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 0; test_case < T; test_case++) {
            String stmt = sc.next();

            int[] hello = new int[4];

            for (int i = 0; i < stmt.length(); i++) {
                char current = stmt.charAt(i);

                if (current == 'h') {
                    hello[0]++;
                } else if (current == 'e') {
                    hello[1]++;
                } else if (current == 'l') {
                    hello[2]++;
                } else if (current == 'o') {
                    hello[3]++;
                }
            }

            hello[2] /= 2;

            Answer = stmt.length();
            for (int i = 0; i < hello.length; i++) {
                if (hello[i] < Answer) {
                    Answer = hello[i];
                }
            }

            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }
}