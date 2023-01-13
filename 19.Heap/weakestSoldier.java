import java.util.*;
public class weakestSoldier {
    public static class rows implements Comparable<rows>{
        int soldier;
        int idx;
        rows(int soldier,int idx){
            this.soldier= soldier;
            this.idx = idx;
        }
        @Override
        public int compareTo(rows r){
            if(this.soldier == r.soldier){
                return this.idx-r.idx;
            }
            return this.soldier-r.soldier;
        }
    }
    public static void main(String args[]){
        int army[][]={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}
                     }; 
        PriorityQueue<rows>pq = new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int soldier = 0;
            for(int j=0;j<army[0].length;j++){
                if(army[i][j]==1){
                    soldier++;
                }
            }
            pq.add(new rows(soldier,i));
        }
        for(int i=0;i<2;i++){
            System.out.print("R"+pq.remove().idx+" ");
        }

    }
}
