
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double var=6123;         // номер зачетной книжки
        
        double  c2=var%2,
                c3=var%3,
                c5=var%5,
                c7=var%7,
                c=c3;            // инициализация переменных

        int n, m;                   // переменные для условий циклов

        Scanner reader = new Scanner(System.in);  // ввод чисел
        System.out.print("Введите n и m ");
        n = reader.nextInt();
        m = reader.nextInt();

        if(n<0||m<0||n==0||m==0)
        {
            System.out.print("Ошибка: m и n -- не может быть меньше равно ноль\n");
        }
        else {
            double S = 0.0;
            for (float i = 0; i < n; i++)
                for (float j = 0; j < m; j++) {
                    if ((i - c) == 0)
                        continue;        //  если деление на 0 то перейти за след. итерацию
                    else
                        S += ((i) + j) / (i - c);  // иначе считать функцию

                }
            System.out.print("S = ");
            System.out.print(S);
        }
    }
}
