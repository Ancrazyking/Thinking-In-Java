package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Ancrazyking
 * @date 2018/4/25 14:57
 **/
public class UDPSend
{
    public static void main(String [] args) throws Exception{
        DatagramSocket sendSocket=new DatagramSocket();

        byte[] buffer="Hello,UDP".getBytes();

        DatagramPacket datagramPacket=new DatagramPacket(buffer,buffer.length, InetAddress.getByName("127.0.0.1"),12306);

        sendSocket.send(datagramPacket);

        sendSocket.close();

    }




}
