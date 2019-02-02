package com.test.LL;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Stack;
import java.util.Scanner;
public class Solution {

     
   static boolean isMatch(char ch,char ch2)
    {
     if(ch==')')
        {if(ch2=='(') 
           return true;
        else
         return false;
        
        }
     else if(ch==']')
        {if(ch2=='[') 
           return true;
        else
         return false;
        
        }
        else if(ch=='}')
        {if(ch2=='{') 
           return true;
        else
         return false;
        
        }
        else
        return false; 


    }
    static String isBalanced(String s) {

        Stack<Character> stack = new Stack<Character>();
        boolean flag=true;
          
     for(int stringIter=0;stringIter<s.length();stringIter++)
     {
          char ch=s.charAt(stringIter);
           
        if(ch=='{' ||ch == '(' || ch == '[') 
        {
            stack.push(ch);
        }
        
        if((ch=='}' || ch == ')' || ch == ']')&&stack.size()>0) 
        {
            char ch2= stack.pop();
            
        if(ch==')')
        {if(ch2=='(') 
           flag= true;
        else
         flag= false;
        
        }
     else if(ch==']')
        {if(ch2=='[') 
           flag=  true;
        else
         flag=  false;
        
        }
        else if(ch=='}')
        {if(ch2=='{') 
           flag=  true;
        else
         flag=  false;
        
        }
        else
        flag=  false; 


             if(!flag)    
              return "NO";
        }

     }
      if (stack.isEmpty()) 
         return "YES"; /*balanced*/
       else
         {   /*not balanced*/
             return "NO"; 
         }  

    }


    public static void main(String[] args) throws IOException {

       
            String result = isBalanced("({}([][]))[]()");
            System.out.println(result);

    }       
}

