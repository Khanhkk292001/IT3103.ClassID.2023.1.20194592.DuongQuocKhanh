// Dương Quốc Khánh - 20194592
package Week2;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store(10); // Assuming the store can hold 10 DVDs

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Title1", "Category1", "Director1", 120, 15.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Title2", "Category2", "Director2", 90, 12.99f);

        store.addDVD(dvd1);
        store.addDVD(dvd2);

        System.out.println("Items in the store after adding DVDs:");
        displayStoreItems(store);

        DigitalVideoDisc dvdToRemove = new DigitalVideoDisc("Title1", "Category1", "Director1", 120, 15.99f);
        store.removeDVD(dvdToRemove);

        System.out.println("Items in the store after removing a DVD:");
        displayStoreItems(store);
    }

    private static void displayStoreItems(Store store) {
        for (int i = 0; i < store.getStoreSize(); i++) {
            System.out.println(store.getItemsInStore()[i]);
        }
    }
}
