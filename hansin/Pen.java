package com.hansin;
class Pen {
	String colour;
	String type;
	
	public void write() {
			System.out.print("writing something");
	}
				public void printcolour() {
						System.out.print(this.colour);
		
	}

	 public static void main(String[] args) {
		 Pen pen1 =new Pen ();
		 pen1.colour="blue";
		 pen1.type="ball pen";
		 pen1.printcolour();
				
		 
	
		 
	 }
	
}