package main.java.container;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 


public class SimilarSongsPageContainer {
	

	//Todo: set in mockup "name = movieTitle"
	@FindBy(how = How.CSS, using = ".results-list")
    public WebElement resultList;
 
}
