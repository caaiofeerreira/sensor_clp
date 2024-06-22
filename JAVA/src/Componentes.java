// import java.util.Random;

public class Componentes {

  //METODO ALEATORIO
  // Random random = new Random();
  
  // private boolean sensor = random.nextBoolean();
  // private boolean releBobina = random.nextBoolean();
  // private boolean releContato = acionaRele(releBobina);

  private boolean sensor = true;
  private boolean releBobina = false;
  private boolean releContato = acionaRele(releBobina);


  public Componentes(boolean sensor, boolean releBobina, boolean releContato) {
    this.sensor = sensor;
    this.releBobina = releBobina;
    this.releContato = acionaRele(releContato);
  }

  public Componentes(){}

  public boolean getSensor() {
    return sensor;
  }

  public void setSensor(boolean sensor) {
    this.sensor = sensor;
  }

  public boolean getReleBobina() {
    return releBobina;
  }

  public void setReleBobina(boolean releBobina) {
    this.releContato = acionaRele(releBobina);
  }

  public boolean getReleContato() {
    return releContato;
  }

  public void setReleContato(boolean releContato) {
    this.releContato = releContato;
  }

  public boolean acionaRele(boolean bobinaAcionada) {
    return bobinaAcionada;
  }
}