public class PersonBuilder {

    protected String name;
    protected String surname;
    protected Integer age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Name is required");
        } else if (surname == null) {
            throw new IllegalStateException("Surname is required");
        } else if (age != null && age < 0) {
            throw new IllegalArgumentException("The age cannot be less than 0");
        } else {
            Person person = new Person(name, surname, age);
            person.setAddress(address);
            return person;
        }
    }
}
