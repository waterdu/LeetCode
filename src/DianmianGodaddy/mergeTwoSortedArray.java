package DianmianGodaddy;

public class mergeTwoSortedArray {
    public int[] solution(int[] A,int[] B){
        if(A==null) return B;
        if(B==null) return A;
        int n=A.length;
        int[] result=new int[2*n];
        int a=0,b=0,i=0;
        while(a<n&&b<n){
            if(A[a]<=B[b]) result[i++]=A[a++];
            else if(A[a]>B[b]) result[i++]=B[b++];
        }
        if(a==n&&b<n){
            result[i++]=B[b++];
        }
        if(b==n&&a<n){
            result[i]=A[a++];
            i++;
        }
        return result;
    }
//    public void merge(int A[], int B[]) {
//        int m=A.length;
//        int n=B.length;
//        int i = m-1, j = n-1, index = m + n - 1;
//        while (i >= 0 && j >= 0) {
//            if (A[i] > B[j]) {
//                A[index--] = A[i--];
//            } else {
//                A[index--] = B[j--];
//            }
//        }
//        while (i >= 0) {
//            A[index--] = A[i--];
//        }
//        while (j >= 0) {
//            A[index--] = B[j--];
//        }
//    }
    public static void main(String[] args) {
        mergeTwoSortedArray t=new mergeTwoSortedArray();
        int[] A={1,3,5,7};
        int[] B={2,4,9,10};
        int[] result=t.solution(B,A);
    }
}
