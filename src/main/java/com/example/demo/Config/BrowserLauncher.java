package com.example.demo.Config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BrowserLauncher {

    @EventListener(ApplicationReadyEvent.class)
    public void openBrowser() {
        String url = "http://localhost:8080";
        String os = System.getProperty("os.name").toLowerCase();

        try {
            if (os.contains("win")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            } else if (os.contains("mac")) {
                Runtime.getRuntime().exec("open " + url);
            } else {
                Runtime.getRuntime().exec("xdg-open " + url);
            }
        } catch (Exception e) {
            System.out.println("No se pudo abrir el navegador: " + e.getMessage());
        }
    }
}