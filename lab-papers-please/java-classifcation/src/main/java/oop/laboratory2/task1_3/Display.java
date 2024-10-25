package oop.laboratory2.task1_3;

public class Display {
    private double width;
    private double height;
    private float ppi;
    private String model;

    public Display( double width, double height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void compareSize(Display m) {
        double thisSize = this.width * this.height;
        double otherSize = m.width * m.height;

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
        System.out.println("--------------------------------");
    }

    public Display betterDisplay(Display m) {
        double sizeWeight = 0.7;
        double sharpnessWeight = 0.3;
        double score1 = (this.height * this.width * sizeWeight) + (this.ppi * sharpnessWeight);
        double score2 = (m.height * m.width * sizeWeight) + (m.ppi * sharpnessWeight);

        if(score1 > score2) {
            return this;
        }
        else{
            return m;
        }
    }

    public double recommendation(Display m){
        double sizeWeight = 0.7;
        double sharpnessWeight = 0.3;

        double score = Math.abs((this.height*this.width - m.height*m.width)*sizeWeight + (this.ppi - m.ppi)*sharpnessWeight);

        return score;
    }

    @Override
    public String toString() {
        return "Display: " + this.model +
                ", Size: " + this.width + " x " + this.height +
                ", Sharpness(PPI): " + this.ppi;
    }
}
