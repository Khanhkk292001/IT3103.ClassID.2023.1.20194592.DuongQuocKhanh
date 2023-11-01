// Dương Quốc Khánh - 20194592

package Week2;

public class Order {
    public static final int MAX_ORDERED_NUMBER = 10;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_ORDERED_NUMBER];
    private int qtyOrdered = 0;

    // Phương thức getter để lấy giá trị của thuộc tính qtyOrdered
    public int getQtyOrdered() {
        return qtyOrdered;
    }

    // Phương thức setter để thiết lập giá trị cho thuộc tính qtyOrdered
    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    // Phương thức thêm một đĩa DVD vào đơn hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        // Kiểm tra nếu đơn hàng đã đầy (số lượng đĩa DVD đã đạt tối đa) thì thông báo và không thêm nữa
        if (qtyOrdered >= MAX_ORDERED_NUMBER - 1) {
            System.out.println("List of Digital Disk is ALREADY FULL!");
        } else {
            // Nếu chưa đầy, thêm đĩa DVD vào mảng itemsOrdered và tăng số lượng đặt hàng
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("Disc " + "\"" + disc.getTitle() + "\"" + " has been added");
            // Kiểm tra nếu còn một chỗ trống trong danh sách đặt hàng, thông báo
            if (qtyOrdered == MAX_ORDERED_NUMBER - 2)
                System.out.println("Your Digital List is ALMOST FULL. Only 1 more to add.");
        }
    }

    // Phương thức loại bỏ một đĩa DVD khỏi đơn hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("List of Digital Disk is empty. Cannot remove!");
        } else {
            int control = 0;
            // Tìm vị trí của đĩa DVD trong danh sách đặt hàng
            for (int i = 0; i < qtyOrdered; i++) {
                if (disc.Equals(itemsOrdered[i]) == 1)
                    control = i;
            }
            // Nếu tìm thấy, loại bỏ đĩa DVD và giảm số lượng đặt hàng
            if (control != 0) {
                for (int i = control; i < qtyOrdered; i++) {
                    itemsOrdered[i] = itemsOrdered[i + 1];
                }
                qtyOrdered -= 1;
                System.out.println("Disc " + "\"" + disc.getTitle() + "\"" + " has been deleted from the list!");
            } else {
                // Nếu không tìm thấy đĩa DVD cần loại bỏ, thông báo
                System.out.println("Inputted element: Not found!");
            }
        }
    }

    // Phương thức tính tổng giá trị của các đĩa DVD trong đơn hàng
    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
}
