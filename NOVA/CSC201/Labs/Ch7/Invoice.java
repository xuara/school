package e711.pkg;
// @author Michael Kester

public class Invoice {

    private String partNum;
    private String partDesc;
    private int quant;
    private double price;

    //Invoice constructor that receives four parameters 
    public Invoice(String partNum, String partDesc, int quant, double price) {
        this.partNum = partNum;
        this.partDesc = partDesc;

        if (quant > 0) {
            this.quant = quant;
        } else {
            this.quant = 0;
        }

        if (price > 0.0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }

    public void setQuant(int quant) {

        if (quant > 0) {
            this.quant = quant;
        } else {
            this.quant = 0;
        }
    }

    public void setPrice(double price) {

        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    public String getPartNum() {
        return partNum;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public int getQuant() {
        return quant;
    }

    public double getPrice() {
        return price;
    }

    public double getInvoiceAmount() {
        return quant * price;
    }

} //end class Invoice
