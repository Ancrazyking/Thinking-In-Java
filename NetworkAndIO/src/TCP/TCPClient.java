package TCP;

import java.io.*;
import java.net.Socket;

/**
 * @author Ancrazyking
 * @date 2018/4/25 15:18
 **/
public class TCPClient
{
    public static void main(String[] args) throws Exception
    {
        Socket socket = new Socket("127.0.0.1", 8888);

        OutputStream out = socket.getOutputStream();

        BufferedInputStream fileIn = new BufferedInputStream(new FileInputStream("I:\\GoogleDownload\\JavaBase\\NetworkAndIO\\picture\\QQ图片20180311162556.jpg"));
        //5,把图片数据写到Socket的输出流中(把数据传给服务器)
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = fileIn.read(buffer)) != -1)
        {
//把数据写到Socket的输出流中
            out.write(buffer, 0, len);
        }
//6,客户端发送数据完毕，结束Socket输出流的写入操作，告知服务器端
        socket.shutdownOutput();

//-----------------反馈信息---------------------
//12,获取Socket的输入流  作用： 读反馈信息
        InputStream in = socket.getInputStream();
//13,读反馈信息
        byte[] info = new byte[1024];
//把反馈信息存储到info数组中，并记录字节个数
        int length = in.read(info);
//显示反馈结果
        System.out.println(new String(info, 0, length));
//关闭流
        in.close();
        fileIn.close();
        out.close();
        socket.close();


    }


}
