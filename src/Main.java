import java.util.Scanner;

// * Java. Уровень 2. Домашнее задание по 2 лекции.
//         * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого
//         * размера необходимо бросить исключение MyArraySizeException.
//         *
//         * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то
//         * элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть
//         * брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//         *
//         * 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и
//         * MyArrayDataException, и вывести результат расчета.
// Билалов Ильдар Москва Тестер-студент GeekBrains
public class Main {
    public static void main(String[] args) throws MyArrayDataException {
        MyArray();

    }

    public static void MyArray() throws MyArrayDataException {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            try {
                if (a != 4 || b != 4) {
                    throw new MyArraySizeException();
                } else {
                    String[][] MyArray = new String[a][b];

                    for (int i = 0; i < MyArray.length; i++) {
                        for (int j = 0; j < MyArray[i].length; j++) {
                            MyArray[i][j] = String.valueOf((int) (Math.random() * 10));
                        }
                    }
                    for (int i = 0; i < MyArray.length; i++, System.out.println()) {
                        for (int j = 0; j < MyArray[i].length; j++) {
                            System.out.print(MyArray[i][j] + " ");
                            try {
                                count = count + Integer.parseInt(MyArray[i][j]);
                            } catch (NumberFormatException e) {
                                throw new MyArrayDataException(i, j);
                            }
                        }
                    }
                }
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Программа отработала"+" сумма равна "+ count);
            }

    }

}

class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Одно из вводимых чисел не равно 4");
    }
}

class MyArrayDataException extends Exception {
    public int i;
    public int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }
}
