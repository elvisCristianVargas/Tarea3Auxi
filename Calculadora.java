

public class Calculadora
{
   public String CalcularEcuacuion;
   public int EncontrarEcuacionDeLaRecta;
   public double IndicarValorCateto;
   public String calcularEcuacion(int a, int b, int c){
       String respuesta;
       if(b*b<4*a*c){
           respuesta = "Solucion perteneciente al campo de los numeros complejos.";
       }else if(a!=0&&b*b>4*a*c){
            respuesta ="La primera solucion es "+(-b+Math.sqrt(b*b-4*a*c))/(2*a);
            respuesta ="La segunda solucion es "+(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        }else {
             respuesta ="Esta ecuacion no es de segundo grado.";
         
             return respuesta;
       }
       return respuesta;
   }
   
    public int EncontrarEcuacionDeLaRecta(int x, int y, int x1, int y1){
       int m = (y1 - y) / (x1 - x);
       
       return m;
   }
   
   public double IndicarValorCateto(int h, int c){
       double catetoFaltante = Math.sqrt((h * h)-(c * c));
       return catetoFaltante;
   }
}
