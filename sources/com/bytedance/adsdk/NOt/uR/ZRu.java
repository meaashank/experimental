package com.bytedance.adsdk.NOt.uR;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ZRu implements uR {
    private final HttpURLConnection ZRu;

    public ZRu(HttpURLConnection httpURLConnection) {
        this.ZRu = httpURLConnection;
    }

    @Override // com.bytedance.adsdk.NOt.uR.uR
    public InputStream NOt() throws IOException {
        return this.ZRu.getInputStream();
    }

    @Override // com.bytedance.adsdk.NOt.uR.uR
    public boolean ZRu() {
        try {
            return this.ZRu.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.ZRu.disconnect();
    }

    @Override // com.bytedance.adsdk.NOt.uR.uR
    public String mZ() {
        return this.ZRu.getContentType();
    }

    @Override // com.bytedance.adsdk.NOt.uR.uR
    public String uR() {
        try {
            if (ZRu()) {
                return null;
            }
            return "Unable to fetch " + this.ZRu.getURL() + ". Failed with " + this.ZRu.getResponseCode() + "\n" + ZRu(this.ZRu);
        } catch (IOException e10) {
            return e10.getMessage();
        }
    }

    private String ZRu(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }
}
