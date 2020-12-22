package bugs;

import java.util.Date;

/**
 * Необходимо объяснить и решить проблему - почему здесь идет зацикленность;заканчивается память
 */
public class Bug1 {
    public static void main(String[] args) {

        System.out.println("Current time is " + new Date().getTime());

        for (int i = 0; i < 129; i++) {
            System.out.println("Current time is " + new Date().getTime());
        }
    }
}

//сделал
//смена типа счетчика на интегер решила проблему. Видимо тип байт не достигает 129 никогда.