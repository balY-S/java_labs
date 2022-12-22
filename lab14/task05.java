package ru.mirea.labs;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task05 {
    public static void main(String[] args) {
        String s1 = "29/02/2000, 30/04/2003, 01/01/2003";
        String s2 = "29/02/2001, 30-04-2003, 1/1/1899";
        String regexp = "(29/02/(2000|2400|2800|(19|[2-9][0-9])(0[48]|[2468][048]|[13579][26])))"
                + "|((0[1-9]|1[0-9]|2[0-8])/02/((19|2[0-9])[0-9]{2}))"
                + "|((0[1-9]|[12][0-9]|3[01])/(0[13578]|10|12)/((19|2[0-9])[0-9]{2}))"
                + "|((0[1-9]|[12][0-9]|30)/(0[469]|11)/((19|2[0-9])[0-9]{2}))";
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


/* �������� ���������� ���������, ������������ �������� �� ������
        ������� ����� � ������� dd/mm/yyyy. ������� � 1900 ���� �� 9999 ����. */
