package builderpattern;

public class Main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
            .setCpu("Intel i9")
            .setRam("32GB")
            .setStorage("1TB SSD")
            .build();

        Computer officePC = new Computer.Builder()
            .setCpu("Intel i5")
            .setRam("16GB")
            .setStorage("512GB SSD")
            .build();

        System.out.println("Gaming PC Specs:");
        gamingPC.showSpecs();

        System.out.println();

        System.out.println("Office PC Specs:");
        officePC.showSpecs();
    }
}
