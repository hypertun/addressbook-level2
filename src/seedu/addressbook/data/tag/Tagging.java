package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.ui.TextUi;

import java.util.ArrayList;

/**
 * Display individual Tags with Person's name
 * and whether it has been added or removed
 */
public class Tagging {
    private ArrayList<Person> personsList;
    private ArrayList<Tag> tagsList;
    private ArrayList<String> typesList;
    private TextUi ui;

    private void Tagging(){
        personsList = new ArrayList<>();
        tagsList = new ArrayList<>();
        typesList = new ArrayList<>();
        this.ui = new TextUi();
    }

    public void addTag(Person person,Tag tag){
        personsList.add(person);
        tagsList.add(tag);
        typesList.add("Added");
    }

    public void removeTag(Person person,Tag tag){
        personsList.add(person);
        tagsList.add(tag);
        typesList.add("Deleted");
    }

    public void displayTags(){
        StringBuilder TagsMessage = new StringBuilder();
        if(personsList.size()==0){
            TagsMessage.append("No tags were changed");
        }
        else{
            for(int i = 0;i < personsList.size();i++){
                TagsMessage.append(personsList.get(i).getName().toString());
                TagsMessage.append(typesList.get(i));
                TagsMessage.append(tagsList.get(i).toString());
                TagsMessage.append("\n");
            }
        }
        ui.showToUser(TagsMessage.toString().trim());
    }
}
