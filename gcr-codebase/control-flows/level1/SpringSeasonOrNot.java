//creating a class which tells spring season or not "SpringSeasonOrNot"

public class SpringSeasonOrNot {
	public static void main(String [] args){
	
	//Taking input month and day
	int month = Integer.parseInt(args[0]);
	int day = Integer.parseInt(args[1]);

	//checking spring season or not

	if(month > 3 && month < 6){
	   System.out.println("Its a Spring Season");
	}
	else if(month == 3 && day >= 20 || month == 6 && day <= 20 ){
	   System.out.println("Its a Spring Season");
	}
	else{
	   System.out.println("Not a Spring Season");
	}
	
	}
}