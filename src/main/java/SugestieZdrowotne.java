import java.util.List;

public class SugestieZdrowotne {
    //    public String zwrocSugestieZdrowotne() {
//        return "Twoje zdrowie jest OK !";
//    }
    List<Product> list = new List<Product>();

    public String returnSuggestionsForSugars(List<?> list) {
        int wegle;

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

    public String returnSuggestionsForFat(List<?> list) {
        int tluszcze;
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

    public String returnSuggestionsForProtein(List<?> list) {
        int bialko;
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