/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daosist
 */
public class QueueTest {
    
    public QueueTest() {
    }
    
    @Test
    public void Queue() {
        System.out.println("Test Queue");
        Queue x = new Queue(3);
        assertEquals(x.size(), 3);
    }
    
    @Test
    public void qsize() {
        System.out.println("Test qsize");
        Queue x = new Queue(5);
        assertEquals(x.queuecount(), 0);
        x.enqueue(10);
        assertEquals(x.queuecount(), 1);
        x.enqueue(12);
        assertEquals(x.queuecount(), 2);
        x.dequeue();
        assertEquals(x.queuecount(), 1);
    }
    
    @Test
    public void wide() {
        System.out.println("Test wide");
        Queue x = new Queue(3);
        x.enqueue(10);
        x.enqueue(15);
        x.enqueue(12);
        x.enqueue(16);
        assertEquals(x.size(), 6);
    }
    
    @Test
    public void dequeue() {
        System.out.println("Test dequeue");
        Queue x = new Queue(3);
        x.enqueue(10);
        assertEquals(x.dequeue(), 10);
        assertEquals(x.queuecount(), 0);
    }
    
    @Test
    public void enqueue() {
        System.out.println("Test enqueue");
        Queue x = new Queue(3);
        x.enqueue(5);
        
        assertEquals(x.queuecount(), 1);
        assertEquals(x.dequeue(), 5);
    }
    
    public static int xdd() {
        return 1;
    }
    
    @Test
    public void MyException() {
        System.out.println("Test MyException");
        Queue x = new Queue(3);
        boolean wasException = false;
        try {
            x.dequeue();
        } catch (MyException ex) {
            wasException = true;
        } finally {
            
        }
        Assert.assertTrue(wasException);
    }
}
