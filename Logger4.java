package week5;

public class Logger4 {
	public class App {
	    public static void main(String[] args) {
	        // Instantiate an instance of each logger class
	        Logger asteriskLogger = new AsteriskLogger();
	        Logger spacedLogger = new SpacedLogger();
	        
	        // Test AsteriskLogger
	        System.out.println("Testing AsteriskLogger:");
	        asteriskLogger.log("Hello");
	        asteriskLogger.error("Hello");
	        System.out.println();
	        
	        asteriskLogger.log("Welcome to Java");
	        asteriskLogger.error("File not found");
	        System.out.println();
	        
	        // Test SpacedLogger
	        System.out.println("Testing SpacedLogger:");
	        spacedLogger.log("Hello");
	        spacedLogger.error("Hello");
	        System.out.println();
	        
	        spacedLogger.log("Welcome to Java");
	        spacedLogger.error("File not found");
	    }
	}
}
