package tcc;

import java.util.ArrayList;
import java.util.List;

public class UpperAndLowerCase {
    private final String palavra;
    private final String maiscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    private final String minuscula = "abcdefghijklmnopqrstuvwxyz ";

    public UpperAndLowerCase(String palavra) {
        this.palavra = palavra;
    }

    private List<Integer> convertToNumber() {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < this.palavra.length(); i++) {
            char Letra = palavra.charAt(i);
            for (int j = 0; j <= 26; j++) {
                char Maiscula = maiscula.charAt(j);
                char Minuscula = minuscula.charAt(j);
                if (Letra == Maiscula || Letra == Minuscula) {
                    listNumber.add(j);
                }
            }
        }
        return listNumber;
    }

    public String ToLowerCase() {
        String novaPalavra = "";
        List<Integer> listNumber = convertToNumber();
        for (Integer integer : listNumber) {
            for (int j = 0; j < this.minuscula.length(); j++) {
                if (integer == j) {
                    char Minuscula = minuscula.charAt(j);
                    novaPalavra = novaPalavra + Minuscula;
                }
            }
        }
        return novaPalavra;
    }

    public String ToUpperCase() {
        String novaPalavra = "";
        List<Integer> listNumber = convertToNumber();
        for (Integer integer : listNumber) {
            for (int j = 0; j < this.maiscula.length(); j++) {
                if (integer == j) {
                    char Maiscula = maiscula.charAt(j);
                    novaPalavra = novaPalavra + Maiscula;
                }
            }
        }
        return novaPalavra;
    }

}
