package androidx.compose.ui.semantics;

import androidx.activity.C1477d;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import md.C5229e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/ProgressBarRangeInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1617:1\n1#2:1618\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104122e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f104124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final md.f<Float> f104125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f104126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f104121d = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final h f104123f = new h(0.0f, new C5229e(0.0f, 0.0f), 0, 4, null);

    public static final class a {
        public a() {
        }

        @NotNull
        public final h a() {
            return h.f104123f;
        }

        public a(C4969v c4969v) {
        }
    }

    public h(float f10, @NotNull md.f<Float> fVar, int i10) {
        this.f104124a = f10;
        this.f104125b = fVar;
        this.f104126c = i10;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final float b() {
        return this.f104124a;
    }

    @NotNull
    public final md.f<Float> c() {
        return this.f104125b;
    }

    public final int d() {
        return this.f104126c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f104124a == hVar.f104124a && G.g(this.f104125b, hVar.f104125b) && this.f104126c == hVar.f104126c;
    }

    public int hashCode() {
        return ((this.f104125b.hashCode() + (Float.floatToIntBits(this.f104124a) * 31)) * 31) + this.f104126c;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb2.append(this.f104124a);
        sb2.append(", range=");
        sb2.append(this.f104125b);
        sb2.append(", steps=");
        return C1477d.a(sb2, this.f104126c, ')');
    }

    public /* synthetic */ h(float f10, md.f fVar, int i10, int i11, C4969v c4969v) {
        this(f10, fVar, (i11 & 4) != 0 ? 0 : i10);
    }
}
