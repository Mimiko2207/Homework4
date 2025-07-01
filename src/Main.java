//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }

        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("ЗАДАЧА 2");
        int temperature = 8;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");

            System.out.println("ЗАДАЧА 3");
            int speed = 80;
            if (speed <= 60) {
                System.out.println("Если скорость " + speed + " ,то можно ездить спокойно ");
            }

            if (speed > 60) {
                System.out.println("Если скорость " + speed + " ,то придется заплатить штраф");

                System.out.println("ЗАДАЧА 4");
                int years = 21;
                if (years > 2 && years < 6) {
                    System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в детский сад");
                }if (years < 17 && years > 7) {
                    System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в школу");
                }if (years >= 18 && years <= 24) {
                    System.out.println("Если возраст человека равен " + years + " то его место в университете");
                }if (years > 24) {
                    System.out.println("Если возраст человека равен " + years + " то ему пора на работу");
                }


                System.out.println("ЗАДАЧА 5");
                int yearKed = 5;
                if (yearKed <5){
                    System.out.println("Если возраст ребенка равен " + yearKed + " , то ему нельзя кататься на аттракционе");}
                if (yearKed >=5 && yearKed <14){
                    System.out.println("Если возраст ребенка равен " + yearKed + " , то ему можно кататься на аттракционе в сопровождении взрослого");}
                if (yearKed >=14){
                    System.out.println("Если возраст ребенка равен " + yearKed + " , то ему можно кататься на аттракционе без сопровождении взрослого");}


                System.out.println("ЗАДАЧА 6");
                int human = 0;
                int sitting = 60;
                int standing = 42;
                if (human <102 && human >=0){
                    System.out.println("Мест в вагоне " + (102- human));}
                else if (human >=102){
                        System.out.println("Мест в вагоне нет");
                    }
                if (sitting <=60 && sitting >=0 && human <102 && human >=0) {
                    System.out.println("Сидячих мест в вагоне " + sitting);
                }else if (sitting >60) {
                    System.out.println("Сидячих мест нет");
                }
                if (standing <=42 && sitting >=0 && human <102 && human >=0){
                    System.out.println("Стоячих мест в вагоне " + standing);
                }else if (standing >42) {
                    System.out.println("Стоячих мест нет");}

                System.out.println("ЗАДАЧА 7 ");
                int one = 5;
                int two = 30;
                int three = 30;
                if (one > two && one > three){
                    System.out.println(one);}
                else if (two > three && two > one){
                    System.out.println(two);}
                else if (three > one && three > two){
                    System.out.println(three);}
                else {
                    System.out.println("Значения одинаковы");}

















            }
        }
    }
}

