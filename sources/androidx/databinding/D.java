package androidx.databinding;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class D<T> extends WeakReference<B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x<T> f112264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f112265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f112266c;

    public D(B b10, int i10, x<T> xVar, ReferenceQueue<B> referenceQueue) {
        super(b10, referenceQueue);
        this.f112265b = i10;
        this.f112264a = xVar;
    }

    @Nullable
    public B a() {
        B b10 = (B) get();
        if (b10 == null) {
            e();
        }
        return b10;
    }

    public T b() {
        return this.f112266c;
    }

    public void c(androidx.lifecycle.B b10) {
        this.f112264a.b(b10);
    }

    public void d(T t10) {
        e();
        this.f112266c = t10;
        if (t10 != null) {
            this.f112264a.e(t10);
        }
    }

    public boolean e() {
        boolean z10;
        T t10 = this.f112266c;
        if (t10 != null) {
            this.f112264a.d(t10);
            z10 = true;
        } else {
            z10 = false;
        }
        this.f112266c = null;
        return z10;
    }
}
