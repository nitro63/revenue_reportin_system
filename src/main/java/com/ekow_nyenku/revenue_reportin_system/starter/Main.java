package com.ekow_nyenku.revenue_reportin_system.starter;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;



public class Main extends Application {

    private ConfigurableApplicationContext context;

    protected StageInitializer stageManager;



    @Override
    public void init() throws Exception {
        context = new SpringApplicationBuilder(RevenueReportinSystemApplication.class).run();
    }

    @Override
    public void stop() throws Exception {
       context.stop();
        Platform.exit();
    }

    @Override
    public void start(Stage stage) throws Exception {
        context.publishEvent(new StageReadyEvent(stage));
    }

     static class StageReadyEvent extends ApplicationEvent {
        public StageReadyEvent(Stage stage) {
            super(stage);
        }

        public Stage getStage(){
            return (Stage) getSource();
        }
    }
}
