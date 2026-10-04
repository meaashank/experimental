package com.prism.commons.utils;

import android.util.Log;
import com.prism.commons.exception.BadStrEncodeException;
import com.prism.commons.exception.GaiaRuntimeException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: com.prism.commons.utils.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3860y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162168a = "y";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f162169b = "SHA-1";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f162170c = "MD5";

    public static byte[] a(File file) throws IOException {
        return C3843g.l(d(file), false);
    }

    public static byte[] b(byte[] bArr) {
        return c(bArr, 0);
    }

    public static byte[] c(byte[] bArr, int i10) {
        return C3843g.l(f(bArr, i10), false);
    }

    public static long d(File file) throws IOException {
        Adler32 adler32 = new Adler32();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = fileInputStream.read(bArr);
            if (i10 <= 0) {
                fileInputStream.close();
                return adler32.getValue();
            }
            adler32.update(bArr, 0, i10);
        }
    }

    public static long e(byte[] bArr) {
        return f(bArr, 0);
    }

    public static long f(byte[] bArr, int i10) {
        Adler32 adler32 = new Adler32();
        adler32.update(bArr, i10, bArr.length - i10);
        return adler32.getValue();
    }

    public static byte[] g(File file) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    fileInputStream.close();
                    return messageDigest.digest();
                }
                messageDigest.update(bArr, 0, i10);
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new GaiaRuntimeException(e10);
        }
    }

    public static byte[] h(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e10) {
            throw new GaiaRuntimeException(e10);
        }
    }

    public static String i(File file) throws IOException {
        return C3843g.a(g(file));
    }

    public static String j(String str) throws BadStrEncodeException {
        return l(C3843g.j(str));
    }

    public static String k(String str, Charset charset) throws BadStrEncodeException {
        return l(C3843g.k(str, charset));
    }

    public static String l(byte[] bArr) {
        return C3843g.a(h(bArr));
    }

    public static String m(String str) {
        try {
            return j(str);
        } catch (Throwable th) {
            Log.e(f162168a, th.getMessage(), th);
            return Integer.toString(str.hashCode());
        }
    }

    public static byte[] n(File file) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(f162169b);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    fileInputStream.close();
                    return messageDigest.digest();
                }
                messageDigest.update(bArr, 0, i10);
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new GaiaRuntimeException(e10);
        }
    }

    public static byte[] o(byte[] bArr) {
        return p(bArr, 0);
    }

    public static byte[] p(byte[] bArr, int i10) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(f162169b);
            messageDigest.update(bArr, i10, bArr.length - i10);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e10) {
            throw new GaiaRuntimeException(e10);
        }
    }

    public static String q(File file) throws IOException {
        return C3843g.a(n(file));
    }

    public static String r(String str) throws BadStrEncodeException {
        return t(C3843g.j(str));
    }

    public static String s(String str, Charset charset) throws BadStrEncodeException {
        return t(C3843g.k(str, charset));
    }

    public static String t(byte[] bArr) {
        return C3843g.a(p(bArr, 0));
    }
}
