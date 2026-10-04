package androidx.compose.ui.text.input;

import androidx.compose.animation.C1635o;
import androidx.compose.runtime.InterfaceC1924k0;
import h0.C4481i;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f104831i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f104835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f104836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f104837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final O f104838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C4481i f104839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f104830h = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final r f104832j = new r(false, 0, false, 0, 0, null, null, 127, null);

    public static final class a {
        public a() {
        }

        @NotNull
        public final r a() {
            return r.f104832j;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ r(boolean z10, int i10, boolean z11, int i11, int i12, O o10, C4481i c4481i, C4969v c4969v) {
        this(z10, i10, z11, i11, i12, o10, c4481i);
    }

    public static /* synthetic */ r c(r rVar, boolean z10, int i10, boolean z11, int i11, int i12, O o10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = rVar.f104833a;
        }
        if ((i13 & 2) != 0) {
            i10 = rVar.f104834b;
        }
        if ((i13 & 4) != 0) {
            z11 = rVar.f104835c;
        }
        if ((i13 & 8) != 0) {
            i11 = rVar.f104836d;
        }
        if ((i13 & 16) != 0) {
            i12 = rVar.f104837e;
        }
        if ((i13 & 32) != 0) {
            o10 = rVar.f104838f;
        }
        int i14 = i12;
        O o11 = o10;
        return rVar.b(z10, i10, z11, i11, i14, o11);
    }

    public static /* synthetic */ r e(r rVar, boolean z10, int i10, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = rVar.f104833a;
        }
        if ((i13 & 2) != 0) {
            i10 = rVar.f104834b;
        }
        if ((i13 & 4) != 0) {
            z11 = rVar.f104835c;
        }
        if ((i13 & 8) != 0) {
            i11 = rVar.f104836d;
        }
        if ((i13 & 16) != 0) {
            i12 = rVar.f104837e;
        }
        int i14 = i12;
        boolean z12 = z11;
        return rVar.d(z10, i10, z12, i11, i14);
    }

    public static r g(r rVar, boolean z10, int i10, boolean z11, int i11, int i12, O o10, C4481i c4481i, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = rVar.f104833a;
        }
        if ((i13 & 2) != 0) {
            i10 = rVar.f104834b;
        }
        if ((i13 & 4) != 0) {
            z11 = rVar.f104835c;
        }
        if ((i13 & 8) != 0) {
            i11 = rVar.f104836d;
        }
        if ((i13 & 16) != 0) {
            i12 = rVar.f104837e;
        }
        if ((i13 & 32) != 0) {
            o10 = rVar.f104838f;
        }
        if ((i13 & 64) != 0) {
            c4481i = rVar.f104839g;
        }
        C4481i c4481i2 = c4481i;
        rVar.getClass();
        O o11 = o10;
        int i14 = i12;
        boolean z12 = z11;
        return new r(z10, i10, z12, i11, i14, o11, c4481i2);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional hintLocales parameter.")
    public final /* synthetic */ r b(boolean z10, int i10, boolean z11, int i11, int i12, O o10) {
        return new r(z10, i10, z11, i11, i12, o10, this.f104839g);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    public final /* synthetic */ r d(boolean z10, int i10, boolean z11, int i11, int i12) {
        return new r(z10, i10, z11, i11, i12, this.f104838f, this.f104839g);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f104833a == rVar.f104833a && this.f104834b == rVar.f104834b && this.f104835c == rVar.f104835c && this.f104836d == rVar.f104836d && this.f104837e == rVar.f104837e && kotlin.jvm.internal.G.g(this.f104838f, rVar.f104838f) && kotlin.jvm.internal.G.g(this.f104839g, rVar.f104839g);
    }

    @NotNull
    public final r f(boolean z10, int i10, boolean z11, int i11, int i12, @Nullable O o10, @NotNull C4481i c4481i) {
        return new r(z10, i10, z11, i11, i12, o10, c4481i);
    }

    public final boolean h() {
        return this.f104835c;
    }

    public int hashCode() {
        int iA = (((((C1635o.a(this.f104835c) + (((C1635o.a(this.f104833a) * 31) + this.f104834b) * 31)) * 31) + this.f104836d) * 31) + this.f104837e) * 31;
        O o10 = this.f104838f;
        return this.f104839g.f202385a.hashCode() + ((iA + (o10 != null ? o10.hashCode() : 0)) * 31);
    }

    public final int i() {
        return this.f104834b;
    }

    @NotNull
    public final C4481i j() {
        return this.f104839g;
    }

    public final int k() {
        return this.f104837e;
    }

    public final int l() {
        return this.f104836d;
    }

    @Nullable
    public final O m() {
        return this.f104838f;
    }

    public final boolean n() {
        return this.f104833a;
    }

    @NotNull
    public String toString() {
        return "ImeOptions(singleLine=" + this.f104833a + ", capitalization=" + ((Object) C2353w.k(this.f104834b)) + ", autoCorrect=" + this.f104835c + ", keyboardType=" + ((Object) C2354x.p(this.f104836d)) + ", imeAction=" + ((Object) C2348q.o(this.f104837e)) + ", platformImeOptions=" + this.f104838f + ", hintLocales=" + this.f104839g + ')';
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional hintLocales parameter.")
    public /* synthetic */ r(boolean z10, int i10, boolean z11, int i11, int i12, O o10, C4969v c4969v) {
        this(z10, i10, z11, i11, i12, o10);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ r(boolean z10, int i10, boolean z11, int i11, int i12, C4969v c4969v) {
        this(z10, i10, z11, i11, i12);
    }

    public r(boolean z10, int i10, boolean z11, int i11, int i12, O o10, C4481i c4481i) {
        this.f104833a = z10;
        this.f104834b = i10;
        this.f104835c = z11;
        this.f104836d = i11;
        this.f104837e = i12;
        this.f104838f = o10;
        this.f104839g = c4481i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(boolean z10, int i10, boolean z11, int i11, int i12, O o10, C4481i c4481i, int i13, C4969v c4969v) {
        z10 = (i13 & 1) != 0 ? false : z10;
        if ((i13 & 2) != 0) {
            C2353w.f104840b.getClass();
            i10 = C2353w.f104842d;
        }
        z11 = (i13 & 4) != 0 ? true : z11;
        if ((i13 & 8) != 0) {
            C2354x.f104847b.getClass();
            i11 = C2354x.f104849d;
        }
        if ((i13 & 16) != 0) {
            C2348q.f104819b.getClass();
            i12 = C2348q.f104821d;
        }
        o10 = (i13 & 32) != 0 ? null : o10;
        if ((i13 & 64) != 0) {
            C4481i.f202382c.getClass();
            c4481i = C4481i.f202384e;
        }
        C4481i c4481i2 = c4481i;
        int i14 = i12;
        this(z10, i10, z11, i11, i14, o10, c4481i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(boolean z10, int i10, boolean z11, int i11, int i12, O o10, int i13, C4969v c4969v) {
        z10 = (i13 & 1) != 0 ? false : z10;
        if ((i13 & 2) != 0) {
            C2353w.f104840b.getClass();
            i10 = C2353w.f104842d;
        }
        z11 = (i13 & 4) != 0 ? true : z11;
        if ((i13 & 8) != 0) {
            C2354x.f104847b.getClass();
            i11 = C2354x.f104849d;
        }
        if ((i13 & 16) != 0) {
            C2348q.f104819b.getClass();
            i12 = C2348q.f104821d;
        }
        this(z10, i10, z11, i11, i12, (i13 & 32) != 0 ? null : o10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(boolean z10, int i10, boolean z11, int i11, int i12, O o10) {
        this(z10, i10, z11, i11, i12, o10, C4481i.f202384e);
        C4481i.f202382c.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(boolean z10, int i10, boolean z11, int i11, int i12, int i13, C4969v c4969v) {
        z10 = (i13 & 1) != 0 ? false : z10;
        if ((i13 & 2) != 0) {
            C2353w.f104840b.getClass();
            i10 = C2353w.f104842d;
        }
        z11 = (i13 & 4) != 0 ? true : z11;
        if ((i13 & 8) != 0) {
            C2354x.f104847b.getClass();
            i11 = C2354x.f104849d;
        }
        if ((i13 & 16) != 0) {
            C2348q.f104819b.getClass();
            i12 = C2348q.f104821d;
        }
        int i14 = i12;
        this(z10, i10, z11, i11, i14);
    }

    public r(boolean z10, int i10, boolean z11, int i11, int i12) {
        this(z10, i10, z11, i11, i12, null, null, 64, null);
    }
}
