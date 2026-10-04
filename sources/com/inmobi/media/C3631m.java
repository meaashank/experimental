package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import java.io.BufferedOutputStream;
import java.io.File;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: com.inmobi.media.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3631m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f153119b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z0 f153120a;

    public C3631m(Z0 mResultListener) {
        kotlin.jvm.internal.G.p(mResultListener, "mResultListener");
        this.f153120a = mResultListener;
    }

    public static void a(File file, HttpURLConnection httpURLConnection, BufferedOutputStream bufferedOutputStream) {
        try {
            if (file.exists()) {
                file.delete();
            }
            httpURLConnection.disconnect();
            C3473a9.a(bufferedOutputStream);
        } catch (Exception e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }
}
