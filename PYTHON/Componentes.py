#import random

class Componentes:

  def __init__(self):

    #METODO ALEATORIO
    # self.sensor = random.choice([True, False])
    # self.rele_bobina = self.aciona_releBobina(self.sensor)
    # self.rele_contato = self.aciona_rele(self.rele_bobina)

    self.sensor = True
    self.rele_bobina = False
    self.rele_contato = self.aciona_releContato(self.rele_bobina)

  def aciona_releContato(self, rele_bobina):
    return rele_bobina
