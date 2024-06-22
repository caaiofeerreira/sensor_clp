from Componentes import Componentes

class CLP:

  def __init__(self, sensor, rele_bobina, rele_contato):

    self.sensor = sensor
    self.rele_bobina = rele_bobina
    self.rele_contato = rele_contato
    
    if self.sensor and self.rele_bobina and self.rele_contato:

      print(f"OK: Sensor: {self.sensor}, Rele Bobina: {self.rele_bobina}, Rele Contato: {self.rele_contato}")
      
      print("Sinal de OK enviado para o CLP.")
      print("Robo autorizado para trabalho!")

    else:
      print("Nenhum sinal enviado para o CLP.")
      print("Robo nao autorizado para trabalho! Algum componente comprometido.")
      
