public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println();
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Человеку 18 или больше лет");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        // Задача 2
        System.out.println();
        System.out.println("Задача 2");
        int outsideTemperature = 2;
        if (outsideTemperature < 5) {
            System.out.println("На улице +" + outsideTemperature + " градуса, нужно надеть шапку");
        } else {
            System.out.println("На улице +" + outsideTemperature + " градусов, можно идти без шапки");
        }

        // Задача 3
        System.out.println();
        System.out.println("Задача 3");
        int carSpeed = 58
                ;
        boolean carSpeedLimit = carSpeed > 60;
        if (carSpeedLimit) {
            System.out.println("Если скорость " + carSpeed + " км/ч, придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + carSpeed + " км/ч, можно ездить спокойно");
        }

        // Задача 4
        System.out.println();
        System.out.println("Задача 4");
        int manAge = 46;
        boolean isKinderGardenAge = manAge >= 2 && manAge < 6;
        boolean isSchoolAge = manAge >= 7 && manAge < 17;
        boolean isUniversityAge = manAge >= 18 && manAge <= 24;
        boolean workAge = manAge > 24;
        if (isKinderGardenAge) {
            System.out.println("Если возраст человека равен " + manAge + " лет, то ему нужно ходить в детский сад.");
        }
        if (isSchoolAge) {
            System.out.println("Если возраст человека равен " + manAge + " лет, то ему нужно ходить в школу.");
        }
        if (isUniversityAge) {
            System.out.println("Если возраст человека равен " + manAge + " лет, то его место в университете.");
        }
        if (workAge) {
            System.out.println("Если человеку " + manAge + " лет, то ему пора ходить на работу.");
        }
        // Задача 5
        System.out.println();
        System.out.println("Задача 5");
        int childAge = 4;
        boolean childAttractionAgeLowLimit = childAge < 5;
        boolean childAttractionAgeLimitWithoutAdult = childAge >= 5 && childAge < 14;
        boolean childAttractionAgeNoLimit = childAge >= 14;
        if (childAttractionAgeLowLimit) {
            System.out.println("Если ребёнку " + childAge + " года, кататься на аттракционе нельзя.");
        }
        if (childAttractionAgeLimitWithoutAdult) {
            System.out.println("Если ребёнку " + childAge + " лет, кататься на аттракционе можно в сопровождении взрослого.");
        }
        if (childAttractionAgeNoLimit) {
            System.out.println("Если ребёнку " + childAge + " лет, кататься на аттракционе можно без сопровождения взрослого.");
        }

        // Задача 6
        System.out.println();
        System.out.println("Задача 6");
        int placeNumber = 106;
        if (placeNumber <= 60) {
            System.out.println("В вагоне есть и сидячие и стоячие места.");
        }
        if (placeNumber > 60 && placeNumber <= 102) {
            System.out.println("Вагоне есть только стоячие места.");
        }
        if (placeNumber > 102) {
            System.out.println("В вагоне нет мест.");
        }

        // Задача 7
        System.out.println();
        System.out.println("Задача 7");
        int one = 7;
        int two = 45;
        int three = 37;
        if (one > two && one > three) {
            System.out.println("Число one большее, оно равно " + one);
        }
        if (two > one && two > three) {
            System.out.println("Число two большее, оно равно " + two);
        }
        if (three > one && three > two) {
            System.out.println("Число three большее, оно равно " + three);
        }
        }
        }