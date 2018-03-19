package Front;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Flogin extends BaseTest{
	@Test
	public void TestfLogin() throws InterruptedException{
		webtest.open("http://localhost:8032/MyMovie/index.php/Index/index");
		Thread.sleep(3000);
		webtest.click("link=登录");
    	webtest.type("name=username", "admin");
    	webtest.type("name=password", "admin");
    	webtest.click("xpath=//input[@value='马上登录']");
    	Thread.sleep(3000);
    	//assertTrue(webtest.getHtmlSource().contains("退出"));
	}
}