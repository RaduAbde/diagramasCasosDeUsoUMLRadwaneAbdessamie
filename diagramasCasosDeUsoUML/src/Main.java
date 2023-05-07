import java.lang.reflect.Parameter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String regex = "He ido al (cine|supermercado)";
        Pattern pattern = Pattern.compile(regex);
        String a = "He ido al cine";
        Matcher matcher = pattern.matcher(a);
        System.out.println(matcher.matches());

        String reem = "Ciclo formativo Desarrollo de aplicaciones multiplataforma.";
        System.out.println(reem.replaceAll("\\s","_"));

        String abcd = "aaabcccccccdddefffg";
        String regabc = "^a{3}bc{7}d{3}ef{3}g$";

        System.out.println(abcd.matches(regabc));

        String numsREg =  "(\\D{1,})([.])(\\d{1,})";
        String numsREgbien =  "\\D{1,}[.]\\d{1,}";
        String solnums = "(\\d.*).*?";
        String regsFicherop =  "(\\D{1,})([.])(\\d{1,})";
        String oprueba1 = "abcde.1234\tjd.6\ttjuk.000\n";
        Pattern pattern1 = Pattern.compile(regsFicherop);
        Matcher matcher1 = pattern1.matcher(oprueba1);
        int k = 0;
        while (matcher1.find()){
            k++;
            System.out.println(oprueba1.charAt(matcher1.start(3)));
        }

        String puntos = "{0, 2}, {1, 5}, {2, 3}, {3, 4}";
        String regPuntos = "(\\{(\\d,[ ]\\d)\\})";
        Pattern pattern2 = Pattern.compile(regPuntos);
        Matcher matcher2 = pattern2.matcher(puntos);
        while (matcher2.find()){
            System.out.println(matcher2.group(2));
        }
        String regexPostal = "\\d{5}";
        System.out.println("12311".matches(regexPostal));
        String regexTarjeta = "(\\d{4}[ ]){3}\\d{4}";
        System.out.println("4356 6423 6422 4123".matches(regexTarjeta));
        String regexEmail = ".*@.*[.]com";
        System.out.println("test2@mail.com".matches(regexEmail));

    }
}