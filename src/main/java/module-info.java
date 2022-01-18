module fynnandjonas.chatappfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    exports fynnandjonas.chatappfx.UI;
    opens fynnandjonas.chatappfx.UI to javafx.fxml;
}