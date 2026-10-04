package androidx.compose.ui.text.font;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class q0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104639f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final AbstractC2325w f104640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final L f104641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f104642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f104643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Object f104644e;

    public /* synthetic */ q0(AbstractC2325w abstractC2325w, L l10, int i10, int i11, Object obj, C4969v c4969v) {
        this(abstractC2325w, l10, i10, i11, obj);
    }

    public static q0 g(q0 q0Var, AbstractC2325w abstractC2325w, L l10, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            abstractC2325w = q0Var.f104640a;
        }
        if ((i12 & 2) != 0) {
            l10 = q0Var.f104641b;
        }
        if ((i12 & 4) != 0) {
            i10 = q0Var.f104642c;
        }
        if ((i12 & 8) != 0) {
            i11 = q0Var.f104643d;
        }
        if ((i12 & 16) != 0) {
            obj = q0Var.f104644e;
        }
        Object obj3 = obj;
        q0Var.getClass();
        int i13 = i10;
        return new q0(abstractC2325w, l10, i13, i11, obj3);
    }

    @Nullable
    public final AbstractC2325w a() {
        return this.f104640a;
    }

    @NotNull
    public final L b() {
        return this.f104641b;
    }

    public final int c() {
        return this.f104642c;
    }

    public final int d() {
        return this.f104643d;
    }

    @Nullable
    public final Object e() {
        return this.f104644e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.G.g(this.f104640a, q0Var.f104640a) && kotlin.jvm.internal.G.g(this.f104641b, q0Var.f104641b) && this.f104642c == q0Var.f104642c && this.f104643d == q0Var.f104643d && kotlin.jvm.internal.G.g(this.f104644e, q0Var.f104644e);
    }

    @NotNull
    public final q0 f(@Nullable AbstractC2325w abstractC2325w, @NotNull L l10, int i10, int i11, @Nullable Object obj) {
        return new q0(abstractC2325w, l10, i10, i11, obj);
    }

    @Nullable
    public final AbstractC2325w h() {
        return this.f104640a;
    }

    public int hashCode() {
        AbstractC2325w abstractC2325w = this.f104640a;
        int iHashCode = (((((((abstractC2325w == null ? 0 : abstractC2325w.hashCode()) * 31) + this.f104641b.f104572a) * 31) + this.f104642c) * 31) + this.f104643d) * 31;
        Object obj = this.f104644e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final int i() {
        return this.f104642c;
    }

    public final int j() {
        return this.f104643d;
    }

    @NotNull
    public final L k() {
        return this.f104641b;
    }

    @Nullable
    public final Object l() {
        return this.f104644e;
    }

    @NotNull
    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f104640a + ", fontWeight=" + this.f104641b + ", fontStyle=" + ((Object) H.i(this.f104642c)) + ", fontSynthesis=" + ((Object) I.l(this.f104643d)) + ", resourceLoaderCacheKey=" + this.f104644e + ')';
    }

    public q0(AbstractC2325w abstractC2325w, L l10, int i10, int i11, Object obj) {
        this.f104640a = abstractC2325w;
        this.f104641b = l10;
        this.f104642c = i10;
        this.f104643d = i11;
        this.f104644e = obj;
    }
}
