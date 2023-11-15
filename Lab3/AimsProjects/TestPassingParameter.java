// Dương Quốc Khánh - 20194592
package Week2;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    // Phương thức để đổi chỗ hai đối tượng
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    // Phương thức để thay đổi tiêu đề của đối tượng DigitalVideoDisc
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title); // Sửa đổi tiêu đề của đối tượng dvd
        // Dòng sau đây không cần thiết và gây nhầm lẫn
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
