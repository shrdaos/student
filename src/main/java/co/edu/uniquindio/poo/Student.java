package co.edu.uniquindio.poo;
public class Student {
    private String name;
    private String lastName;
    private String identification;
    private String email;
    private String telephone;
    private byte age;
    public Student( String name, String lastName, String identification, String email, String telephone, byte age){

        assert name != null && !name.isBlank() : "el nombre debe ser diferente de null";
        assert lastName != null && !lastName.isBlank(): "el apellido debe ser diferente de null";
        assert identification != null && !identification.isBlank(): "el numero de identificación debe ser deferente de null";
        assert email != null && email.contains("@") : " el correo debe contener el simbolo @";
        assert telephone != null:"el telefono no puede ser null";
        assert age > 0 : " la edad debe ser mayor a cero";

        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public String getIdentification() {
        return identification;
    }
    public void setidentification(String identification) {
        this.identification = identification;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Students{"+"name='"+ name +'\''+
        ", lastname='" +lastName + '\'' +
        ", identification='" +identification + '\'' +
        ", email='" +email + '\'' +
        ", telephone='" +telephone + '\'' +
        ", age=" + age +
        '}';
        

    }
}
