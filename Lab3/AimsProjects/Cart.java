// Dương Quốc Khánh - 20194592 
package Week2;

public class Cart {
    public static final int MAX_CART_SIZE = 20;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_CART_SIZE];
    private int cartSize = 0;

    // Phương thức hiện tại để thêm một DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (cartSize >= MAX_CART_SIZE - 1) {
            System.out.println("Cart is FULL. Cannot add more DVDs!");
        } else {
            itemsInCart[cartSize++] = disc;
            System.out.println("DVD " + "\"" + disc.getTitle() + "\"" + " has been added to the cart.");
        }
    }

        // Phương thức được nạp chồng để thêm một danh sách các DVD vào giỏ hàng (sử dụng mảng tham số)
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd);
        }
    }

     // Phương thức được nạp chồng để thêm hai DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    // In ra mục lục
    public void printOrder() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:\n");

        for (int i = 0; i < cartSize; i++) {
            DigitalVideoDisc dvd = itemsInCart[i];
            System.out.println(i + 1 + ". DVD - " + "[" + dvd.getTitle() + "] - [" + dvd.getCategory() +
                    "] - [" + dvd.getDirector() + "] - [" + dvd.getLength() + "]: " + dvd.getCost() + " $");
        }

        System.out.println("\nTotal cost: " + totalCost());
        System.out.println("***************************************************");
    }

    // Tính tổng thêm
    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < cartSize; i++) {
            sum += itemsInCart[i].getCost();
        }
        return sum;
    }
}
