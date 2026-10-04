package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C2094p2 extends Q2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Q2 f101366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f101367c;

    public /* synthetic */ C2094p2(Q2 q22, long j10, C4969v c4969v) {
        this(q22, j10);
    }

    @Override // androidx.compose.ui.graphics.Q2
    @e.T(31)
    @NotNull
    public RenderEffect b() {
        return W2.f100889a.b(this.f101366b, this.f101367c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2094p2)) {
            return false;
        }
        C2094p2 c2094p2 = (C2094p2) obj;
        return kotlin.jvm.internal.G.g(this.f101366b, c2094p2.f101366b) && P.g.l(this.f101367c, c2094p2.f101367c);
    }

    public int hashCode() {
        Q2 q22 = this.f101366b;
        return C1550p.a(this.f101367c) + ((q22 != null ? q22.hashCode() : 0) * 31);
    }

    @NotNull
    public String toString() {
        return "OffsetEffect(renderEffect=" + this.f101366b + ", offset=" + ((Object) P.g.y(this.f101367c)) + ')';
    }

    public C2094p2(Q2 q22, long j10) {
        this.f101366b = q22;
        this.f101367c = j10;
    }
}
