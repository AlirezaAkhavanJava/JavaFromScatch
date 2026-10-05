package ClassTypes;

public enum Computer {
    CPU(1, 280.99D) {
        double cpuPrice(int quantity, double price) {
            return Math.round(quantity * price);
        }
    },
    RAM(4, 192.10D),
    HDD(2, 60),
    SSD(2, 420.0),
    MOTHERBOARD(1, 200),
    PSU(1, 250.65),
    GPU(1, 989.99) {
        double cpuPrice(int quantity, double price) {
            return Math.round(quantity * price);
        }
    };

    private final int quantity;
    private final double price;

    Computer(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    Double overAllPrice() {
        return CPU.price +
                (RAM.price * RAM.quantity) +
                (HDD.price * HDD.quantity) +
                (SSD.quantity * SSD.price) +
                MOTHERBOARD.price + PSU.price + GPU.price;
    }


}
