
import java.util.Scanner;

public class Task9 {


    public static void main(String[] args) {
        int minutes, fps;
        System.out.println("Введите 2 исходных аргумента по отдельности в указанном порядке: количество минут, FPS");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        try {
            minutes = Integer.valueOf(input1.nextLine());
            fps = Integer.valueOf(input2.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Исходные значения должны быть заданы положительными целыми числами!");
            return;
        }
        if ((minutes <= 0) || (fps <= 0)) {
            System.err.println("Исходные значения должны быть заданы положительными целыми числами!");
        } else {
            System.out.println("Количество кадров, показанных за заданное количество минут для исходного FPS: " + frames(minutes,fps));
        }
    }

    public static int frames(int minutes, int fps) {
        return minutes*60*fps;
    }
}