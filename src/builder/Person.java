package builder;

public class Person {
 private String firstName;
    private String middleName;
    private String lastName;
    private Integer age;
    private String gender;

    public Person(String firstName, String middleName, String lastName,Integer age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(PersonBuilder personBuilder) {
        setFirstName(personBuilder.firstName);
        setLastName(personBuilder.lastName);
        setMiddleName(personBuilder.middleName);
        setAge(personBuilder.age);
        setGender(personBuilder.gender);
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "FirstName: "+firstName+"\nLastName: "+lastName+"\nAge:"+age+"\nGender: "+gender;
    }

    public static class PersonBuilder{
        private String firstName;
        private String middleName;
        private String lastName;
        private Integer age;
        private String gender;

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }


}
