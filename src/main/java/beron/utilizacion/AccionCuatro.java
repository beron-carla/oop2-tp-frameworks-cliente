package beron.utilizacion;

import beron.framework.Accion;

public class AccionCuatro implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando AccionCuatro...");
    }

    @Override
    public String nombreItemMenu() {
        return "Accion 4";
    }

    @Override
    public String descripcionItemMenu() {
        return "Esto es para traer los twitts de Pepe...";
    }
}
