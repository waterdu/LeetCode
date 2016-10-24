package DianmianGodaddy;

import java.util.*;

/**
 * Created by zqz on 2016/10/23.
 * a1 = [1, 2, 3, 5, 6, 2, 7]
 * a2 = [2, 5, 2, 8, 9, 4]
 * 输出：[5, 2, 2]
 * 如果有重复两次的数输出里面也要重复两次
 */
public class SameElementsInTwoArrays {
    public List<Integer> solution(int[] A,int[] B){
        Arrays.sort(A);
        Arrays.sort(B);
        List<Integer> result=new ArrayList<>();
        int i=A.length-1;
        int j=B.length-1;
        while(i>=0&&j>=0){
            if(A[i]>B[j]){
                i--;
            }else if(A[i]<B[j]){
                j--;
            }else{
                System.out.println(A[i]);
                result.add(A[i]);
                i--;
                j--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        mergeTwoSortedArray t=new mergeTwoSortedArray();
        int[] a1 = {1, 2, 3, 5, 6, 2, 7};
        int[]  a2 = {2, 5, 2, 8, 9, 4};
//        List<Integer> res=t.solution(a1,a2);

    }
}
