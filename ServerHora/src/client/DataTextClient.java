package client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import server.DataTextServer;

public class DataTextClient {

	public static void main(String[] args) {
		try {
			Socket sock = new Socket("localhost", DataTextServer.PORT);
			DataInputStream entrada= new DataInputStream(sock.getInputStream());
			String fecha = entrada.readUTF();
			
			System.out.println(fecha);
			entrada.close();
			sock.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
