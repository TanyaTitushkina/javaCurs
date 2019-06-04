package javaCurs.chapter10ex14;

public class PieceWorker extends Employee{

    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber,
                       double wage, int pieces)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return wage * pieces;
    }

    @Override
    public String toString() {
        return String.format("piece-worker employee: %s %s%nsocial security number: %s%n%s %.2f%n%s %d",
                getFirstName(), getLastName(), getSocialSecurityNumber(),
                "Wage per piece:", getWage(), "Pieces made:", getPieces());
    }
}
