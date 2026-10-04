package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import e.InterfaceC4337k;
import kotlin.L0;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,875:1\n1#2:876\n*E\n"})
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f88698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f88700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public EdgeEffect f88701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public EdgeEffect f88702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public EdgeEffect f88703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public EdgeEffect f88704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public EdgeEffect f88705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public EdgeEffect f88706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public EdgeEffect f88707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public EdgeEffect f88708k;

    public G(@NotNull Context context, @InterfaceC4337k int i10) {
        this.f88698a = context;
        this.f88699b = i10;
        k0.x.f214338b.getClass();
        this.f88700c = k0.x.f214339c;
    }

    public final boolean A() {
        return y(this.f88705h);
    }

    public final boolean B() {
        return y(this.f88701d);
    }

    public final void C(long j10) {
        this.f88700c = j10;
        EdgeEffect edgeEffect = this.f88701d;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (j10 >> 32), (int) (j10 & ZipKt.f225990j));
        }
        EdgeEffect edgeEffect2 = this.f88702e;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (j10 >> 32), (int) (j10 & ZipKt.f225990j));
        }
        EdgeEffect edgeEffect3 = this.f88703f;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) (j10 & ZipKt.f225990j), (int) (j10 >> 32));
        }
        EdgeEffect edgeEffect4 = this.f88704g;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) (j10 & ZipKt.f225990j), (int) (j10 >> 32));
        }
        EdgeEffect edgeEffect5 = this.f88705h;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (j10 >> 32), (int) (j10 & ZipKt.f225990j));
        }
        EdgeEffect edgeEffect6 = this.f88706i;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (j10 >> 32), (int) (j10 & ZipKt.f225990j));
        }
        EdgeEffect edgeEffect7 = this.f88707j;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) (j10 & ZipKt.f225990j), (int) (j10 >> 32));
        }
        EdgeEffect edgeEffect8 = this.f88708k;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) (ZipKt.f225990j & j10), (int) (j10 >> 32));
        }
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffectA = F.f88668a.a(this.f88698a);
        edgeEffectA.setColor(this.f88699b);
        long j10 = this.f88700c;
        k0.x.f214338b.getClass();
        if (!k0.x.h(j10, k0.x.f214339c)) {
            long j11 = this.f88700c;
            edgeEffectA.setSize((int) (j11 >> 32), (int) (j11 & ZipKt.f225990j));
        }
        return edgeEffectA;
    }

    public final void f(@NotNull ed.l<? super EdgeEffect, L0> lVar) {
        EdgeEffect edgeEffect = this.f88701d;
        if (edgeEffect != null) {
            lVar.invoke(edgeEffect);
        }
        EdgeEffect edgeEffect2 = this.f88702e;
        if (edgeEffect2 != null) {
            lVar.invoke(edgeEffect2);
        }
        EdgeEffect edgeEffect3 = this.f88703f;
        if (edgeEffect3 != null) {
            lVar.invoke(edgeEffect3);
        }
        EdgeEffect edgeEffect4 = this.f88704g;
        if (edgeEffect4 != null) {
            lVar.invoke(edgeEffect4);
        }
    }

    @NotNull
    public final EdgeEffect g() {
        EdgeEffect edgeEffect = this.f88702e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f88702e = edgeEffectE;
        return edgeEffectE;
    }

    @NotNull
    public final EdgeEffect h() {
        EdgeEffect edgeEffect = this.f88706i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f88706i = edgeEffectE;
        return edgeEffectE;
    }

    @NotNull
    public final EdgeEffect i() {
        EdgeEffect edgeEffect = this.f88703f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f88703f = edgeEffectE;
        return edgeEffectE;
    }

    @NotNull
    public final EdgeEffect j() {
        EdgeEffect edgeEffect = this.f88707j;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f88707j = edgeEffectE;
        return edgeEffectE;
    }

    @NotNull
    public final EdgeEffect k() {
        EdgeEffect edgeEffect = this.f88704g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f88704g = edgeEffectE;
        return edgeEffectE;
    }

    @NotNull
    public final EdgeEffect l() {
        EdgeEffect edgeEffect = this.f88708k;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f88708k = edgeEffectE;
        return edgeEffectE;
    }

    @NotNull
    public final EdgeEffect m() {
        EdgeEffect edgeEffect = this.f88701d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f88701d = edgeEffectE;
        return edgeEffectE;
    }

    @NotNull
    public final EdgeEffect n() {
        EdgeEffect edgeEffect = this.f88705h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f88705h = edgeEffectE;
        return edgeEffectE;
    }

    public final boolean o(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final boolean p() {
        return o(this.f88702e);
    }

    public final boolean q() {
        return y(this.f88706i);
    }

    public final boolean r() {
        return y(this.f88702e);
    }

    public final boolean s() {
        return o(this.f88703f);
    }

    public final boolean t() {
        return y(this.f88707j);
    }

    public final boolean u() {
        return y(this.f88703f);
    }

    public final boolean v() {
        return o(this.f88704g);
    }

    public final boolean w() {
        return y(this.f88708k);
    }

    public final boolean x() {
        return y(this.f88704g);
    }

    public final boolean y(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(F.f88668a.b(edgeEffect) == 0.0f);
    }

    public final boolean z() {
        return o(this.f88701d);
    }
}
