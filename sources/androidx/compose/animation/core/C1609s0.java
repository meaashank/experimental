package androidx.compose.animation.core;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C1609s0<T> implements F<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f88182b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88183a;

    public C1609s0() {
        this(0, 1, null);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C1609s0) && ((C1609s0) obj).f88183a == this.f88183a;
    }

    public final int f() {
        return this.f88183a;
    }

    public int hashCode() {
        return this.f88183a;
    }

    public C1609s0(int i10) {
        this.f88183a = i10;
    }

    @Override // androidx.compose.animation.core.U, androidx.compose.animation.core.InterfaceC1587h
    @NotNull
    public <V extends AbstractC1603p> O0<V> a(@NotNull H0<T, V> h02) {
        return new Y0(this.f88183a);
    }

    public /* synthetic */ C1609s0(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
