// Dương Quốc Khánh - 20194592
package Week2;

public class CartTest {
	Cart cart = new Cart();
	DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,91.5f);
	cart.addDigitalVideoDisc(dvd1);
	
	DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars","Science Fiction","Geogre Lucas",13,23.5f);
	cart.addDigitalVideoDisc(dvd2);
	DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation","Alex Fugion",17,20.5f);
	cart.addDigitalVideoDisc(dvd3);
	
	cast.print();

}
