package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemWithGetText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Identify the <div> for TagLine
		WebElement divtag = driver.findElement(By.className("_8esl"));
		//Actually <div> tag has no TagText
		//It is considering the sub tagtext of <h2>
		//If main tag and sub tag  both having tagText then it will take both the tagText.
		//This is the problem with getText()
		String divtagText = divtag.getText();
		System.out.println("TagLine Text is : "+divtagText);
		String divTagName = divtag.getTagName();
		System.out.println("<"+divtagText+">");
		System.out.println("<"+divTagName+">"+divtagText+"</"+divTagName+">");
		System.out.println("===============================================================");
		WebElement actualTag = driver.findElement(By.className("_8eso"));
		String actualTagName = actualTag.getTagName();
		System.out.println("actualTagName is : "+"<"+actualTagName+">");
		String actualTagText = actualTag.getText();
		System.out.println("actualTagText is: "+actualTagText);
		System.out.println("<"+actualTagName+">"+actualTagText+"<"+actualTagName+">");
		driver.manage().window().minimize();
		driver.quit();
	}
}
