package bugs;

/**
 * Программа должна выводить числа от 10 до 0
 */
public class Bug8 {
    public static void main(String[] args) {
        for (int i = 10; i < 0; i--) {
            System.out.println(i);
        }

        System.out.println("End");
    }
}


//ошибка в том что i++ нужен i--