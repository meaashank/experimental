package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1960k;
import androidx.compose.runtime.snapshots.InterfaceC1962m;
import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Z
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1985z1 implements InterfaceC1962m, kotlinx.coroutines.Z0<AbstractC1960k> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f100355b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AbstractC1960k f100356a;

    public C1985z1(@NotNull AbstractC1960k abstractC1960k) {
        this.f100356a = abstractC1960k;
    }

    @Override // kotlinx.coroutines.Z0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void u(@NotNull kotlin.coroutines.i iVar, @Nullable AbstractC1960k abstractC1960k) {
        this.f100356a.I(abstractC1960k);
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    public <R> R fold(R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) i.b.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @Nullable
    public <E extends i.b> E get(@NotNull i.c<E> cVar) {
        return (E) i.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.i.b
    @NotNull
    public i.c<?> getKey() {
        return InterfaceC1962m.f100187L2;
    }

    @Nullable
    public AbstractC1960k h(@NotNull kotlin.coroutines.i iVar) {
        return this.f100356a.s();
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i minusKey(@NotNull i.c<?> cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i plus(@NotNull kotlin.coroutines.i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // kotlinx.coroutines.Z0
    public AbstractC1960k z2(kotlin.coroutines.i iVar) {
        return this.f100356a.s();
    }
}
