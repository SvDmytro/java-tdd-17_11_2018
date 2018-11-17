import java.util.List;

public class SugestieZdrowotne {
   int sredniaWegli;
   int sredniaTluszczy;
   int sredniaCukrow;
    List<Product> list = new List<Product>();

    public String returnSuggestionsForSugars(List<?> list) {
        int wegle;

        int size = list.size();

        int sumWegli = 0;
        for (Product product:list) {
            int i = 0;
            wegle = list.get(i).wegle();
            i++;

             sumWegli +=wegle;
        }
        int iloscProduktow = size + 1;
        int sredniaWegli = sumWegli / iloscProduktow;
        if (sredniaWegli > 33) {
            return "Kup więcej bialka lub tluszczy!";
        }

    }

    public String returnSuggestionsForFat(List<?> list) {
        int tluszcze;
        int size = list.size();
        int sumaTluszczy = 0;
        for (Product product:list) {
            int i = 0;
            tluszcze = list.get(i).tluszcze();
            i++;

             sumaTluszczy +=tluszcze;
        }
        int iloscProduktow = size + 1;
        int sredniaTluszczy = sumaTluszczy / iloscProduktow;
        if (sredniaTluszczy > 33) {
            return "Kup więcej bialka lub wegli!";
        }
    }

    public String returnSuggestionsForProtein(List<?> list) {
        int bialko;
        int size = list.size();

        int sumaBialka = 0;
        for (Product product:list) {
            int i = 0;
            bialko = list.get(i).bialko();
            i++;
            sumaBialka += bialko;
        }
        int iloscProduktow = size + 1;
        int sredniaBialka = sumaBialka / iloscProduktow;
        if (sredniaBialka > 33) {
            return "Kup więcej tluszczy lub wegli!";
        }
    }

}