/*
 * Assignment3_SeungChanKim.java
 * ============
 * A class to initialize the application with basic JavaFX structure
 *  AUTHOR: SEUNG CHAN KIM (kimseu@sheridancollege.ca)
 * CREATED: 2018-04-10
 * UPDATED: 2018-03-20
 */

package chan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Assignment3_SeungChanKim extends Application
{
    ///////////////////////////////////////////////////////////////////////////
    // entry-point of JavaFX application
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainForm.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }



    ///////////////////////////////////////////////////////////////////////////
    public static void main(String[] args)
    {
        launch(args);
    }
}