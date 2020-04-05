package com.github.clumsy48.io_nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


// reads byte by byte from input and writes byte by byte to output
// disadvantage - it actually represents a kind of low-level I/O that you should avoid
public class ByteStreams {

    public void run(String[] args) throws IOException {
        if (args.length < 1) {
            return;
        }
        System.out.print(args[1]);
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(args[0]);
            File file = new File(args[1]);
            if (!file.exists()) {
                file.createNewFile();
            }
            fos = new FileOutputStream(file);

            int c ;
            while ((c = fis.read()) != -1){
                System.out.print(c);
                fos.write(c);
            }
        }finally { // always close streams to avoid resource leaks
            if(fis!=null){
                fis.close();
            }
            if ((fos!=null)){
                fos.close();
            }
        }
    }
}
