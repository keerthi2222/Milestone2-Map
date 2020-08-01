package maps;

public class Ex4 
{
	public static void main(String[] args) {
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("Keerthi", 98310983);
		contactsList.addContact("Police", 100);
		contactsList.addContact("Janu", 98765432);
				
		System.out.println("Police: " + contactsList.doesContactNameExist("Police"));
		System.out.println("98765432: " + contactsList.doesContactNumberExist(98765432));
		
		System.out.println();
		contactsList.listAllContacts();
	}

}
