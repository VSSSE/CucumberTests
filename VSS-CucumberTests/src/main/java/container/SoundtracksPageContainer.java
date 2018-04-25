package main.java.container;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 


public class SoundtracksPageContainer {
	

	//Todo: set in mockup "id = results-list"
	@FindBy(how = How.CSS, using = ".results-list")
    public WebElement resultList;
	 

	@FindBy(how = How.CSS, using = "#result1")
    public WebElement firstEntry;
	 
}
