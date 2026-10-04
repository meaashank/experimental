package kotlinx.coroutines.internal;

import kotlinx.coroutines.Z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final kotlin.coroutines.i f220328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object[] f220329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Z0<Object>[] f220330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f220331d;

    public c0(@NotNull kotlin.coroutines.i iVar, int i10) {
        this.f220328a = iVar;
        this.f220329b = new Object[i10];
        this.f220330c = new Z0[i10];
    }

    public final void a(@NotNull Z0<?> z02, @Nullable Object obj) {
        Object[] objArr = this.f220329b;
        int i10 = this.f220331d;
        objArr[i10] = obj;
        Z0<Object>[] z0Arr = this.f220330c;
        this.f220331d = i10 + 1;
        kotlin.jvm.internal.G.n(z02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        z0Arr[i10] = z02;
    }

    public final void b(@NotNull kotlin.coroutines.i iVar) {
        int length = this.f220330c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            Z0<Object> z02 = this.f220330c[length];
            kotlin.jvm.internal.G.m(z02);
            z02.u(iVar, this.f220329b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
