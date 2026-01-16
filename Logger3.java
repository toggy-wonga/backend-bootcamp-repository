package week5;

public class Logger3 {
	// SpacedLogger.java
	public class SpacedLogger implements Logger {
	    
	    @Override
	    public void log(String message) {
	        System.out.println(addSpaces(message));
	    }
	    
	    @Override
	    public void error(String message) {
	        System.out.println("ERROR: " + addSpaces(message));
	    }
	    
	    // Helper method to add spaces between characters
	    private String addSpaces(String message) {
	        String result = "";
	        for (int i = 0; i < message.length(); i++) {
	            result += message.charAt(i);
	            if (i < message.length() - 1) {
	                result += " ";
	            }
	        }
	        return result;
	    }
	}
}
