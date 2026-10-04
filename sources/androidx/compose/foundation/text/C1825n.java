package androidx.compose.foundation.text;

import androidx.compose.runtime.T1;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.text.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
public final class C1825n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f94573h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ed.l<InterfaceC1824m, L0> f94575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ed.l<InterfaceC1824m, L0> f94576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ed.l<InterfaceC1824m, L0> f94577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ed.l<InterfaceC1824m, L0> f94578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final ed.l<InterfaceC1824m, L0> f94579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final ed.l<InterfaceC1824m, L0> f94580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f94572g = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final C1825n f94574i = new C1825n(null, null, null, null, null, null, 63, null);

    /* JADX INFO: renamed from: androidx.compose.foundation.text.n$a */
    public static final class a {
        public a() {
        }

        @T1
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final C1825n a() {
            return C1825n.f94574i;
        }

        public a(C4969v c4969v) {
        }
    }

    public C1825n() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Nullable
    public final ed.l<InterfaceC1824m, L0> b() {
        return this.f94575a;
    }

    @Nullable
    public final ed.l<InterfaceC1824m, L0> c() {
        return this.f94576b;
    }

    @Nullable
    public final ed.l<InterfaceC1824m, L0> d() {
        return this.f94577c;
    }

    @Nullable
    public final ed.l<InterfaceC1824m, L0> e() {
        return this.f94578d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1825n)) {
            return false;
        }
        C1825n c1825n = (C1825n) obj;
        return this.f94575a == c1825n.f94575a && this.f94576b == c1825n.f94576b && this.f94577c == c1825n.f94577c && this.f94578d == c1825n.f94578d && this.f94579e == c1825n.f94579e && this.f94580f == c1825n.f94580f;
    }

    @Nullable
    public final ed.l<InterfaceC1824m, L0> f() {
        return this.f94579e;
    }

    @Nullable
    public final ed.l<InterfaceC1824m, L0> g() {
        return this.f94580f;
    }

    public int hashCode() {
        ed.l<InterfaceC1824m, L0> lVar = this.f94575a;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        ed.l<InterfaceC1824m, L0> lVar2 = this.f94576b;
        int iHashCode2 = (iHashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        ed.l<InterfaceC1824m, L0> lVar3 = this.f94577c;
        int iHashCode3 = (iHashCode2 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        ed.l<InterfaceC1824m, L0> lVar4 = this.f94578d;
        int iHashCode4 = (iHashCode3 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        ed.l<InterfaceC1824m, L0> lVar5 = this.f94579e;
        int iHashCode5 = (iHashCode4 + (lVar5 != null ? lVar5.hashCode() : 0)) * 31;
        ed.l<InterfaceC1824m, L0> lVar6 = this.f94580f;
        return iHashCode5 + (lVar6 != null ? lVar6.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1825n(@Nullable ed.l<? super InterfaceC1824m, L0> lVar, @Nullable ed.l<? super InterfaceC1824m, L0> lVar2, @Nullable ed.l<? super InterfaceC1824m, L0> lVar3, @Nullable ed.l<? super InterfaceC1824m, L0> lVar4, @Nullable ed.l<? super InterfaceC1824m, L0> lVar5, @Nullable ed.l<? super InterfaceC1824m, L0> lVar6) {
        this.f94575a = lVar;
        this.f94576b = lVar2;
        this.f94577c = lVar3;
        this.f94578d = lVar4;
        this.f94579e = lVar5;
        this.f94580f = lVar6;
    }

    public /* synthetic */ C1825n(ed.l lVar, ed.l lVar2, ed.l lVar3, ed.l lVar4, ed.l lVar5, ed.l lVar6, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? null : lVar, (i10 & 2) != 0 ? null : lVar2, (i10 & 4) != 0 ? null : lVar3, (i10 & 8) != 0 ? null : lVar4, (i10 & 16) != 0 ? null : lVar5, (i10 & 32) != 0 ? null : lVar6);
    }
}
