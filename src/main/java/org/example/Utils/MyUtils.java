package org.example.Utils;

import org.example.Queue;

public class MyUtils {
    /**
     * @author - ronny
     * @param q - of integers
     * @return - true if all numbers are double-digit
     */
    public static boolean doubleDigits(Queue<Integer> q) {
        Queue<Integer> copyQ = copyQueue(q);
        boolean all2digit = true;
        while(!copyQ.isEmpty()){
            int val = q.remove();
            if(Math.abs(val)<10 || Math.abs(val)>99)
                all2digit=false;
        }
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
        Queue<Integer> copyQ = copyQueue(q);
        while(!copyQ.isEmpty()){
            copyQ.remove();
            size++;
        }
        return size;
    }

    public static boolean prequnta1(Queue<Integer> queue) {
        Queue<Integer> copyQ = copyQueue(queue);

        //check emptiness
        if(queue.isEmpty())
            return false;
        if(!doubleDigits(queue))
            return false;
        int amount = sizeQ(queue);
        int[] onesArr = new int[amount];
        int[] tensArr = new int[amount];
        for (int i = 0; i < amount; i++) {
            int num = copyQ.remove();
            onesArr[i] = num%10;
            tensArr[i] = num/10;
        }
        copyQ = copyQueue(queue);   //refill again
        boolean checkAll = true;
        while (!copyQ.isEmpty()){
            int indx = 0;
            int val = copyQ.remove();
            if(!finalCheck(val, indx, tensArr, onesArr))
                checkAll=false;
            indx++;
        }
        return checkAll;
    }

    private static boolean finalCheck(int digit, int indx, int[] tensArr,int[] onesArr) {
        boolean oneAsTens = false;
        boolean tenAsOnes = false;

        for (int i = 0; i < tensArr.length ; i++) {
            if(i!=indx && tensArr[i]==digit)
                oneAsTens = true;
        }
        for (int i = 0; i < onesArr.length ; i++) {
            if(i!=indx && onesArr[i]==digit)
                tenAsOnes = true;
        }
        return oneAsTens && tenAsOnes;
    }
}
