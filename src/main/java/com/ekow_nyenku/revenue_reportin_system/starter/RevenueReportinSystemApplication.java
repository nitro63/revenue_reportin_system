package com.ekow_nyenku.revenue_reportin_system.starter;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import static javafx.application.Application.launch;

@SpringBootApplication
@ComponentScan("com.ekow_nyenku.revenue_reportin_system")
public class RevenueReportinSystemApplication {

    public static void main(String[] args) {
        launch(Main.class, args);
    }

}
