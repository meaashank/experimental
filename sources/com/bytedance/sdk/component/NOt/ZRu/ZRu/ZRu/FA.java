package com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu;

import com.bytedance.sdk.component.NOt.ZRu.yBV;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class FA extends yBV {
    InputStream NOt;
    HttpURLConnection ZRu;

    public FA(HttpURLConnection httpURLConnection) throws IOException {
        this.ZRu = httpURLConnection;
        this.NOt = new Ht(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.yBV
    public String NOt() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.NOt));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    close();
                    return string;
                }
                stringBuffer.append(line + "\n");
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.yBV
    public com.bytedance.sdk.component.NOt.ZRu.Vor TFq() {
        if (this.ZRu.getContentType() != null) {
            return com.bytedance.sdk.component.NOt.ZRu.Vor.ZRu(this.ZRu.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.yBV
    public long ZRu() {
        try {
            return this.ZRu.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.yBV, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.NOt.close();
            this.ZRu.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.yBV
    public InputStream mZ() {
        return this.NOt;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.yBV
    public byte[] uR() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i10 = this.NOt.read(bArr);
                if (i10 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public FA(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.ZRu = httpURLConnection;
        this.NOt = new Ht(inputStream, httpURLConnection);
    }
}
