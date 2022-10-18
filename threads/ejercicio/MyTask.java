package threads.ejercicio;

import java.util.ArrayList;

public class MyTask {

    private ArrayList<Productor> productores = new ArrayList<Productor>();
    private ArrayList<Consumidor> consumidores = new ArrayList<Consumidor>();
    private Contador contador = new Contador();

    public MyTask() {
        for (int i = 0; i < 6; i++) {
            this.productores.add(new Productor(this.contador));
            this.consumidores.add(new Consumidor(this.contador));
        }
    }

    public int doTest() {

        for (int i = 0; i < this.productores.size(); i++) {
            this.productores.get(i).start();
            this.consumidores.get(i).start();
        }

        for (int i = 0; i < this.productores.size(); i++) {
            try {
                this.productores.get(i).join();
                this.consumidores.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ;
        }

        return this.contador.mostrar();

    }

}
