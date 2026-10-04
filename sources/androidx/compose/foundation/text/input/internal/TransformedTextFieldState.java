package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.K1;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.T1;
import androidx.compose.runtime.X1;
import ed.InterfaceC4376a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C4969v;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
@kotlin.jvm.internal.V({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,678:1\n81#2:679\n107#2,2:680\n261#3,15:682\n261#3,15:697\n261#3,15:712\n261#3,15:727\n261#3,15:742\n267#3,9:757\n261#3,15:766\n261#3,15:781\n261#3,15:796\n261#3,15:811\n1#4:826\n314#5,11:827\n*S KotlinDebug\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n*L\n174#1:679\n174#1:680,2\n198#1:682,15\n205#1:697,15\n211#1:712,15\n218#1:727,15\n224#1:742,15\n244#1:757,9\n265#1:766,15\n283#1:781,15\n290#1:796,15\n318#1:811,15\n419#1:827,11\n*E\n"})
public final class TransformedTextFieldState {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f94011h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f94012i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.foundation.text.input.p f94013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public androidx.compose.foundation.text.input.d f94014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final InterfaceC1798o f94015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final androidx.compose.foundation.text.input.i f94016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final X1<b> f94017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final X1<b> f94018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f94019g;

    @kotlin.jvm.internal.V({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,678:1\n1#2:679\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0213a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f94020a;

            static {
                int[] iArr = new int[WedgeAffinity.values().length];
                try {
                    iArr[WedgeAffinity.Start.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WedgeAffinity.End.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f94020a = iArr;
            }
        }

        public a() {
        }

        public static /* synthetic */ long i(a aVar, long j10, Q0 q02, V0 v02, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                v02 = null;
            }
            return aVar.h(j10, q02, v02);
        }

        @dd.o
        public final b e(androidx.compose.foundation.text.input.l lVar, androidx.compose.foundation.text.input.i iVar, V0 v02) {
            Q0 q02 = new Q0();
            androidx.compose.foundation.text.input.j jVar = new androidx.compose.foundation.text.input.j(lVar, null, null, q02, 6, null);
            iVar.a(jVar);
            androidx.compose.ui.text.Z z10 = null;
            if (jVar.d().f94108a.f99566c == 0) {
                return null;
            }
            long jH = h(lVar.f94359b, q02, v02);
            androidx.compose.ui.text.Z z11 = lVar.f94360c;
            if (z11 != null) {
                z10 = new androidx.compose.ui.text.Z(TransformedTextFieldState.f94011h.h(z11.f104408a, q02, v02));
            }
            return new b(jVar.x(jH, z10), q02);
        }

        @dd.o
        public final b f(androidx.compose.foundation.text.input.l lVar, InterfaceC1798o interfaceC1798o, V0 v02) {
            androidx.compose.ui.text.Z z10;
            Q0 q02 = new Q0();
            CharSequence charSequenceB = C1800p.b(lVar, interfaceC1798o, q02);
            if (charSequenceB == lVar) {
                return null;
            }
            long jH = h(lVar.f94359b, q02, v02);
            androidx.compose.ui.text.Z z11 = lVar.f94360c;
            if (z11 != null) {
                z10 = new androidx.compose.ui.text.Z(TransformedTextFieldState.f94011h.h(z11.f104408a, q02, v02));
            } else {
                z10 = null;
            }
            return new b(new androidx.compose.foundation.text.input.l(charSequenceB, jH, z10, null, 8, null), q02);
        }

        @dd.o
        public final long g(long j10, Q0 q02) {
            long jA = q02.a(androidx.compose.ui.text.Z.n(j10), false);
            long jA2 = androidx.compose.ui.text.Z.h(j10) ? jA : q02.a((int) (ZipKt.f225990j & j10), false);
            int iMin = Math.min(androidx.compose.ui.text.Z.l(jA), androidx.compose.ui.text.Z.l(jA2));
            int iMax = Math.max(androidx.compose.ui.text.Z.k(jA), androidx.compose.ui.text.Z.k(jA2));
            return androidx.compose.ui.text.Z.m(j10) ? androidx.compose.ui.text.a0.b(iMax, iMin) : androidx.compose.ui.text.a0.b(iMin, iMax);
        }

        @dd.o
        public final long h(long j10, Q0 q02, V0 v02) {
            long jA = q02.a(androidx.compose.ui.text.Z.n(j10), true);
            long jA2 = androidx.compose.ui.text.Z.h(j10) ? jA : q02.a((int) (j10 & ZipKt.f225990j), true);
            int iMin = Math.min(androidx.compose.ui.text.Z.l(jA), androidx.compose.ui.text.Z.l(jA2));
            int iMax = Math.max(androidx.compose.ui.text.Z.k(jA), androidx.compose.ui.text.Z.k(jA2));
            long jB = androidx.compose.ui.text.Z.m(j10) ? androidx.compose.ui.text.a0.b(iMax, iMin) : androidx.compose.ui.text.a0.b(iMin, iMax);
            if (androidx.compose.ui.text.Z.h(j10) && !androidx.compose.ui.text.Z.h(jB)) {
                WedgeAffinity wedgeAffinity = v02 != null ? v02.f94039a : null;
                int i10 = wedgeAffinity == null ? -1 : C0213a.f94020a[wedgeAffinity.ordinal()];
                if (i10 != -1) {
                    if (i10 == 1) {
                        int i11 = (int) (jB >> 32);
                        return androidx.compose.ui.text.a0.b(i11, i11);
                    }
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i12 = (int) (jB & ZipKt.f225990j);
                    return androidx.compose.ui.text.a0.b(i12, i12);
                }
            }
            return jB;
        }

        public a(C4969v c4969v) {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final androidx.compose.foundation.text.input.l f94021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Q0 f94022b;

        public b(@NotNull androidx.compose.foundation.text.input.l lVar, @NotNull Q0 q02) {
            this.f94021a = lVar;
            this.f94022b = q02;
        }

        public static b d(b bVar, androidx.compose.foundation.text.input.l lVar, Q0 q02, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = bVar.f94021a;
            }
            if ((i10 & 2) != 0) {
                q02 = bVar.f94022b;
            }
            bVar.getClass();
            return new b(lVar, q02);
        }

        @NotNull
        public final androidx.compose.foundation.text.input.l a() {
            return this.f94021a;
        }

        @NotNull
        public final Q0 b() {
            return this.f94022b;
        }

        @NotNull
        public final b c(@NotNull androidx.compose.foundation.text.input.l lVar, @NotNull Q0 q02) {
            return new b(lVar, q02);
        }

        @NotNull
        public final Q0 e() {
            return this.f94022b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.G.g(this.f94021a, bVar.f94021a) && kotlin.jvm.internal.G.g(this.f94022b, bVar.f94022b);
        }

        @NotNull
        public final androidx.compose.foundation.text.input.l f() {
            return this.f94021a;
        }

        public int hashCode() {
            return this.f94022b.hashCode() + (this.f94021a.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TransformedText(text=" + ((Object) this.f94021a) + ", offsetMapping=" + this.f94022b + ')';
        }
    }

    public TransformedTextFieldState(@NotNull androidx.compose.foundation.text.input.p pVar, @Nullable androidx.compose.foundation.text.input.d dVar, @Nullable final InterfaceC1798o interfaceC1798o, @Nullable final androidx.compose.foundation.text.input.i iVar) {
        this.f94013a = pVar;
        this.f94014b = dVar;
        this.f94015c = interfaceC1798o;
        this.f94016d = iVar;
        this.f94017e = iVar != null ? K1.d(new InterfaceC4376a<b>() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$outputTransformedText$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @Nullable
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final TransformedTextFieldState.b invoke() {
                return TransformedTextFieldState.f94011h.e(this.f94032d.f94013a.t(), iVar, this.f94032d.n());
            }
        }) : null;
        this.f94018f = interfaceC1798o != null ? K1.d(new InterfaceC4376a<b>() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$codepointTransformedText$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @Nullable
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final TransformedTextFieldState.b invoke() {
                androidx.compose.foundation.text.input.l lVarT;
                TransformedTextFieldState.b value;
                TransformedTextFieldState.a aVar = TransformedTextFieldState.f94011h;
                X1<TransformedTextFieldState.b> x12 = this.f94023d.f94017e;
                if (x12 == null || (value = x12.getValue()) == null || (lVarT = value.f94021a) == null) {
                    lVarT = this.f94023d.f94013a.t();
                }
                return aVar.f(lVarT, interfaceC1798o, this.f94023d.n());
            }
        }) : null;
        WedgeAffinity wedgeAffinity = WedgeAffinity.Start;
        this.f94019g = M1.g(new V0(wedgeAffinity, wedgeAffinity), null, 2, null);
    }

    public static /* synthetic */ void B(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z10, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        transformedTextFieldState.A(charSequence, z10, textFieldEditUndoBehavior);
    }

    public static /* synthetic */ void D(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, long j10, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = textFieldEditUndoBehavior;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        transformedTextFieldState.C(charSequence, j10, textFieldEditUndoBehavior2, z10);
    }

    @dd.o
    public static final b e(androidx.compose.foundation.text.input.l lVar, androidx.compose.foundation.text.input.i iVar, V0 v02) {
        return f94011h.e(lVar, iVar, v02);
    }

    @dd.o
    public static final b f(androidx.compose.foundation.text.input.l lVar, InterfaceC1798o interfaceC1798o, V0 v02) {
        return f94011h.f(lVar, interfaceC1798o, v02);
    }

    public static void l(TransformedTextFieldState transformedTextFieldState, boolean z10, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        androidx.compose.foundation.text.input.p pVar = transformedTextFieldState.f94013a;
        androidx.compose.foundation.text.input.d dVar = transformedTextFieldState.f94014b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        pVar.f94372b.f93722b.e();
        lVar.invoke(pVar.f94372b);
        pVar.e(dVar, z10, textFieldEditUndoBehavior);
    }

    @dd.o
    public static final long t(long j10, Q0 q02) {
        return f94011h.g(j10, q02);
    }

    @dd.o
    public static final long w(long j10, Q0 q02, V0 v02) {
        return f94011h.h(j10, q02, v02);
    }

    public final void A(@NotNull CharSequence charSequence, boolean z10, @NotNull TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        androidx.compose.foundation.text.input.p pVar = this.f94013a;
        androidx.compose.foundation.text.input.d dVar = this.f94014b;
        pVar.f94372b.f93722b.e();
        I i10 = pVar.f94372b;
        if (z10) {
            i10.c();
        }
        long jM = i10.m();
        i10.q(androidx.compose.ui.text.Z.l(jM), androidx.compose.ui.text.Z.k(jM), charSequence);
        int length = charSequence.length() + androidx.compose.ui.text.Z.l(jM);
        i10.v(length, length);
        pVar.e(dVar, true, textFieldEditUndoBehavior);
    }

    public final void C(@NotNull CharSequence charSequence, long j10, @NotNull TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z10) {
        androidx.compose.foundation.text.input.p pVar = this.f94013a;
        androidx.compose.foundation.text.input.d dVar = this.f94014b;
        pVar.f94372b.f93722b.e();
        I i10 = pVar.f94372b;
        long jS = s(j10);
        i10.q(androidx.compose.ui.text.Z.l(jS), androidx.compose.ui.text.Z.k(jS), charSequence);
        int length = charSequence.length() + androidx.compose.ui.text.Z.l(jS);
        i10.v(length, length);
        pVar.e(dVar, z10, textFieldEditUndoBehavior);
    }

    public final void E() {
        androidx.compose.foundation.text.input.p pVar = this.f94013a;
        androidx.compose.foundation.text.input.d dVar = this.f94014b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        pVar.f94372b.f93722b.e();
        I i10 = pVar.f94372b;
        i10.v(0, i10.f93721a.c());
        pVar.e(dVar, true, textFieldEditUndoBehavior);
    }

    public final void F(long j10) {
        G(s(j10));
    }

    public final void G(long j10) {
        androidx.compose.foundation.text.input.p pVar = this.f94013a;
        androidx.compose.foundation.text.input.d dVar = this.f94014b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        pVar.f94372b.f93722b.e();
        pVar.f94372b.v(androidx.compose.ui.text.Z.n(j10), (int) (j10 & ZipKt.f225990j));
        pVar.e(dVar, true, textFieldEditUndoBehavior);
    }

    public final void H(@NotNull V0 v02) {
        this.f94019g.setValue(v02);
    }

    public final void I() {
        this.f94013a.f94375e.g();
    }

    public final void J(@Nullable androidx.compose.foundation.text.input.d dVar) {
        this.f94014b = dVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedTextFieldState)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) obj;
        if (kotlin.jvm.internal.G.g(this.f94013a, transformedTextFieldState.f94013a) && kotlin.jvm.internal.G.g(this.f94015c, transformedTextFieldState.f94015c)) {
            return kotlin.jvm.internal.G.g(this.f94016d, transformedTextFieldState.f94016d);
        }
        return false;
    }

    public final void g() {
        androidx.compose.foundation.text.input.p pVar = this.f94013a;
        androidx.compose.foundation.text.input.d dVar = this.f94014b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        pVar.f94372b.f93722b.e();
        I i10 = pVar.f94372b;
        i10.v((int) (i10.m() & ZipKt.f225990j), (int) (ZipKt.f225990j & i10.m()));
        pVar.e(dVar, true, textFieldEditUndoBehavior);
    }

    public final void h() {
        androidx.compose.foundation.text.input.p pVar = this.f94013a;
        androidx.compose.foundation.text.input.d dVar = this.f94014b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        pVar.f94372b.f93722b.e();
        I i10 = pVar.f94372b;
        i10.v(androidx.compose.ui.text.Z.k(i10.m()), androidx.compose.ui.text.Z.k(i10.m()));
        pVar.e(dVar, true, textFieldEditUndoBehavior);
    }

    public int hashCode() {
        int iHashCode = this.f94013a.hashCode() * 31;
        InterfaceC1798o interfaceC1798o = this.f94015c;
        int iHashCode2 = (iHashCode + (interfaceC1798o != null ? interfaceC1798o.hashCode() : 0)) * 31;
        androidx.compose.foundation.text.input.i iVar = this.f94016d;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.text.input.p.a r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1) r0
            int r1 = r0.f94029e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94029e = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f94027c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f94029e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            java.lang.Object r5 = r0.f94026b
            androidx.compose.foundation.text.input.p$a r5 = (androidx.compose.foundation.text.input.p.a) r5
            java.lang.Object r5 = r0.f94025a
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r5 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState) r5
            kotlin.C4885d0.n(r6)
            goto L60
        L37:
            kotlin.C4885d0.n(r6)
            r0.f94025a = r4
            r0.f94026b = r5
            r0.f94029e = r3
            kotlinx.coroutines.o r6 = new kotlinx.coroutines.o
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)
            r6.<init>(r0, r3)
            r6.n0()
            androidx.compose.foundation.text.input.p r0 = r4.f94013a
            r0.c(r5)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1 r0 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
            r0.<init>()
            r6.k0(r0)
            java.lang.Object r5 = r6.z()
            if (r5 != r1) goto L60
            return r1
        L60:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.i(androidx.compose.foundation.text.input.p$a, kotlin.coroutines.e):java.lang.Object");
    }

    public final void j() {
        androidx.compose.foundation.text.input.p pVar = this.f94013a;
        androidx.compose.foundation.text.input.d dVar = this.f94014b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.NeverMerge;
        pVar.f94372b.f93722b.e();
        I i10 = pVar.f94372b;
        i10.d(androidx.compose.ui.text.Z.l(i10.m()), androidx.compose.ui.text.Z.k(i10.m()));
        i10.v(androidx.compose.ui.text.Z.l(i10.m()), androidx.compose.ui.text.Z.l(i10.m()));
        pVar.e(dVar, true, textFieldEditUndoBehavior);
    }

    public final void k(boolean z10, @NotNull ed.l<? super I, kotlin.L0> lVar) {
        androidx.compose.foundation.text.input.p pVar = this.f94013a;
        androidx.compose.foundation.text.input.d dVar = this.f94014b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        pVar.f94372b.f93722b.e();
        lVar.invoke(pVar.f94372b);
        pVar.e(dVar, z10, textFieldEditUndoBehavior);
    }

    @NotNull
    public final androidx.compose.foundation.text.input.l m() {
        b value;
        androidx.compose.foundation.text.input.l lVar;
        X1<b> x12 = this.f94017e;
        return (x12 == null || (value = x12.getValue()) == null || (lVar = value.f94021a) == null) ? this.f94013a.t() : lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final V0 n() {
        return (V0) this.f94019g.getValue();
    }

    @NotNull
    public final androidx.compose.foundation.text.input.l o() {
        return this.f94013a.t();
    }

    @NotNull
    public final androidx.compose.foundation.text.input.l p() {
        b value;
        androidx.compose.foundation.text.input.l lVar;
        X1<b> x12 = this.f94018f;
        return (x12 == null || (value = x12.getValue()) == null || (lVar = value.f94021a) == null) ? m() : lVar;
    }

    public final void q(int i10, long j10) {
        long jS = s(j10);
        androidx.compose.foundation.text.input.p pVar = this.f94013a;
        androidx.compose.foundation.text.input.d dVar = this.f94014b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        pVar.f94372b.f93722b.e();
        pVar.f94372b.u(i10, androidx.compose.ui.text.Z.n(jS), (int) (jS & ZipKt.f225990j));
        pVar.e(dVar, true, textFieldEditUndoBehavior);
    }

    public final long r(int i10) {
        b value;
        b value2;
        X1<b> x12 = this.f94017e;
        Q0 q02 = null;
        Q0 q03 = (x12 == null || (value2 = x12.getValue()) == null) ? null : value2.f94022b;
        X1<b> x13 = this.f94018f;
        if (x13 != null && (value = x13.getValue()) != null) {
            q02 = value.f94022b;
        }
        long jA = q02 != null ? q02.a(i10, false) : androidx.compose.ui.text.a0.b(i10, i10);
        return q03 != null ? f94011h.g(jA, q03) : jA;
    }

    public final long s(long j10) {
        b value;
        b value2;
        X1<b> x12 = this.f94017e;
        Q0 q02 = null;
        Q0 q03 = (x12 == null || (value2 = x12.getValue()) == null) ? null : value2.f94022b;
        X1<b> x13 = this.f94018f;
        if (x13 != null && (value = x13.getValue()) != null) {
            q02 = value.f94022b;
        }
        if (q02 != null) {
            j10 = f94011h.g(j10, q02);
        }
        return q03 != null ? f94011h.g(j10, q03) : j10;
    }

    @NotNull
    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.f94013a + ", outputTransformation=" + this.f94016d + ", outputTransformedText=" + this.f94017e + ", codepointTransformation=" + this.f94015c + ", codepointTransformedText=" + this.f94018f + ", outputText=\"" + ((Object) m()) + "\", visualText=\"" + ((Object) p()) + "\")";
    }

    public final long u(int i10) {
        b value;
        b value2;
        X1<b> x12 = this.f94017e;
        Q0 q02 = null;
        Q0 q03 = (x12 == null || (value2 = x12.getValue()) == null) ? null : value2.f94022b;
        X1<b> x13 = this.f94018f;
        if (x13 != null && (value = x13.getValue()) != null) {
            q02 = value.f94022b;
        }
        long jA = q03 != null ? q03.a(i10, true) : androidx.compose.ui.text.a0.b(i10, i10);
        return q02 != null ? f94011h.h(jA, q02, n()) : jA;
    }

    public final long v(long j10) {
        b value;
        b value2;
        X1<b> x12 = this.f94017e;
        Q0 q02 = null;
        Q0 q03 = (x12 == null || (value2 = x12.getValue()) == null) ? null : value2.f94022b;
        X1<b> x13 = this.f94018f;
        if (x13 != null && (value = x13.getValue()) != null) {
            q02 = value.f94022b;
        }
        if (q03 != null) {
            j10 = a.i(f94011h, j10, q03, null, 4, null);
        }
        return q02 != null ? f94011h.h(j10, q02, n()) : j10;
    }

    public final void x(int i10) {
        F(androidx.compose.ui.text.a0.b(i10, i10));
    }

    public final void y() {
        this.f94013a.f94375e.f();
    }

    public final void z(@NotNull CharSequence charSequence) {
        androidx.compose.foundation.text.input.p pVar = this.f94013a;
        androidx.compose.foundation.text.input.d dVar = this.f94014b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        pVar.f94372b.f93722b.e();
        I i10 = pVar.f94372b;
        H.c(i10);
        H.b(i10, charSequence.toString(), 1);
        pVar.e(dVar, true, textFieldEditUndoBehavior);
    }

    public /* synthetic */ TransformedTextFieldState(androidx.compose.foundation.text.input.p pVar, androidx.compose.foundation.text.input.d dVar, InterfaceC1798o interfaceC1798o, androidx.compose.foundation.text.input.i iVar, int i10, C4969v c4969v) {
        this(pVar, (i10 & 2) != 0 ? null : dVar, (i10 & 4) != 0 ? null : interfaceC1798o, (i10 & 8) != 0 ? null : iVar);
    }
}
