package Task12_10;


import java.util.Date;

public class GetTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        String date1 = date.toString();
//        System.out.println(date1);

        int hours = Integer.parseInt(date1.substring(11, 13));
//        System.out.println(hours);
        int minutes = Integer.parseInt(date1.substring(14, 16));
//        System.out.println(minutes);
        int secund = Integer.parseInt(date1.substring(17, 19));
//        System.out.println(secund);

        int result1 = 24 -hours;
        int result2 = 59 - minutes;
        int result3 = 60 - secund;
        System.out.println("До конца  дня осталось " + result1 + " часов, "  +
                            result2 + " минут, и " + result3 + " секунд.");

        int result4 = 24 * 60 * 60 - (hours - 1) * 60 * 60 - minutes * 60 - secund;
        System.out.println("Или " + result4 + " секунд.");

        int result5 = 24 * 60 - (hours - 1) * 60 - (minutes + 1);
        System.out.println("Или " + result5 + " минут.");

        int result6 = 24  - hours ;
        System.out.println("Или " + result6 + " часа(-ов).");



    }
}