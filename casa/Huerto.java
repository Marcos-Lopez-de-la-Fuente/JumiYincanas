package casa;

public class Huerto {
    private float superficie;
    private Boolean riego_por_goteo;



    public Huerto (float superficie, Boolean riego_por_goteo) {
        this.superficie = superficie;
        this.riego_por_goteo = riego_por_goteo;
    }


    public String show() {
        return "Huerto [riego_por_goteo=" + riego_por_goteo + ", superficie=" + superficie + "]";
    }

    public Integer get_valor() {
        return 0;
    }
}
