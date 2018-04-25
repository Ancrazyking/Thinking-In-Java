package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Ancrazyking
 * @date 2018/4/25 15:01
 **/
public class UDPReceive
{
    public static void main(String[] args)throws Exception{
        DatagramSocket receiveSocket=new DatagramSocket(12306);

        byte[] buffer=new byte[1024];

        DatagramPacket datagramPacket=new DatagramPacket(buffer,1024);

        receiveSocket.receive(datagramPacket);

        InetAddress inetAddress=datagramPacket.getAddress();
        String ip=inetAddress.getHostAddress();
        byte[] data=datagramPacket.getData();
        int length=datagramPacket.getLength();
        String dataStr=new String(data,0,length);
        System.out.println("IP地址:"+ip+"数据是"+dataStr);
        receiveSocket.close();

    }


}
