package com.prism.commons.utils;

import android.text.TextUtils;
import android.util.Base64;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.prism.commons.utils.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3844h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f162104a = 11;

    public static byte[] a(byte[] bArr) {
        return Base64.encode(bArr, 11);
    }

    public static String b(String str) {
        return c(str, C3843g.f162097a);
    }

    public static String c(String str, Charset charset) {
        return TextUtils.isEmpty(str) ? "" : new String(Base64.encode(str.getBytes(charset), 11), charset);
    }

    public static byte[] d(byte[] bArr) {
        return Base64.decode(bArr, 11);
    }

    public static String e(String str) {
        return f(str, C3843g.f162097a);
    }

    public static String f(String str, Charset charset) {
        return TextUtils.isEmpty(str) ? "" : new String(Base64.decode(str.getBytes(charset), 11), charset);
    }
}
