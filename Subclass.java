package task10;


class BlackTea extends Tea { // BlackTea is a subclass of Tea class
    
      //Prepare the black tea with specific ingredients and brewing time
         public void prepareTea() {
    	System.out.println("");
        System.out.println("preparing black tea / brewing for 3 min");
    }
}


class GreenTea extends Tea {   // GreenTea is a subclass of Tea class
    
       // Prepare the green tea with specific ingredients and brewing time
        public void prepareTea() {
        System.out.println("");
        System.out.println("preparing green tea / brewing for 2 min");
    }
}


class HerbalTea extends Tea { // HerbalTea is a subclass of Tea class
    
         // Prepare the herbal tea with specific ingredients and brewing time.
        public void prepareTea() {
        System.out.println("");
        System.out.println("preparing herbal tea / brewing for 5 min");
    }
}

public class Subclass {
	
		    public static void main(String[] args) {
	        Tea t1 = new BlackTea();
	        Tea t2 = new GreenTea();
	        Tea t3= new HerbalTea();

	 
	        // Calling prepareTea() method
	        t1.prepareTea();
	        t2.prepareTea();
	        t3.prepareTea();
	    }
}

/*
 Output:
 
preparing black tea / brewing for 3 min

preparing green tea / brewing for 2 min

preparing herbal tea / brewing for 5 min

*/
  