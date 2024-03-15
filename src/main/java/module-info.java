module org.georgiancollege.week09 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.georgiancollege.week09 to javafx.fxml;
    exports org.georgiancollege.week09;
}