package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.AbstractC1739m;
import androidx.compose.runtime.InterfaceC1946s;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C1726g implements AbstractC1739m.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f91434e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ed.l<Integer, Object> f91435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.p<m, Integer, C1722c> f91436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ed.l<Integer, Object> f91437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ed.r<k, Integer, InterfaceC1946s, Integer, L0> f91438d;

    /* JADX WARN: Multi-variable type inference failed */
    public C1726g(@Nullable ed.l<? super Integer, ? extends Object> lVar, @NotNull ed.p<? super m, ? super Integer, C1722c> pVar, @NotNull ed.l<? super Integer, ? extends Object> lVar2, @NotNull ed.r<? super k, ? super Integer, ? super InterfaceC1946s, ? super Integer, L0> rVar) {
        this.f91435a = lVar;
        this.f91436b = pVar;
        this.f91437c = lVar2;
        this.f91438d = rVar;
    }

    @NotNull
    public final ed.r<k, Integer, InterfaceC1946s, Integer, L0> a() {
        return this.f91438d;
    }

    @NotNull
    public final ed.p<m, Integer, C1722c> b() {
        return this.f91436b;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC1739m.a
    @Nullable
    public ed.l<Integer, Object> getKey() {
        return this.f91435a;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC1739m.a
    @NotNull
    public ed.l<Integer, Object> getType() {
        return this.f91437c;
    }
}
