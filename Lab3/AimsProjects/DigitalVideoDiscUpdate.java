// Dương Quốc Khánh - 20194592
package Week2;

public class DigitalVideoDiscUpdate {
    private static int nbDigitalVideoDiscs = 0; // Thuộc tính lớp
    private int id; // Thuộc tính đối tượng
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Hàm khởi tạo với tham số title
    public void DigitalVideoDisc(String title) {
        this.id = ++nbDigitalVideoDiscs; // Tăng giá trị và gán cho id
        this.title = title;
    }

    // Hàm khởi tạo với các tham số title, category, và cost
    public void DigitalVideoDisc(String title, String category, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Hàm khởi tạo với các tham số title, category, director, và cost
    public void DigitalVideoDisc(String title, String category, String director, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    // Hàm khởi tạo với các tham số title, category, director, length, và cost
    public void DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Phương thức getter cho id
    public int getId() {
        return id;
    }

    // Phương thức getter cho title
    public String getTitle() {
        return title;
    }

    // Phương thức setter cho title
    public void setTitle(String title) {
        this.title = title;
    }

    // Phương thức getter cho category
    public String getCategory() {
        return category;
    }

    // Phương thức getter cho director
    public String getDirector() {
        return director;
    }

    // Phương thức getter cho length
    public int getLength() {
        return length;
    }

    // Phương thức getter cho cost
    public float getCost() {
        return cost;
    }

    // Phương thức so sánh hai đối tượng DigitalVideoDisc
    public  int Equals(DigitalVideoDisc disc) {
        if (disc.title.equals(this.title) && this.category.equals(disc.category)
                && this.director.equals(disc.director) && this.length == disc.length && this.cost == disc.cost) {
            return 1;
        }
        return 0;
    }
}
