package zerobank.library.pages;

import zerobank.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class DashboardMenuPage {

    public DashboardMenuPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "active")
    public WebElement selMenu;

    public WebElement getBoardHeaderByIndex(int i){
        return Driver.getDriver().findElement(By.xpath("//h2["+ i +"]"));
    }

    public WebElement getBoardHeaderByName(String name){
        return Driver.getDriver().findElement(By.xpath("//h2[@class='board-header'][contains(text(),'"+ name +"')]"));
    }

    public List<WebElement> getTableColumnsByTableName(String name){
        return Driver.getDriver().findElements(By.xpath("//h2[@class='board-header'][contains(text(),'"+ name +"')]/following-sibling::div[1]//table//thead//th"));
    }

    public void goToMenu(String menu){
        Driver.getDriver().findElement(By.xpath("//ul[@class='nav nav-tabs']//li//a[contains(text(),'"+ menu +"')]")).click();
    }

    public void goToTab(String tabName){
        Driver.getDriver().findElement(By.xpath("//ul[@class='ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all']//li//a[.='"+tabName+"']")).click();
    }
}

