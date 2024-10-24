package oop.laboratory2;

public class Display {
    private int width;
    private int height;
    private float ppi;
    private String model;

    public Display( int width, int height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    public void compareSize(Display m) {
        int thisSize = this.width * this.height;
        int otherSize = m.width * m.height;

        if (thisSize > otherSize) {
            System.out.println("Display " + this.model + " is of a bigger size than Display " + m.model);
        } else if (thisSize < otherSize) {
            System.out.println("Display " + m.model + " is of a bigger size than Display " + this.model);
        } else {
            System.out.println("Display " + this.model + " is the same size as Display " + m.model);
        }
    }

    public void compareSharpness(Display m) {
        if (this.ppi > m.ppi) {
            System.out.println("Display " + this.model + " is sharper than Display " + m.model);
        } else if (this.ppi < m.ppi) {
            System.out.println("Display " + m.model + " is sharper than Display " + this.model);
        } else {
            System.out.println("Display " + this.model + " is the same sharpness as Display " + m.model);
        }
    }

    public void compareMonitor(Display m) {
        System.out.println("Comparing sharpness and shape of Display " + this.model + " and the Display " + m.model + ":");
        compareSize(m);
        compareSharpness(m);
    }
}
