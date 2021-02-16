/* 
 - Using loops, write a Java program that:

 - Prints all the even numbers between 0 and 100.

 - Each number should be on a separate line.
 * 
 */
package assignment01;

/**
 *
 * @author Rohan Lallbachan
 */
public class Assignment01 {

    public static void main(String[] args) {
        
        for(int i = 0; i<100; i++)
            if(i % 2 == 0 )
                System.out.print(i + "\n");
        
    
    }
    
}
