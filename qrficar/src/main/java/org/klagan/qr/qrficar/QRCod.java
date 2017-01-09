package org.klagan.qr.qrficar;

import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;

import java.io.*;

public class QRCod {

    public static void main(String... args){
        ByteArrayOutputStream bout =
            QRCode.from("https://www.k-lagan.com/").withSize(250, 250).to(ImageType.PNG).stream();

        try {
            OutputStream out = new FileOutputStream("/tmp/qr-code.png");
            bout.writeTo(out);
            out.flush();
            out.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

