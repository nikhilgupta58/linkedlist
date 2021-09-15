
import com.nikhil.linkedlist.LinkedList.LinkedList;
import com.nikhil.linkedlist.LinkedList.SinglyLinkedList;
import org.junit.*;
import static org.junit.Assert.*;

public class SinglyLinkedListTest {
    static LinkedList<Integer> ll = new SinglyLinkedList<>();

    @BeforeClass
    public  static  void setUp(){
        ll.append(5);
        ll.append(7);
        ll.append(9);
        ll.append(3);
    }

    @Test
    public void testSearch(){
        assertTrue(ll.search(7));
        assertFalse(ll.search(10));
    }

    @Test
    public  void testInsert(){

    }
}
