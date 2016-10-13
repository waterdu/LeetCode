package FacebookDianmian;

/**
 * 给a list of segment，求出与其他segment相交最多的segment
 比如[1,3] [2,4] [7,8] [4,5] 返回[2,4] 因为它与[1,3]和[4,5]相交
 * keep an active_segment (a hashmap) to keep track of how many intersections each segment have. When adding a segment,
 all segments currently in active_segments should be added 1 if they intersect the added segments. The segments don't
 intersect the added segment will be dropped because the rest segments won't intersect it either, so they have reached
 max number of intersections. Before drop each passed segment, compare its number with the max intersections, if larger
 than max_intersection, we find a new max intersection segment.

 */
public class MostOverlapSegment {
}
