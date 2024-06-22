
public class Painel {
  public static void main(String[] args) {

    Componentes componente = new Componentes();
    new CLP(componente.getSensor(), componente.getReleBobina(), componente.getReleContato());
  }
}