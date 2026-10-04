package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.L0;
import androidx.compose.runtime.L1;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final L0<kotlin.L0> f91551a;

    public /* synthetic */ K(L0 l02) {
        this.f91551a = l02;
    }

    public static final void a(L0<kotlin.L0> l02) {
        l02.getValue();
    }

    public static final /* synthetic */ K b(L0 l02) {
        return new K(l02);
    }

    @NotNull
    public static L0<kotlin.L0> c(@NotNull L0<kotlin.L0> l02) {
        return l02;
    }

    public static L0 d(L0 l02, int i10, C4969v c4969v) {
        return (i10 & 1) != 0 ? ActualAndroid_androidKt.e(kotlin.L0.f217464a, L1.a()) : l02;
    }

    public static boolean e(L0<kotlin.L0> l02, Object obj) {
        return (obj instanceof K) && kotlin.jvm.internal.G.g(l02, ((K) obj).f91551a);
    }

    public static final boolean f(L0<kotlin.L0> l02, L0<kotlin.L0> l03) {
        return kotlin.jvm.internal.G.g(l02, l03);
    }

    public static int g(L0<kotlin.L0> l02) {
        return l02.hashCode();
    }

    public static final void h(L0<kotlin.L0> l02) {
        l02.setValue(kotlin.L0.f217464a);
    }

    public static String i(L0<kotlin.L0> l02) {
        return "ObservableScopeInvalidator(state=" + l02 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f91551a, obj);
    }

    public int hashCode() {
        return this.f91551a.hashCode();
    }

    public final /* synthetic */ L0 j() {
        return this.f91551a;
    }

    public String toString() {
        return i(this.f91551a);
    }
}
