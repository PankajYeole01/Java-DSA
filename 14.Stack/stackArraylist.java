import java.util.ArrayList;
public class stackArraylist{
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            int temp = list.get(list.size()-1);
            list.remove(list.size()-1);
            return temp;
        }
        //peek
        public static int peek(){
            return list.get(list.size()-1);
        }

}
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
             System.out.println(s.peek());
             System.out.println(s.pop());
        }

    }
}