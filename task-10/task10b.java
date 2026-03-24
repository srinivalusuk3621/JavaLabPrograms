import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class task10b extends Application {

    @Override
    public void start(Stage stage) {

        Label billLabel = new Label("Enter Bill Amount:");
        TextField billField = new TextField();

        Label tipLabel = new Label("Select Tip Percentage:");

        RadioButton tip10 = new RadioButton("10%");
        RadioButton tip15 = new RadioButton("15%");
        RadioButton tip20 = new RadioButton("20%");

        ToggleGroup group = new ToggleGroup();
        tip10.setToggleGroup(group);
        tip15.setToggleGroup(group);
        tip20.setToggleGroup(group);

        Button calculate = new Button("Calculate Tip");

        Label tipResult = new Label("Tip Amount: ");
        Label totalResult = new Label("Total Bill: ");

        calculate.setOnAction(e -> {

            double bill = Double.parseDouble(billField.getText());
            double tipPercent = 0;

            if (tip10.isSelected())
                tipPercent = 10;
            else if (tip15.isSelected())
                tipPercent = 15;
            else if (tip20.isSelected())
                tipPercent = 20;

            double tip = bill * tipPercent / 100;
            double total = bill + tip;

            tipResult.setText("Tip Amount: " + tip);
            totalResult.setText("Total Bill: " + total);
        });

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(
                billLabel, billField,
                tipLabel,
                tip10, tip15, tip20,
                calculate,
                tipResult, totalResult
        );

        Scene scene = new Scene(root, 350, 400);

        stage.setTitle("Tip Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void task10b(String[] args) {
        launch();
    }
}
