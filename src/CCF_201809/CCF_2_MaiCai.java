import java.util.Scanner;

public class CCF_2_MaiCai {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[][] v1 = new int[n][2];
        int[][] v2 = new int[n][2];
        int ans = 0;
        for (int i = 0; i <  n ; i++) {
            for (int j = 0; j < 2; j++) {
                v1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <  n ; i++) {
            for (int j = 0; j < 2; j++) {
                v2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for(int j = 0; j< n;j++) {
                if (v1[i][0] <= v2[j][1] && v1[i][1] >= v2[j][0]) {
                     ans += Math.min( v1[i][1],v2[j][1]) - Math.max(v1[i][0] , v2[j][0]);
                }
            }
        }
        System.out.print(ans);
    }
}
