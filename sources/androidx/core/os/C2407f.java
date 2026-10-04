package androidx.core.os;

import android.os.CancellationSignal;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: androidx.core.os.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C2407f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f111290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f111291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f111292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f111293d;

    /* JADX INFO: renamed from: androidx.core.os.f$a */
    public interface a {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f111290a) {
                    return;
                }
                this.f111290a = true;
                this.f111293d = true;
                a aVar = this.f111291b;
                Object obj = this.f111292c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f111293d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f111293d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    @Nullable
    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f111292c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f111292c = cancellationSignal;
                    if (this.f111290a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f111292c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public boolean c() {
        boolean z10;
        synchronized (this) {
            z10 = this.f111290a;
        }
        return z10;
    }

    public void d(@Nullable a aVar) {
        synchronized (this) {
            try {
                f();
                if (this.f111291b == aVar) {
                    return;
                }
                this.f111291b = aVar;
                if (this.f111290a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }

    public void e() {
        if (c()) {
            throw new OperationCanceledException();
        }
    }

    public final void f() {
        while (this.f111293d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
