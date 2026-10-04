package ic;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import kc.C4839a;

/* JADX INFO: renamed from: ic.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4601a implements io.reactivex.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f202918a = new AtomicBoolean();

    /* JADX INFO: renamed from: ic.a$a, reason: collision with other inner class name */
    public class RunnableC0756a implements Runnable {
        public RunnableC0756a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4601a.this.a();
        }
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }

    public abstract void a();

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        if (this.f202918a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a();
            } else {
                C4839a.b().e(new RunnableC0756a());
            }
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f202918a.get();
    }
}
