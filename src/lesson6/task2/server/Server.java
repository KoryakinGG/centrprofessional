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
        ArrayList<String> names = new ArrayList<>(); // список я нигде не использую. Надо сделать проверку, на совпадение имен
//        names.add("ChatBot");
        Socket socket;  //сокет для клиента
        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            System.out.println("INFO: Сервер запущен");
            while (true) {
                socket = serverSocket.accept(); // Ожидаем клиента и когда кто-то подключается кладем его в этот сокет
                DataInputStream in = new DataInputStream(socket.getInputStream()); // Поток ввода
                DataOutputStream out;
                String name = in.readUTF();
                clients.add(socket); // Добавляем клиента в список
                names.add(name);
                System.out.println(name + " подключился");
                for (Socket count : clients) {
                    out = new DataOutputStream(count.getOutputStream());
                    out.writeUTF(name + " подключился");
                }
                Thread thread = new Thread(new Runnable() { // Открываем поток для клиента
                    @Override
                    public void run() {
                        try {
                            DataOutputStream out;
                            while (true) {
//                                System.out.println("Ожидаем сообщение...");
                                String request = in.readUTF(); // читаем сообщение и помещаем его в стринг
                                System.out.println(name + ": " + request); // выводим в консоль сервера
                                for (Socket socket : clients) { // Перебираем список клиентов
                                    out = new DataOutputStream(socket.getOutputStream()); // Поток вывода
                                    out.writeUTF(name + ": " + request);
                                }
                            }
                        } catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}