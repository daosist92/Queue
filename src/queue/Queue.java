/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author daosist
 */
public class Queue<Type> {

    private Object[] array;
    private int front;
    private int rear;
    private static int items;
    private int size;

    public Queue(int size) {
        this.size = size;
        array = new Object[size];
        front = 0;
        rear = 0;
        items = 0;
    }
    
    int size(){
        return size;
    }

    int queuecount() {
        return items;
    }

    boolean isEmpty() {
        return items == 0;
    }

    boolean isFull() {
        return items == size;
    }

    public void enqueue(Type item) {
        //
        if (isFull()) {
            wide_array();
        }
        array[rear] = item;
        rear++;
        if (rear == size) {
            rear = 0;
        }
        items++;
    }
    

    Type dequeue() throws MyException {

        if (isEmpty()) {
            throw new MyException("Queue is empty");
        }
        Type temp;
        temp = (Type) array[front];
        front++;
        items--;
        if (front > size) {
            front = 0;
        }
        return temp;
    }

    private void wide_array() {
        Object tmp_array[];
        tmp_array = new Object[size * 2];
        if (rear > front) {
            int j = 0;
            for (int i = front; i < rear; i++) {
                tmp_array[j] = array[i];
                j++;
            }
        } else {
            int j = 0;
            for (int i = front; i < size; i++) {
                tmp_array[j] = array[i];
                j++;
            }
            for (int i = 0; i < rear; i++) {
                tmp_array[j] = array[i];
                j++;
            }
        }
        array = tmp_array;
        rear = size;
        size = size * 2;
        front = 0;
    }

    void printQ() {
        if (rear > front) {
            for (int i = front; i < rear; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("\n");
        } else if (items == 0) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            for (int i = 0; i < rear; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("\n");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue x = new Queue(3);
        x.printQ();
        System.out.println(x.queuecount());
        x.enqueue(10);
        x.enqueue(15);
        x.printQ();
        System.out.println(x.queuecount());
        x.enqueue(3);
        x.printQ();
        System.out.println(x.queuecount());
        x.enqueue(1499);
        x.printQ();
        System.out.println(x.queuecount());
        x.enqueue(1515);
        x.printQ();
        System.out.println(x.queuecount());
        x.dequeue();
        x.dequeue();
        x.printQ();
        System.out.println(x.queuecount());
    }
}
    