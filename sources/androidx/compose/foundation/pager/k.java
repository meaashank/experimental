package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.AbstractC1739m;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval$CC;
import androidx.compose.runtime.InterfaceC1946s;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class k implements AbstractC1739m.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f92499c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ed.l<Integer, Object> f92500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.r<r, Integer, InterfaceC1946s, Integer, L0> f92501b;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@Nullable ed.l<? super Integer, ? extends Object> lVar, @NotNull ed.r<? super r, ? super Integer, ? super InterfaceC1946s, ? super Integer, L0> rVar) {
        this.f92500a = lVar;
        this.f92501b = rVar;
    }

    @NotNull
    public final ed.r<r, Integer, InterfaceC1946s, Integer, L0> a() {
        return this.f92501b;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC1739m.a
    @Nullable
    public ed.l<Integer, Object> getKey() {
        return this.f92500a;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC1739m.a
    public /* synthetic */ ed.l getType() {
        return LazyLayoutIntervalContent$Interval$CC.b(this);
    }
}
