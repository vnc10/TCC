public class UpperAndLowerCase {
    private String palavra;
    private String maiscula = "ABCDEF";
    private String nova;

    public UpperAndLowerCase(String palavra) {
        this.palavra = palavra;
    }

    public String ToLowerCase() {
        for (int i = 0; i < this.palavra.length(); i++) {
            for (int j = 0; j < this.maiscula.length(); j++) {
                char Palavra = palavra.charAt(i);
                char Maiscula = maiscula.charAt(j);
                if(Palavra == Maiscula){
                    nova = String.valueOf(Maiscula);
                }
            }
        }
        return nova;
    }

    @Override
    public String toString() {
        return "UpperAndLowerCase{" +
                "palavra='" + palavra + '\'' +
                ", minuscula='" + maiscula + '\'' +
                '}';
    }

}
