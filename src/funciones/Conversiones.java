package funciones;

import getDataApi.DataConverter;
import java.io.IOException;
import org.json.JSONObject;

public class Conversiones {
    
    
    DataConverter data = new DataConverter();
    
    
    public Object pesoADolar(String valor) throws IOException{
        JSONObject response = data.run("https://api.apilayer.com/currency_data/convert?from=DOP&to=USD&amount="+valor);
        System.out.println("https://api.apilayer.com/currency_data/convert?from=DOP&to=USD&amount="+valor);
        return response.get("result");
    }
 
    public Object pesoAEuro(String valor)throws IOException{ 
        JSONObject response = data.run("https://api.apilayer.com/currency_data/convert?from=DOP&to=EUR&amount="+valor);
        return response.get("result");
   }
    
    public Object pesoAColombiano(String valor)throws IOException{
        JSONObject response = data.run("https://api.apilayer.com/currency_data/convert?from=DOP&to=COP&amount="+valor);
        return response.get("result");
   }
    
    public Object pesoAMexicano(String valor)throws IOException{
        JSONObject response = data.run("https://api.apilayer.com/currency_data/convert?from=DOP&to=MXN&amount="+valor);
        return response.get("result");
   }
    
    
    // Crypto
    public Object PesoABitcoin(String valor)throws IOException{
        JSONObject response = data.run("https://api.apilayer.com/currency_data/convert?from=DOP&to=BTC&amount="+valor);
        return response.get("result");
   }
    
    // invertidos
    public Object dolarAPeso(String valor)throws IOException{
        JSONObject response = data.run("https://api.apilayer.com/currency_data/convert?from=USD&to=DOP&amount="+valor);
        return response.get("result");
   }
 
    public Object euroAPeso(String valor)throws IOException{
        JSONObject response = data.run("https://api.apilayer.com/currency_data/convert?from=EUR&to=DOP&amount="+valor);
        return response.get("result");
   }
    
    public Object colombianoAPeso(String valor)throws IOException{
        JSONObject response = data.run("https://api.apilayer.com/currency_data/convert?from=COP&to=DOP&amount="+valor);
        return response.get("result");
   }
    
    public Object mexicanoAPeso(String valor)throws IOException{
        JSONObject response = data.run("https://api.apilayer.com/currency_data/convert?from=MXN&to=DOP&amount="+valor);
        return response.get("result");
   }
    
    //Crypto invertido
    public Object bitcoinAPeso(String valor)throws IOException{
        JSONObject response = data.run("https://api.apilayer.com/currency_data/convert?from=BTC&to=DOP&amount="+valor);
        return response.get("result");
   }
    
    
    //fahrenheit a celsius
      public Object fahrenheitACelsius(double valor)throws IOException{
          double result = (valor - 32) / 1.8;
          return result;
   }
    
    //celsius a fahrenheit 
    public double celsiusAFahrenheit(double valor)throws IOException{
        double result = (valor * 1.8) + 32;
        return result;
   }
    
}
