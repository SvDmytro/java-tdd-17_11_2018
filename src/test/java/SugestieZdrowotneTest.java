import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SugestieZdrowotneTest {

    @Test
    public void suggesterShouldReciveMacro() {
        SugestieZdrowotne sugestieZdrowotne = new SugestieZdrowotne();
        Assert.assertNotNull(sugestieZdrowotne.sredniaTluszczy);
        Assert.assertNotNull(sugestieZdrowotne.sredniaWegli);
        Assert.assertNotNull(sugestieZdrowotne.sredniaCukrow);
    }

    @Test
    public void suggesterShouldReturnSuggestionForFats() {
        SugestieZdrowotne sugestieZdrowotne = new SugestieZdrowotne();
        List<MockProduct50> mockList;
        Assert.assertEquals("Kup więcej bialka lub wegli!", sugestieZdrowotne.returnSuggestionsForFat(mockList));
    }

    @Test
    public void suggesterShouldReturnSuggestionForSugar() {
        SugestieZdrowotne sugestieZdrowotne = new SugestieZdrowotne();
        List<MockProduct50> mockList;
        Assert.assertEquals("Kup więcej bialka lub tluszczy!", sugestieZdrowotne.returnSuggestionsForSugars(mockList));
    }

    @Test
    public void suggesterShouldReturnSuggestionForProtein() {
        SugestieZdrowotne sugestieZdrowotne = new SugestieZdrowotne();
        List<MockProduct50> mockList;
        Assert.assertEquals("Kup więcej tluszczy lub wegli!", sugestieZdrowotne.returnSuggestionsForProtein(mockList));
    }
}
