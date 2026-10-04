package zc;

import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class K<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K<Object> f241332b = new K<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f241333a;

    public K(@yc.f Object value) {
        this.f241333a = value;
    }

    @yc.e
    public static <T> K<T> a() {
        return (K<T>) f241332b;
    }

    @yc.e
    public static <T> K<T> b(@yc.e Throwable error) {
        Objects.requireNonNull(error, "error is null");
        return new K<>(NotificationLite.error(error));
    }

    @yc.e
    public static <T> K<T> c(T value) {
        Objects.requireNonNull(value, "value is null");
        return new K<>(value);
    }

    @yc.f
    public Throwable d() {
        Object obj = this.f241333a;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @yc.f
    public T e() {
        Object obj = this.f241333a;
        if (obj == null || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) this.f241333a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof K) {
            return Objects.equals(this.f241333a, ((K) obj).f241333a);
        }
        return false;
    }

    public boolean f() {
        return this.f241333a == null;
    }

    public boolean g() {
        return NotificationLite.isError(this.f241333a);
    }

    public boolean h() {
        Object obj = this.f241333a;
        return (obj == null || NotificationLite.isError(obj)) ? false : true;
    }

    public int hashCode() {
        Object obj = this.f241333a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f241333a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            return "OnErrorNotification[" + NotificationLite.getError(obj) + "]";
        }
        return "OnNextNotification[" + this.f241333a + "]";
    }
}
