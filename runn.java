//To be used without Testng type tests


package initial;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class runn {
	
	public static void main(String[]args) {
         Result result = JUnitCore.runClasses(suiteTest.class);
         for (Failure failure : result.getFailures()) {
        	 System.out.println(failure.toString());
         }
		System.out.println(result.wasSuccessful());
}
}