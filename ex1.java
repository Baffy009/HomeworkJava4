
import java.util.LinkedList;
import java.util.Random;


public class ex1 {
    public static void main(String[] args) {

        Random rand = new Random();
    
    LinkedList<Integer> llist = new LinkedList<Integer>(); 
    LinkedList<Integer> revlist = new LinkedList<Integer>();

    for (int i = 0; i < 15; i++) {            
        llist.add(rand.nextInt(100));
    }
    System.out.println("- Исходный  список: " + llist);

    for (int i = 0; i < 15; i++) {        
        revlist.push(llist.removeFirst());
    }
    System.out.println("Перевернутый список:" + revlist);

    }

    
}
