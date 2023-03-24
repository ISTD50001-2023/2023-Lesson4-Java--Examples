package Example1;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    /*** this example shows one use of nested classes
     *  which is as a data model
     *  since the PhoneBook relies on Entry to store data,
     *  it would make sense to make Entry as a nested class in PhoneBook
     *
     */

    interface Entry {
        String getName();
        String getPhoneNumber();
    }

    private List<Entry> entryList;

    // TODO 1 Complete the constructor to initialize entryList
    PhoneBook(){
    }

    // TODO 2 Complete addEntry to add a phoneBook entry
    void addEntry(String name, String number){
    }

    // TODO 3 What if you'd like to be able to sort phonebook entries by name?

    static class SimpleEntry implements Entry{

        private String name, number;

        SimpleEntry(String name, String number ){
            this.name = name;
            this.number = number;

        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getPhoneNumber() {
            return number;
        }

        @Override
        public String toString() {
            return name + ":" + number;
        }
    }

}
