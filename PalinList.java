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
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList()
	{
	    Queue<Integer> queue;
		setList("");
		
	    //stack = new Stack<>();
	}
	

	public PalinList(String list)
	{
        queue = new LinkedList<Integer>();
        setList(list);
		
		//stack = new Stack<>();
	}

	public void setList(String list)
	{
		
        queue = new LinkedList<Integer>();
        setList(list);

	    //stack = new Stack<>();
	}

	public boolean isPalin()
	{
		return true;
	}



public String toString()
	{
	    
	    if (isPalin())
	    {
	        return queue + " is a palinlist.\n";
	    }    
	    else
	    {    
	       return queue + " is not a palinlist.\n";
	    }
	}
