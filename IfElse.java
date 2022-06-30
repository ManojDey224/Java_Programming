package java2;

public class IfElse {

	public static void main(String[] args) {
		int month= 4;
		String Season;
		if(month==12|| month==1|| month==2)
			Season = "Winter";
		else if(month==6|| month==7|| month==8)
			Season = "Summer";
		else if(month==3|| month==4|| month==5)
			Season = "Spring";
		else if(month==9|| month==10|| month==11)
			Season = "Autumn";
		else
			Season="Bogus Month";
		
		System.out.println("April is in the " + Season + " .");

	}

}
