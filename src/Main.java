import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task 1
        int age = 18;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + " он совершенолетний ");
        }
        if (age < 18) {
        } else {
            System.out.println(" Если возраст человека меньше " + age + " он не достиг совершеннолетия, нужно немного подождать ");
        }

        // task2
        int temperature = 5;
        if (temperature >= 5) {


            System.out.println(" Сегодня  тепло, можно идти без шапки " + temperature);
        }
        if (temperature <= 5) {
            System.out.println(" На улице холодно, нужно одеть шапку " + temperature);
        }
        // task 3
        int speed1 = 50;
        if (speed1 >= 60) {
            System.out.println(" Если скорость " + speed1 + " то  придется заплатить штраф ");

        } else {

            System.out.println(" Если скорость " + speed1 + " то  можно ездить спокойно»");


        }
        // task 4
        int age4 = 25;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен, " + age4 + " то ему нужно ходить в детский сад ");
        }

        if (age4 >= 7 && age4 <= 18) {
            System.out.println(" Если возраст человека равен, " + age4 + " то ему нужно ходить в школу ");
        }
        if (age4 > 18 && age4 < 24) {
            System.out.println(" Если возраст человека равен, " + age4 + " то его место в университет ");
        } else {
            System.out.println(" А если человеку больше, " + age4 + " то ему пора ходить на работу ");
        }

        // task 5
        int baby = 5;
        if (baby <= 5) {
            System.out.println(" Если возраст ребенка меньше, " + baby + " то ему  нельзя кататься на аттракционе  без сопровождения взрослого ");
        }
        if (baby >= 5 && baby < 14) {
            System.out.println(" Если возраст ребенка равен, " + baby + " то ему  можно кататься на аттракционе в сопровождении взрослого ");
        }
        if (baby >= 14) {
            System.out.println(" Если возраст ребенка равен, " + baby + " то он может кататься  на атракционе без сопровождения взрослого ");
        }

            }

        }



