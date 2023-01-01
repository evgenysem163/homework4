import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int age = 18; // константа
        if (age >= 18) {   // сравнение ~ условие
            System.out.println(" Если возраст человека равен " + age + " он совершенолетний ");
        }

        if (age < 18) {
            System.out.println(" Если возраст человека меньше " + age + " он не достиг совершеннолетия, нужно немного подождать ");
        }

//        // task2
        int temperature = 5;
        if (temperature >= 5) {


            System.out.println(" Сегодня  тепло, можно идти без шапки " + temperature);
        }
        if (temperature <= 5) {
            System.out.println(" На улице холодно, нужно одеть шапку " + temperature);
        }
//        // task 3
        int speed1 = 50;
        if (speed1 >= 60) {
            System.out.println(" Если скорость " + speed1 + " то  придется заплатить штраф ");

        } else {

            System.out.println(" Если скорость " + speed1 + " то  можно ездить спокойно»");


        }
//        // task 3
//        Scanner x = new Scanner(System.in);
//        int age4 = x.nextInt();
        int age4 = 3;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен, " + age4 + " то ему нужно ходить в детский сад ");
        }

        if (age4 >= 7 && age4 <= 18) {
            System.out.println(" Если возраст человека равен, " + age4 + " то ему нужно ходить в школу ");
        }
        if (age4 > 18 && age4 < 24) {
            System.out.println(" Если возраст человека равен, " + age4 + " то его место в университет ");
        } else if (age4 >= 24) {
            System.out.println(" А если человеку больше, " + age4 + " то ему пора ходить на работу ");
        }

//        // task 4
        int baby = 5;

        if (baby <= 5) {
            System.out.println(" Если возраст ребенка меньше, " + baby + " то ему  нельзя кататься на аттракционе  ");
        }
        if (baby >= 5 && baby < 14) {
            System.out.println(" Если возраст ребенка равен, " + baby + " то ему  можно кататься на аттракционе в сопровождении взрослого ");
        }
        if (baby >= 14) {
            System.out.println(" Если возраст ребенка равен, " + baby + " то он может кататься  на атракционе без сопровождения взрослого ");
        }


        int a = 102;
        int b = 60;
        int x= 103;
        if (x < a && x < b) {
            System.out.println("В вагоне есть сидячие  места ");
        } else {
            if (x < a && x > b) {
                System.out.println("В вагоне только стоячие места " );
            } else if (x > a) {
                System.out.println("Вагон полный !!!");
            }

        // tass5
        int monthOfTheYear = 1;

        switch (monthOfTheYear) {
            case 1:
                System.out.println("зимний месяц");
                break;
            case 2:
                System.out.println("зимний месяц");
                break;
            case 3:
                System.out.println("весенний месяц");
                break;
            case 4:
                System.out.println("весенний месяц");
                break;
            case 5:
                System.out.println("весенний месяц");
                break;
            case 6:
                System.out.println("летний месяц");
                break;
            case 7:
                System.out.println("летний месяц");
                break;
            case 8:
                System.out.println("летний месяц");
                break;
            case 9:
                System.out.println("осений месяц");
                break;
            case 10:
                System.out.println("осений месяц");
                break;
            case 11:
                System.out.println("осений месяц");
                break;
            case 12:
                System.out.println("зимний месяц");
                break;
            default:
                System.out.println("такого месяца не существует");


        }

        }
    }
}



