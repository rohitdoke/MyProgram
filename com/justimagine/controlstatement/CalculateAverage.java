package com.justimagine.controlstatement;

public class CalculateAverage {
	
	int english;
	int marthi;
	int hindi;
	int science;
	int socialScience;
	int sum=0;
	float avg=0;
	
	public int Add(int a,int b,int c,int d,int e)
	{
		
		this.english=a;
		this.marthi=b;
		this.hindi=c;
		this.science=d;
		this.socialScience=e;
		
		sum=(english+marthi+hindi+science+socialScience);
		return sum;
				
	}
	
	
	public float Average()
	{
		
		avg=(sum/5);
		return avg;
		
		
	}
	
	
	public static void main(String args[])
	{
		
		CalculateAverage CalAvg=new CalculateAverage();
		
		int Addition =CalAvg.Add(75,86,56,63,88);
		System.out.println("Additin of five subject marks is:="+Addition);
		
		
		float Avg=CalAvg. Average();
		System.out.println("Average of five subject  is:="+Avg);
		
	}

}
