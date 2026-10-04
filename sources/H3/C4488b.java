package h3;

import android.net.Uri;

/* JADX INFO: renamed from: h3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4488b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f202389a = 512;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f202390b = 384;

    public static boolean a(Uri uri) {
        return c(uri) && uri.getPathSegments().contains("picker");
    }

    public static boolean b(Uri uri) {
        return c(uri) && !f(uri);
    }

    public static boolean c(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean d(Uri uri) {
        return c(uri) && f(uri);
    }

    public static boolean e(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    public static boolean f(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
