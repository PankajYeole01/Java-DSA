import java.util.*;
public class nearestCars {
    public static class point implements Comparable<point>{
        int distSq;
        int idx;
        point(int distSq,int idx){
            this.distSq = distSq;
            this.idx = idx;
        }
        @Override
        public int compareTo(point P2){
            return this.distSq - P2.distSq;
        }


    }
    public static void main(String args[]){
        int pts[][]={{3,3},{5,-1},{-2,4}};
        //only two nearest cars
        int k =2;
        PriorityQueue <point>pq = new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new point(distSq,i));
        }
        for(int i=0;i<k;i++){
            System.out.print("C"+pq.remove().idx+" ");
        }
        
    }
}
