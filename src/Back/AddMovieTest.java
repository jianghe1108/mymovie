package Back;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddMovieTest extends BaseTest{
	 @BeforeSuite
	public void addListener(ITestContext context)throws Exception {
	    		TestRunner runner = (TestRunner) context;
	    	    runner.addListener(new Listener());
	    	}
    @Test
    public void testLogin() throws InterruptedException {
    	BackLogin add=new BackLogin(webtest);
    	add.inputValues("admin", "admin");
    	Thread.sleep(3000);
    }
    @Test(dependsOnMethods="testLogin")
    public void addMovie() throws InterruptedException {
    	AddMovie addM=new AddMovie(webtest);
    	addM.inputValues("羞羞的铁拳", "羞羞的", "中国人", "国内", "中国", "汉语", "2017-09-26", "121", "C:Users\\acer\\Pictures\\lovewallpaper\\1.jpg");
    	Thread.sleep(3000);
    }
   
}
