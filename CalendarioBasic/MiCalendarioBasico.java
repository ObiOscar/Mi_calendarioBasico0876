
/**
 * Write a description of class MiCalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiCalendarioBasico
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int anno;
    

        /**
         * Constructor for objects of class MiCalendarioBasico
         */
        public MiCalendarioBasico()
        {
          dia = 1;
          mes = 1;
          anno = 1;   
 
       }

       
//FIJAMOS LA FECHA INTRODUCIMOS NÚMEROS ENTEROS   
public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno) {
        dia = nuevoDia;
        mes = nuevoMes;
        anno = nuevoAno;
}


//AVANZAMOS UN DÍA LA FECHA
public void avanzarFecha() {
    
        dia = dia + 1;
        if (dia == 31) {
            dia = 1;
            mes = mes + 1;
            if (mes == 13) {
                mes = 1;
                anno = anno + 1;
                if (anno == 100) {
                    dia = 1;
                    mes = 1;
                    anno = 1;
                }
            }
        }
}

//Enseño la fecha

public String obtenerFecha() {
    
        String muestraDia;
        String muestraMes;
        String muestraAnno;
        
        if(dia < 10){ 
            
            muestraDia = "0" + dia;
            
        }
        else{
            muestraDia = dia+ "";  
        }
        
        if(mes < 10){ 
            
            muestraMes = "0" + mes;
            
        }
        else{
            muestraMes = mes+ "";  
        }
        
        if(anno < 10){ 
            
            muestraAnno= "0" + anno;
            
        }
        else{
            muestraAnno = anno+ "";  
        }
        
        
        return muestraDia + "-" + muestraMes + "-" + muestraAnno;
    }
}
