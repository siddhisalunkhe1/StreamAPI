package streamAPIPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumberList2
{
	 public static void main(String[] args) {
			ArrayList arrList=new ArrayList();
			NumberList2 n1=new NumberList2();
			
			arrList.add(46);
			arrList.add(79);
			arrList.add(64);
			arrList.add(24);
			arrList.add(26);
			arrList.add(90);
			arrList.add(93);
			
			n1.list(arrList);
			
		}
	 
	 public void list(ArrayList<Integer>  arrayList)
	 {
		 //sum of all elements
		 System.out.println("Sum of elements:");
		 int sum=arrayList.stream().mapToInt(s->s.intValue()).sum();
		 System.out.println(sum);
		 
		//print odd numbers
		 System.out.println("Odd Numbers:");
		 arrayList.stream()
		 .filter(t->t%2!=0) 
		 .forEach(s->System.out.print(s + " "));
		 System.out.println();
		 
		 //print even numbers
		 System.out.println("Even Numbers:");
		 arrayList.stream()
		 .filter(t->t%2==0)
		 .forEach(s->System.out.print(s + " "));
		 System.out.println();
		 
		 //print elements of list
		 System.out.println("All elements of list:");
		 arrayList.stream().forEach(s->System.out.print(s + " "));
		 
		 //print sum of even numbers
		 System.out.println();
		 System.out.println("Sum of even numbers:");
		 int sum1=arrayList.stream()
		 .filter(t->t%2==0).mapToInt(s->s).sum();
		 System.out.println(sum1);
	 }
}
