package TCP;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Ancrazyking
 * @date 2018/4/25 15:11
 **/
public class TCPServer
{
    public static void main(String [] args)throws  Exception{
        ServerSocket serverSocket=new ServerSocket(8888);
        Socket clientSocket=serverSocket.accept();
        InetAddress inetAddress=clientSocket.getInetAddress();
        String ip=inetAddress.getHostAddress();
        System.out.println("IP:"+ip);


        InputStream inputStream=clientSocket.getInputStream();

        BufferedOutputStream fileOut=new BufferedOutputStream(new FileOutputStream("I:\\GoogleDownload\\JavaBase\\NetworkAndIO\\picture\\提莫.jpg"));

        byte[] buffer=new byte[1024];
        int len=-1;
        while((len=inputStream.read(buffer))!=-1){
            fileOut.write(buffer,0,len);
        }

        OutputStream out=clientSocket.getOutputStream();
        out.write("图片上传成功".getBytes());
        out.close();
        fileOut.close();
        inputStream.close();
        clientSocket.close();
    }



}
