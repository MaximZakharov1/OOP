import java.util.Scanner;

import static java.lang.Math.*;

public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Введите координаты первой точки: ");
        Scanner input1= new Scanner(System.in);
        double x1=input1.nextDouble();
        Scanner input2= new Scanner(System.in);
        double y1=input2.nextDouble();
        Scanner input3= new Scanner(System.in);
        double z1=input3.nextDouble();
        System.out.println("Введите координаты второй точки: ");
        Scanner input4= new Scanner(System.in);
        double x2=input4.nextDouble();
        Scanner input5= new Scanner(System.in);
        double y2=input5.nextDouble();
        Scanner input6= new Scanner(System.in);
        double z2=input6.nextDouble();
        System.out.println("Введите координаты третьей точки: ");
        Scanner input7= new Scanner(System.in);
        double x3=input7.nextDouble();
        Scanner input8= new Scanner(System.in);
        double y3=input8.nextDouble();
        Scanner input9= new Scanner(System.in);
        double z3=input9.nextDouble();
        Point3d t1 = new Point3d (x1,y1,z1);
        Point3d t2 = new Point3d (x2,y2,z2);
        Point3d t3 = new Point3d (x3,y3,z3);

        if (t1.isEqual(t2) || t2.isEqual(t3) || t3.isEqual(t1)) {
            System.out.println("Невозможно построить треугольник, т.к. точки совпадают!");
        }
        else {
            System.out.println("Площадь треугольника, заданного тремя исходными точками: " + computeArea(t1, t2, t3));
        }
    }

    public static double computeArea(Point3d t1, Point3d t2, Point3d t3) {
            double a = t1.distanceTo(t2);
            double b = t2.distanceTo(t3);
            double c = t3.distanceTo(t1);
            double p = (a+b+c)/2;
            return (sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
