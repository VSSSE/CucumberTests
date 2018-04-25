package main.java.container;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 


public class StartPageContainer {
	

	//Todo: set in mockup "name = movieTitle"
	@FindBy(how = How.CSS, using = "input[name=movieTitle]")
    public WebElement movieTitleInput;

	//Todo: set in mockup "id = btnSearchSoundtracks"
	@FindBy(how = How.CSS, using = "#btnSearchSoundtracks")
    public WebElement submitButton;

	@FindBy(how = How.CSS, using = "#errorMessage")
	public WebElement errorMessage;
	 
}
