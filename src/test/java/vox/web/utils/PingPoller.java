package vox.web.utils;

import java.io.IOException;
import java.net.Socket;

public class PingPoller {
	public static void getServerStatus() throws IOException {
		System.out.println("Ping Poller Starts...");

		try {
			Socket socket = new Socket("staging.voxweb.in", 443);
			socket.close();
			System.out.println("Server is up");

		} catch (IOException e) {
			System.out.println("Server is down");
		}

	}
	
	public static void getServerTime() throws IOException {
      System.out.println("Ping Poller Starts...");

      try {
          Socket socket = new Socket("staging.voxweb.in", 443);
          socket.close();
          System.out.println("Server is up");

      } catch (IOException e) {
          System.out.println("Server is down");
      }

  }

}
