package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{
	
	private Label questionLabel;
	private Button option1;
	private Button option2;
	private Button option3;
	private VBox layout;
	
	


	//start of questioning
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Inspiring Through Computer Science");

		questionLabel = new Label("Welcome!");
		Button nextButton = new Button("Thank you!");
		nextButton.setOnAction(e -> intro());

		layout = new VBox(10);
		layout.getChildren().addAll(questionLabel, nextButton);

		Scene scene = new Scene(layout, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void intro()
	{
		layout.getChildren().clear();

        questionLabel.setText("We understand it's hard to know what you want to do with your education; but we can help with that.");
		
		option1 = new Button("Yeah");
		option2 = new Button("No");

		option1.setOnAction(e -> questions());
		option2.setOnAction(e -> opening2());

		
        layout.getChildren().addAll(questionLabel, option1, option2);
	}
	
	private void opening()
	{
		layout.getChildren().clear();

        questionLabel.setText("Take our quick questionair");
		
		option1 = new Button("Yeah");
		option2 = new Button("No");

		option1.setOnAction(e -> questions());
		option2.setOnAction(e -> opening2());

		
        layout.getChildren().addAll(questionLabel, option1, option2);
	}
	
	private void opening2()
	{
		layout.getChildren().clear();

        questionLabel.setText("To bad...");
	   
		option1.setOnAction(e -> questions());
		
        layout.getChildren().addAll(questionLabel, option1);
	}

	public void questions()
	{
		
		layout.getChildren().clear();

		
		questionLabel.setText("What do you enjoy more?");
		
		option1 = new Button("A finished product");
		option2 = new Button("The process of making things");

		
		option1.setOnAction(e -> question1());
		option2.setOnAction(e -> question2());

		layout.getChildren().addAll(questionLabel, option1, option2);
	}
	
	public void question1()
	{
		layout.getChildren().clear();

		
		questionLabel.setText("What do you enjoy more?");
		
		option1 = new Button("Finding unquie and intresting ways to solve problems?");
		option2 = new Button("Structures, keeping everything organized and neat");
		option3 = new Button("Enjoying finding unquie and intresting ways to solve problems and doing it while everything organized and neat");

		option1.setOnAction(e -> Mid(1));
		option2.setOnAction(e -> Mid(2));
		option3.setOnAction(e -> Mid(3));

		layout.getChildren().addAll(questionLabel, option1, option2, option3);
	}
	
	
	public void question2()
	{
		layout.getChildren().clear();

		
		questionLabel.setText("What do you enjoy more?");
		
		option1 = new Button("Working in a team");
		option2 = new Button("Working with numbers");
		option3 = new Button("The Designs of thinkgs I make");

		option1.setOnAction(e -> question2_1());
		option2.setOnAction(e -> question2_2());
		option3.setOnAction(e -> Mid(8));

		layout.getChildren().addAll(questionLabel, option1, option2, option3);
	}
	
	public void question2_1()
	{
		layout.getChildren().clear();

		
		questionLabel.setText("What do you enjoy more?");
		
		option1 = new Button("Structures and organiztion.");
		option2 = new Button("I just love making things!");

		option1.setOnAction(e -> Mid(4));
		option2.setOnAction(e -> Mid(5));

		layout.getChildren().addAll(questionLabel, option1, option2);
	}
	public void question2_2()
	{
		layout.getChildren().clear();

		
		questionLabel.setText("What do you enjoy more?");
		
		option1 = new Button("Structures and organiztion.");
		option2 = new Button("I just love making things!");

		option1.setOnAction(e -> Mid(7));
		option2.setOnAction(e -> Mid(8));

		layout.getChildren().addAll(questionLabel, option1, option2);
	}
	
	private void Mid(int t)
	{
		layout.getChildren().clear();
		
        questionLabel.setText("We will show you what you're intrests");
	   
		option1.setOnAction(e -> Mid2(t));
		
        layout.getChildren().addAll(questionLabel, option1);
	}
	
	private void Mid2(int t)
	{
		layout.getChildren().clear();
		String text = "";
		switch(t)
		{
			case 1:
				
			case 2:
			
			case 3:
			
			case 4:
			
			case 5:
			
			case 6:
				
			case 7:
				
			case 8:	
		}
        questionLabel.setText(text);
	   
		option1.setOnAction(e ->questions());
		
        layout.getChildren().addAll(questionLabel, option1);
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args)
	{
		launch(args);
	}
}