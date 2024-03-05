package Doubts;

import java.util.Scanner;
class Health
{
  int height;
  int weight;
  int i;
  public float calbmiValue(Health a[])
  {
    return (a[i].weight/(a[i].height*a[i].height));
  }
}

class People
{
  Scanner sc = new Scanner(System.in);
  public static void main(String args[])
  {
       Health a[] = new Health[5];
       for(int i=0;i<a.length;i++)
       {
         Health a[i] = new Health();
       }
       People.getData(a);
       People.putData(a);
       People.calAverage(a);     
  }
  public static void getData(Health a[])
  {
       for(int i=0;i<a.length;i++)
       {
          System.out.println("enter height of person :"+i );
          a[i].heigth = sc.nextInt();
          System.out.println("enter weigth of person :"+i );
          a[i].weigth = sc.nextInt();
        }
  }
  public static void putData(Health a[])
  {
      for(int i=0;i<a.length;i++)
      {
         System.out.println("Details of person :"+i );
         System.out.println("Height: "+a[i].heigth);
         System.out.println("Weigth: "+a[i].weigth);
      }
  }
  public static void calAverage(Health a[])
  {  
     int sum=0,avg;
     for(int i=0;i<a.length;i++)
     {
        sum = sum+a[i].calbmiValue(a[i]);
     }
     avg = sum/a.length;
     System.out.println("Average Body Mass Index Value : "+avg);
  }
}