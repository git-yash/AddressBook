import java.util.ArrayList;
import java.util.List;

public class Contacts {
    private List<Contact> contacts = new ArrayList<>();

    public void delete(int index) {
        contacts.remove(index);
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public List<Contact> search(String text) {
        List<Contact> searchedContacts = new ArrayList<>();
        contacts.forEach(contact -> {
            if (contact.contains(text)) {
                searchedContacts.add(contact);
            }
        });
        return searchedContacts;
    }
}
