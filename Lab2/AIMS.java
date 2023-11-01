// Dương Quốc Khánh - 20194592
package Week2;

public class Aims {
    public static void main(String[] args) {
        // Tạo một đối tượng Order để đại diện cho đơn hàng
        Order od = new Order();
        
        // Tạo một đối tượng DVD (dvd1) với thông tin cụ thể: "The Lion King" (tên), "Animation" (thể loại), "Roger Aller" (đạo diễn), 87 (độ dài), và giá 19.95f
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
        
        // Thêm dvd1 vào đơn hàng od
        od.addDigitalVideoDisc(dvd1);

        // Tạo một đối tượng DVD (dvd2) khác với thông tin: "Stars War" (tên), "Science Fiction" (thể loại), "George Lucas" (đạo diễn), 87 (độ dài), và giá 24.95f
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Stars War", "Science Fiction", "George Lucas", 87, 24.95f);
        
        // Thêm dvd2 vào đơn hàng od
        od.addDigitalVideoDisc(dvd2);

        // Tạo một đối tượng DVD (dvd3) khác với thông tin: "Aladdin" (tên), "Animation" (thể loại), và giá 18.99f
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        
        // Thêm dvd3 vào đơn hàng od
        od.addDigitalVideoDisc(dvd3);
        
        // In ra tổng giá trị của đơn hàng od bằng cách gọi phương thức totalCost() và sử dụng String.format để định dạng kết quả với 4 chữ số thập phân
        System.out.println("Total Cost is: " + String.format("%.4g%n", od.totalCost()));

        // Tạo một đối tượng DVD (dvd4) khác với thông tin: "Prometheus" (tên), "Science Fiction" (thể loại), "Ridley Scott" (đạo diễn), và giá 20.5f
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Prometheus", "Science Fiction", "Ridley Scott", 20.5f);
        
        // Thêm dvd4 vào đơn hàng od
        od.addDigitalVideoDisc(dvd4);

        // In ra tổng giá trị của đơn hàng od sau khi thêm dvd4
        System.out.println("Total Cost is: " + String.format("%.4g%n", od.totalCost()));

        // Loại bỏ dvd2 khỏi đơn hàng od bằng cách gọi phương thức removeDigitalVideoDisc()
        od.removeDigitalVideoDisc(dvd2);
        
        // In ra tổng giá trị của đơn hàng od sau khi loại bỏ dvd2
        System.out.println("Total Cost is: " + String.format("%.4g%n", od.totalCost()));
    }
}
