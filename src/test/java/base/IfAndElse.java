package base;

public class IfAndElse {
/*
 * queen gave me 10$
 * buy orange or apple or avocado while they are 5-->7$
 */
	
	int price=2;
	public static void main(String[] args) {
		IfAndElse ie= new IfAndElse();
		//ie.ifconddition();
		//ie.ifAndElseCondition();
		ie.if_elseIf_else();
	}

	
	public void ifconddition() {
		if(price==5) {
			System.out.println("price is 5 dollar");
		}
	}

	public void ifAndElseCondition() {
		if(price==5) {
			System.out.println("price is 5 dollar");
		}else {
			System.out.println("price is not 5 dollar");
		}
	}
	
	public void if_elseIf_else() {
		if(price==5) {
			System.out.println("buy apple");
		}else if(price==6) {
			System.out.println("buy orange");
		}else if(price==7){
			System.out.println("buy avacado");
		}else {
			System.out.println(" do not buy annything");
		}
	}
	
	
	
	
	
	
}
