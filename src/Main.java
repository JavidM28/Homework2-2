public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 80, 50, 90, 85, 95);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 85, 55, 95, 90, 100);
        Gryffindor ron = new Gryffindor("Рон Уизли", 75, 45, 80, 70, 85);

        Slytherin draco = new Slytherin("Драко Малфой", 80, 50, 90, 85, 95, 70, 85);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 75, 45, 80, 70, 85, 65, 80);
        Slytherin goyle = new Slytherin("Грегори Гойл", 70, 40, 75, 65, 80, 60, 75);

        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 80, 50, 90, 85, 95);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 85, 55, 95, 90, 100);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 75, 45, 80, 70, 85);

        Ravenclaw cho = new Ravenclaw("Чжоу Чанг", 80, 50, 90, 85, 95, 70);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 85, 55, 95, 90, 100, 75);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 75, 45, 80, 70, 85, 65);

        harry.printDescription();
        System.out.println();
        draco.printDescription();
        System.out.println();
        zacharias.printDescription();
        System.out.println();
        cho.printDescription();
        System.out.println();

        Gryffindor.compareStudents(hermione, ron);
        Slytherin.compareStudents(draco, goyle);
        Hufflepuff.compareStudents(zacharias, justin);
        Ravenclaw.compareStudents(cho, marcus);

        compareMagicAndTransgression(harry, draco);
    }

    public static void compareMagicAndTransgression(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagicPower() > student2.getMagicPower()) {
            System.out.println(student1.getName() + " обладает большей магической силой, чем " + student2.getName());
        } else if (student1.getMagicPower() < student2.getMagicPower()) {
            System.out.println(student2.getName() + " обладает большей магической силой, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " обладают равной магической силой");
        }

        if (student1.getTransgressionDistance() > student2.getTransgressionDistance()) {
            System.out.println(student1.getName() + " может трансгрессировать на большее расстояние, чем " + student2.getName());
        } else if (student1.getTransgressionDistance() < student2.getTransgressionDistance()) {
            System.out.println(student2.getName() + " может трансгрессировать на большее расстояние, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " могут трансгрессировать на равное расстояние");
        }
    }
}