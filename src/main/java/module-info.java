module com.example.projetjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.management;
    requires jdk.jdi;


    opens com.example.projetjava to javafx.fxml;
    exports com.example.projetjava;

    // Other module declarations

    // Open the package containing your data classes to javafx.base
    opens com.example.projetjava.DataClasses;
}

