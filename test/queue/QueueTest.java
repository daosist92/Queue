/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import org.junit.AfterClass;
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
        Queue x = new Queue(3);
        assertEquals(x.size(), 3);
    }

    @Test
    public void qsize() {
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
        Queue x = new Queue(3);
        x.enqueue(10);
        x.enqueue(15);
        x.enqueue(12);
        x.enqueue(16);
        assertEquals(x.size(), 6);
        
    }
}