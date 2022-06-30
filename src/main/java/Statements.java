public class Statements {
    public static void main(String[] args) {
        int actualPersons=55;
        String actualStatus="gruen";

        String print = checkStatus(actualPersons,actualStatus);
        System.out.println(print);
    }

    public static boolean biggerEqualsX(int anzahl, int erlaubt) {
        return anzahl<=erlaubt;
    }

    public static String checkStatus(int actual, String status){
        switch(status){
            case "rot": return nachricht(biggerEqualsX(actual, 0));
            case "gelb": return nachricht(biggerEqualsX(actual,30));
            case "gruen": return nachricht(biggerEqualsX(actual,60));
            default: return "kein Status, Personen beliebig";
        }
    }

    public static String nachricht(boolean bo){
        if(bo==true){
            return "Eintritt möglich";
        }else{
            return "Bitte nicht eintreten";
        }
    }

    public static int fakultaet(int eingabe) {
        int result = 1;
        int counter=1;
        while (counter<=eingabe) {
            result=result*counter;
            counter++;
        }
        return result;
    }
}
