package sample;

import javafx.beans.property.SimpleStringProperty;

public class ListResult {

    private SimpleStringProperty user_id;
    private SimpleStringProperty user_name;

    public ListResult() {
    }

    public ListResult(String s1, String s2) {

        user_id = new SimpleStringProperty(s1);
        user_name = new SimpleStringProperty(s2);
    }

    public String getUser_id() {

        return user_id.get();
    }

    public void setUser_id(String s) {

        user_id.set(s);
    }

    public String getUser_name() {

        return user_name.get();
    }

    public void User_name(String s) {

        user_name.set(s);
    }

    @Override
    public String toString() {

        return (user_id.get() + ", by " + user_name.get());
    }

}