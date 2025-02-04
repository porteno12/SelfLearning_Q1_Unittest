package org.example;

public class MyUtils {
    /**
     * @author - ronny
     * @param q - of integers
     * @return - true if all numbers are double digit
     */
    public static boolean doubleDigits(Queue<Integer> q) {
        Queue<Integer> tmpQ = new Queue<>();
        boolean all2digit = true;
        while(!q.isEmpty()){
            int val = q.remove();
            if(Math.abs(val)<10 || Math.abs(val)>99)
                all2digit=false;
            tmpQ.insert(val);
        }
        while(!tmpQ.isEmpty())
            q.insert(tmpQ.remove());
        return all2digit;
    }

    /**
     * @author - ronny
     * @param queue - of integers
     * @return Queue - a copy of the given queue
     */
    public static Queue<Integer> copyQueue(Queue<Integer> queue){
        Queue<Integer> tmpQ = new Queue<>();
        Queue<Integer> copyQ = new Queue<>();
        while(!queue.isEmpty()){
            int nm = queue.remove();
            tmpQ.insert(nm);
            copyQ.insert(nm);
        }
        while(!tmpQ.isEmpty())
            queue.insert(tmpQ.remove());

        return copyQ;
    }
    /**
     * @author - ronny
     * @param q - of integers
     * @return int - amount of numbers in queue
     */
    public static int sizeQ(Queue<Integer> q) {
        int size=0;
        Queue<Integer> tmpQ = new Queue<>();
        while(!q.isEmpty()){
            size++;
            tmpQ.insert(q.remove());
        }
        while(!tmpQ.isEmpty())
            q.insert(tmpQ.remove());
        return size;
    }
}
