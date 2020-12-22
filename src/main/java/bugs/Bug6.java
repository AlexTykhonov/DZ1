package bugs;

/**
 * Проанализируй почему получается бесконечный цикл, исправь проблему то как видишь
 */
public class Bug6 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Test" + ++i);
        } while (i<10==true);
    }
}

//сделал
//у нас нет условия каким-то образом меняющего true в скобках while. Дописал условие.