package hc;

import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes7.dex */
public final class y<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y<Object> f202669b = new y<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f202670a;

    public y(Object obj) {
        this.f202670a = obj;
    }

    @lc.e
    public static <T> y<T> a() {
        return (y<T>) f202669b;
    }

    @lc.e
    public static <T> y<T> b(@lc.e Throwable th) {
        io.reactivex.internal.functions.a.g(th, "error is null");
        return new y<>(NotificationLite.error(th));
    }

    @lc.e
    public static <T> y<T> c(@lc.e T t10) {
        io.reactivex.internal.functions.a.g(t10, "value is null");
        return new y<>(t10);
    }

    @lc.f
    public Throwable d() {
        Object obj = this.f202670a;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @lc.f
    public T e() {
        Object obj = this.f202670a;
        if (obj == null || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) this.f202670a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof y) {
            return io.reactivex.internal.functions.a.c(this.f202670a, ((y) obj).f202670a);
        }
        return false;
    }

    public boolean f() {
        return this.f202670a == null;
    }

    public boolean g() {
        return NotificationLite.isError(this.f202670a);
    }

    public boolean h() {
        Object obj = this.f202670a;
        return (obj == null || NotificationLite.isError(obj)) ? false : true;
    }

    public int hashCode() {
        Object obj = this.f202670a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f202670a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            return "OnErrorNotification[" + NotificationLite.getError(obj) + "]";
        }
        return "OnNextNotification[" + this.f202670a + "]";
    }
}
