def fechaIngreso = '2022-05-30'
int seleccionNumero = 2

//Funcion que recibe como parametro una fecha en string 'AAAA-MM-DD' y un entero que determina el corte al cual accede.
def quincena (fecha, corte){
  
  def formato = new java.text.SimpleDateFormat("yyyy-MM-dd")
  def fechaFormato = formato.parse(fecha)
  
  def año = fechaFormato.year + 1900
  def mes = fechaFormato.month + 1
  def dia = fechaFormato.date

  switch (corte){
    case 1:
      println("$año-$mes-15")
      break
    case 2:
      switch  (mes){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          println("$año-$mes-31")
          break
        case 2:
        case 4:
        case 6:
        case 9:
        case 11:
          println("$año-$mes-30")
          break
      }
    case 3:
      switch  (mes){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          println("$año-$mes-31")
          break
        case 2:
        case 4:
        case 6:
        case 9:
        case 11:
          println("$año-$mes-30")
          break
      }
    break
    }
}

quincena (fechaIngreso,seleccionNumero)