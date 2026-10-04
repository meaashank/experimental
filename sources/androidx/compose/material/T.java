package androidx.compose.material;

import androidx.compose.runtime.InterfaceC1946s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class T<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f97844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.q<ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0>, InterfaceC1946s, Integer, kotlin.L0> f97845b;

    /* JADX WARN: Multi-variable type inference failed */
    public T(T t10, @NotNull ed.q<? super ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0>, ? super InterfaceC1946s, ? super Integer, kotlin.L0> qVar) {
        this.f97844a = t10;
        this.f97845b = qVar;
    }

    public static T d(T t10, Object obj, ed.q qVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = t10.f97844a;
        }
        if ((i10 & 2) != 0) {
            qVar = t10.f97845b;
        }
        t10.getClass();
        return new T(obj, qVar);
    }

    public final T a() {
        return this.f97844a;
    }

    @NotNull
    public final ed.q<ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0>, InterfaceC1946s, Integer, kotlin.L0> b() {
        return this.f97845b;
    }

    @NotNull
    public final T<T> c(T t10, @NotNull ed.q<? super ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0>, ? super InterfaceC1946s, ? super Integer, kotlin.L0> qVar) {
        return new T<>(t10, qVar);
    }

    public final T e() {
        return this.f97844a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        return kotlin.jvm.internal.G.g(this.f97844a, t10.f97844a) && kotlin.jvm.internal.G.g(this.f97845b, t10.f97845b);
    }

    @NotNull
    public final ed.q<ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0>, InterfaceC1946s, Integer, kotlin.L0> f() {
        return this.f97845b;
    }

    public int hashCode() {
        T t10 = this.f97844a;
        return this.f97845b.hashCode() + ((t10 == null ? 0 : t10.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f97844a + ", transition=" + this.f97845b + ')';
    }
}
