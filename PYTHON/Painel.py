from CLP import CLP
from Componentes import Componentes

class Painel:

  componente = Componentes()
  clp = CLP(componente.sensor, componente.rele_bobina, componente.rele_contato)

if __name__ == "__main__":
  painel = Painel()