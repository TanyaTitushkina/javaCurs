package javaCurs.chapter10ex12;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s%nsocial security number: %s%n%s %S",
                getFirstName(), getLastName(), getSocialSecurityNumber(), "Bithday:", getBirthDate());
    }

    // must be overridden by subclasses
    public abstract double earnings();
}
