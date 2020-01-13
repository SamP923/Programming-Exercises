import java.util.*;

public class Assignment9
{
public static void main(String [] args)
{
Random rng = new Random();
int r = rng.nextInt( 1001 );
Thread lowest = new Findit(r, 0, 349);
Thread middle = new Findit(r, 350, 699);
Thread highest = new Findit(r, 700, 1000);
lowest.start();
middle.start();
highest.start();

for(int i = 0; i < 50; i++)
{
lowest.run();
middle.run();
highest.run();
}
System.out.println( r );
}
}