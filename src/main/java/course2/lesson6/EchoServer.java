package course2.lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class EchoServer {
	public static void main(String[] args) {
		final EchoServer echoServer = new EchoServer();
		try (ServerSocket serverSocket = new ServerSocket(8189)) {//try with resources
			System.out.println("Сервер запущен, ожидаем подключения клиента");
			Socket socket = serverSocket.accept(); // Блокирующий метод
			System.out.println("Клиент подключился");
			final DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());// Получение данных
			final DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());// Отправка данных
			final Thread thread = new Thread(new Runnable() {
				final Scanner scanner = new Scanner(System.in);
				@Override
				public void run() {
					try {
						while (true) {
							final String msg = scanner.nextLine();
//							final String message = dataInputStream.readUTF();// Блокирует выполнение кода пока не прочитает
							dataOutputStream.writeUTF(msg);
//							System.out.println("Сообщение от сервера " + message);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			});
			while (true) {
				final String message = dataInputStream.readUTF();
				if ("/end".equalsIgnoreCase(message)) {
					break;
				}
				dataOutputStream.writeUTF("Echo: " + message);
				System.out.println("PewPew");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Сервер помер с:");
	}
}

