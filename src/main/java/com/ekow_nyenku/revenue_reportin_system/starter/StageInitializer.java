package com.ekow_nyenku.revenue_reportin_system.starter;

import com.ekow_nyenku.revenue_reportin_system.starter.Main.StageReadyEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {

//    private static final Stage primaryStage;

    @Value("classpath:fxml/login.fxml")
    Resource loginResource;
    @Value("classpath:static/kmalogo.png")
    private Resource appBandLogo;
    private ApplicationContext context;


    public StageInitializer(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void onApplicationEvent(StageReadyEvent stageReadyEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(loginResource.getURL());
            loader.setControllerFactory(aClass -> this.context.getBean(aClass));
            Parent root = loader.load();
            Stage stage = stageReadyEvent.getStage();
            stage.setTitle("Login Prompt");
            stage.getIcons().add(new Image(appBandLogo.getURL().openStream()));
            stage.setScene(new Scene(root));
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
