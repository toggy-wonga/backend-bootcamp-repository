package week5;

public class Logger2 {
	// AsteriskLogger.java
	public class AsteriskLogger implements Logger {
	    
	    @Override
	    public void log(String message) {
	        System.out.println("***" + message + "***");
	    }
	    
	    @Override
	    public void error(String message) {
	        String errorMessage = "***Error: " + message + "***";
	        int length = errorMessage.length();
	        
	        // Print top border
	        for (int i = 0; i < length; i++) {
	            System.out.print("*");
	        }
	        System.out.println();
	        
	        // Print error message
	        System.out.println(errorMessage);
	        
	        // Print bottom border
	        for (int i = 0; i < length; i++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}
