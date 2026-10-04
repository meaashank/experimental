package androidx.compose.foundation.text.selection;

import androidx.collection.C1550p;
import androidx.compose.animation.C1635o;
import androidx.compose.animation.C1636p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.ui.text.a0;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94994d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f94995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f94996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94997c;

    @InterfaceC1924k0
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f94998d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ResolvedTextDirection f94999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f95000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f95001c;

        public a(@NotNull ResolvedTextDirection resolvedTextDirection, int i10, long j10) {
            this.f94999a = resolvedTextDirection;
            this.f95000b = i10;
            this.f95001c = j10;
        }

        public static a e(a aVar, ResolvedTextDirection resolvedTextDirection, int i10, long j10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                resolvedTextDirection = aVar.f94999a;
            }
            if ((i11 & 2) != 0) {
                i10 = aVar.f95000b;
            }
            if ((i11 & 4) != 0) {
                j10 = aVar.f95001c;
            }
            aVar.getClass();
            return new a(resolvedTextDirection, i10, j10);
        }

        @NotNull
        public final ResolvedTextDirection a() {
            return this.f94999a;
        }

        public final int b() {
            return this.f95000b;
        }

        public final long c() {
            return this.f95001c;
        }

        @NotNull
        public final a d(@NotNull ResolvedTextDirection resolvedTextDirection, int i10, long j10) {
            return new a(resolvedTextDirection, i10, j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f94999a == aVar.f94999a && this.f95000b == aVar.f95000b && this.f95001c == aVar.f95001c;
        }

        @NotNull
        public final ResolvedTextDirection f() {
            return this.f94999a;
        }

        public final int g() {
            return this.f95000b;
        }

        public final long h() {
            return this.f95001c;
        }

        public int hashCode() {
            return C1550p.a(this.f95001c) + (((this.f94999a.hashCode() * 31) + this.f95000b) * 31);
        }

        @NotNull
        public String toString() {
            return "AnchorInfo(direction=" + this.f94999a + ", offset=" + this.f95000b + ", selectableId=" + this.f95001c + ')';
        }
    }

    public l(@NotNull a aVar, @NotNull a aVar2, boolean z10) {
        this.f94995a = aVar;
        this.f94996b = aVar2;
        this.f94997c = z10;
    }

    public static l e(l lVar, a aVar, a aVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = lVar.f94995a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = lVar.f94996b;
        }
        if ((i10 & 4) != 0) {
            z10 = lVar.f94997c;
        }
        lVar.getClass();
        return new l(aVar, aVar2, z10);
    }

    @NotNull
    public final a a() {
        return this.f94995a;
    }

    @NotNull
    public final a b() {
        return this.f94996b;
    }

    public final boolean c() {
        return this.f94997c;
    }

    @NotNull
    public final l d(@NotNull a aVar, @NotNull a aVar2, boolean z10) {
        return new l(aVar, aVar2, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return G.g(this.f94995a, lVar.f94995a) && G.g(this.f94996b, lVar.f94996b) && this.f94997c == lVar.f94997c;
    }

    @NotNull
    public final a f() {
        return this.f94996b;
    }

    public final boolean g() {
        return this.f94997c;
    }

    @NotNull
    public final a h() {
        return this.f94995a;
    }

    public int hashCode() {
        return C1635o.a(this.f94997c) + ((this.f94996b.hashCode() + (this.f94995a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final l i(@Nullable l lVar) {
        if (lVar == null) {
            return this;
        }
        boolean z10 = this.f94997c;
        if (z10 || lVar.f94997c) {
            return new l(lVar.f94997c ? lVar.f94995a : lVar.f94996b, z10 ? this.f94996b : this.f94995a, true);
        }
        return e(this, null, lVar.f94996b, false, 5, null);
    }

    public final long j() {
        return a0.b(this.f94995a.f95000b, this.f94996b.f95000b);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Selection(start=");
        sb2.append(this.f94995a);
        sb2.append(", end=");
        sb2.append(this.f94996b);
        sb2.append(", handlesCrossed=");
        return C1636p.a(sb2, this.f94997c, ')');
    }

    public /* synthetic */ l(a aVar, a aVar2, boolean z10, int i10, C4969v c4969v) {
        this(aVar, aVar2, (i10 & 4) != 0 ? false : z10);
    }
}
