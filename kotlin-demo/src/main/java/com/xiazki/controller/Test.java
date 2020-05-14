package com.xiazki.controller;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;

public class Test {


    public static byte[] getRequestPostBytes(HttpServletRequest request)
            throws IOException {
        int contentLength = request.getContentLength();
        if (contentLength < 0) {
            return null;
        }
        byte buffer[] = new byte[contentLength];
        for (int i = 0; i < contentLength; ) {

            int readlen = request.getInputStream().read(buffer, i,
                    contentLength - i);
            if (readlen == -1) {
                break;
            }
            i += readlen;
        }
        return buffer;
    }

    public static byte[] get(HttpServletRequest request) {
        int contentLength = request.getContentLength();
        if (contentLength < 0) {
            return null;
        }
        byte buffer[] = new byte[contentLength];
        try (
                InputStream inputStream = request.getInputStream()

        ) {
            for (int i = 0; i < contentLength; ) {
                int readlen = inputStream.read(buffer, i, contentLength - i);
                if (readlen == -1) {
                    break;
                }
                i += readlen;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buffer;
    }

}
