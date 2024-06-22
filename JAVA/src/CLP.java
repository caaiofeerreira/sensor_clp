
public class CLP extends Componentes {

  public CLP(boolean sensor, boolean releBobina, boolean releContato) {
    super(sensor, releBobina, releContato);

    if (sensor && releBobina && releContato) {
      System.out.println("OK: Sensor: " + sensor + ", Rele Bobina: " + releBobina + ", Rele Contato: " + releContato);
      System.out.println("Sinal de OK enviado para o CLP.");
      System.out.println("Robo autorizado para trabalho!");
    } else {
      System.out.println("Nenhum sinal enviado para o CLP.");
      System.out.println("Robo nao autorizado para trabalho! Algum componente comprometido.");
    }
  }
}