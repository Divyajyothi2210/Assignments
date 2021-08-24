import java.util.Arrays;
import java.util.List;
public class lambda2 {
	String item,status;
    int price;
    lambda2(String item,int price,String status){
 	   this.item=item;
 	   this.price=price;
 	   this.status=status;
    }
    public String getItem() {
 	   return item;
    }
    public int getPrice() {
 	   return price;
    }
    public String getStatus() {
 	   return status;
    }
    public String toString() {
 	   return "{ item : "+item+", price : "+price+", status : "+status+"}\n"; 
    }
    private static void printOrder(List<lambda2> order,Condition c) {
 	   for(lambda2 or:order) {
 		   if( c.test(or)) {
 			   System.out.println(or);
 		   }
 	   }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<lambda2> order=Arrays.asList(
				new lambda2("fridze",11250,"Accepted"),
				new lambda2("cooler",1050,"Completed"),
				new lambda2("fan",750,"Accepted"),
				new lambda2("charger",550,"Completed"),
				new lambda2("AC",12500,"Accepted")
				);
		
		 printOrder(order,new Condition() {
			 public boolean test(lambda2 o) {
				 if(o.getPrice()>10000) {
					 return true;
				 }
				 else {
					 return false;
				 }
			 }
		 });
		 for(lambda2 or:order) {
			 System.out.println(or.getStatus());
		 }

	}

}
interface Condition {
	boolean test(lambda2 o);

}


