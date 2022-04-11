package course2.lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	private Socket socket;
	private DataInputStream inputStream;
	private DataOutputStream outputStream;
	
	public static void main(String[] args) {
		final EchoClient client = new EchoClient();
		client.start();
	}
	
	private void start() {
		try {
			openConnection(); // DI- dependency injection, IoC- inversion of control загуголить с:
			final Scanner scanner = new Scanner(System.in);
			while (true) {
				final String msg = scanner.nextLine();//Блокирующий метод(блокирует main), ждет сообщение от пользователя
				outputStream.writeUTF(msg); // посылка сообщений на сервер
				if ("/end".equalsIgnoreCase(msg)) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}
	
	private void closeConnection() {
		if (socket != null) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (inputStream != null) {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (outputStream != null) {
			try {
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void openConnection() throws IOException {
		socket = new Socket("localhost", 8189);
		inputStream = new DataInputStream(socket.getInputStream());
		outputStream = new DataOutputStream(socket.getOutputStream());
		final Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						final String message = inputStream.readUTF();// Блокирует выполнение кода пока не прочитает
						System.out.println("Сообщение от сервера ! " + message);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		});
		thread.start();
	}
	
}
