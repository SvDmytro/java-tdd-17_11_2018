import java.util.List;

public class SugestieZdrowotne {
//    public String zwrocSugestieZdrowotne() {
//        return "Twoje zdrowie jest OK !";
//    }

    public String returnSuggestionsForSugars() {
        int wegle;

        List<Product> list = new List<Product>();
        int size = list.size();

        int sumWegli = 0;
        for (Product:
             list) {
            int i = 0;
            int wegle = list.get(i).getWegle();
            i++;

            int sumWegli +=wegle;
        }
        int iloscProduktow = size + 1;
        int sredniaWegli = sumWegli / iloscProduktow;
        if (sredniaWegli > 33) {
            return "Kup więcej bialka lub tluszczy!";
        }

    }

    public String returnSuggestionsForFat() {
        int tluszcze;
        List<Product> list = new List<Product>();
        int size = list.size();

        for (Product:
             list) {
            int i = 0;
            int tluszcze = list.get(i).getTluszcze();
            i++;

            int sumTluszczy +=tluszcze;
        }
        int iloscProduktow = size + 1;
        int sredniaTluszczy = sumaTluszczy / iloscProduktow;
        if (sredniaTluszczy > 33) {
            return "Kup więcej bialka lub wegli!";
        }
    }

    public String returnSuggestionsForProtein() {
        int bialko;
        List<Product> list = new List<Product>();
        int size = list.size();

        for (Product:
             list) {
            int i = 0;
            int bialko = list.get(i).getBialko();
            i++;
            int sumBialka +=bialko;
        }
        int iloscProduktow = size + 1;
        int sredniaBialka = sumaBialka / iloscProduktow;
        if (sredniaBialka > 33) {
            return "Kup więcej tluszczy lub wegli!";
        }
    }

}