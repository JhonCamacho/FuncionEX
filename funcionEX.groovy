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

//FUNCION OPTIMIZADA 

import java.time.LocalDate
import java.time.format.DateTimeFormatter

def fechaIngreso = '2023-02-16'
int seleccionNumero = 1

def quincena (fecha , corte){
  def fechaFormato = LocalDate.parse(fecha)
  def año = fechaFormato.year
  def mes = fechaFormato.monthValue
  def ultimoDiaDelMes = fechaFormato.withDayOfMonth(fechaFormato.lengthOfMonth())

  if (corte == 1){
    println("$año-$mes-15")
  }else if (corte == 2 || corte == 3){
    println((ultimoDiaDelMes))
  }else{
    println("Seleccion invalida")
  }
}

quincena (fechaIngreso, seleccionNumero)

//FUNCION FINAL CON AJUSTES
import java.time.LocalDate
import java.time.format.DateTimeFormatter

def fechaIngreso = '2024-02-16'
int seleccionNumero = 3

def quincena (fecha , corte){
  def fechaFormato = LocalDate.parse(fecha)
  def ano = fechaFormato.year
  def mes = fechaFormato.monthValue
  def fechaCorregida 

  if (corte == 1){
    fechaCorregida = fechaFormato.withDayOfMonth(15)
  }else{
    fechaCorregida  = fechaFormato.withDayOfMonth(fechaFormato.lengthOfMonth())
  }
  return fechaCorregida
}
println(quincena(fechaIngreso, seleccionNumero))
