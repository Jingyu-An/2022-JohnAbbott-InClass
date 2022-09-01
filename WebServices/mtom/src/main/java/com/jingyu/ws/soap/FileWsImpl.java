package com.jingyu.ws.soap;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import java.io.*;

public class FileWsImpl implements FileWs{

    InputStream inputStream = null;
    OutputStream outputStream = null;
    String path = "E:\\Johnabbott\\Web Services\\Day09\\upload\\test.jpg";

    @Override
    public void upload(DataHandler attachment) {
        try {
            inputStream = attachment.getInputStream();
            outputStream = new FileOutputStream(new File(path));
            byte[] buffer = new byte[100000];
            int bytesRead = 0;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public DataHandler download() {

        return new DataHandler(new FileDataSource(new File("E:\\Johnabbott\\Web Services\\Day09\\upload\\test.jpg")));
    }
}
