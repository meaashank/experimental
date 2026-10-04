package androidx.compose.foundation.text.selection;

import androidx.activity.C1477d;
import androidx.compose.foundation.text.selection.l;
import androidx.compose.ui.text.S;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f94987g = S.f104307g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f94991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f94992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final S f94993f;

    public k(long j10, int i10, int i11, int i12, int i13, @NotNull S s10) {
        this.f94988a = j10;
        this.f94989b = i10;
        this.f94990c = i11;
        this.f94991d = i12;
        this.f94992e = i13;
        this.f94993f = s10;
    }

    @NotNull
    public final l.a a(int i10) {
        return new l.a(SelectionLayoutKt.b(this.f94993f, i10), i10, this.f94988a);
    }

    public final ResolvedTextDirection b() {
        return SelectionLayoutKt.b(this.f94993f, this.f94991d);
    }

    @NotNull
    public final String c() {
        return this.f94993f.f104308a.f104296a.f104196a;
    }

    @NotNull
    public final CrossStatus d() {
        int i10 = this.f94990c;
        int i11 = this.f94991d;
        return i10 < i11 ? CrossStatus.NOT_CROSSED : i10 > i11 ? CrossStatus.CROSSED : CrossStatus.COLLAPSED;
    }

    public final int e() {
        return this.f94991d;
    }

    public final int f() {
        return this.f94992e;
    }

    public final int g() {
        return this.f94990c;
    }

    public final long h() {
        return this.f94988a;
    }

    public final int i() {
        return this.f94989b;
    }

    public final ResolvedTextDirection j() {
        return SelectionLayoutKt.b(this.f94993f, this.f94990c);
    }

    @NotNull
    public final S k() {
        return this.f94993f;
    }

    public final int l() {
        return c().length();
    }

    @NotNull
    public final l m(int i10, int i11) {
        return new l(a(i10), a(i11), i10 > i11);
    }

    public final boolean n(@NotNull k kVar) {
        return (this.f94988a == kVar.f94988a && this.f94990c == kVar.f94990c && this.f94991d == kVar.f94991d) ? false : true;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionInfo(id=");
        sb2.append(this.f94988a);
        sb2.append(", range=(");
        sb2.append(this.f94990c);
        sb2.append(SignatureVisitor.SUPER);
        sb2.append(j());
        sb2.append(',');
        sb2.append(this.f94991d);
        sb2.append(SignatureVisitor.SUPER);
        sb2.append(b());
        sb2.append("), prevOffset=");
        return C1477d.a(sb2, this.f94992e, ')');
    }
}
