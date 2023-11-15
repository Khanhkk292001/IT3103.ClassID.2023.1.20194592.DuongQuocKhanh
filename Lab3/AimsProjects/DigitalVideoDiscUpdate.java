// Dương Quốc Khánh - 20194592 
package Week2;

<<<<<<< HEAD
public class DigitalVideoDiscUpdate {
    private static int nbDigitalVideoDiscs = 0; // Thuộc tính lớp
    private int id; // Thuộc tính đối tượng
=======
public class DigitalVideoDisc {
>>>>>>> topic/class-members
    private String title;
    String category;
    private String director;
    private int length;
    private float cost;

    // Hàm khởi tạo không tham số, không có thân hàm
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

    // Hàm khởi tạo với các tham số: title (tên đĩa), category (thể loại đĩa), cost (giá đĩa)
    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Hàm khởi tạo với các tham số: title (tên đĩa), category (thể loại đĩa), director (đạo diễn đĩa), cost (giá đĩa)
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    // Hàm khởi tạo với các tham số: title (tên đĩa), category (thể loại đĩa), director (đạo diễn đĩa), length (độ dài đĩa), cost (giá đĩa)
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Phương thức getter để lấy giá trị của thuộc tính title
    public String getTitle() {
        return title;
    }
  
    public void setTitle(String title) {
        
        
    	this.title = title;
    	    }
    // Phương thức getter để lấy giá trị của thuộc tính category
    public String getCategory() {
        return category;
    }

    // Phương thức getter để lấy giá trị của thuộc tính director
    public String getDirector() {
        return director;
    }

    // Phương thức getter để lấy giá trị của thuộc tính length
    public int getLength() {
        return length;
    }

    // Phương thức getter để lấy giá trị của thuộc tính cost
    public float getCost() {
        return cost;
    }

    // Phương thức so sánh hai đối tượng DigitalVideoDisc, trả về 1 nếu giống nhau và 0 nếu khác nhau
    public int Equals(DigitalVideoDisc disc) {
        if (disc.title.equals(this.title)) {
            if (this.category.equals(disc.category)) {
                if (this.director.equals(disc.director)) {
                    if (this.length == disc.length && this.cost == disc.cost) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
