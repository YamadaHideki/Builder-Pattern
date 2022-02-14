public class Main {
    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Name")
                .setSurname("Surname")
                .setAge(48)
                .setAddress("Moscow")
                .build();

        Person son = mom.newChildBuilder()
                .setName("Child")
                .build();

        System.out.println(mom);
        System.out.println(son);

        son.happyBirthday();
    }
}
