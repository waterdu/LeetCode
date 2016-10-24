package GeekForGeeks;

/**
 * Created by zqz on 2016/10/8.
 */
public class count0inBinary {
    int findZeroBit(int num)
    {
        int n=1,count=0;
        while(n <= num)
        {
            if((n & num)==0){//if this position is 0,count +1
                count++;}
            n<<=1;
        }
        return count;
    }
    int countZero(int num){
        int count=0;
        while(num>0){
            if((num&1)==0){//if ones is 0 count +1
                count++;
            }
            num >>= 1;
        }
        return count;
    }
    public static void main(String[] args){
        count0inBinary t1=new count0inBinary();
        System.out.println(t1.countZero(8));
        System.out.println(t1.findZeroBit(8));
    }
}
