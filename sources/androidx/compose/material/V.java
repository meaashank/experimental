package androidx.compose.material;

import androidx.compose.runtime.InterfaceC1924k0;
import k0.InterfaceC4814e;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@P
@InterfaceC1924k0
@InterfaceC4982o(message = SwipeableKt.f97668a)
public final class V implements M0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f98516b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f98517a;

    public /* synthetic */ V(float f10, C4969v c4969v) {
        this(f10);
    }

    public static V d(V v10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = v10.f98517a;
        }
        v10.getClass();
        return new V(f10);
    }

    @Override // androidx.compose.material.M0
    public float a(@NotNull InterfaceC4814e interfaceC4814e, float f10, float f11) {
        return (Math.signum(f11 - f10) * interfaceC4814e.l2(this.f98517a)) + f10;
    }

    public final float b() {
        return this.f98517a;
    }

    @NotNull
    public final V c(float f10) {
        return new V(f10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof V) && k0.i.l(this.f98517a, ((V) obj).f98517a);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f98517a);
    }

    @NotNull
    public String toString() {
        return "FixedThreshold(offset=" + ((Object) k0.i.u(this.f98517a)) + ')';
    }

    public V(float f10) {
        this.f98517a = f10;
    }
}
