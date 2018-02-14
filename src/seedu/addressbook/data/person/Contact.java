package seedu.addressbook.data.person;

public class Contact {

    public final String value;
    protected boolean isPrivate;

    public Contact(String Contact,boolean isPrivate){
        this.isPrivate = isPrivate;
        String trimmedContact = Contact.trim();
        this.value = trimmedContact;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    @Override
    public String toString() {
        return value;
    }

}
