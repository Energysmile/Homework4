public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        //Задание 2
        System.out.println("Задание 2");
        int outsideTemperature = -6;
        if (outsideTemperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (outsideTemperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        //Задание 3
        System.out.println("Задание 3");
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //Задание 4
        System.out.println("Задание 4");
        int ageForTeaching = 45;
        if (ageForTeaching >= 2 && ageForTeaching <= 6) {
            System.out.println("Если возраст человека равен " + ageForTeaching + ", то ему нужно ходить в детский сад");
        }
        if (ageForTeaching >= 7 && ageForTeaching <= 17) {
            System.out.println("Если возраст человека равен " + ageForTeaching + ", то ему нужно ходить в школу");
        }
        if (ageForTeaching >= 18 && ageForTeaching <= 24) {
            System.out.println("Если возраст человека равен " + ageForTeaching + ", то ему нужно ходить в университет");
        }
        if (ageForTeaching > 24) {
            System.out.println("Если возраст человека равен " + ageForTeaching + ", то ему нужно ходить на работу");
        }
        //Задание 5
        System.out.println("Задание 5");
        int ageChild = 15;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он не может кататься на аттракционе");
        } else {
            if (ageChild >= 5 && ageChild < 14) {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
            } else {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то может кататься без сопровождения взрослого");
            }
        }
        //Задание 6
        System.out.println("Задание 6");
        int allPassengers = 102;
        int ticketsSold = 102;
        int passengersSitting = 60;
        int ticketsSoldSitting = 55;
        int passengersStanding = allPassengers - passengersSitting;
        int ticketsSoldStanding = 41;
        boolean seatOnTheTrain = ticketsSold < 102;
        boolean seatOnTheTrainSitting = ticketsSoldSitting >= 60;
        boolean seatOnTheTrainStanding = ticketsSoldStanding >= passengersStanding;
        if (ticketsSold >= 102) {
            System.out.println("Вагон уже полностью забит");
        } else {
            if (seatOnTheTrain) {
                System.out.println("Места в вагоне есть");
            }
            if (seatOnTheTrainSitting) {
                System.out.println("В вагоне нет сидячих мест");
            } else {
                System.out.println("В вагоне есть сидячие места");
            }
            if (seatOnTheTrainStanding) {
                System.out.println("В вагоне нет стоячих мест");
            } else {
                System.out.println("В вагоне есть стоячие места");
            }
        }
        //Задание 7
        System.out.println("Задание 7");
        int one = 5;
        int two = 4;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число - " + one);
        } else {
            if (two > one && two > three) {
                System.out.println("Самое большое число - " + two);
            } else {
                System.out.println("Самое большое число - " + three);
            }
        }
    }
}