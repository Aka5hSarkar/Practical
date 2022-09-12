package Practice;

class AddressHasa{
	String country;
	String state;
	String area;
	 AddressHasa(String country,String state,String area){
		 this.country=country;
		 this.state=state;
		 this.area=area;
	 }
}

public class StudentHasa {
 int id;
 String name;
 AddressHasa address;
 StudentHasa(int id,String name,AddressHasa address){
	 this.id=id;
	 this.name=name;
	 this.address=address;
 }
 void show() {
	 System.out.println(id+" "+name);
	 System.out.println(address.country+" "+address.state+" "+address.area);
 }
 public static void main(String args[]) {
	 AddressHasa ad=new AddressHasa("India","West Bengal","Sonapur");
	 StudentHasa sd=new StudentHasa(102,"Akash",ad);
	 sd.show();
 }
}
