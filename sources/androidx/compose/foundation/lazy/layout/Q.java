package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.T1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
@dd.h
public final class Q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f91798a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Q(Object obj) {
        this.f91798a = obj;
    }

    public static final /* synthetic */ Q a(Object obj) {
        return new Q(obj);
    }

    @NotNull
    public static <T> Object b(T t10) {
        return t10;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof Q) && kotlin.jvm.internal.G.g(obj, ((Q) obj2).f91798a);
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.G.g(obj, obj2);
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String g(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public final T e() {
        return this.f91798a;
    }

    public boolean equals(Object obj) {
        return c(this.f91798a, obj);
    }

    public final /* synthetic */ Object h() {
        return this.f91798a;
    }

    public int hashCode() {
        return f(this.f91798a);
    }

    public String toString() {
        return g(this.f91798a);
    }
}
