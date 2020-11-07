package e1014.pkg;
// @author Michael

public class PieceWorker extends Employee {

    private double wage; //wage per piece
    private double pieces; //number of pieces produced

    // five-argument constructor
    public PieceWorker(String firstName, String lastName,
            String socialSecurityNumber, double wage, double pieces) {

        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0) // validate wage
        {
            throw new IllegalArgumentException(
                    "Hourly wage must be >= 0.0");
        }
        this.wage = wage;

        if (pieces < 0.0) // validate pieces
        {
            throw new IllegalArgumentException(
                    "Number of pieces must be >= 0.0");
        }
        this.pieces = pieces;
    }

    public final void setWage(double wage) {
        if (wage < 0.0) // validate wage
        {
            throw new IllegalArgumentException(
                    "Hourly wage must be >= 0.0");
        }

        this.wage = wage;
    } // end method setWage

    public double getWage() {
        return wage;
    } // end method getWage

    public final void setPieces(double pieces) {
        if (pieces < 0.0) // validate pieces
        {
            throw new IllegalArgumentException(
                    "Number of pieces must be >= 0.0");
        }
        this.pieces = pieces;
    } // end method setPieces

    public double getPieces() {
        return pieces;
    } // end method getPieces

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        return getWage() * getPieces();
    } // end method earnings

    // return String representation of PieceWorker object
    @Override
    public String toString() {
        return String.format("PieceWorker: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "Wage per piece", getWage(),
                "Number of pieces produced", getPieces());
    } // end method toString

}
