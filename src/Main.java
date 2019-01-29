import java.util.Scanner;

/**
 * Created by liudong on 2018/12/6.
 * 现有n个数和两个集合A，B，要求将这n个数放入这两个集合中，设A集合中的数为a1,a2...a|A|,B中的数字为b1,b2...b|B|(|A|,|B|给定)。
 * 对于不同的放置方法，都有一个函数来评估方式的优劣
 * 输入
 输入第一行包含一个数n，表示数字的个数。(2<=n<=100000)

 输入第二行包含两个数|A|和|B|，分别表示A集合和B集合的大小（|A|+|B|=n）。

 输入第三行有n个数，即需要放入集合的数，所有数字都小于等于5。

 输出
 设fi表示第i个数需要放入的集合编号，1表示放入A，2表示放入B。输出包含一行，f1,f2,f3....fn,如果有多种答案，请输出字典序最小的f序列。


 样例输入
 5
 3 2
 4 4 5 4 4
 样例输出
 1 1 2 1 2

 Hint
 根据样例输出的结果，V=4+4.5=8。为所有情况中的最大值。
 *
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int max = 0;
        int[] max_a = new int[10000];
        int[] max_b = new int[10000];

        int number_a = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    max_a[number_a++] = array[i] + array[j] + array[k];
                }
            }

        }

        int number_b = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <= n-1; j++) {
              max_b[number_b++] = array[i] + array[j];
            }
        }

        int m_a=0;
        int m_b = 0;
        for (int i = 0; i < max_a.length; i++) {
            for (int j = 0; j < max_b.length; j++) {
                if (max_a[i]/3 + max_b[j]/2 > max) {
                    max = (max_a[i]/3 + max_b[j]/2);
                    m_a = max_a[i];
                    m_b = max_b[j];
                }
            }
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <= n-1; j++) {
                if(m_b == array[i] + array[j]){
                    array[i] = 2;
                    array[j] = 2;
                }
            }
        }


        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if(m_a == array[i] + array[j] + array[k]){
                        array[i] = 1;
                        array[j] = 1;
                        array[k] = 1;
                    }
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
