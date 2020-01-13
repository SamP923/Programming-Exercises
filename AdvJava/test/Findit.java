public class Findit extends Thread
{
private int target;
private int begin;
private int end;
private int count;
boolean done = false;

public Findit(int a, int b, int e)
{
target = a;
begin = b;
end = e;
}
public void run()
{
if(!done){
for(int i = 0; i < 10; i++)
{
if(begin == target)
{
System.out.println("Target number: " + begin + ", found by " + this.getName());
begin = end + 1;
Thread.yield();
done =true;
break;
}
else
{
i++;
System.out.println( this.getName() + " Count is " + begin );
begin++;
}
}
}
}
public boolean getDone(){
return done;
}
public int getTarget()
{
return target;
}
public int getBegin()
{
return begin;
}
public int getEnd()
{
return end;
}
public void setTarget(int a)
{
target = a;
}
public void setBegin(int a)
{
begin = a;
}
public void setEnd(int a)
{
end = a;
}
}