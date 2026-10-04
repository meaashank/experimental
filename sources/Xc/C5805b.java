package xc;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import wc.C5774a;
import zc.W;

/* JADX INFO: renamed from: xc.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5805b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W f240594a = C5774a.f(new CallableC5804a());

    /* JADX INFO: renamed from: xc.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final W f240595a = new C5806c(new Handler(Looper.getMainLooper()), true);
    }

    public C5805b() {
        throw new AssertionError("No instances.");
    }

    public static W b(Looper looper) {
        return c(looper, true);
    }

    @SuppressLint({"NewApi"})
    public static W c(Looper looper, boolean z10) {
        if (looper != null) {
            return new C5806c(new Handler(looper), z10);
        }
        throw new NullPointerException("looper == null");
    }

    public static W d() {
        return C5774a.g(f240594a);
    }
}
