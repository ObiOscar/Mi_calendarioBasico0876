
/**
 * La clase ha cambiado. Ahora usa metodos de la clase DisplayDosDigitos. Creo objetos de esa clase.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiCalendarioBasico
{
    // instance variables - replace the example below with your own
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos anno;
    

        /**
         * Constructor for objects of class MiCalendarioBasico
         */
        public MiCalendarioBasico()
        {
          dia = new DisplayDosDigitos(31);
          mes = new DisplayDosDigitos(13);
          anno = new DisplayDosDigitos(100);  
       }

       
//FIJAMOS LA FECHA INTRODUCIMOS NÚMEROS ENTEROS   
public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno) {
        dia.setValor(nuevoDia);             //El objeto dia se lo meto al metodo set valor, y marco el nuevo valor
        mes.setValor(nuevoMes);
        anno.setValor(nuevoAno);
}


//AVANZAMOS UN DÍA LA FECHA
public void avanzarFecha() {
        dia.incrementaValor();  
         if (dia.getValor() == 1) {
             mes.incrementaValor();  
             if (mes.getValor() == 1) {
                   anno.incrementaValor();  
              }
          }
        }


//Enseño la fecha
public String obtenerFechaComoCadena() {
		return dia.getValorDelDisplay() + "-" + mes.getValorDelDisplay() + "-" + anno.getValorDelDisplay();
}
}
