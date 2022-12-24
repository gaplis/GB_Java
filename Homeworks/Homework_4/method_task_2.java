package Homeworks.Homework_4;

import java.util.LinkedList;

public class method_task_2 {
    LinkedList<Integer> array = new LinkedList<>();
    
    public void enqueue(int item) {
        array.add(item);
    }

    public int dequeue() {
        int temp = array.get(0);
        array.remove(0);
        return temp;
    }

    public int first() {
        return array.get(0);
    }

    public LinkedList<Integer> get() {
        return array;
    }
}
