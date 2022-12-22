package ru.mirea.labs;
import java.util.regex.*;

public class task04 {
    public static void main(String[] args) {
        String s1 = "(1+8)-9/4";
        String s2 = "6/5-2*9";

        String regexp = "(\\d[^+])";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher1 = pattern.matcher(s1);
        Matcher matcher2 = pattern.matcher(s2);

        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
    }
}
