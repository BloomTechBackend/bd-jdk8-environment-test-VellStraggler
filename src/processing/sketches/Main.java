package processing.sketches;

import generator.Generator;
import processing.core.PApplet;

public class Main extends PApplet {

    private int hue;

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        // Sets the color mode to HSB, 360 being the max Hue,
        // 100 the max Saturation, and 100 the max Brightness
        colorMode(HSB, 360, 100, 100);
        background(360);
    }

    public void draw() {
        stroke(hue % 360, 100, 100);
        hue++;

        line(mouseX, mouseY, width / 2, height / 2);
    }

    public static void main(String[] args) {
        PApplet.main("processing.sketches.Main");

        Generator.generateAssessmentKey();
    }
}
