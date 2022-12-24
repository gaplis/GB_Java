/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.
(Подобную задачу решали на семинаре. Здесь так же нужно создать класс, который будет реализовывать указанные методы) */

package Homeworks.Homework_4;

public class task2 {
    public static void main(String[] args) {
        method_task_2 queue = new method_task_2();
        queue.enqueue(111);
        queue.enqueue(22);
        queue.enqueue(3333);
        queue.enqueue(4);
        System.out.println(queue.get());
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
        System.out.println(queue.get());
    }
}
