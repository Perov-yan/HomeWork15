public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();

        // Грифиндорцы
        Gryffindor potter = new Gryffindor("Гарри Поттер", 42, 66, 16, 26, 80);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 45, 22, 25, 51, 65);
        Gryffindor ron = new Gryffindor("Рон Визли", 10, 22, 16, 22, 52);

        // Слизеренцы
        Slytherin malfoy = new Slytherin("Драко Малфой", 10,15,7,8,2,3,4);
        Slytherin montegry = new Slytherin("Грэхэм Монтегю",9,2,5,1,6,8,9);
        Slytherin goil = new Slytherin("Грегори Гойл",15,5,1,2,7,34,5);

        // Пуффендуйцы
        Hufflepuff smit = new Hufflepuff("Захария Смит",10, 23,2,4,2);
        Hufflepuff diggory = new Hufflepuff("Седрик Диггори", 2,4,16,73,3);
        Hufflepuff finch = new Hufflepuff("Джастин Финч-Флетчли", 5, 6,2,5,2);

        // Когтевранцы
        Ravenclaw chang = new Ravenclaw("Чжоу Чанг", 20,12,45,5,1,5);
        Ravenclaw patil = new Ravenclaw("Падма Патил", 14,51,6,23,4,12);
        Ravenclaw belbi = new Ravenclaw("Маркус Белби",24,51,22,33,44,55);

        System.out.println(" ");
        System.out.println(diggory);
        System.out.println(patil);
        System.out.println(ron);
        System.out.println(chang);
        System.out.println(" ");

        Magic.compareAnyStudents(belbi,goil);
        Magic.compareAnyStudents(potter,diggory);
        Magic.compareGryffindorStudents(hermione, ron);
        Magic.compareSlytherinStudents(malfoy, montegry);
        Magic.compareHufflepuffStudents(smit,finch);
        Magic.compareRavenclawStudents(chang,patil);

    }
}