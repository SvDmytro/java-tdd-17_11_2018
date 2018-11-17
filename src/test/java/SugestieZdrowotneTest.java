import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SugestieZdrowotneTest {

    @Test
    public void suggesterShouldReciveMacro() {

        Assert.assertNotNull(sumBialko);
        Assert.assertNotNull(sumWegle);
        Assert.assertNotNull(sumTluszcze);
    }

    @Test
    public void suggesterShouldReturnSuggestionForSugars() {
        SugestieZdrowotne sugestieZdrowotne = new SugestieZdrowotne();

        sugestieZdrowotne.zwrocSugestieZdrowotne();
        List<MockProduct> mockList = new List<MockProduct>();
        //TODO

    }
}
