module es.ieslosmontecillos.aplicacionlibretadedireccionesconfxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.aplicacionlibretadedireccionesconfxml to javafx.fxml;
    exports es.ieslosmontecillos.aplicacionlibretadedireccionesconfxml;
}