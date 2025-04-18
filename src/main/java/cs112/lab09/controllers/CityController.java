package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CityController {
    @FXML
    ImageView eventImageView;
    @FXML
    Label locationLabel;
    @FXML
    Label dateLabel;
    @FXML
    Label descriptionLabel;
    @FXML
    Label revisedDescriptionLabel;
    @FXML
    Hyperlink hyperlinkReference;

    public void handleCloseButton() {
        Stage stage = (Stage) eventImageView.getScene().getWindow();
        stage.close();
    }

    public void initData(Constants.Event eventIndex) {
        String[] data = Constants.HISTORICAL_DATA[eventIndex.ordinal()];
        RevisedHistoricalEvent revisedEvent = new RevisedHistoricalEvent(data);
        eventImageView.setImage(revisedEvent.getImage());
        locationLabel.setText(revisedEvent.getLocation());
        dateLabel.setText(revisedEvent.getEventDay().toString());
        descriptionLabel.setText(revisedEvent.getDescription());
        revisedDescriptionLabel.setText(revisedEvent.getRevisedDescription());
        hyperlinkReference.setText(revisedEvent.getCitation());
    }
}

