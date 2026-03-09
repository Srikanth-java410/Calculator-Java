package Demo;

import java.util.*;             
class Addition
{
    Scanner sc=new Scanner(System.in);
    void add()
    {
        double sum=0;
        System.out.println("Enter how many numbers to add");
     int n=sc.nextInt();
        double add[]=new double[n];
        System.out.println("Enter "+n+" Numbers to add");
        for(int i=0;i<add.length;i++)
        {
          add[i]=sc.nextDouble();
        }
        System.out.println("The addition is");
        for(int i=0;i<add.length;i++)
        {
            sum+=add[i];
        }
        System.out.println(sum);
    }
}
class Subtraction {
    Scanner sc=new Scanner(System.in);
    void sub()
    {
    System.out.println("Enter no of digits");
    int n=sc.nextInt();
    System.out.println("Enter "+n+" numbers to Subtract");
    double sum;
    double sub[]=new double[n];
    for(int i=0;i<n;i++)
    {
        sub[i]=sc.nextDouble();
    }
    sum=sub[0];
    for(int i=1;i<n;i++)
    {
     sum-=sub[i];
    }
    System.out.println("The subtraction is "+sum);
    }
}
class Multiplication 
{
    Scanner sc=new Scanner(System.in);
    void mul()
    {
        double sum=1;
        System.out.println("Enter no of digits");
        int n=sc.nextInt();
        double mul[]=new double[n];
        System.out.println("Enter "+n+" numbers for product");
        for(int i=0;i<n;i++)
        {
            mul[i]=sc.nextDouble();
            
        }
        for(int j=0;j<n;j++)
        {
          sum*=mul[j];
        }
        System.out.println("The multiplication is "+sum);
        
    }
}
class Division
{
    Scanner sc=new Scanner(System.in);
    int k;
    void just()
    {
        System.out.println("Press 2 for Remaninder division\nPress 1 for Quotient division");
        k=sc.nextInt();
    if(k==2)
    {
        Remainder();
    }
    else if(k==1)
    {
        quotient();
    }
    else
    {
        System.out.println("Invalid");
    }
    }
    void quotient()
    {
       double sum;
        
  System.out.println("Enter no of digits");
  int n=sc.nextInt();
  double quo[]=new double[n];
  System.out.println("Enter "+n+" Numbers for division");
  for(int i=0;i<n;i++)
  {
    quo[i]=sc.nextDouble();
  }
  sum=quo[0];
  
  for(int j=1;j<n;j++)
  {
      if(quo[j]==0)
      {
          System.out.println("Cannot divide by Zero(0)");
          return;
      }
    sum/=quo[j];
  }
  System.out.println("the Quotient is "+sum);
    }
    void Remainder()
    {
        double sum;
    System.out.println("Enter no of digits");
    
    int n=sc.nextInt();
    double rem[]=new double[n];
    System.out.println("Enter "+n+" Numbers to divide");
    for(int i=0;i<n;i++)
    {
        rem[i]=sc.nextDouble();
    }
    sum=rem[0];
    System.out.println("The Remainder is ");
    for(int i=1;i<n;i++)
    {
        if(rem[i]==0)
        {
            System.out.println("Cannot divide by Zero(0)");
            return;
        }
     
     sum%=rem[i];
    }
    System.out.println(sum);
    }  
    }

public class Calculator
{
public static void main(String args[])
{
    Addition a=new Addition();
    Subtraction s=new Subtraction();
    Multiplication m=new Multiplication();
    Division d=new Division();
    int choice;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.println("1.Addtion");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");
        System.out.println("Enter your choice ");
         choice=sc.nextInt();
         switch(choice)
         {
             case 1:
                 try
                 {a.add();}
                 catch(InputMismatchException e)
                 {
                     System.out.println(e);
                 }
                 break;
             case 2:
               try
                {s.sub();
                }
               catch
                   (InputMismatchException e)
               {
                   System.out.println(e);
               }
               break;
               case 3:
               try
                {m.mul();}

               catch(InputMismatchException e)
               {
                   System.out.println(e);
              }
              break;
              case 4:
                  try
                  {
                      d.just();
                  }
                  catch(InputMismatchException e)
                  {
                      System.out.println(e);
                  }
                  break;
              default:
              {
                  System.out.println("Invalid case");
              }
                  
    }
}
          while(choice!=5);
 System.out.println("Thankyou");
 sc.close();
}
}
