package androidx.compose.foundation.text.input;

import androidx.compose.foundation.L;
import androidx.compose.foundation.text.input.internal.I;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.input.j;
import androidx.compose.foundation.text.input.s;
import androidx.compose.runtime.L0;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.T1;
import androidx.compose.runtime.snapshots.AbstractC1960k;
import androidx.compose.ui.text.Z;
import androidx.compose.ui.text.a0;
import e.f0;
import java.util.List;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.F;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
@V({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,694:1\n1208#2:695\n1187#2,2:696\n81#3:698\n107#3,2:699\n81#3:701\n107#3,2:702\n602#4,8:704\n602#4,8:712\n1#5:720\n460#6,11:721\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n572#1:695\n572#1:696,2\n97#1:698\n97#1:699,2\n112#1:701\n112#1:702,2\n184#1:704,8\n203#1:712,8\n432#1:721,11\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f94370g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final s f94371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public I f94372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final L0 f94373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final L0 f94374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final u f94375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.collection.c<a> f94376f;

    public interface a {
        void a(@NotNull l lVar, @NotNull l lVar2, boolean z10);
    }

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class b implements androidx.compose.runtime.saveable.e<p, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f94377a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f94378b = 0;

        @Override // androidx.compose.runtime.saveable.e
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public p b(@NotNull Object obj) {
            G.n(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            G.n(obj2, "null cannot be cast to non-null type kotlin.String");
            G.n(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            G.n(obj4, "null cannot be cast to non-null type kotlin.Int");
            long jB = a0.b(iIntValue, ((Integer) obj4).intValue());
            s.a.C0217a c0217a = s.a.C0217a.f94393a;
            G.m(obj5);
            return new p((String) obj2, jB, c0217a.b(obj5));
        }

        @Override // androidx.compose.runtime.saveable.e
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object a(@NotNull androidx.compose.runtime.saveable.f fVar, @NotNull p pVar) {
            return kotlin.collections.I.Q(pVar.t().f94358a.toString(), Integer.valueOf(Z.n(pVar.t().f94359b)), Integer.valueOf((int) (pVar.t().f94359b & ZipKt.f225990j)), s.a.C0217a.f94393a.a(fVar, pVar.f94371a));
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94379a;

        static {
            int[] iArr = new int[TextFieldEditUndoBehavior.values().length];
            try {
                iArr[TextFieldEditUndoBehavior.ClearHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.MergeIfPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.NeverMerge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94379a = iArr;
        }
    }

    public /* synthetic */ p(String str, long j10, s sVar, C4969v c4969v) {
        this(str, j10, sVar);
    }

    public static /* synthetic */ void f(p pVar, d dVar, boolean z10, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        pVar.e(dVar, z10, textFieldEditUndoBehavior);
    }

    public static void i(p pVar, d dVar, boolean z10, TextFieldEditUndoBehavior textFieldEditUndoBehavior, ed.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        pVar.f94372b.f93722b.e();
        lVar.invoke(pVar.f94372b);
        pVar.e(dVar, z10, textFieldEditUndoBehavior);
    }

    @f0
    public static /* synthetic */ void n() {
    }

    @L
    public static /* synthetic */ void s() {
    }

    @InterfaceC4850b0
    @NotNull
    public final j A() {
        AbstractC1960k.a aVar = AbstractC1960k.f100175e;
        AbstractC1960k abstractC1960kG = aVar.g();
        ed.l<Object, kotlin.L0> lVarK = abstractC1960kG != null ? abstractC1960kG.k() : null;
        AbstractC1960k abstractC1960kM = aVar.m(abstractC1960kG);
        try {
            if (u()) {
                throw new IllegalStateException("TextFieldState does not support concurrent or nested editing.");
            }
            x(true);
            return new j(t(), null, null, null, 14, null);
        } finally {
            aVar.x(abstractC1960kG, abstractC1960kM, lVarK);
        }
    }

    @f0
    public final void B(@NotNull j jVar, @Nullable Z z10, boolean z11, boolean z12) {
        String string = this.f94372b.f93721a.toString();
        l lVar = new l(string, this.f94372b.m(), this.f94372b.g(), null, 8, null);
        boolean zG = G.g(z10, this.f94372b.g());
        if (z11) {
            this.f94372b = new I(jVar.f94354c.toString(), jVar.f94356e);
        } else if (z12) {
            I i10 = this.f94372b;
            long j10 = jVar.f94356e;
            i10.v((int) (j10 >> 32), (int) (j10 & ZipKt.f225990j));
        }
        if (z10 == null || Z.h(z10.f104408a)) {
            this.f94372b.c();
        } else {
            this.f94372b.r(Z.l(z10.f104408a), Z.k(z10.f104408a));
        }
        if (z11 || (!z12 && !zG)) {
            this.f94372b.c();
        }
        if (z11) {
            string = jVar.f94354c.toString();
        }
        C(lVar, new l(string, this.f94372b.m(), this.f94372b.g(), null, 8, null), true);
    }

    public final void C(l lVar, l lVar2, boolean z10) {
        z(lVar2);
        int i10 = 0;
        x(false);
        androidx.compose.runtime.collection.c<a> cVar = this.f94376f;
        int i11 = cVar.f99566c;
        if (i11 > 0) {
            a[] aVarArr = cVar.f99564a;
            do {
                aVarArr[i10].a(lVar, lVar2, z10);
                i10++;
            } while (i10 < i11);
        }
    }

    public final void c(@NotNull a aVar) {
        this.f94376f.b(aVar);
    }

    @InterfaceC4850b0
    public final void d(@NotNull j jVar) {
        boolean z10 = jVar.d().f94108a.f99566c > 0;
        boolean zG = true ^ Z.g(jVar.f94356e, this.f94372b.m());
        if (z10) {
            this.f94371a.c();
        }
        B(jVar, null, z10, zG);
    }

    public final void e(d dVar, boolean z10, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        l lVarT = t();
        I i10 = this.f94372b;
        if (i10.f93722b.f94108a.f99566c == 0 && Z.g(lVarT.f94359b, i10.m())) {
            if (G.g(lVarT.f94360c, this.f94372b.g()) && G.g(lVarT.f94361d, this.f94372b.f93725e)) {
                return;
            }
            C(t(), new l(this.f94372b.f93721a.toString(), this.f94372b.m(), this.f94372b.g(), this.f94372b.f93725e), z10);
            return;
        }
        l lVar = new l(this.f94372b.f93721a.toString(), this.f94372b.m(), this.f94372b.g(), this.f94372b.f93725e);
        if (dVar == null) {
            C(lVarT, lVar, z10);
            v(lVarT, lVar, this.f94372b.f93722b, textFieldEditUndoBehavior);
            return;
        }
        j jVar = new j(lVar, this.f94372b.f93722b, lVarT, null, 8, null);
        dVar.p0(jVar);
        boolean zQ1 = F.Q1(jVar.f94354c, lVar);
        boolean z11 = !zQ1;
        boolean zG = Z.g(jVar.f94356e, lVar.f94359b);
        boolean z12 = !zG;
        if (zQ1 && zG) {
            C(lVarT, j.y(jVar, 0L, lVar.f94360c, 1, null), z10);
        } else {
            B(jVar, null, z11, z12);
        }
        v(lVarT, t(), jVar.d(), textFieldEditUndoBehavior);
    }

    public final void g(@NotNull ed.l<? super j, kotlin.L0> lVar) {
        j jVarA = A();
        try {
            lVar.invoke(jVarA);
            d(jVarA);
        } finally {
            x(false);
        }
    }

    public final void h(@Nullable d dVar, boolean z10, @NotNull TextFieldEditUndoBehavior textFieldEditUndoBehavior, @NotNull ed.l<? super I, kotlin.L0> lVar) {
        this.f94372b.f93722b.e();
        lVar.invoke(this.f94372b);
        e(dVar, z10, textFieldEditUndoBehavior);
    }

    public final void j(@NotNull ed.l<? super I, kotlin.L0> lVar) {
        this.f94372b.f93722b.e();
        lVar.invoke(this.f94372b);
        C(t(), new l(this.f94372b.f93721a.toString(), this.f94372b.m(), this.f94372b.g(), null, 8, null), true);
    }

    @InterfaceC4850b0
    public final void k() {
        x(false);
    }

    @Nullable
    public final Z l() {
        return t().f94360c;
    }

    @NotNull
    public final I m() {
        return this.f94372b;
    }

    public final long o() {
        return t().f94359b;
    }

    @NotNull
    public final CharSequence p() {
        return t().f94358a;
    }

    @NotNull
    public final s q() {
        return this.f94371a;
    }

    @L
    @NotNull
    public final u r() {
        return this.f94375e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final l t() {
        return (l) this.f94374d.getValue();
    }

    @NotNull
    public String toString() {
        AbstractC1960k.a aVar = AbstractC1960k.f100175e;
        AbstractC1960k abstractC1960kG = aVar.g();
        ed.l<Object, kotlin.L0> lVarK = abstractC1960kG != null ? abstractC1960kG.k() : null;
        AbstractC1960k abstractC1960kM = aVar.m(abstractC1960kG);
        try {
            return "TextFieldState(selection=" + ((Object) Z.q(t().f94359b)) + ", text=\"" + ((Object) t().f94358a) + "\")";
        } finally {
            aVar.x(abstractC1960kG, abstractC1960kM, lVarK);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.f94373c.getValue()).booleanValue();
    }

    public final void v(l lVar, l lVar2, j.a aVar, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        int i10 = c.f94379a[textFieldEditUndoBehavior.ordinal()];
        if (i10 == 1) {
            this.f94371a.c();
        } else if (i10 == 2) {
            t.c(this.f94371a, lVar, lVar2, aVar, true);
        } else {
            if (i10 != 3) {
                return;
            }
            t.c(this.f94371a, lVar, lVar2, aVar, false);
        }
    }

    public final void w(@NotNull a aVar) {
        this.f94376f.h0(aVar);
    }

    public final void x(boolean z10) {
        this.f94373c.setValue(Boolean.valueOf(z10));
    }

    public final void y(@NotNull I i10) {
        this.f94372b = i10;
    }

    public final void z(l lVar) {
        this.f94374d.setValue(lVar);
    }

    public /* synthetic */ p(String str, long j10, C4969v c4969v) {
        this(str, j10);
    }

    public p(String str, long j10, s sVar) {
        this.f94371a = sVar;
        this.f94372b = new I(str, a0.c(j10, 0, str.length()));
        this.f94373c = M1.g(Boolean.FALSE, null, 2, null);
        this.f94374d = M1.g(new l(str, j10, null, null, 12, null), null, 2, null);
        this.f94375e = new u(this);
        this.f94376f = new androidx.compose.runtime.collection.c<>(new a[16], 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(String str, long j10, int i10, C4969v c4969v) {
        str = (i10 & 1) != 0 ? "" : str;
        if ((i10 & 2) != 0) {
            int length = str.length();
            j10 = a0.b(length, length);
        }
        this(str, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(String str, long j10) {
        this(str, j10, new s(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }
}
