package LeetCode;
import java.util.*;
/**
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei),
 * find the minimum number of conference rooms required.
 For example,
 Given [[0, 30],[5, 10],[15, 20]],
 return 2.
 */

//Interval class has already been defined in the meeting room 1
public class MeetingRoomsII {
    public int minMeetingRooms(Interval[] intervals){
        //base case first
        if(intervals==null||intervals.length==0) return 0;
        if(intervals.length==1) return 1;
        Arrays.sort(intervals,new Comparator<Interval>(){
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        PriorityQueue<Integer> endTimes=new PriorityQueue<>();
        endTimes.offer(intervals[0].end);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i].start>=endTimes.peek()){
                endTimes.poll();
            }
            endTimes.offer(intervals[i].end);
        }
        return endTimes.size();

    }
}
//    public int minMeetingRooms(Interval[] intervals) {
//        if(intervals == null || intervals.length == 0) return 0;
//        Arrays.sort(intervals, new Comparator<Interval>(){
//            public int compare(Interval i1, Interval i2){
//                return i1.start - i2.start;
//            }
//        });
//        // 用堆来管理房间的结束时间
//        PriorityQueue<Integer> endTimes = new PriorityQueue<Integer>();
//        endTimes.offer(intervals[0].end);
//        for(int i = 1; i < intervals.length; i++){
//            // 如果当前时间段的开始时间大于最早结束的时间，则可以更新这个最早的结束时间为当前时间段的结束时间，如果小于的话，就加入一个新的结束时间，表示新的房间
//            if(intervals[i].start >= endTimes.peek()){
//                endTimes.poll();
//            }
//            endTimes.offer(intervals[i].end);
//        }
//        // 有多少结束时间就有多少房间
//        return endTimes.size();
//    }