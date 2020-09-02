package System;
public class Conversion
{
    DolarProvider dolarProvider = new DolarProvider();

    private double milla = 1.60934, libra = 0.453592, dolar = 72.57, onza = 0.0295735;
    public void kmamilla(int km) {
        System.out.println(km+" kilometers in miles is: "+(km/milla));
    }
    public void klalibras(int kil) {
        System.out.println(kil+" kilos in pounds is: "+(kil/libra));
    }
    public void pesodolar(int peso) {
        //Explicacion del dolarProvider:
        //Hace un tiempo cuando estaba investigando en hacer un bot en python
        //logre encontrar un API gratuito en internet que me devolvia el precio de
        //dolar a pesos y queria hacer lo mismo aca ya que dolar es una variable sujeta al mercado
        //sin embargo trambien deje la variable hardcodeada como dolar arriba
        System.out.println(peso+" Pesos in Dollars is: "+(peso/dolarProvider.getPrecio()));
    }
    public void laoz(int litros) {
        System.out.println(litros+" liters in ounces is: "+(litros/onza));
    }
}


