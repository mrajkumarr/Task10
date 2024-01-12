package task10;

public class Tea {

	    private boolean prepare;
	    private boolean milk;
	    private boolean sugar;

	    
	    // Prepares basic tea with hot water and tea leaves
	     
	    public void prepareTea() {
	        prepare = true;
	        System.out.println("tea prepared with hot water and tea leaves");
	        System.out.println("");
	    }

	    
	    // Ads milk to basic tea
	     
	    public void addMilk() {
	        if (prepare) {
	            milk = true;
	            System.out.println("milk added to  tea");
	        } else {
	            System.out.println("tea needs to be prepared first");
	        }
	    }

	    
	     // Ads sugar to basic tea
	     
	    public void addSugar() {
	        if (prepare) {
	            sugar = true;
	            System.out.println("sugar added to tea");
	        } else {
	            System.out.println("tea needs to be prepared first");
	        }
	    }

	    
	     // prints tea, milk and sugar
	     
	    public void printTea() {
	    	 System.out.println("");
	        System.out.println("tea prepared: " + prepare);
	        System.out.println("milk added: " + milk);
	        System.out.println("sugar added: " + sugar);
	    }

	    public static void main(String[] args) {
	        Tea t = new Tea();
	        t.prepareTea();
	        t.addMilk();
	        t.addSugar();
	        t.printTea();
	    }
	}


/*

Output

tea prepared with hot water and tea leaves

milk added to  tea
sugar added to tea

tea prepared: true
milk added: true
sugar added: true

*/