package bugs;

/**
 * Проанализируй почему сравнение 2 строк name и name2 при == дает true
 *         String name = "Test";
 *         String name2 = "Test";
 * но если я напишу
 *         String name = "Test";
 *          String name2 = new String("Test"); то == уже работать не будет?
 *
 * как можно сделать так, чтобы == даже при варианте, описанным выше работал
 * то-есть
 * String name = "Test";
 * String name2 = new String("Test");
 * System.out.println(name == name2);// вернет true <<< что нужно поправить/дописать здесь(строки объявления переменных трогать не нужно)
 *
 * *
 */
public class Bug4 {
    public static void main(String[] args) {
        String name = "Test";
        String name2 = "Test";

        System.out.println(name == name2);// вернет true


        String name3 = "Test";
        String name4 = new String("Test");
        System.out.println(name4.equals(name4));// false > а нужно true

    }
}

//сделал
//я заменил "==" на "equals".Причину нашел здесь https://www.infoworld.com/article/3276354/string-comparisons-in-java.html
//Adding the new operator forces the creation of a new String in the memory heap. Thus, the JVM will create two different objects.