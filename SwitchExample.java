package JavaClass;

public class SwitchExample {

	public static void main(String[] args) {
		int day=7;
		String daystring="";
		switch(day) {
		case 1: daystring="monday";
		break;
		case 2: daystring="tusday";
		break;
		case 3: daystring="wednesday";
		break;
		case 4: daystring="thursday";
		break;
		case 5: daystring="friday";
		break;
		case 6: daystring="saturday";
		break;
		case 7: daystring="sunday";
		break;
		default : System.out.println("invalid day");
		}
		System.out.println(daystring);
		

	}

}
