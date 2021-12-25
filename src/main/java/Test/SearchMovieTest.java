package Test;

import Pages.SearchMovie;
import Util.TestBase;
import org.testng.annotations.Test;

public class SearchMovieTest extends TestBase {

    @Test()
    public void firstMovieSearchTest() throws InterruptedException {
        SearchMovie page = new SearchMovie();
        page.goToHomePage();
        page.enterMovieName();
        Thread.sleep(3000);
    }
}
