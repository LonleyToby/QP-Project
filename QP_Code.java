import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import java.awt.TextField;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;



public class Main extends Application
{
    private Label questionLabel;
    private Button option1;
    private Button option2;
    private Button option3;
    private VBox layout;
    int major;
    private String majorhold;
    
    private Image image = new Image("file:C:/Users/tarma/Downloads/wa.jpg");
    private BackgroundSize backgroundSize = new BackgroundSize(100.0,100.0,true,true,false,true);
    private BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,  BackgroundPosition.CENTER, backgroundSize);
    private StackPane pane = new StackPane();
    
    //start of questioning
    public void start(Stage primaryStage)
    {
        pane.setBackground(new Background(backgroundImage));
        
        questionLabel = new Label("Welcome!");
        questionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 100px;");
        
        Button option1 = new Button("Thank you!");
        option1.setStyle("-fx-font-size: 18px;");
        option1.setOnAction(e -> intro());

        VBox vb = new VBox(10,questionLabel, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
        
        Scene scene = new Scene(pane, 600, 400);
        primaryStage.setTitle("Inspiring Through Computer Science");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void intro()
    {
        pane.getChildren().clear();

        questionLabel.setText("We understand it's hard to know what you want to do with\nyour education; but we can help with that...");
        questionLabel.setWrapText(true);
        questionLabel.setStyle("-fx-alignment: center; -fx-text-alignment: center;-fx-text-fill: white; -fx-font-size: 50px;");
        
        option1 = new Button("Alright");
        option1.setStyle("-fx-font-size: 18px;");
        option1.setOnAction(e -> intro2());
        
        VBox vb = new VBox(10,questionLabel, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    private void intro2()
    {
        pane.getChildren().clear();

        questionLabel.setText("Through Computers!");
        questionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 100px;");
        
        option1 = new Button("Alright");
        option1.setStyle("-fx-font-size: 18px;");
        option1.setOnAction(e -> opening());
        
        VBox vb = new VBox(10,questionLabel, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    } 
    
    private void opening()
    {
        pane.getChildren().clear();

        questionLabel.setText("To help you, you need to take our questionair(it's short)");
        questionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 50px;");
        
        option1 = new Button("Alright");
        option2 = new Button("No");
        
        option1.setStyle("-fx-font-size: 18px;");
        option2.setStyle("-fx-font-size: 18px;");

        option1.setOnAction(e -> questions());
        option2.setOnAction(e -> opening2());

        VBox vb = new VBox(10,questionLabel, option1, option2);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    private void opening2()
    {
        pane.getChildren().clear();

        questionLabel.setText("To bad...");
        questionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 50px;");
        
        option1 = new Button("Alright");
        option1.setStyle("-fx-font-size: 18px;");
        option1.setOnAction(e -> questions());
        
        VBox vb = new VBox(10,questionLabel, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }

    public void questions()
    {
        pane.getChildren().clear();
        
        questionLabel.setText("What do you enjoy more?");
        questionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 50px;");
        
        option1 = new Button("A finished product");
        option2 = new Button("The process of making things");
        
        option1.setStyle("-fx-font-size: 18px;");
        option2.setStyle("-fx-font-size: 18px;");
        
        option1.setOnAction(e -> question1());
        option2.setOnAction(e -> question2());

        VBox vb = new VBox(10,questionLabel, option1, option2);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    public void question1()
    {
        pane.getChildren().clear();

        questionLabel.setText("What do you enjoy more?");
        questionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 50px;");
        
        option1 = new Button("Finding unquie and intresting ways to solve problems?");
        option2 = new Button("Structures, keeping everything organized and neat");
        option3 = new Button("Enjoying finding unquie and intresting ways to solve problems and doing it while everything organized and neat");
        
        option1.setStyle("-fx-font-size: 18px;");
        option2.setStyle("-fx-font-size: 18px;");
        option3.setStyle("-fx-font-size: 18px;");

        option1.setOnAction(e -> Mid(1));
        option2.setOnAction(e -> Mid(2));
        option3.setOnAction(e -> Mid(3));

        VBox vb = new VBox(10,questionLabel, option1, option3);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    public void question2()
    {
        pane.getChildren().clear();
        
        questionLabel.setText("What do you enjoy more?");
        questionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 50px;");
        
        option1 = new Button("Working in a team");
        option2 = new Button("Working with numbers");
        option3 = new Button("The Designs of thinkgs I make");
        
        option1.setStyle("-fx-font-size: 18px;");
        option2.setStyle("-fx-font-size: 18px;");
        option3.setStyle("-fx-font-size: 18px;");

        option1.setOnAction(e -> question2_1());
        option2.setOnAction(e -> question2_2());
        option3.setOnAction(e -> Mid(8));

        VBox vb = new VBox(10,questionLabel, option1, option2, option3);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    public void question2_1()
    {
        pane.getChildren().clear();
        
        questionLabel.setText("What do you enjoy more?");
        questionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 50px;");
        
        option1 = new Button("Structures and organiztion.");
        option2 = new Button("I just love making things!");
        
        option1.setStyle("-fx-font-size: 18px;");
        option2.setStyle("-fx-font-size: 18px;");

        option1.setOnAction(e -> Mid(4));
        option2.setOnAction(e -> Mid(5));

        VBox vb = new VBox(10,questionLabel, option1, option2);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    public void question2_2()
    {
        pane.getChildren().clear();
        
        questionLabel.setText("What do you enjoy more?");
        questionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 50px;");
        
        option1 = new Button("Structures and organiztion.");
        option2 = new Button("I just love making things!");
        
        option1.setStyle("-fx-font-size: 18px;");
        option2.setStyle("-fx-font-size: 18px;");

        option1.setOnAction(e -> Mid(6));
        option2.setOnAction(e -> Mid(7));

        VBox vb = new VBox(10,questionLabel, option1, option2);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    private void Mid(int t)
    {
        pane.getChildren().clear();
        
        questionLabel.setText("We will show you what you're intrests");
       
        option1.setText("Alright");
        option1.setStyle("-fx-font-size: 18px;");
        
        option1.setOnAction(e -> Mid2(t));
        
        VBox vb = new VBox(10,questionLabel, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    private void Mid2(int t)
    {
        pane.getChildren().clear();
        questionLabel.setText("From your responses we can see that you enjoy");
        questionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 50px;");
        
        Label questionLabel2 = new Label();
        
        switch(t)
        {
            case 1:
                questionLabel2.setText("Solving problems through unquie and intresting approches");
                break;
            case 2:
                questionLabel2.setText("Solving problems while keeping everything nice and neat");
                break;
            case 3:
                questionLabel2.setText("Solving problems with unqiue ways and keeping everything neat");
                break;
            case 4:
                questionLabel2.setText("The process of making things in a structured manner, while in a team");
                break;
            case 5:
                questionLabel2.setText("Loving the process of makings and working in a team");
                break;
            case 6:
                questionLabel2.setText("The process of making things that involve new technology");
                break;
            case 7:
                questionLabel2.setText("The process of making things that involve unquie and intresting approches");
                break;
            case 8: 
                questionLabel2.setText("The process of making things that you enjoy, you find it pleasing");
                break;
        }
        questionLabel2.setStyle("-fx-text-fill: white; -fx-font-size: 50px;");
       
        option1.setOnAction(e -> Mid3(t));
        
        VBox vb = new VBox(10,questionLabel,questionLabel2, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    private void Mid3(int t)
    {
        pane.getChildren().clear();
        
        questionLabel.setText("Through our questions we found\nthat you would enjoy the field off...");
        questionLabel.setWrapText(true);
        questionLabel.setStyle("-fx-alignment: center; -fx-text-alignment: center;-fx-text-fill: white; -fx-font-size: 50px;");
       
        option1.setText("SHOW ME!");
        option1.setStyle("-fx-font-size: 25px;");
        
        option1.setOnAction(e -> Mid4(t));
        
        VBox vb = new VBox(10,questionLabel, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    private void Mid4(int t)
    {
        pane.getChildren().clear();
        
        switch(t)
        {
            case 1:
                majorhold = "Cybersecurity";
                break;
            case 2:
                majorhold = "Computer Networking";
                break;
            case 3:
                majorhold = "Database Management & Administration";
                break;
            case 4:
                majorhold = "Database Management & Administration";
                break;
            case 5:
                majorhold = "Software Engineering";
                break;
            case 6:
                majorhold = "Artificial Intelligence";
                break;
            case 7:
                majorhold = "Data Science & Big Data";
                break;
            case 8: 
                majorhold = "Web Development";
                break;
        }
        
        questionLabel.setText(majorhold);

        questionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 100px;");
       
        option1.setText("Arlight!");
        option1.setStyle("-fx-font-size: 18px;");
        
        option1.setOnAction(e -> Mid5(t));
        
        VBox vb = new VBox(10,questionLabel, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    private void Mid5(int t)
    {
        pane.getChildren().clear();
        
        questionLabel.setText("Your intrests aline with someone in this major");
        questionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 50px;");
       
        option1.setText("Arlight");
        option1.setStyle("-fx-font-size: 18px;");
        
        option1.setOnAction(e -> Mid6(t));
        
        VBox vb = new VBox(10,questionLabel, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    private void Mid6(int t)
    {
        pane.getChildren().clear();
        
        questionLabel.setText("Those in " + majorhold + " are ");
        
        Label questionLabel2 = new Label();
        switch(t)
        {
            case 1:
                questionLabel2.setText("Detail-oriented problem solvers, critical thinkers,\nand those who enjoy ethical hacking, security protocols, and risk management");
                break;
            case 2:
                questionLabel2.setText("Detail-oriented people who enjoy troubleshooting,\nsystem management, and ensuring smooth network operations");
                break;
            case 3:
                questionLabel2.setText("Detail-oriented individuals who enjoy working with\nstructured data and ensuring system reliability");
                break;
            case 4:
                questionLabel2.setText("Detail-oriented individuals who enjoy working with\nstructured data and ensuring system reliability");
                break;
            case 5:
                questionLabel2.setText("Logical thinkers, programmers, and those who like\nbuilding things and working in teams to develop practical solutions");
                break;
            case 6:
                questionLabel2.setText("Analytical thinkers, number crunchers, and those\nwho enjoy working with large datasets and solving real-world problems using data");
                break;
            case 7:
                questionLabel2.setText("Math lovers, creative problem solvers, and those\nwho enjoy working with data, algorithms, and cutting-edge technology");
                break;
            case 8: 
                questionLabel2.setText("Those who enjoy coding, design, and working with\nfront-end (UI/UX) and back-end (server) development");
                break;
        }
        questionLabel.setWrapText(true);
        questionLabel.setStyle("-fx-alignment: center; -fx-text-alignment: center;-fx-text-fill: white; -fx-font-size: 35px;");
        questionLabel2.setStyle("-fx-alignment: center; -fx-text-alignment: center;-fx-text-fill: white; -fx-font-size: 35px;");
        option1.setText("Arlight");
        
        option1.setStyle("-fx-font-size: 18px;");
        
        option1.setOnAction(e -> Mid7(t));
        
        VBox vb = new VBox(10,questionLabel,questionLabel2, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    private void Mid7(int t)
    {
        pane.getChildren().clear();
        
        String info = "";
        switch(t)
        {
            case 1:
                info = "\nprotect digital systems from cyber attacks, data breaches.\nEnsuring the saftey of data and infrastructure online";
                break;
            case 2:
                info = "\ndesign, implement and manage communnication systems.\nKeeping business, goverments, and\n indiviuduals connected and productive";
                break;
            case 3:
                info = "\nmanage and maintain databases to ensure data integrity and availability.\nThey are the life blood of businesses, healthcare systems and research";
                break;
            case 4:
                info = "\nmanage and maintain databases to ensure data integrity and availability.\nThey are the life blood of businesses, healthcare systems and research";
                break;
            case 5:
                info = "\ndevelop, test, and maintain applications that power everything from apps\nto enterpises.\nThey allow automation and innovation to happen";
                break;
            case 6:
                info = "\ndevelop algorithms and models that minci human intelligence.\nMaking applications that can help healthcare, finance, education and much more";
                break;
            case 7:
                info = "\nanalyze massive datasets that help business.They help organizations make data-driven\ndecisions, making descisions more effective and usefull";
                break;
            case 8: 
                info = "\nbuild and maintain websites. Allowing people to\n access information, shop online, connect socially and much more";
                break;
        }
        questionLabel.setText("Those in " + majorhold + " " + info);
        questionLabel.setWrapText(true);
        questionLabel.setStyle("-fx-alignment: center; -fx-text-alignment: center;-fx-text-fill: white; -fx-font-size: 35px;");
        
        option1.setText("Arlight");
        option1.setStyle("-fx-font-size: 18px;");
        
        option1.setOnAction(e -> Mid8(t));
        
        VBox vb = new VBox(10,questionLabel, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    private void Mid8(int t)
    {
        pane.getChildren().clear();
        
        questionLabel.setText("An on avrage " + majorhold + " makes...");
        questionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 50px;");
       
        option1.setText("Tell me!");
        option1.setStyle("-fx-font-size: 18px;");
        
        option1.setOnAction(e -> Mid9(t));
        
        VBox vb = new VBox(10,questionLabel, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    private void Mid9(int t)
    {
        pane.getChildren().clear();
        
        String info = "";
        switch(t)
        {
            case 1:
                info = "120k";
                break;
            case 2:
                info = "95k";
                break;
            case 3:
                info = "100k";
                break;
            case 4:
                info = "100k";
                break;
            case 5:
                info = "130k";
                break;
            case 6:
                info = "150k";
                break;
            case 7:
                info = "166k";
                break;
            case 8: 
                info = "82k";
                break;
        }
        questionLabel.setText(info);
        questionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 100px;");
        
        Label questionLabel2 = new Label();
        questionLabel2.setText("per year!");
        questionLabel2.setStyle("-fx-text-fill: white; -fx-font-size: 30px;");
        
        option1.setText("Wow");
        option1.setStyle("-fx-font-size: 18px;");
        
        option1.setOnAction(e -> Mid10());
        
        VBox vb = new VBox(10,questionLabel,questionLabel2, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    private void Mid10()
    {
        pane.getChildren().clear();
        
        questionLabel.setText("Our questionair isn't full proof, and we recommend that you do some more\ndigging of your own to find if you would really enjoy this major");
        questionLabel.setWrapText(true);
        questionLabel.setStyle("-fx-alignment: center; -fx-text-alignment: center;-fx-text-fill: white; -fx-font-size: 45px;");
       
        option1.setText("Alright");
        option1.setStyle("-fx-font-size: 18px;");
        
        option1.setOnAction(e -> Mid11());
        
        VBox vb = new VBox(10,questionLabel, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    private void Mid11()
    {
        pane.getChildren().clear();
        
        questionLabel.setText("If you have questions please ask them into the text box\n and we will try to give you the best answear we can");
        questionLabel.setWrapText(true);
        questionLabel.setStyle("-fx-alignment: center; -fx-text-alignment: center;-fx-text-fill: white; -fx-font-size: 50px;");
       
        TextField textField = new TextField();
        option1.setText("Sumbit");
        option1.setStyle("-fx-font-size: 18px;");
        
        option1.setOnAction(e -> 
        {
            String userInput = textField.getText();
            End(userInput);
        });
        
        VBox vb = new VBox(10,questionLabel, option1);
        vb.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(vb);
    }
    
    private void End(String input)
    {
        
    }
    
    
    private static final String API_KEY = "";
    private static final String API_URL = "https://api.openai.com/v1/chat/completions";
    private static final String API_MODEL = "gpt-3.5-turbo";
    private static String Chatgpt(String input)
    {
        try
        {
            URL obj = new URL(API_URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Authorization", "Bearer "+ API_URL);
            con.setRequestProperty("Content-Type", "application/json");
            
            String body = "{\"model\": \"" + API_MODEL + "\", \"messages\": [{\"role\": \"user\", \"content\": \"" + input + "\"}]}";
            con.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
            writer.write(body);
            writer.flush();
            writer.close();
            
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
           
            return extractContentFromResponse(response.toString());
        } 
        catch (IOException e) 
        {
            throw new RuntimeException(e);
        }
    }
    public static String extractContentFromResponse(String response)
    {
        int startMarker = response.indexOf("content")+11;
        int endMarker = response.indexOf("\"", startMarker);
        return response.substring(startMarker, endMarker);
    }
    
    public static void run()
    {
        System.out.println(Chatgpt("hi"));
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}

