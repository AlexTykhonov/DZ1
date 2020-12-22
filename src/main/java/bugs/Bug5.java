package bugs;

/**
 * Исправь NPE(NullPointerException - чисто логически, проанализируй кусочек кода и скажи почему эта ошибка появляется
 * <p>
 * ее смысл заключается в том - что ты обращаешься к объекту которого в памяти нет, а есть только название
 * так называемая "пустая" ссылка(ссылка на пустоту) - важно понимать что эта ошибка относиться только к объектам(ссылочные типы данных), а не к примитивам
 * <p>
 * пример
 * String name = null;//память не выделена, есть только пустая ссылка; в качестве заглушки используется null
 * <p>
 * System.out.println(name.toUpperCase());// здесь даст NPE так как у тебя нет объекта по факту, есть просто назввание ссылки без объекта
 * *
 */
public class Bug5 extends Exception {

    private static final String value="кот";

    {
        System.out.println(value.length());
    }

    public static void main(String[] args) {
        /**
         * 1 case
         */

        try {
            String name = null;
            System.out.println(name.toUpperCase());
        } catch (Exception e) {
            System.out.println("Выявлена ошибка в переменной имени. Тип ошибки " + e);
        }
        /**
         * 2 case
         */
        try {
            Integer number = null;
            System.out.println(number.intValue());
        } catch (Exception e1) {
            System.out.println("Выявлена ошибка в переменной номера. Тип ошибки " + e1);
            /**
             * 3 case
             */
            System.out.println(value.substring(0, 1));
        }
    }
}

//сделал
//имена name и number -null и если их изменить - будет все ок. value - переменная с ограниченным доступом
// и не обьявлена и потому нулл. ИДЕ предложила сделать ее финальной.
