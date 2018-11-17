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
        List<MockProduct50> mockList;
        sugestieZdrowotne.zwrocSugestieZdrowotne(mockList);

        //TODO



    }
}
