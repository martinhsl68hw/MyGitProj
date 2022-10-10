public class Calculator {
    private double rTotal; // The running total field
    public Calculator(double initVal){  // Constructor
        rTotal=initVal; // Set the initial value of rTotal
    }
    private void showRT(){  // Display the rTotal
        System.out.println("Result="+rTotal);
    }
    public double add(double val){ // A method to add a value
        rTotal=rTotal+val;
        showRT();
        return rTotal;
    }
    public void AC(){
        rTotal=0;
        System.out.println("Cleared");
    }


}
