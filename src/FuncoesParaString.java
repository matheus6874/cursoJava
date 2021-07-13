public class FuncoesParaString {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG      ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();//retira os espaços do final
        String s04 = original.substring(2);//Gera uma nova string a partir do segundo caracter
        String s05 = original.substring(2,9);//Gera uma nova string a partir do 2 e até o 9
        String s06 = original.replace("a","x");//Troca a por x
        String s07 = original.replace("abc","xy");//Troca abc por xy
        int i = original.indexOf("bc");//Primeira Ocorrência do bc
        int j = original.lastIndexOf("bc");//Ultima Ocorrência do bc
        String s = "potato apple lemon";

        String [] vet = s.split(" ");
        String word1 = vet[0];
        String word2 = vet[1];
        String word3 = vet[2];

        System.out.println("Original: -" + original + "-");
        System.out.println("toLower: -" + s01 + "-");
        System.out.println("toUpper: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring (2,9): -" + s05 + "-");
        System.out.println("replace 'a' por 'x': -" + s06 + "-");
        System.out.println("replace 'abc' por 'xy': -" + s07 + "-");
        System.out.println("indexOf bc: " + i);
        System.out.println("lastIndexOf bc: " + j);
        System.out.println("Word1 : " + word1);
        System.out.println("Word2 : " + word2);
        System.out.println("Word3 : " + word3);
    }
}
