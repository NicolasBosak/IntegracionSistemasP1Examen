package org.example;

import org.apache.camel.main.Main;

public class MainApp {

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.configure().addRoutesBuilder(new FileIntegrationRoute());

        System.out.println("#################################################");
        System.out.println("Iniciando integración de Clínica SaludVital...");
        System.out.println("Escuchando archivos en la carpeta: data/input");
        System.out.println("#################################################");
        main.run(args);
    }
}