package COSC2006.Midterm;

import java.util.ArrayList;
import java.util.List;

interface weightCalc {
    double getTotalWeight();
}

class Package implements weightCalc {
    private List<Package> subPackages;
    private double weight;

    public Package(double weight) {
        this.weight = weight;
        this.subPackages = new ArrayList<>();
    }

    public void addSubPackage(Package subPackage) {
        subPackages.add(subPackage);
    }

    @Override
    public double getTotalWeight() {
        double total = weight;

        for (Package subPackage : subPackages) {
            total += subPackage.getTotalWeight();
        }

        return total;
    }

    public static void main(String[] args) {
        Package p1 = new Package(1);
        Package p2 = new Package(2);
        p1.addSubPackage(p2);
        System.out.println(p1.getTotalWeight());
        Package p3 = new Package(1);
        Package p4 = new Package(2);
        Package p5 = new Package(3);
        p3.addSubPackage(p4);
        p4.addSubPackage(p5);
        System.out.println(p3.getTotalWeight());
    }
}
