/*********************************************************************************
 * Lets the user enter numbers in the GUI, and displays them in a text area.
 * the input is stored in a LinkedList, and can be sorted, shuffled and reversed 
 * with their respective methods. Sort, Shuffle and Reverse buttons will call
 * their respective methods, and the updated LinkedList will be shown in the text
 * area.
 *********************************************************************************/
package Chapter_20_Lists_Stacks_Queues_and_Priority_Queues.Exercise_20_02;

import java.util.Collections;
import java.util.LinkedList;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StoreNumbersInALinkedList extends Application {
    
        protected Label label = new Label("Enter a number: ");
        protected TextField text = new TextField();
        protected TextArea textArea = new TextArea();
        protected LinkedList<Integer> linkedList = new LinkedList<>();
    
    @Override
    public void start(Stage primaryStage) {
        //Add 3 buttons
        Button btnSort = new Button("Sort");
        Button btnShuffle = new Button("Shuffle");
        Button btnReverse = new Button("Reverse");
        
        //Add label and text to hBoxInput
        HBox hBoxInput = new HBox(10);
        hBoxInput.getChildren().addAll(label, text);
        hBoxInput.setAlignment(Pos.CENTER);
        
        //Add the 3 buttons to hBoxBtn
        HBox hBoxBtn = new HBox(10);
        hBoxBtn.getChildren().addAll(btnSort, btnShuffle, btnReverse);
        hBoxBtn.setAlignment(Pos.CENTER);
        
        //Add the TextArea to a ScrollPane
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(textArea);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        
        //Add a BorderPane
        BorderPane root = new BorderPane();
        root.setTop(hBoxInput); //set hBoxInput to the top of the BorderPane
        root.setCenter(scrollPane); //set hBoxInput to the center of the BorderPane
        root.setBottom(hBoxBtn); //set hBoxInput to the bottom of the BorderPane
        
        //ActionListeners
        text.setOnAction(e -> {
            linkedList.add(Integer.parseInt(text.getText()));
            updateTextArea();
        });
        
        btnSort.setOnAction(e -> {
            sort();
            updateTextArea();
        });
        
        btnShuffle.setOnAction(e -> {
            shuffle();
            updateTextArea();
        });
        
        btnReverse.setOnAction(e -> {
            reverse();
            updateTextArea();
        });
        
        //Create a scene, and add the BorderPane to that scene
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Linked List Operations");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    //Sort the linkedList
    private void sort() {
        Collections.sort(linkedList);
    }
    
    //Shuffle the linkedList
    private void shuffle() {
        Collections.shuffle(linkedList);
    }
    
    //Reverse the linkedList
    private void reverse() {
        Collections.reverse(linkedList);
    }
    
    //Update the TextArea with numbers from the linkedList
    private void updateTextArea() {
        String result = "";
        for(int i = 0; i < linkedList.size(); i++) {
            if(Character.isDigit(linkedList.get(i).toString().charAt(0)))
                result+=linkedList.get(i) + " ";
        }
        textArea.setText(result);
    }
}
