package ru.mirea.lab;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task23 {
    public static void main(String[] args) {
        Map<String, Pattern> patterns = Map.of(
                "Десятичная запись с точками", Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$"),
                "16-ая запись с точками", Pattern.compile("^(?:0x[0-9A-F]{2}\\.){3}0x[0-9A-F]{2}$"),
                "8-ая запись с точками", Pattern.compile("^(?:0[0-3][0-7]{2}\\.){3}0[0-3][0-7]{2}$"),
                "16-ая запись без точек", Pattern.compile("0x(?:[0-9A-F]{2}){4}"),
                "Десятичная запись без точек", Pattern.compile("^(?:429496729[0-6]|42949672[0-8][0-9]|4294967[01][0-9]{2}|429496[0-6][0-9]{3}|42949[0-5][0-9]{4}|4294[0-8][0-9]{5}|4293[0-9]{6}|429[0-2][0-9]{7}|42[0-8][0-9]{8}|4[01][0-9]{9}|[0-3]?(?:[0-9]?){10})$"),
                "Восьмеричная запись без точек", Pattern.compile("^0[0-3][0-7]{10}$")
        );

        List<String> ips = List.of(
                "192.0.2.235",
                "0xC0.0x10.0x02.0xEB",
                "0300.0000.0002.0353",
                "0xC00002EB",
                "3221226219",
                "030000001353",
                "000sdfdsf0v03"
        );


        for (String ip : ips) {
            boolean find = false;
            for (var pattern : patterns.entrySet()) {
                Matcher matcher = pattern.getValue().matcher(ip);
                if (matcher.matches()) {
                    System.out.println(pattern.getKey() + ": " + ip);
                    find = true;
                }
            }

            if (!find) {
                System.out.println(ip + " is not ip");
            }
        }
    }
}
