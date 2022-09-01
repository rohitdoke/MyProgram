package com.justimgine.controlstatement;

public class CheckMonth {

	
		int month;
		public void getMonth(int month)
		{
			this.month=month;
			
			switch(month)
			{
			
			case 1:
				if(month==1)
				{
					System.out.println("January");
				}
				break;

			case 2:
				if(month==2)
				{
					System.out.println("February");
				}
				break;

			case 3:
				if(month==3)
				{
					System.out.println("march");
				}
				break;

			case 4:
				if(month==4)
				{
					System.out.println("April");
				}
				break;

			case 5:
				if(month==5)
				{
					System.out.println("May");
				}
				break;

			case 6:
				if(month==6)
				{
					System.out.println("June");
				}
				break;

			case 7:
				if(month==7)
				{
					System.out.println("july");
				}
				break;

			case 8:
				if(month==8)
				{
					System.out.println("augest");
				}
				break;

			case 9:
				if(month==9)
				{
					System.out.println("sptember");
					
				}

			case 10:
				if(month==10)
				{
					System.out.println("octamber");
				}
				break;

			case 11:
				if(month==11)
				{
					System.out.println("november");
				}
				break;

			case 12:
				if(month==12)
				{
					System.out.println("December");
				}
				break;
				default:
					System.out.println("please enter correct month Number");
			}
		}
	
	public static void main(String[] args) {
		
		
		CheckMonth m1=new CheckMonth();
		m1.getMonth(12);
	}

}
