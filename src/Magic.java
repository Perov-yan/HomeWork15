public class Magic {

    //Сравниваем по основным показателям студентов
    public static void compareAnyStudents(Hogwarts first, Hogwarts second) {
        // сравниваем по основным показателям
        if (first.getMagicPower() > second.getMagicPower()) {
            System.out.println(first.getName() + " сильнее, чем " + second.getName());
        } else if (first.getMagicPower() == second.getMagicPower()) {
            System.out.println(first.getName() + " равны по магической силе с " + second.getName());
        } else {
            System.out.println(second.getName() + " сильнее, чем " + first.getName());
        }
        if (first.getTransgressionDistance() > second.getTransgressionDistance()) {
            System.out.println(first.getName() + " расстояние больше, чем " + second.getName());
            System.out.println(" ");
        } else if (first.getTransgressionDistance() == second.getTransgressionDistance()) {
            System.out.println(first.getName() + " расстояние такое же как и у " + second.getName());
            System.out.println(" ");
        } else {
            System.out.println(second.getName() + " расстояние больше, чем " + first.getName());
            System.out.println(" ");
        }
    }

    // Сравниваем Слизеринцев
    public static void compareSlytherinStudents(Slytherin first, Slytherin second) {
        //сумма очков
        int firstSum = first.getCunning() + first.getAmbition()
                + first.getDecisiveness() + first.getPowerLust() + first.getResourcefulness();
        int secondSum = second.getCunning() + second.getAmbition()
                + second.getDecisiveness() + second.getPowerLust() + second.getResourcefulness();

        // сравнивание
        if (firstSum > secondSum) {
            System.out.println(first.getName() + " лучший Слизеринец, чем  " + second.getName());
            System.out.println(" ");
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучший Слизеринец, чем " + first.getName());
            System.out.println(" ");
        } else {
            System.out.println(first.getName() + " и " + second.getName() + " одинаковые Слизеренцы");
            System.out.println(" ");
        }
    }

    // Сравниваем Гриффиндорцев
    public static void compareGryffindorStudents(Gryffindor first, Gryffindor second) {
        //сумма очков
        int firstSum = first.getBravery() + first.getHonor()
                + first.getNobility();
        int secondSum = second.getBravery() + second.getHonor()
                + second.getNobility();

        // сравнивание
        if (firstSum > secondSum) {
            System.out.println(first.getName() + " лучший Гриффиндорец, чем " + second.getName());
            System.out.println(" ");
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучший Гриффиндорец, чем " + first.getName());
            System.out.println(" ");
        } else {
            System.out.println(first.getName() + " и " + second.getName() + " одинаковые Гриффиндорцы");
            System.out.println(" ");
        }
    }
// Сравниваем Пуффендуйцев
    public static void compareHufflepuffStudents(Hufflepuff first, Hufflepuff second) {
        //сумма очков
        int firstSum = first.getHardwork()
                + first.getIntegrity() + first.getLoyalty();
        int secondSum = second.getHardwork()
                + second.getIntegrity() + second.getLoyalty();

        // сравнивание
        if (firstSum > secondSum) {
            System.out.println(first.getName() + " лучший Пуффендуец, чем  " + second.getName());
            System.out.println(" ");
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучший Пуффендуец, чем " + first.getName());
            System.out.println(" ");
        } else {
            System.out.println(first.getName() + " и " + second.getName() + " одинаковые Пуффендуйцы");
            System.out.println(" ");
        }
    }
    // Сравниваем Когтевранцев
    public static void compareRavenclawStudents(Ravenclaw first, Ravenclaw second) {
        //сумма очков
        int firstSum = first.getCreativity() + first.getIntelligence()
                + first.getSmartness() + first.getWisdom();

        int secondSum = second.getCreativity() + second.getIntelligence()
                + second.getSmartness() + second.getWisdom();

        // сравнивание
        if (firstSum > secondSum) {
            System.out.println(first.getName() + " лучший Когтевранец, чем " + second.getName());
            System.out.println(" ");
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучший Когтевранец, чем " + first.getName());
            System.out.println(" ");
        } else {
            System.out.println(first.getName() + " и " + second.getName() + " одиныковые Когтевранецы");
            System.out.println(" ");
        }
    }

}
