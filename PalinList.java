//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Casey Martinez

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue; // basic variable
	private Stack<String> stack; // basic variable

	public PalinList()
	{
		setList(""); // default constructor 
		
	}
	

	public PalinList(String list)
	{
        	setList(list); // paramatrized constructor 
		
	}
   	// Method to setlists
	public void setList(String list)
	{
		
            queue = new LinkedList<>(); // makes a new LinkedList/queue
	    stack = new Stack<>(); // makes a new Stack
	    
	    String[] items = list.split(" "); // splits items in a list
	    for(String item : items) {
	        queue.add(item); // adds items into the queue
	        stack.push(item); // adds items into Stack
	    }
	}

	public boolean isPalin()
	{
	    // While the queue is not empty it gets rid of items from the queue and Stack 
		while(!queue.isEmpty()){
		    String queueEle = queue.poll(); 
		    String stackEle = stack.pop(); 
		
		if(!queueEle.equals(stackEle)){
		    return false; //used to compare the queue to the stack, ensuring they are equal.
		}
	}
	return true;
  }	

	public String toString()
	{
	    ArrayList<String> oQueue = new ArrayList<>(queue); // used so it does not mess with the queue directly
	   
	    //if the boolean returned true it is a palinlist, if not it's not a palinlist. It is also used to return the queue
	    if (isPalin())
	    {
	        return oQueue + " is a palinlist.\n";
	    }    
	    else
	    {    
	       return oQueue + " is not a palinlist.\n";
	    }
	}
}
