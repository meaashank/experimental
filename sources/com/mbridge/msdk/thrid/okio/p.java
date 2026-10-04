package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    static o f159849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static long f159850b;

    private p() {
    }

    public static o a() {
        synchronized (p.class) {
            try {
                o oVar = f159849a;
                if (oVar == null) {
                    return new o();
                }
                f159849a = oVar.f159847f;
                oVar.f159847f = null;
                f159850b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(o oVar) {
        if (oVar.f159847f == null && oVar.f159848g == null) {
            if (oVar.f159845d) {
                return;
            }
            synchronized (p.class) {
                try {
                    long j10 = f159850b + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    if (j10 > 65536) {
                        return;
                    }
                    f159850b = j10;
                    oVar.f159847f = f159849a;
                    oVar.f159844c = 0;
                    oVar.f159843b = 0;
                    f159849a = oVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
