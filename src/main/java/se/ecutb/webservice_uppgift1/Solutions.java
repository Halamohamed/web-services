package se.ecutb.webservice_uppgift1;

import java.util.*;
import java.util.stream.Collectors;

public class Solutions {

    // fizzbuzz
    public List<String> fizzBuzz(){
        List<String> fizzbuzz = new ArrayList<>();
        for(int i= 1; i <= 100; i++ ){
             if(i % 3 == 0 && i % 5 == 0 ){
                 fizzbuzz.add("fizzbuzz");
            }
            else if(i % 3 == 0 ){
                fizzbuzz.add("fizz");
            }else if(i % 5 == 0 ){
                fizzbuzz.add("buzz");
            }else {
                fizzbuzz.add(String.valueOf(i)) ;
            }

        }
        return fizzbuzz;
    }

    //dubbletter
    public void duplicates(List letter){
        List<Integer> integerList= new ArrayList<>(letter);

        System.out.println("Original list : " + integerList);
        System.out.println("After clear double letter : " +
                integerList.stream()
                .distinct()
                .collect(Collectors.toList()));
    }

    //rövarspråket
    public StringBuilder robberLang(String string){
        //StringBuilder s = new StringBuilder();
        StringBuilder noDouble = new StringBuilder("");
        //List<String> stringList = new ArrayList<String>(Collections.singleton(string));
        //String vokaler = new String("O ,U , Å , E , I , Y , Ä , Ö ");
        for (int i=0; i< string.length(); i++){
            if((string.charAt(i) >= 'a' && string.charAt(i) <= 'ö') || (string.charAt(i)>='A' && string.charAt(i)<='Ö') ) {
                if (string.charAt(i) == 'a' || string.charAt(i) == 'A'
                        || string.charAt(i) == 'e' || string.charAt(i) == 'E'
                        || string.charAt(i) == 'i' || string.charAt(i) == 'I'
                        || string.charAt(i) == 'o' || string.charAt(i) == 'O'
                        || string.charAt(i) == 'u' || string.charAt(i) == 'U'
                        || string.charAt(i) == 'y' || string.charAt(i) == 'Y'
                        || string.charAt(i) == 'ö' || string.charAt(i) == 'Ö'
                        || string.charAt(i) == 'ä' || string.charAt(i) == 'Ä'
                        || string.charAt(i) == 'å' || string.charAt(i) == 'Å') {
                    noDouble = noDouble.append(string.charAt(i)); // lägga(kopiera) bara bokstaven om den är en vokal

                } else {
                    noDouble = noDouble.append(string.charAt(i));
                    noDouble = noDouble.append('o');
                    noDouble = noDouble.append(Character.toLowerCase(string.charAt(i)));
                }
            }else {
                noDouble = noDouble.append(string.charAt(i));
            }
    }
        return noDouble;
}

//Rövarspråket 2
    public StringBuilder robberLangBack(String s){
        StringBuilder string = new StringBuilder(s);
        StringBuilder translated = new StringBuilder("");
        for (int i=0; i< string.length(); i++){
                if (string.charAt(i) == 'o' && Character.toLowerCase(string.charAt(i+1)) == Character.toLowerCase(string.charAt(i-1))) {
                    string.replace(i-1, i+1 , String.valueOf(string.charAt(i-1)));
                } else {
                translated = translated.append(string.charAt(i));
            }
        }
        return translated;
    }

    //Riskorn
    public int riceGrain(int risNo){
        int square = 1;
        for(int i =1; i<= 64; i++){
            square = (int) Math.pow(2,i) ;
            if(square >= risNo){
                return i;
            }
        }return square;

    }

}
