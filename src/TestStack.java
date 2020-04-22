/**
 *TestStack Class Programming Project 4 CS131
 *Class that creates and tests a stack
 *@author dalec
 *ArrayStack Project
 *Version 1
 *Spring 2020
 *4/21/20
 */
import java.util.Arrays;
import jsjf.ArrayStack;

public class TestStack {

    public static void main(String[] args) {
    	//Creating a new Stack
        ArrayStack<Integer> stack = new ArrayStack<Integer>();

        System.out.println("Testing a Stack");
        //Pushing 3 elements into the stack
        stack.push(5);
        stack.push(4);
        stack.push(3);
        
        System.out.println(stack);
        
        System.out.print("***************\n");
        //Removing the top element
        stack.pop();
        //Pushing 2 new elements to the stack
        stack.push(2);
        stack.push(1);

        System.out.println(stack);
        System.out.print("***************\n");
        
        //Removes the top element in the stack
        System.out.println(stack.pop());
        
        //Peek, which retrives the first element of the stack
        System.out.println(stack.peek());
        System.out.print("***************\n");

        System.out.println("Is the stack empty: "+ stack.isEmpty());//Testing is Empty
        System.out.println("The size of the stack is: " + stack.size());//Testing the stack size
        System.out.println("The stack contains:\n" + stack.toString());// Testing the toString
        }//Close Main
    }//Close Class
