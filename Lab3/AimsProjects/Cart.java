// Dương Quốc Khánh - 20194592 
package Week2;

public class Cart {
    public static final int MAX_CART_SIZE = 20;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_CART_SIZE];
    private int cartSize = 0;

    //  Phương thức hiện tại để thêm một DVD vào giỏ hàng
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

    // Phương thức được nạp chồng để thêm một số lượng tùy ý DVD vào giỏ hàng (sử dụng varargs)
  /*  public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        for (DigitalVideoDisc dvd : dvds) {
            addDigitalVideoDisc(dvd);
        }
    }    */

  
    // Phương thức được nạp chồng để thêm hai DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    // Tính tổng các DVD đã thêm vào giỏ

    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < cartSize; i++) {
            sum += itemsInCart[i].getCost();
        }
        return sum;
    }
    // Tìm kiếm theo ID
    public void searchById(int dvdId) {
        System.out.println("Search results by ID:");

        for (int i = 0; i < cartSize; i++) {
            if (itemsInCart[i].getId() == dvdId) {
                System.out.println(itemsInCart[i].toString());
                return; 
            }
        }

        System.out.println("No match found.");
    }

    // Tìm kiếm theo tên
    public void searchByTitle(String dvdTitle) {
        System.out.println("Search results by title:");

        for (int i = 0; i < cartSize; i++) {
            if (itemsInCart[i].getTitle().equalsIgnoreCase(dvdTitle)) {
                System.out.println(itemsInCart[i].toString());
            }
        }

        System.out.println("No match found.");
    }
    
}
