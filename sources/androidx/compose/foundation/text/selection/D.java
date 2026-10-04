package androidx.compose.foundation.text.selection;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.ui.graphics.K0;
import kotlin.B0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94673c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f94675b;

    public /* synthetic */ D(long j10, long j11, C4969v c4969v) {
        this(j10, j11);
    }

    public final long a() {
        return this.f94675b;
    }

    public final long b() {
        return this.f94674a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return K0.y(this.f94674a, d10.f94674a) && B0.p(this.f94675b, d10.f94675b);
    }

    public int hashCode() {
        return C1550p.a(this.f94675b) + (K0.K(this.f94674a) * 31);
    }

    @NotNull
    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) K0.L(this.f94674a)) + ", selectionBackgroundColor=" + ((Object) K0.L(this.f94675b)) + ')';
    }

    public D(long j10, long j11) {
        this.f94674a = j10;
        this.f94675b = j11;
    }
}
