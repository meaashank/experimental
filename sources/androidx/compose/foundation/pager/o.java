package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.AbstractC1739m;
import androidx.compose.foundation.lazy.layout.I;
import androidx.compose.foundation.lazy.layout.InterfaceC1730d;
import androidx.compose.runtime.InterfaceC1946s;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC1739m<k> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.r<r, Integer, InterfaceC1946s, Integer, L0> f92502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ed.l<Integer, Object> f92503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f92504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC1730d<k> f92505e;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull ed.r<? super r, ? super Integer, ? super InterfaceC1946s, ? super Integer, L0> rVar, @Nullable ed.l<? super Integer, ? extends Object> lVar, int i10) {
        this.f92502b = rVar;
        this.f92503c = lVar;
        this.f92504d = i10;
        I i11 = new I();
        i11.b(i10, new k(lVar, rVar));
        this.f92505e = i11;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC1739m
    @NotNull
    public InterfaceC1730d<k> k() {
        return this.f92505e;
    }

    @Nullable
    public final ed.l<Integer, Object> o() {
        return this.f92503c;
    }

    @NotNull
    public final ed.r<r, Integer, InterfaceC1946s, Integer, L0> p() {
        return this.f92502b;
    }

    public final int q() {
        return this.f92504d;
    }
}
