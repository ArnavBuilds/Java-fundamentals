public class PracticeProblem {
    public static void main(String[] args) {
        float v=4;
        float u=2;
        float a=1;
        float s=1;
        float ans=(v*v-u*u)/2*a*s;
        System.out.println(ans);

        //replace <|name|> with Ashwin !
        String letter ="Thanks <|name|>!";
        letter =letter.replace("<|name|>" ,"Ashwin");
        System.out.println(letter);

        //detect double and triple spaces
        String name="This string contains  double   and triple spaces";
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));

    }
}
