package sample;

import javafx.beans.property.SimpleStringProperty;

public class user {

    private final SimpleStringProperty user_id;
    private final SimpleStringProperty user_name;

    public user(String user_id, String user_name) {
        this.user_id = new SimpleStringProperty(user_id);
        this.user_name = new SimpleStringProperty(user_name);
    }

    public void setUser_id(String user_id) {
        this.user_id.set(user_id);
    }

    public void setUser_name(String user_name) {
        this.user_name.set(user_name);
    }

    public String getUser_id() {

        return user_id.get();
    }

    public SimpleStringProperty user_idProperty() {
        return user_id;
    }

    public String getUser_name() {
        return user_name.get();
    }

    public SimpleStringProperty user_nameProperty() {
        return user_name;
    }
}
