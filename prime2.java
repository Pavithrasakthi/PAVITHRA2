import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scaner(System.in);
int num,i,count=0;
System.out.println("Enter number");
num=sc.nextInt();
for(i=o;i<2;i++)
{
if(num%i == 0)
  {
     count++;
     break;
            }
        }
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
    }
}
