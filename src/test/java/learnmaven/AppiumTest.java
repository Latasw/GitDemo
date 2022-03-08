package learnmaven;
import org.testng.annotations.Test;

public class AppiumTest {
	
		@Test
		public void NativeAppAndroid() 
		{
			System.out.println("NativeAppAndroid");
		}
		
		//changes done Develop branch
		@Test
		public void NativeAppAndroidS() 
		{
			System.out.println("NativeAppAndroidS");
		}
		
		@Test
		public void NativeAppIOS()
		{
			System.out.println("NativeAppIOS");
			
			//changes done Develop branch
			System.out.println("NativeAppIOS1");
			System.out.println("NativeAppIOS2");
		}
}
