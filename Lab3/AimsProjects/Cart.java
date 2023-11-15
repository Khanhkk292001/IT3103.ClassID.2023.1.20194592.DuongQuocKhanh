// Dương Quốc Khánh - 20194592 
package Week2;

public class Cart {
	public String toString() {
        return "DVD - [" + title + "] - [" + category + "] - [" + director + "] - [" + length + "]: " + cost + " $";
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
