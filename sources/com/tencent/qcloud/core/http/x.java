package com.tencent.qcloud.core.http;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public abstract class x {

    public static final class a extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final okhttp3.t f194355a;

        public a(okhttp3.t tVar) {
            this.f194355a = tVar;
        }

        @Override // com.tencent.qcloud.core.http.x
        public okhttp3.t a() {
            return this.f194355a;
        }
    }

    public static x b(String str, byte[] bArr) {
        return c(str, bArr, 0L, -1L);
    }

    public static x c(String str, byte[] bArr, long j10, long j11) {
        if ((j11 < 0 ? ((long) bArr.length) - j10 : Math.min(j11, ((long) bArr.length) - j10)) < 204800) {
            return new a(okhttp3.t.f225839a.f(g(str), bArr));
        }
        return new a(C.u(bArr, str, j10, j11));
    }

    public static x d(String str, File file) {
        return e(str, file, 0L, -1L);
    }

    public static x e(String str, File file, long j10, long j11) {
        if (TextUtils.isEmpty(str)) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(yb.e.c(file.getPath()));
        }
        return new a(C.w(file, str, j10, j11));
    }

    public static x f(o oVar) {
        return new a(oVar);
    }

    public static okhttp3.q g(String str) {
        if (str != null) {
            return okhttp3.q.j(str);
        }
        return null;
    }

    public static x h(String str, File file, InputStream inputStream) {
        return i(str, file, inputStream, 0L, -1L);
    }

    public static x i(String str, File file, InputStream inputStream, long j10, long j11) {
        return new a(C.D(inputStream, file, str, j10, j11));
    }

    public static x j(String str, String str2) {
        return new a(okhttp3.t.f225839a.d(g(str), str2));
    }

    public static x k(String str, ByteString byteString) {
        return new a(okhttp3.t.f225839a.e(g(str), byteString));
    }

    public static x l(String str, Uri uri, Context context) {
        return m(str, uri, context, 0L, -1L);
    }

    public static x m(String str, Uri uri, Context context, long j10, long j11) {
        ContentResolver contentResolver = context.getContentResolver();
        if (TextUtils.isEmpty(str)) {
            str = contentResolver.getType(uri);
        }
        return new a(C.E(uri, contentResolver, str, j10, j11));
    }

    public static x n(String str, URL url) {
        return o(str, url, 0L, -1L);
    }

    public static x o(String str, URL url, long j10, long j11) {
        if (TextUtils.isEmpty(str)) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(url.toString()));
        }
        return new a(C.F(url, str, j10, j11));
    }

    public static x p(okhttp3.t tVar) {
        return new a(tVar);
    }

    public abstract okhttp3.t a();
}
