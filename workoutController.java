package application;

import com.gluonhq.charm.glisten.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class workoutController {

    @FXML
    private RadioButton cycling;

    @FXML
    private Label result;

    @FXML
    private RadioButton running;

    @FXML
    private RadioButton swimming;

    @FXML
    private ToggleGroup workout;

    @FXML
    private Button workoutcalc;

    @FXML
    private TextField workoutmin;

    @FXML
    void workoutcalcButtonAction(ActionEvent event) {
        // Get the selected radio button from the workout toggle group
        RadioButton selectedRadioButton = (RadioButton) workout.getSelectedToggle();

        // Get the value entered in the workoutmin text field
        String workoutDuration = workoutmin.getText();

        // Check if a radio button and a duration value are selected
        if (selectedRadioButton != null && workoutDuration != null && !workoutDuration.isEmpty()) {
            String workoutType = selectedRadioButton.getText();

            // Convert the workout duration to an integer
            int duration = Integer.parseInt(workoutDuration);

            // Perform the desired action based on the selected workout type and duration
            switch (workoutType) {
                case "Cycling":
                    // TODO: Perform calculation or action for cycling workout with the specified duration
                    result.setText("You selected Cycling for " + duration + " minutes");
                    break;
                case "Running":
                    // TODO: Perform calculation or action for running workout with the specified duration
                    result.setText("You selected Running for " + duration + " minutes");
                    break;
                case "Swimming":
                    // TODO: Perform calculation or action for swimming workout with the specified duration
                    result.setText("You selected Swimming for " + duration + " minutes");
                    break;
            }
        } else {
            // Show an error message if a radio button or duration value is not selected
            result.setText("Please select a workout and enter the duration");
        }
    }
}
