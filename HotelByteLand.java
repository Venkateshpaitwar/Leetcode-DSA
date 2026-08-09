// this is a codechef question rated as 1405
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
            int N = sc.nextInt();
            int[] arrival = new int[N];
            int[] departure = new int[N];
            for (int i = 0; i < N; i++) {
                arrival[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                departure[i] = sc.nextInt();
            }
            Arrays.sort(arrival);
            Arrays.sort(departure);
            int i = 0;
            int j = 0;
            int current = 0;
            int max = 0;
            while (i < N && j < N) {
                if (arrival[i] < departure[j]) {
                    current++;
                    max = Math.max(max, current);
                    i++;
                } else {
                    current--;
                    j++;
                }
            }
            System.out.println(max);
        }
	}
}
