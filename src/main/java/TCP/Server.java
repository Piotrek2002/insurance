package TCP;

import TCP.Message;
import dao.UserDao;
import model.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static final int PORT = 50007;

    public static void main(String args[]) throws IOException {
        //tworzenie gniazda serwerowego
        ServerSocket serv;
        serv = new ServerSocket(PORT);

        //oczekiwanie na polaczenie i tworzenie gniazda sieciowego
        System.out.println("Nasluchuje: " + serv);
        Socket sock;
        sock = serv.accept();
        System.out.println("Jest polaczenie: " + sock);

        //tworzenie strumienia danych pobieranych z gniazda sieciowego
        BufferedReader inp;
        inp = new BufferedReader(new InputStreamReader(sock.getInputStream()));

        //komunikacja - czytanie danych ze strumienia
        String str;
        str = inp.readLine();
        long userId = Long.parseLong(str);
        UserDao userDao = new UserDao();
        User user = userDao.read(userId);
        Message message = new Message(user.getLogin());

        System.out.println("<Nadeszlo:> " +message.returnMessage());

        //zamykanie polaczenia
        inp.close();
        sock.close();
        serv.close();
    }


}
