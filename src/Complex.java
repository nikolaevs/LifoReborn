/**
 * Created by Borges on 15.11.2015.
 */
public class Complex {
    private double argument, mod;
    private double real, im;

    public Complex(double x,double y, boolean polar) {
        initialization(x,y,polar);
    }

    protected void initialization(double x, double y, boolean polar) {
        if(polar) {
            this.argument=x;
            this.mod=y;
            cosin();
        }
        else {
            this.real=x;
            this.im=y;

        }
    }

    private void cosin() {
        real = mod * Math.cos(argument);
        im = mod * Math.sin(argument);
    }

    public String toString() {
        return "(" + real + ", " + im + ")";
    }
}
