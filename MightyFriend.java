// this is a codechef question rated as 1406 Mighty Friend
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
            int K = sc.nextInt();
            int[] scores = new int[N];
            for (int i = 0; i < N; i++) {
                scores[i] = sc.nextInt();
            }
            int[] Motu = new int[(N + 1) / 2];
            int[] Tomu = new int[N / 2];
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    Motu[i / 2] = scores[i];
                } else {
                    Tomu[i / 2] = scores[i];
                }
            }
            Arrays.sort(Motu);
            Arrays.sort(Tomu);
            int MotuScore = 0;
            int TomuScore = 0;
            for (int i = 0; i < Motu.length; i++) {
                MotuScore += Motu[i];
            }
            for (int i = 0; i < Tomu.length; i++) {
                TomuScore += Tomu[i];
            }
            int motuIndex = Motu.length - 1;
            int tomuIndex = 0;
            while (K-- > 0 && tomuIndex < Tomu.length) {
                int m = Motu[motuIndex];
                int t = Tomu[tomuIndex];
                if (m <= t) {
                    break;
                }
                MotuScore -= m;
                TomuScore += m;
                TomuScore -= t;
                MotuScore += t;
                motuIndex--;
                tomuIndex++;
            }
            if (MotuScore < TomuScore) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
