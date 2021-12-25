package Test;

import Pages.SearchFunctionPage;
import Util.TestBase;
import org.testng.annotations.Test;

public class SearchFunctionTest extends TestBase {

    @Test() //Positive Test Case 01
    public void searchTest() throws InterruptedException {
        SearchFunctionPage search = new SearchFunctionPage();
        search.goToTesla();
        search.searchFunction();
        Thread.sleep(2000);
    }

    @Test()
    public void negativeSearchTest() throws InterruptedException {
        SearchFunctionPage search = new SearchFunctionPage();
        search.goToTesla();
        search.negativeSearchFunction();
        Thread.sleep(2000);
    }
}
