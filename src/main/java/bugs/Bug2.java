package bugs;


/**
 * Смысл программы ниже - к name "приклеить"(сделать concat http://proglang.su/java/strings-concat) цифер от 0 до 10
 * чтобы была строка User1-0-1-2-3-4-5-6...-10
 */
public class Bug2 {
    public static void main(String[] args) {

        StringBuffer name = new StringBuffer("User1");
        for (int i = 0; i <= 10; i++) {
           name.append("-").append(i).toString();
        }
        System.out.println(name);//почему User1? а не User1-0-1-2-3-4-5-6...-10
    }
}

//сделал
//https://habr.com/ru/post/260767/
//Используйте метод concat, если слияние нужно провести только один раз, для остальных случаев рекомендовано использовать или оператор "+"
//интересно использовать StringBuffer