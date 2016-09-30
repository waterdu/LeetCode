package LeetCode;
import java.util.*;
/**
 * Created by zqz on 2016/9/30.
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei),
 * determine if a person could attend all meetings. For example, Given [[0, 30],[5, 10],[15, 20]], return false.
 */
public class MeetingRooms {
    //typical time interval question, sort interval by end time first,greedy algorithm
    public boolean canAttendMeetings(Interval[] intervals){
        if(intervals==null||intervals.length<2){
            return true;
        }
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i].end>intervals[i+1].start){
                return false;}
        }
        return true;
    }

    public static void main(String[] args){
        MeetingRooms t1=new MeetingRooms();
        Interval i1=new Interval(0,30);
        Interval i2=new Interval(30,40);
        Interval i3=new Interval(29,60);
        boolean result=t1.canAttendMeetings(new Interval[]{i1,i3});


            System.out.println(result);


    }
}
 class Interval{
    int start;
    int end;
    public Interval(int start,int end){
        this.start=start;
        this.end=end;
    }
}