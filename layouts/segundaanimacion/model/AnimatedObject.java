package layouts.segundaanimacion.model;

public class AnimatedObject implements Runnable {

    // ! Atributos
    private CoordenadasDTO coordenadasDTO;

    public AnimatedObject(int x, int y) {
        this.setCoordenadasDTO(new CoordenadasDTO(x, y));
    }

    /*
     * Este hilo irá descansando e irá cambiando las coordenadas de cada uno de los
     * objetos animados
     */
    // ! Cada 1 segundo las coordenadas X e Y sumarán + 1
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.getCoordenadasDTO().setX(this.getCoordenadasDTO().getX() + 1);
        this.getCoordenadasDTO().setY(this.getCoordenadasDTO().getY() + 1);

    }

    // ! Getters y Setters
    /**
     * @return the coordenadasDTO
     */
    public CoordenadasDTO getCoordenadasDTO() {
        return coordenadasDTO;
    }

    /**
     * @param coordenadasDTO the coordenadasDTO to set
     */
    public void setCoordenadasDTO(CoordenadasDTO coordenadasDTO) {
        this.coordenadasDTO = coordenadasDTO;
    }

}
