package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import testcases.baseclass;

public class Screenshot extends baseclass {
	public void takeScreenShot(String fileName) throws Exception {
		String filePath = "C:\\Users\\2319759\\eclipse-workspace\\Hackathon\\Screenshots\\" + fileName + ".png";
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(filePath);
		FileUtils.copyFile(src, dest);
	}
}