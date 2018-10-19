import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by liudong on 2018/10/19.
 * 201712-2 游戏
 * CCF
 * JDK 1.8
 * 循环列表
 */
public class YouXi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 1;
        int check = 0;
        Friend[] friend = new Friend[n];
        // 编好数的小朋友
        for (int i = 0; i < n ; i++) {
            friend[i] = new Friend(i+1,count++);
        }
        while(true){
            //判断报数
            for (int i = 0; i < n ; i++) {
                if (friend[i].getNumber() != 0 && (friend[i].getNumber() % k ==0 || (friend[i].getNumber()%10 == k))) {
                    friend[i].setNumber(0);
                    check++;
                }
            }
            if (check == n-1) {
                break;
            }
            for (int i = 0; i < n ; i++) {
                if(friend[i].getNumber() != 0){
                    friend[i].setNumber(count++);
                }
            }

        }
        for(int i= 0;i<n;i++){
            if (friend[i].getNumber() != 0) {
                System.out.print(friend[i].getPosition());
            }

        }


    }
}
class  Friend{
    private int position;
    private int number;
    public Friend(int position, int number){
        this.position = position;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getPosition() {
        return position;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}