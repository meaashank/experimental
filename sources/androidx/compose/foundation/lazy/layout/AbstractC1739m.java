package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.AbstractC1739m.a;
import androidx.compose.foundation.lazy.layout.InterfaceC1730d;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.L
@V({"SMAP\nLazyLayoutIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,85:1\n60#1,3:86\n60#1,3:89\n*S KotlinDebug\n*F\n+ 1 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n40#1:86,3\n48#1:89,3\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 2)
public abstract class AbstractC1739m<Interval extends a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f91840a = 0;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.m$a */
    @androidx.compose.foundation.L
    public interface a {
        @Nullable
        ed.l<Integer, Object> getKey();

        @NotNull
        ed.l<Integer, Object> getType();
    }

    @Nullable
    public final Object j(int i10) {
        InterfaceC1730d.a<Interval> aVar = k().get(i10);
        return aVar.f91817c.getType().invoke(Integer.valueOf(i10 - aVar.f91815a));
    }

    @NotNull
    public abstract InterfaceC1730d<Interval> k();

    public final int l() {
        return k().getSize();
    }

    @NotNull
    public final Object m(int i10) {
        Object objInvoke;
        InterfaceC1730d.a<Interval> aVar = k().get(i10);
        int i11 = i10 - aVar.f91815a;
        ed.l<Integer, Object> key = aVar.f91817c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i11))) == null) ? new DefaultLazyKey(i10) : objInvoke;
    }

    public final <T> T n(int i10, @NotNull ed.p<? super Integer, ? super Interval, ? extends T> pVar) {
        InterfaceC1730d.a<Interval> aVar = k().get(i10);
        return pVar.invoke(Integer.valueOf(i10 - aVar.f91815a), aVar.f91817c);
    }
}
