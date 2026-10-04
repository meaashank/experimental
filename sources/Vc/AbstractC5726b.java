package vc;

import android.os.Looper;
import io.reactivex.rxjava3.disposables.d;
import java.util.concurrent.atomic.AtomicBoolean;
import xc.C5805b;

/* JADX INFO: renamed from: vc.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC5726b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f239955a = new AtomicBoolean();

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }

    public abstract void a();

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        if (this.f239955a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a();
            } else {
                C5805b.d().e(new Runnable() { // from class: vc.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f239954a.a();
                    }
                });
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean isDisposed() {
        return this.f239955a.get();
    }
}
