package com.prism.hider.utils;

import ia.C4599a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f168359a = 400;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f168360b = 50;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte f168361c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte f168362d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte f168363e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte f168364f = 3;

    public static byte[] a(byte[] bArr) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d(byteArrayInputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        byteArrayInputStream.close();
        return byteArray;
    }

    public static byte[] b(byte[] bArr) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        e(byteArrayInputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        byteArrayInputStream.close();
        return byteArray;
    }

    public static String c(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return C4599a.b(byteArrayOutputStream.toByteArray());
    }

    public static void d(InputStream inputStream, OutputStream outputStream) throws Exception {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        byte[] bArr = new byte[400];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 400);
            if (i10 == -1) {
                gZIPOutputStream.finish();
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                return;
            }
            gZIPOutputStream.write(bArr, 0, i10);
        }
    }

    public static void e(InputStream inputStream, OutputStream outputStream) throws Exception {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        byte[] bArr = new byte[400];
        while (true) {
            int i10 = gZIPInputStream.read(bArr, 0, 400);
            if (i10 == -1) {
                gZIPInputStream.close();
                return;
            }
            outputStream.write(bArr, 0, i10);
        }
    }

    public static String f(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(C4599a.a(str)));
        byte[] bArr = new byte[256];
        while (true) {
            int i10 = gZIPInputStream.read(bArr);
            if (i10 < 0) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }
}
