public class Purchase

{

    private double purchase;

    private double tax;



    public Purchase(double purchaseAmt, double taxAmt)

    {

        purchase = purchaseAmt;

        tax = taxAmt;

    }



    public void totalAmount()

    {

        System.out.print(purchase + tax);

    }

    public static void main(String[] args) {
        Purchase p = new Purchase(2.4,5.5);
    }

}