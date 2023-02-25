import java.util.LinkedList;

public class ex2 {
    private static LinkedList<Object> elements = new LinkedList<>();

    public ex2(LinkedList<Object> elements) {
        ex2.elements = elements;
    }

    public void enqueue(Object element) {
        elements.add(element);
    }

    public Object dequeue() {
        Object first = elements.getFirst();
        elements.removeFirst();
        return first;
    }

    public Object first() {
        return elements.getFirst();
    }

    public LinkedList<Object> getElements() {
        return elements;
    }

    public void setElements(LinkedList<Object> elements) {
        ex2.elements = elements;
    }

    public static void main(String[] args) {
        ex2 queue = new ex2(elements);
        queue.enqueue(12);
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(9);
        queue.enqueue(15);
        queue.enqueue(21);
        queue.enqueue(18);
        System.out.println(queue.getElements());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());
        System.out.println(queue.first());
    }
}


