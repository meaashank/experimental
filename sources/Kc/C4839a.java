package kc;

import android.os.Handler;
import android.os.Looper;
import hc.H;
import java.util.concurrent.Callable;
import jc.C4802a;

/* JADX INFO: renamed from: kc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4839a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f217423a = C4802a.f(new CallableC0819a());

    /* JADX INFO: renamed from: kc.a$a, reason: collision with other inner class name */
    public static class CallableC0819a implements Callable<H> {
        public H a() throws Exception {
            return b.f217424a;
        }

        @Override // java.util.concurrent.Callable
        public H call() throws Exception {
            return b.f217424a;
        }
    }

    /* JADX INFO: renamed from: kc.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final H f217424a = new C4840b(new Handler(Looper.getMainLooper()));
    }

    public C4839a() {
        throw new AssertionError("No instances.");
    }

    public static H a(Looper looper) {
        if (looper != null) {
            return new C4840b(new Handler(looper));
        }
        throw new NullPointerException("looper == null");
    }

    public static H b() {
        return C4802a.g(f217423a);
    }
}
