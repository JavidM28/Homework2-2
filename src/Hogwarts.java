class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void printCommonDescription() {
        System.out.println("Имя: " + name);
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии: " + transgressionDistance);
    }

    public void printDescription() {
        printCommonDescription();
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.magicPower > student2.magicPower) {
            System.out.println(student1.name + " обладает большей магической силой, чем " + student2.name);
        } else if (student1.magicPower < student2.magicPower) {
            System.out.println(student2.name + " обладает большей магической силой, чем " + student1.name);
        } else {
            System.out.println(student1.name + " и " + student2.name + " равны по магической силе");
        }

        if (student1.transgressionDistance > student2.transgressionDistance) {
            System.out.println(student1.name + " может трансгрессировать на большее расстояние, чем " + student2.name);
        } else if (student1.transgressionDistance < student2.transgressionDistance) {
            System.out.println(student2.name + " может трансгрессировать на большее расстояние, чем " + student1.name);
        } else {
            System.out.println(student1.name + " и " + student2.name + " равны по расстоянию трансгрессии");
        }
    }
}
