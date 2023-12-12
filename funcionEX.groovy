import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

def fechaIngreso = '2024-12-16';
int seleccionNumero = 1;

//Funcion que recibe como parametros una fecha como string y numero que indica un corte a acceder, en base al corte se retorna la fecha ingresada modificando el dia segun corresponda.
def quincena (fecha , corte){
  def fechaFormato = LocalDate.parse(fecha);
  def fechaCorregida ;

  if (corte == 1){
    fechaCorregida = fechaFormato.withDayOfMonth(15);
  }else{
    fechaCorregida  = fechaFormato.withDayOfMonth(fechaFormato.lengthOfMonth());
  }
  return fechaCorregida;
}
println(quincena(fechaIngreso, seleccionNumero));