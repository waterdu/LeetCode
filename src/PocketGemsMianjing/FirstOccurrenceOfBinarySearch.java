package PocketGemsMianjing;

/**
 * Created by zqz on 2016/10/7.
 * Given an array, [1,1,1,1,4,4,4,6,6,6,6,8,8] and an integer z. Return the index of the first occurrence of z in the given array.
 Follow-up: Can you improve run-time if input is sorted?

 Example: For the above array, if z=6, return 7 i.e. the index of the first occurrence of 6 in the array.
 */
public class FirstOccurrenceOfBinarySearch {//binary search if array is sorted. if you find z,
// then just iterate in the negative direction to find the first occurrence.
    public int firstOccurranceOfBinarySearch(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int firstIndex=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;//you need to answer the difference bewtween >>and >>>
            //it's very slow in java, you'de better use /2
            if(nums[mid]==target) {
                firstIndex=Math.min(mid,firstIndex);
                high=mid-1;
            }else if(nums[mid]<target){//need be larger
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(firstIndex!=Integer.MAX_VALUE){
            return firstIndex;
        }
        return -1;//key not found
    }
    public static void  main(String[] strg){
        FirstOccurrenceOfBinarySearch t=new FirstOccurrenceOfBinarySearch();
//        System.out.println((2>>1));
//        System.out.println((2>>>1));
//        System.out.println((0>>>2));
//        System.out.println(((0)>>2));
//        System.out.println(((-1)>>3));
//        System.out.println(((-1)>>>3));
        int[] array= { 1, 1, 1, 1, 2, 2, 3, 3, 3 };
        int result=t.firstOccurranceOfBinarySearch(array,3);
        System.out.println(result);
    }

}
