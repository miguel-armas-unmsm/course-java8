package com.course.java8.nashorn;

import java.io.FileReader;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornApp {

    private ScriptEngineManager m;
    private ScriptEngine e;
    private Invocable invocador;
    
    public NashornApp() {
        m = new ScriptEngineManager();
        e = m.getEngineByName("nashorn");
        invocador = (Invocable) e;
    }
    
    public void llamarFunciones() throws Exception {
        // e.eval("print('JS desde Java')");
        e.eval(new FileReader("src/com/mitocode/nashorn/file.js"));
        
        String rpta = (String) invocador.invokeFunction("calcular", "2", "3");
        System.out.println(rpta);
        
        double rpta2 = (double) invocador.invokeFunction("calcular", 2, 3);
        System.out.println(rpta2);
    }
    
    public void implementarInterfaz() throws Exception {
        e.eval(new FileReader("src/com/mitocode/nashorn/file.js"));
        
        Object implementacion = e.get("hiloImpl");
        Runnable r = invocador.getInterface(implementacion, Runnable.class);
        
        Thread th1 = new Thread(r);
        th1.start();
        
        Thread th2 = new Thread(r);
        th2.start();
    }
    
    public static void main(String[] args) throws Exception {
        NashornApp app = new NashornApp();
        // app.llamarFunciones();
        app.implementarInterfaz();
    }
    
}
