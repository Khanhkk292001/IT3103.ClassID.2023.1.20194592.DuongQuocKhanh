// Dương Quốc Khánh - 20194592 

package Week2;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int storeSize;

    public Store(int maxSize) {
        itemsInStore = new DigitalVideoDisc[maxSize];
        storeSize = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (storeSize < itemsInStore.length) {
            itemsInStore[storeSize++] = dvd;
            System.out.println("DVD \"" + dvd.getTitle() + "\" added to the store.");
        } else {
            System.out.println("Store is FULL. Cannot add more DVDs!");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < storeSize; i++) {
            if (itemsInStore[i].Equals(dvd) == 1) {
                found = true;
                for (int j = i; j < storeSize - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[storeSize - 1] = null;
                storeSize--;
                System.out.println("DVD \"" + dvd.getTitle() + "\" removed from the store.");
                break;
            }
        }

        if (!found) {
            System.out.println("DVD \"" + dvd.getTitle() + "\" not found in the store.");
        }
    }
}

