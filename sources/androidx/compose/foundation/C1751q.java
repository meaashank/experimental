package androidx.compose.foundation;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.ui.graphics.AbstractC2131z0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C1751q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f92543c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f92544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AbstractC2131z0 f92545b;

    public /* synthetic */ C1751q(float f10, AbstractC2131z0 abstractC2131z0, C4969v c4969v) {
        this(f10, abstractC2131z0);
    }

    public static C1751q b(C1751q c1751q, float f10, AbstractC2131z0 abstractC2131z0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = c1751q.f92544a;
        }
        if ((i10 & 2) != 0) {
            abstractC2131z0 = c1751q.f92545b;
        }
        c1751q.getClass();
        return new C1751q(f10, abstractC2131z0);
    }

    @NotNull
    public final C1751q a(float f10, @NotNull AbstractC2131z0 abstractC2131z0) {
        return new C1751q(f10, abstractC2131z0);
    }

    @NotNull
    public final AbstractC2131z0 c() {
        return this.f92545b;
    }

    public final float d() {
        return this.f92544a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1751q)) {
            return false;
        }
        C1751q c1751q = (C1751q) obj;
        return k0.i.l(this.f92544a, c1751q.f92544a) && kotlin.jvm.internal.G.g(this.f92545b, c1751q.f92545b);
    }

    public int hashCode() {
        return this.f92545b.hashCode() + (Float.floatToIntBits(this.f92544a) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BorderStroke(width=");
        C1749o.a(this.f92544a, sb2, ", brush=");
        sb2.append(this.f92545b);
        sb2.append(')');
        return sb2.toString();
    }

    public C1751q(float f10, AbstractC2131z0 abstractC2131z0) {
        this.f92544a = f10;
        this.f92545b = abstractC2131z0;
    }
}
