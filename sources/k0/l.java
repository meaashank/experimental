package k0;

import androidx.compose.foundation.C1749o;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@V({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,577:1\n51#2:578\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n*L\n555#1:578\n*E\n"})
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f214317e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f214318f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f214319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f214320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f214321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f214322d;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ l(float f10, float f11, float f12, float f13, C4969v c4969v) {
        this(f10, f11, f12, f13);
    }

    public static l f(l lVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = lVar.f214319a;
        }
        if ((i10 & 2) != 0) {
            f11 = lVar.f214320b;
        }
        if ((i10 & 4) != 0) {
            f12 = lVar.f214321c;
        }
        if ((i10 & 8) != 0) {
            f13 = lVar.f214322d;
        }
        lVar.getClass();
        return new l(f10, f11, f12, f13);
    }

    public final float a() {
        return this.f214319a;
    }

    public final float b() {
        return this.f214320b;
    }

    public final float c() {
        return this.f214321c;
    }

    public final float d() {
        return this.f214322d;
    }

    @NotNull
    public final l e(float f10, float f11, float f12, float f13) {
        return new l(f10, f11, f12, f13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return i.l(this.f214319a, lVar.f214319a) && i.l(this.f214320b, lVar.f214320b) && i.l(this.f214321c, lVar.f214321c) && i.l(this.f214322d, lVar.f214322d);
    }

    public final float g() {
        return this.f214322d;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f214322d) + androidx.compose.animation.B.a(this.f214321c, androidx.compose.animation.B.a(this.f214320b, Float.floatToIntBits(this.f214319a) * 31, 31), 31);
    }

    public final float i() {
        return this.f214319a;
    }

    public final float k() {
        return this.f214321c;
    }

    public final float m() {
        return this.f214320b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DpRect(left=");
        C1749o.a(this.f214319a, sb2, ", top=");
        C1749o.a(this.f214320b, sb2, ", right=");
        C1749o.a(this.f214321c, sb2, ", bottom=");
        sb2.append((Object) i.u(this.f214322d));
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ l(long j10, long j11, C4969v c4969v) {
        this(j10, j11);
    }

    public l(float f10, float f11, float f12, float f13) {
        this.f214319a = f10;
        this.f214320b = f11;
        this.f214321c = f12;
        this.f214322d = f13;
    }

    public l(long j10, long j11) {
        this(k.j(j10), k.l(j10), m.p(j11) + k.j(j10), m.m(j11) + k.l(j10));
    }

    @T1
    public static /* synthetic */ void h() {
    }

    @T1
    public static /* synthetic */ void j() {
    }

    @T1
    public static /* synthetic */ void l() {
    }

    @T1
    public static /* synthetic */ void n() {
    }
}
