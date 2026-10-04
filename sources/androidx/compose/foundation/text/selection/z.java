package androidx.compose.foundation.text.selection;

import androidx.collection.AbstractC1523b0;
import androidx.collection.C1525c0;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class z implements u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f95039f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f95040g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f95041h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f95042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final l f95045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final k f95046e;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public z(boolean z10, int i10, int i11, @Nullable l lVar, @NotNull k kVar) {
        this.f95042a = z10;
        this.f95043b = i10;
        this.f95044c = i11;
        this.f95045d = lVar;
        this.f95046e = kVar;
    }

    @Override // androidx.compose.foundation.text.selection.u
    public boolean a() {
        return this.f95042a;
    }

    @Override // androidx.compose.foundation.text.selection.u
    @NotNull
    public k b() {
        return this.f95046e;
    }

    @Override // androidx.compose.foundation.text.selection.u
    @NotNull
    public k c() {
        return this.f95046e;
    }

    @Override // androidx.compose.foundation.text.selection.u
    @NotNull
    public CrossStatus d() {
        int i10 = this.f95043b;
        int i11 = this.f95044c;
        return i10 < i11 ? CrossStatus.NOT_CROSSED : i10 > i11 ? CrossStatus.CROSSED : this.f95046e.d();
    }

    @Override // androidx.compose.foundation.text.selection.u
    @Nullable
    public l e() {
        return this.f95045d;
    }

    @Override // androidx.compose.foundation.text.selection.u
    public boolean f(@Nullable u uVar) {
        if (this.f95045d == null || uVar == null || !(uVar instanceof z)) {
            return true;
        }
        z zVar = (z) uVar;
        return (this.f95043b == zVar.f95043b && this.f95044c == zVar.f95044c && this.f95042a == zVar.f95042a && !this.f95046e.n(zVar.f95046e)) ? false : true;
    }

    @Override // androidx.compose.foundation.text.selection.u
    @NotNull
    public k g() {
        return this.f95046e;
    }

    @Override // androidx.compose.foundation.text.selection.u
    public int getSize() {
        return 1;
    }

    @Override // androidx.compose.foundation.text.selection.u
    @NotNull
    public k h() {
        return this.f95046e;
    }

    @Override // androidx.compose.foundation.text.selection.u
    public int i() {
        return this.f95043b;
    }

    @Override // androidx.compose.foundation.text.selection.u
    @NotNull
    public k j() {
        return this.f95046e;
    }

    @Override // androidx.compose.foundation.text.selection.u
    public int k() {
        return this.f95044c;
    }

    @Override // androidx.compose.foundation.text.selection.u
    @NotNull
    public AbstractC1523b0<l> l(@NotNull l lVar) {
        boolean z10 = lVar.f94997c;
        return C1525c0.c(this.f95046e.f94988a, ((z10 || lVar.f94995a.f95000b <= lVar.f94996b.f95000b) && (!z10 || lVar.f94995a.f95000b > lVar.f94996b.f95000b)) ? lVar : l.e(lVar, null, null, !z10, 3, null));
    }

    @NotNull
    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f95042a + ", crossed=" + d() + ", info=\n\t" + this.f95046e + ')';
    }

    @Override // androidx.compose.foundation.text.selection.u
    public void m(@NotNull ed.l<? super k, L0> lVar) {
    }
}
