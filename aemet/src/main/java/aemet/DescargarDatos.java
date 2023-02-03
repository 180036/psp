package aemet;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DescargarDatos {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Para que quede mas visual.
		String server = "https://opendata.aemet.es/opendata/";
		String apikey = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTAxNDZAaWVzc2llcnJhZGVndWFyYS5jb20iLCJqdGkiOiJkMGI0NWRhNi1lZmYzLTQwZDYtYmZkZi05MTE0ZThiZTg0ODAiLCJpc3MiOiJBRU1FVCIsImlhdCI6MTY3NTE1NDYzNSwidXNlcklkIjoiZDBiNDVkYTYtZWZmMy00MGQ2LWJmZGYtOTExNGU4YmU4NDgwIiwicm9sZSI6IiJ9.NW7CYlKvOy6mVtZWF8WoGWgbKgD4cGcRB44kaqelGhM";
		String endpoint = "api/observacion/convencional/todas";
		
		HttpClient cliente = HttpClient.newHttpClient();
		HttpRequest req = HttpRequest.newBuilder().uri(URI.create(server + endpoint + "?api_key=" + apikey)).GET().build();
		
		HttpResponse<String> res = cliente.send(req, HttpResponse.BodyHandlers.ofString());
		
		System.out.println(res.body());
		System.out.println(res);
		
		//Usar jackson para obtener la cadena de datos y de metadatos
		//hacer las peticiones correspondientes de esos dos JSON
		//coger el valor deseado filtrado por el idioma de Huesca(9901X)
		
	}

}
