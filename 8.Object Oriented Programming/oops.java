import java.util.*;
public class oops{
     public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
     }

}
class Pen{
    private String color;
    private int tip;
    //getters
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    //setters
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}