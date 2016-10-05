package PocketGemsMianjing;
import java.util.*;
/**
 * Created by zqz on 2016/10/5.
 */
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        List<Integer>[] bucket=new List[nums.length+1];
        List<Integer> res=new ArrayList<>();
        for(int num:nums){//store freq
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int key:freq.keySet()){//就是把它反向存array里
            int frequency=freq.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        for(int pos=bucket.length-1;pos>0;pos--){
            if(bucket[pos]!=null){
                for(int i=0;i<bucket[pos].size()&&res.size()<k;i++){
                    res.add(bucket[pos].get(i));
                }
            }
        }
        return res;
    }
    public List<Integer> topKFrequentDetailComment(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();

        List<Integer> res=new ArrayList<>();
        for(int num:nums){//store freq
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        List<Integer>[] array=new List[nums.length+1];//the smallest number is 1,so 0+1=1
        for(int key:freq.keySet()){
            int frequency=freq.get(key);
            if(array[frequency]==null){//fre quent here
                array[frequency]=new ArrayList<>();
            }
            array[frequency].add(key);//add all key to this certain frequent
        }
        for(int pos=array.length-1;pos>0;pos--){//get from large to small
            if(array[pos]!=null){
                for(int i=0;i<array[pos].size()&&res.size()<k;i++){//first check over flow, then check get k already yet
                    res.add(array[pos].get(i));
                }
            }
        }
        return res;
    }
}
