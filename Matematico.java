

public class Matematico
{
   public Calculadora calculadora;
   public String respusta;
   public  String calcularEcuacuion(int a, int b, int c){
       Calculadora calcularEcuacion = new Calculadora();
       String calcularEcuacion = Calculadora.calcularEcuacion();
       return calcularEcuacion;
   }
   public int EncontrarEcuacionDeLaRecta(int x, int y, int x1, int x2){
       return calculadora.getcalcularEcuacionDeLaRecta();
   }
   public double IndicarValorCateto(){
       IndicarValorCateto = new IndicarValorCateto();
       double IndicarValorCateto = calculadora.calcularIndicarValorCateto();
       return IndicarValorCateto;
   }
}
