package oop.laboratory2.task1_3;

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display(1920, 1080, 300, "Display 1");
        Display display2 = new Display(2560, 1440, 320, "Display 2");
        Display display3 = new Display(3840, 2160, 400, "Display 3");

        display1.compareMonitor(display2);
        System.out.println();
        display1.compareMonitor(display3);
        System.out.println();
        display2.compareMonitor(display3);
    }
}