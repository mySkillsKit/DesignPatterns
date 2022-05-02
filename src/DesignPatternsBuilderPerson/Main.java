package DesignPatternsBuilderPerson;

public class Main {
    public static void main(String[] args) {

        Person dad = new PersonBuilder()
                .setName("Ivan")
                .setSurname("Petrov")
                .setAge(48)
                .build();

        dad.setAddress("Dubay");

        System.out.println(dad);

        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();

        son.happyBirthday();
        mom.happyBirthday();

        System.out.println("У " + mom + " есть сын, " + son);
        mom.setAddress("Paris");

        System.out.println(mom);


        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
