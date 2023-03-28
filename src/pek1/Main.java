package pek1;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        med [] bolnoi = inizialaiz1();


//1.1
//        getbolnoidiagnoz(bolnoi,"гепатит");

//1.2
//        interval(bolnoi, 1,3);
//2.1
//        task2( str,3,'g');

        String str ="Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) и\n" +
                "ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является\n" +
                "то, что его значение не может быть изменено после создания объекта при помощи\n" +
                "любого метода класса. Изменение строки всегда приводит к созданию нового\n" +
                "объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение\n" +
                "и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";
//2.2
        ;
        String bb= task25(str,"а", "java");
        System.out.print(bb);
//3.1
//        String reg="Да1та выпуска 8 декабря 1998 года[12]. Кодовое имя Playground. В данном случае встречается путаница.\n" +
//                "Выпускались книги, например, Beginning Java 2 by Ivor Horton (Mar 1999), фактически по J2SE 1.2 (бывшее название — Java 2).\n" +
//                "Вместе с тем по сей день такие книги публикуются, например: Х. М. Дейтел, П. Дж. Дейтел, С. И. Сантри.\n" +
//                "Технологии программирования на Java 2. Распределённые приложения (2011).\n" +
//                "В то время, когда, как известно, Java 2 была исторически заменена следующими релизами, подобные названия\n" +
//                " книг дезориентируют в понимании,\n" +
//                "о какой же версии Java они написаны на самом деле. Если J2SE 1.2 принято считать за Java 2, а авторы книг за\n" +
//                " Java 2 принимают JDK 7, это приводит к полной путанице.";
//         String t= regularnie(reg);
//        System.out.println(t);

    }


//    Task1


    static med[] inizialaiz1() {
        med[] bolnoi = new med[6];
        med bolnoi1 = new med(111, "Жопин", "Жопа", "Жопович",
                "Ул. Прямой кишки 12", "1111111", 1, "порванная жопа");
        med bolnoi2 = new med(112, "Хрухин", "Хряк", "Xрякович",
                "ул.Сеновальная", "121212", 2, "опьянения");
        med bolnoi3 = new med(113, "Йен", "Кертис", " ",
                "Манчестер", "323232", 3, "грустит");
        med bolnoi4 = new med(114, "Горшок", "Михаил", "Юрьевич",
                "ул.елимясомужики", "4343434", 4, "наркоман");
        med bolnoi5 = new med(115, "Хой", "Юрий", "Николаевич",
                "ул.Воронеж", "545454", 5, "гепатит");
        med bolnoi6 = new med(116, "Летов", "Егор", "Федорович",
                "ул.моейобороны", "65656", 6, "алкаш");
        bolnoi[0] = bolnoi1;
        bolnoi[1] = bolnoi2;
        bolnoi[2] = bolnoi3;
        bolnoi[3] = bolnoi4;
        bolnoi[4] = bolnoi5;
        bolnoi[5] = bolnoi6;
        return bolnoi;
    }
    //task1.1
    public  static med[] getbolnoidiagnoz (med[] bolnoi,String diagnoz){
        med [] pation = new med[bolnoi.length];
        int i=0;
        for (med bolnoi1 :bolnoi) {
            if (bolnoi1.getDiagnoz().equals(diagnoz)){
                pation[i]=bolnoi1;
                System.out.println(bolnoi1.inf());
            }
            i++;
        }
        return pation;
    }
    //    task1.2
    public  static  void  interval (med [] bolnoi, int from, int to){
        for (med p: bolnoi){
            if (p.getMedkarta()>= from && p.getMedkarta()<=to){
                System.out.println(p.inf());

            }
        }
    }





    //Task 2.1
    static  void task2 (String str, int a, char b){
        var str1= " ";
        String [] strarr = str.split(" ");
        for (int i =0;i<strarr.length;i++){
            if (strarr[i].length()>a){
                char[]chars = strarr[i].toCharArray();
                chars[a]=b;
                strarr[i]=new String(chars);
                str1= str1+ " "+strarr[i];
            }}
        System.out.println(str1);
    }

    // 2.2
    public  static String task25 (String str, String substring, String word){

        String[] strarr = str.split(" ");
        int a = str.indexOf(substring);
        for (int i=0;i<strarr.length;i++){
            if (strarr[i].endsWith(substring)){
                strarr[i]=strarr[i]+" "+word;
            }
        }
        return String.join(" ",strarr);
    }



    //task3.1
    static  String regularnie (String str){
        return str.replaceAll("[^\\p{L}\\s]+", "");
    }
}

