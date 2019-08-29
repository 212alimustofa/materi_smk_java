import java.util.LinkedList; 
import java.util.Queue; 
  
public class QueueExample 
{ 
  public static void main(String[] args) 
  { 
    Queue<Integer> q = new LinkedList<>(); 
  
    // Menambahkan {0, 1, 2, 3, 4} ke dalam queue 
    for (int i=0; i<5; i++) 
     q.add(i); 
  
    // Menampilkan data dalam queue. 
    System.out.println("Elements of queue: "+q); 
  
    // Menghapus data teratas dari queue. 
    int removedele = q.remove(); 
    System.out.println("removed element: " + removedele); 
  
    System.out.println(q); 
  
    // Melihat data teratas dari queue 
    int head = q.peek(); 
    System.out.println("head of queue: " + head); 
  
    // Melihat besarnya queue
    int size = q.size(); 
    System.out.println("Size of queue: " + size); 
  } 
} 