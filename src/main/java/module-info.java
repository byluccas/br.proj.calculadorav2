module proj.calculadora.calculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens proj.calculadora.calculadora to javafx.fxml;
    exports proj.calculadora.calculadora;
}