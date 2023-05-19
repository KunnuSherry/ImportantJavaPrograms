package org.example;
import java.math.MathContext;
class cylinder {
    int rad;
    int height;
    public cylinder(int r, int h){
        rad = r;
        height = h;
    }


    public void setRad(int r){
        rad = r;
    }
    public int getRad(){
        return rad;
    }
    public void setHeight(int r){
        height = r;
    }
    public int getHeight() {
        return height;
    }
    public double volume(){
        return 2*Math.PI*rad*height ;
    }

    public static class Main{
        public static void main(String[] args) {
            cylinder cy = new cylinder(4,7);
            System.out.println("the volume of the cylinder is: " + cy.volume());

        }}}
