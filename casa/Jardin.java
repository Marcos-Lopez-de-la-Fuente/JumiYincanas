package casa;

public class Jardin {
    private float superficie;
    private Integer plantas;



    public Jardin (float superficie, Integer plantas) {
        this.superficie = superficie;
        this.plantas = plantas;
    }

    public String show() {
        return "Jardin [plantas=" + plantas + ", superficie=" + superficie + "]";
    }

    public Integer get_valor() {
        return 0;
    }
}
