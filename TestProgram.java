import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddressBook.AddressBookEntry.PostalAddress postalAddress = AddressBook.AddressBookEntry.PostalAddress.createPostalAddress();
		postalAddress.setCity("Jersey City");
		postalAddress.setCountry("MyCountry");
		
		AddressBook newBook = new AddressBook();
		String id1 = newBook.addEntry("Satyajeet Maharana",postalAddress, "9294625048","satya0721@gmail.com","HELLO BRO");
		String id2 = newBook.addEntry("Viks",postalAddress,"1917926628","satya0721@gmail.com","HELLO BRO");
		String id3 = newBook.addEntry("Abhijeet 2",postalAddress, "1917926628","satya0721@gmail.com","HELLO BRO");
		String id4 = newBook.addEntry("Aakash",postalAddress,"1917926628","satya0721@gmail.com","HELLO BRO");
		String id5 = newBook.addEntry("Zinkovich",postalAddress, "1917926628","satya0721@gmail.com","HELLO BRO");
		String id6 = newBook.addEntry("Maariam",postalAddress,"1917926628","satya0721@gmail.com","HELLO BRO");
		String id7 = newBook.addEntry("Alonso",postalAddress, "1917926628","satya0721@gmail.com","HELLO BRO");
		String id8 = newBook.addEntry("Kelly",null,"1917926628","satya0721@gmail.co","HELLO BRO");
		System.out.println(" " + id1);
		System.out.println(" " + id2);
		System.out.println(" " + id3);
		System.out.println(" " + id4);
		System.out.println(" " + id5);
		System.out.println(" " + id6);
		System.out.println(" " + id7);
		System.out.println(" " + id8);
		
		List<AddressBook.AddressBookEntry> list1 = (List<AddressBook.AddressBookEntry>) newBook.searchEntries("Aak");
		
		List<AddressBook.AddressBookEntry> list2 = (List<AddressBook.AddressBookEntry>) newBook.searchEntries("jeet");
	
		List<AddressBook.AddressBookEntry> list3 = (List<AddressBook.AddressBookEntry>) newBook.searchEntries("462");
		
		List<AddressBook.AddressBookEntry> list4 = (List<AddressBook.AddressBookEntry>) newBook.searchEntries("53");
		
		List<AddressBook.AddressBookEntry> list5 = (List<AddressBook.AddressBookEntry>) newBook.searchEntries("2");
		
		List<AddressBook.AddressBookEntry> list6 = (List<AddressBook.AddressBookEntry>) newBook.searchEntries("Alonso");
		
		List<AddressBook.AddressBookEntry> list7 = (List<AddressBook.AddressBookEntry>) newBook.searchEntries("Maharana");
		
		System.out.println("List : Aak");
		list1.forEach((entry) -> {
			System.out.print(entry.getName()+ ",");
		    System.out.print(entry.getPhoneNumber()+ ",");
		    System.out.print(entry.getEmailAddress() + ",");
		    System.out.print(entry.getPostalAddress() + ",");
		    System.out.print(entry.getNote() + "\n");
		});
		
		System.out.println("List : jeet");
		list2.forEach((entry) -> {
			System.out.print(entry.getName()+ ",");
		    System.out.print(entry.getPhoneNumber()+ ",");
		    System.out.print(entry.getEmailAddress() + ",");
		    System.out.print(entry.getPostalAddress() + ",");
		    System.out.print(entry.getNote() + "\n");
		});
		System.out.println("List : 462");
		list3.forEach((entry) -> {
			System.out.print(entry.getName()+ ",");
		    System.out.print(entry.getPhoneNumber()+ ",");
		    System.out.print(entry.getEmailAddress() + ",");
		    System.out.print(entry.getPostalAddress() + ",");
		    System.out.print(entry.getNote() + "\n");
		});
		System.out.println("List : 53");
		list4.forEach((entry) -> {
			System.out.print(entry.getName()+ ",");
		    System.out.print(entry.getPhoneNumber()+ ",");
		    System.out.print(entry.getEmailAddress() + ",");
		    System.out.print(entry.getPostalAddress() + ",");
		    System.out.print(entry.getNote() + "\n");
		});
		System.out.println("List : 2");
		list5.forEach((entry) -> {
			System.out.print(entry.getName()+ ",");
		    System.out.print(entry.getPhoneNumber()+ ",");
		    System.out.print(entry.getEmailAddress() + ",");
		    System.out.print(entry.getPostalAddress() + ",");
		    System.out.print(entry.getNote() + "\n");
		});
		System.out.println("List : Alonso");
		list6.forEach((entry) -> {
			System.out.print(entry.getName()+ ",");
		    System.out.print(entry.getPhoneNumber()+ ",");
		    System.out.print(entry.getEmailAddress() + ",");
		    System.out.print(entry.getPostalAddress() + ",");
		    System.out.print(entry.getNote() + "\n");
		});
		System.out.println("List : Maharana");
		list7.forEach((entry) -> {
			System.out.print(entry.getName()+ ",");
		    System.out.print(entry.getPhoneNumber()+ ",");
		    System.out.print(entry.getEmailAddress() + ",");
		    System.out.print(entry.getPostalAddress() + ",");
		    System.out.print(entry.getNote() + "\n");
		});
		
		newBook.removeEntry(list6.get(0).getId());
		String fileName = "/Users/satyajeet/Documents/NYU/Sem_4_PQS/MyTestFiles/test1.json";
		try {
			newBook.saveToFile(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		newBook.updateEntryName(list1.get(0).getId(), "Akshay Kumar",false);
		fileName = "/Users/satyajeet/Documents/NYU/Sem_4_PQS/MyTestFiles/test1.json";
		try {
			newBook.saveToFile(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		AddressBook newOne = null;
		try {
			newOne = AddressBook.readFromFile(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		fileName = "/Users/satyajeet/Documents/NYU/Sem_4_PQS/MyTestFiles/test2.json";
		try {
			newOne.saveToFile(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		
	}

}
