package GeekForGeeks;

/**
 * Created by zqz on 2016/10/5.
 */
public class count1inBinary {
    public int  countOnes(int num) {
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        count1inBinary t1=new count1inBinary();
        System.out.println(t1.countOnes(4));
    }
}
