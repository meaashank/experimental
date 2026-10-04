package dagger.internal;

import java.lang.ref.WeakReference;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
@f
public final class l<T> implements Provider<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f194932d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ boolean f194933e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<T> f194934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f194935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile WeakReference<T> f194936c;

    public l(Provider<T> provider) {
        this.f194934a = provider;
    }

    public static <T> l<T> a(Provider<T> delegate, ReferenceReleasingProviderManager references) {
        delegate.getClass();
        l<T> lVar = new l<>(delegate);
        references.e(lVar);
        return lVar;
    }

    public final Object b() {
        Object obj = this.f194935b;
        if (obj != null) {
            return obj;
        }
        if (this.f194936c != null) {
            return this.f194936c.get();
        }
        return null;
    }

    public void c() {
        Object obj = this.f194935b;
        if (obj == null || obj == f194932d) {
            return;
        }
        synchronized (this) {
            this.f194936c = new WeakReference<>(obj);
            this.f194935b = null;
        }
    }

    public void d() {
        T t10;
        Object obj = this.f194935b;
        if (this.f194936c == null || obj != null) {
            return;
        }
        synchronized (this) {
            try {
                Object obj2 = this.f194935b;
                if (this.f194936c != null && obj2 == null && (t10 = this.f194936c.get()) != null) {
                    this.f194935b = t10;
                    this.f194936c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // javax.inject.Provider
    public T get() {
        T tB = (T) b();
        if (tB == null) {
            synchronized (this) {
                try {
                    tB = b();
                    if (tB == null) {
                        tB = this.f194934a.get();
                        if (tB == null) {
                            tB = (T) f194932d;
                        }
                        this.f194935b = tB;
                    }
                } finally {
                }
            }
        }
        if (tB == f194932d) {
            return null;
        }
        return (T) tB;
    }
}
