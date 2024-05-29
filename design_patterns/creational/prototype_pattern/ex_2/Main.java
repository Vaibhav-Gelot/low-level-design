package design_patterns.creational.prototype_pattern.ex_2;

public class Main {
    public static void main(String[] args) {
        Vehicle naxonRed = new Vehicle("NAXON", "RED");
        System.out.println(naxonRed);
        Vehicle naxonBlack = (Vehicle) naxonRed.clone();
        Vehicle.changeColor(naxonBlack, "BLACK");
        System.out.println(naxonBlack);
        Vehicle naxonBlue = (Vehicle) naxonRed.clone();
        Vehicle.changeColor(naxonBlue, "BLUE");
        System.out.println(naxonBlue);
    }
}
