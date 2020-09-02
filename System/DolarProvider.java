package System;
//para poder parsear el .json de la api
import org.json.JSONObject;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DolarProvider
{
    private static HttpURLConnection connection;
    private static double precio;
    public DolarProvider() {
        this.valorDelDolar();

    }
    
    // parseo que toma la respuesta y devuelve el valor de dolar a peso en la variable valor
    public static double parse(String responseBody) {
        JSONObject obj = new JSONObject(responseBody);
        double valor = obj.getDouble("USD_ARS");
        //System.out.println(valor);
        precio = valor;
        return valor;
    }
    public static void valorDelDolar() {
        HttpClient client = HttpClient.newHttpClient(); //creamos un objeto cliente (para hacer la llamada HTTP "Cliente")
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("Private API URL with keyh")).build(); // clase encargada de generar la consulta
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString()) // se envia el request de manera asincronica
                .thenApply(HttpResponse::body) // trae devuelta el body de la respuesta
                .thenAccept(DolarProvider::parse) // el metodo que se ejecuta cuando la request llegue
                .join();
    }
    //getPrecio para la multiplicacion del peso dolar
    public static double getPrecio() {
        return precio;
    }
}

