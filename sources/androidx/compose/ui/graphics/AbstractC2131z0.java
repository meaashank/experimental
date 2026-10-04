package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public abstract class AbstractC2131z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f101794b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101795a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.z0$a */
    @kotlin.jvm.internal.V({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1#2:671\n*E\n"})
    public static final class a {
        public a() {
        }

        public static AbstractC2131z0 c(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i3.f101130b.getClass();
                i10 = i3.f101131c;
            }
            return aVar.a(list, f10, f11, i10);
        }

        public static AbstractC2131z0 d(a aVar, Pair[] pairArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i3.f101130b.getClass();
                i10 = i3.f101131c;
            }
            return aVar.b(pairArr, f10, f11, i10);
        }

        public static AbstractC2131z0 g(a aVar, List list, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                P.g.f65503b.getClass();
                j10 = P.g.f65504c;
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                P.g.f65503b.getClass();
                j11 = P.g.f65505d;
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i3.f101130b.getClass();
                i10 = i3.f101131c;
            }
            return aVar.e(list, j12, j13, i10);
        }

        public static AbstractC2131z0 h(a aVar, Pair[] pairArr, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                P.g.f65503b.getClass();
                j10 = P.g.f65504c;
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                P.g.f65503b.getClass();
                j11 = P.g.f65505d;
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i3.f101130b.getClass();
                i10 = i3.f101131c;
            }
            return aVar.f(pairArr, j12, j13, i10);
        }

        public static AbstractC2131z0 k(a aVar, List list, long j10, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                P.g.f65503b.getClass();
                j10 = P.g.f65506e;
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                i3.f101130b.getClass();
                i10 = i3.f101131c;
            }
            return aVar.i(list, j11, f11, i10);
        }

        public static AbstractC2131z0 l(a aVar, Pair[] pairArr, long j10, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                P.g.f65503b.getClass();
                j10 = P.g.f65506e;
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                i3.f101130b.getClass();
                i10 = i3.f101131c;
            }
            return aVar.j(pairArr, j11, f11, i10);
        }

        public static AbstractC2131z0 o(a aVar, List list, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                P.g.f65503b.getClass();
                j10 = P.g.f65506e;
            }
            return aVar.m(list, j10);
        }

        public static AbstractC2131z0 p(a aVar, Pair[] pairArr, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                P.g.f65503b.getClass();
                j10 = P.g.f65506e;
            }
            return aVar.n(pairArr, j10);
        }

        public static AbstractC2131z0 s(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i3.f101130b.getClass();
                i10 = i3.f101131c;
            }
            return aVar.q(list, f10, f11, i10);
        }

        public static AbstractC2131z0 t(a aVar, Pair[] pairArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i3.f101130b.getClass();
                i10 = i3.f101131c;
            }
            return aVar.r(pairArr, f10, f11, i10);
        }

        @androidx.compose.runtime.T1
        @NotNull
        public final AbstractC2131z0 a(@NotNull List<K0> list, float f10, float f11, int i10) {
            return e(list, P.h.a(f10, 0.0f), P.h.a(f11, 0.0f), i10);
        }

        @androidx.compose.runtime.T1
        @NotNull
        public final AbstractC2131z0 b(@NotNull Pair<Float, K0>[] pairArr, float f10, float f11, int i10) {
            return f((Pair[]) Arrays.copyOf(pairArr, pairArr.length), P.h.a(f10, 0.0f), P.h.a(f11, 0.0f), i10);
        }

        @androidx.compose.runtime.T1
        @NotNull
        public final AbstractC2131z0 e(@NotNull List<K0> list, long j10, long j11, int i10) {
            return new C2053l2(list, null, j10, j11, i10);
        }

        @androidx.compose.runtime.T1
        @NotNull
        public final AbstractC2131z0 f(@NotNull Pair<Float, K0>[] pairArr, long j10, long j11, int i10) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, K0> pair : pairArr) {
                arrayList.add(new K0(pair.f217468b.f100747a));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair<Float, K0> pair2 : pairArr) {
                arrayList2.add(Float.valueOf(pair2.f217467a.floatValue()));
            }
            return new C2053l2(arrayList, arrayList2, j10, j11, i10);
        }

        @androidx.compose.runtime.T1
        @NotNull
        public final AbstractC2131z0 i(@NotNull List<K0> list, long j10, float f10, int i10) {
            return new N2(list, null, j10, f10, i10);
        }

        @androidx.compose.runtime.T1
        @NotNull
        public final AbstractC2131z0 j(@NotNull Pair<Float, K0>[] pairArr, long j10, float f10, int i10) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, K0> pair : pairArr) {
                arrayList.add(new K0(pair.f217468b.f100747a));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair<Float, K0> pair2 : pairArr) {
                arrayList2.add(Float.valueOf(pair2.f217467a.floatValue()));
            }
            return new N2(arrayList, arrayList2, j10, f10, i10);
        }

        @androidx.compose.runtime.T1
        @NotNull
        public final AbstractC2131z0 m(@NotNull List<K0> list, long j10) {
            return new h3(j10, list, null);
        }

        @androidx.compose.runtime.T1
        @NotNull
        public final AbstractC2131z0 n(@NotNull Pair<Float, K0>[] pairArr, long j10) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, K0> pair : pairArr) {
                arrayList.add(new K0(pair.f217468b.f100747a));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair<Float, K0> pair2 : pairArr) {
                arrayList2.add(Float.valueOf(pair2.f217467a.floatValue()));
            }
            return new h3(j10, arrayList, arrayList2);
        }

        @androidx.compose.runtime.T1
        @NotNull
        public final AbstractC2131z0 q(@NotNull List<K0> list, float f10, float f11, int i10) {
            return e(list, P.h.a(0.0f, f10), P.h.a(0.0f, f11), i10);
        }

        @androidx.compose.runtime.T1
        @NotNull
        public final AbstractC2131z0 r(@NotNull Pair<Float, K0>[] pairArr, float f10, float f11, int i10) {
            return f((Pair[]) Arrays.copyOf(pairArr, pairArr.length), P.h.a(0.0f, f10), P.h.a(0.0f, f11), i10);
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ AbstractC2131z0(C4969v c4969v) {
        this();
    }

    public abstract void a(long j10, @NotNull InterfaceC2105s2 interfaceC2105s2, float f10);

    public long b() {
        return this.f101795a;
    }

    public AbstractC2131z0() {
        P.n.f65527b.getClass();
        this.f101795a = P.n.f65529d;
    }
}
