package com.example.javafx;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavafxApplication extends Application {


	public static ConfigurableApplicationContext context;



	public static void main(String[] args) {
		launch();
		SpringApplication.run(JavafxApplication.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader fxml = new FXMLLoader(getClass().getResource( "/Javafx.fxml"));
		context = SpringApplication.run(JavafxApplication.class);
		fxml.setControllerFactory(context::getBean);
		Scene scene = new Scene(fxml.load());
		stage.setTitle("Aplicacion PRUEBA");
		stage.setScene(scene);
		stage.show();
	}

}
