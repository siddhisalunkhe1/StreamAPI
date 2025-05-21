package streamAPIPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberList 
{
        public static void main(String[] args) {
			ArrayList arrList=new ArrayList();
			NumberList n1=new NumberList();
			
			arrList.add(46);
			arrList.add(79);
			arrList.add(64);
			arrList.add(24);
			arrList.add(26);
			arrList.add(90);
			arrList.add(93);
			
			n1.printEven(arrList);
			n1.printList(arrList);
			n1.printSum(arrList);
			
		}
        public void printEven(ArrayList<Integer> arrList)
        {
        	Iterator<Integer> itr=arrList.iterator();
        	System.out.println("Even numbers are->");
        	while(itr.hasNext())
        	{
        		int il=itr.next();
        		if(il%2==0)
        		{
        			System.out.println(il + " ");
        		}
        		
        	}
        }
        
        public void printList(ArrayList<Integer> arrList)
        {
        	Iterator<Integer> itr=arrList.iterator();
        	System.out.println("List elements are->");
        	while(itr.hasNext())
        	{
        		int il=itr.next();
        		System.out.print(il + " ");
        	}
        }
        
        public void printSum(ArrayList<Integer> arrList)
        {
        	Iterator<Integer> itr=arrList.iterator();
        	System.out.println("List elements are->");
        	int sum=0;
        	while(itr.hasNext())
        	{
        		int il=itr.next();
        		sum=sum+il;
        		
        	}
        	System.out.println("Sum of the elements-> "+sum);
        }
}
