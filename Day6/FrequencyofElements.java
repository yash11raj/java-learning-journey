package Day6;

import java.util.Scanner;

public class FrequencyofElements {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the elements:");
         int[] num = new int[5];
        boolean[] visited = new boolean[5];

        for(int i = 0; i < num.length; i++)
        {
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < num.length; i++)
        {
            if(visited[i])
            {
                continue;
            }

            int freq = 1;

            for(int j = i + 1; j < num.length; j++)
            {
                if(num[i] == num[j])
                {
                    freq++;
                    visited[j] = true;
                }
            }

            System.out.println(num[i] + " occurs " + freq + " times");
        }
    }
}