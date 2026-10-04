package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.AbstractC1739m;
import androidx.compose.runtime.InterfaceC1946s;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class j implements AbstractC1739m.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f91516d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ed.l<Integer, Object> f91517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.l<Integer, Object> f91518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ed.r<c, Integer, InterfaceC1946s, Integer, L0> f91519c;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Nullable ed.l<? super Integer, ? extends Object> lVar, @NotNull ed.l<? super Integer, ? extends Object> lVar2, @NotNull ed.r<? super c, ? super Integer, ? super InterfaceC1946s, ? super Integer, L0> rVar) {
        this.f91517a = lVar;
        this.f91518b = lVar2;
        this.f91519c = rVar;
    }

    @NotNull
    public final ed.r<c, Integer, InterfaceC1946s, Integer, L0> a() {
        return this.f91519c;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC1739m.a
    @Nullable
    public ed.l<Integer, Object> getKey() {
        return this.f91517a;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC1739m.a
    @NotNull
    public ed.l<Integer, Object> getType() {
        return this.f91518b;
    }
}
