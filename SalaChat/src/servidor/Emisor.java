package servidor;

import java.net.Socket;
import java.util.ArrayList;

import modelo.Mensaje;

public class Emisor extends Thread{
	private Socket sock;
	private ArrayList<Mensaje> listaMensajes = new ArrayList<Mensaje>();
	
	public Emisor(Socket sock, ArrayList<Mensaje> listaMensajes) {
		this.sock = sock;
		this.listaMensajes = listaMensajes;
	}
	


}
