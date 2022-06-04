public class PersonBuilder {

    private String name;
    private String surname;
    private Integer age;
    private String city;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Некорректный возраст.");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (name == null || surname == null) {
            throw new IllegalStateException("Проверьте правильность написания имени и фамилии.");
        }
        return new Person(name, surname, age, city);
    }
}