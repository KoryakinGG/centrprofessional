package lesson6.task2.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Server {
    public static void main(String[] args) {
        ArrayList<Socket> clients = new ArrayList<>();
        Socket socket = null;
        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            System.out.println("INFO: Сервер запущен");
            while (true){
                socket = serverSocket.accept(); // Ожидаем клиента
                DataInputStream in = new DataInputStream(socket.getInputStream()); // Поток ввода
//              DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                System.out.println("Клиент подключился");
                clients.add(socket); // Добавляем клиента в список
                Thread thread = new Thread(new Runnable() { // Открываем поток для клиента
                    @Override
                    public void run() {
                        try {
//                          Короче, я не стал сильно заморачиваться с листами, просто сюда запомнил имя. Все равно,
//                          потом код переписывать будете
                            String name = in.readUTF();
                            for (int i = 0; i < clients.size(); i++) {
                                System.out.println(name + " присоединился к нам");
                            }
                            while (true){
                                System.out.println("Ожидаем сообщение...");
                                String request = in.readUTF();
                                DataOutputStream out;
                                System.out.println(name + " : " + request);
                                for (Socket socket: clients) { // Перебираем список клиентов
                                    out = new DataOutputStream(socket.getOutputStream()); // Поток вывода
                                    out.writeUTF(name + " : " + request);
                                }
                            }
                        }catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}