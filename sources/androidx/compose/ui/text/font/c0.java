package androidx.compose.ui.text.font;

import androidx.compose.ui.text.InterfaceC2331i;
import androidx.compose.ui.text.font.K;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class c0 implements InterfaceC2324v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f104606h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f104607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final L f104608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f104609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final K.e f104610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f104611g;

    public /* synthetic */ c0(int i10, L l10, int i11, @InterfaceC2331i K.e eVar, int i12, C4969v c4969v) {
        this(i10, l10, i11, eVar, i12);
    }

    public static c0 d(c0 c0Var, int i10, L l10, int i11, int i12, K.e eVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = c0Var.f104607c;
        }
        if ((i13 & 2) != 0) {
            l10 = c0Var.f104608d;
        }
        if ((i13 & 4) != 0) {
            i11 = c0Var.f104609e;
        }
        if ((i13 & 8) != 0) {
            i12 = c0Var.f104611g;
        }
        int i14 = i12;
        if ((i13 & 16) != 0) {
            eVar = c0Var.f104610f;
        }
        K.e eVar2 = eVar;
        c0Var.getClass();
        int i15 = i11;
        return new c0(i10, l10, i15, eVar2, i14);
    }

    public static c0 f(c0 c0Var, int i10, L l10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = c0Var.f104607c;
        }
        if ((i12 & 2) != 0) {
            l10 = c0Var.f104608d;
        }
        if ((i12 & 4) != 0) {
            i11 = c0Var.f104609e;
        }
        return c0Var.e(i10, l10, i11);
    }

    @InterfaceC2331i
    public static /* synthetic */ void g() {
    }

    @Override // androidx.compose.ui.text.font.InterfaceC2324v
    @InterfaceC2331i
    public int a() {
        return this.f104611g;
    }

    @Override // androidx.compose.ui.text.font.InterfaceC2324v
    public int b() {
        return this.f104609e;
    }

    @InterfaceC2331i
    @NotNull
    public final c0 c(int i10, @NotNull L l10, int i11, int i12, @NotNull K.e eVar) {
        return new c0(i10, l10, i11, eVar, i12);
    }

    @NotNull
    public final c0 e(int i10, @NotNull L l10, int i11) {
        return d(this, i10, l10, i11, this.f104611g, null, 16, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f104607c == c0Var.f104607c && kotlin.jvm.internal.G.g(this.f104608d, c0Var.f104608d) && this.f104609e == c0Var.f104609e && kotlin.jvm.internal.G.g(this.f104610f, c0Var.f104610f) && this.f104611g == c0Var.f104611g;
    }

    @Override // androidx.compose.ui.text.font.InterfaceC2324v
    @NotNull
    public L getWeight() {
        return this.f104608d;
    }

    public final int h() {
        return this.f104607c;
    }

    public int hashCode() {
        return this.f104610f.f104549a.hashCode() + (((((((this.f104607c * 31) + this.f104608d.f104572a) * 31) + this.f104609e) * 31) + this.f104611g) * 31);
    }

    @InterfaceC2331i
    @NotNull
    public final K.e i() {
        return this.f104610f;
    }

    @NotNull
    public String toString() {
        return "ResourceFont(resId=" + this.f104607c + ", weight=" + this.f104608d + ", style=" + ((Object) H.i(this.f104609e)) + ", loadingStrategy=" + ((Object) F.j(this.f104611g)) + ')';
    }

    public c0(int i10, L l10, int i11, K.e eVar, int i12) {
        this.f104607c = i10;
        this.f104608d = l10;
        this.f104609e = i11;
        this.f104610f = eVar;
        this.f104611g = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(int i10, L l10, int i11, K.e eVar, int i12, int i13, C4969v c4969v) {
        if ((i13 & 2) != 0) {
            L.f104551b.getClass();
            l10 = L.f104565p;
        }
        L l11 = l10;
        if ((i13 & 4) != 0) {
            H.f104527b.getClass();
            i11 = H.f104528c;
        }
        int i14 = i11;
        K.e eVarB = (i13 & 8) != 0 ? K.f104537a.b(l11, i14, new K.a[0]) : eVar;
        if ((i13 & 16) != 0) {
            F.f104479b.getClass();
            i12 = F.f104482e;
        }
        this(i10, l11, i14, eVarB, i12);
    }
}
