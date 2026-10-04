package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import ed.InterfaceC4376a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.L
@androidx.compose.runtime.internal.r(parameters = 0)
public final class LazyLayoutItemContentFactory {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f91674d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.saveable.b f91675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<InterfaceC1743q> f91676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<Object, CachedItemContent> f91677c = new LinkedHashMap();

    @V({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
    public final class CachedItemContent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Object f91678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Object f91679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f91680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public ed.p<? super InterfaceC1946s, ? super Integer, L0> f91681d;

        public CachedItemContent(int i10, @NotNull Object obj, @Nullable Object obj2) {
            this.f91678a = obj;
            this.f91679b = obj2;
            this.f91680c = i10;
        }

        public final ed.p<InterfaceC1946s, Integer, L0> c() {
            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = LazyLayoutItemContentFactory.this;
            return new ComposableLambdaImpl(1403994769, true, new ed.p<InterfaceC1946s, Integer, L0>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
                @androidx.compose.runtime.InterfaceC1917i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void e(@org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r9, int r10) {
                    /*
                        r8 = this;
                        r0 = r10 & 3
                        r1 = 2
                        if (r0 != r1) goto L10
                        boolean r0 = r9.c()
                        if (r0 != 0) goto Lc
                        goto L10
                    Lc:
                        r9.o()
                        return
                    L10:
                        boolean r0 = androidx.compose.runtime.C1968u.c0()
                        r1 = -1
                        if (r0 == 0) goto L1f
                        r0 = 1403994769(0x53af4291, float:1.5054722E12)
                        java.lang.String r2 = "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)"
                        androidx.compose.runtime.C1968u.p0(r0, r10, r1, r2)
                    L1f:
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory r10 = r1
                        ed.a<androidx.compose.foundation.lazy.layout.q> r10 = r10.f91676b
                        java.lang.Object r10 = r10.invoke()
                        r2 = r10
                        androidx.compose.foundation.lazy.layout.q r2 = (androidx.compose.foundation.lazy.layout.InterfaceC1743q) r2
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent r10 = r2
                        int r10 = r10.f91680c
                        int r0 = r2.getItemCount()
                        if (r10 >= r0) goto L45
                        java.lang.Object r0 = r2.c(r10)
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent r3 = r2
                        java.lang.Object r3 = r3.f91678a
                        boolean r0 = r0.equals(r3)
                        if (r0 != 0) goto L43
                        goto L45
                    L43:
                        r4 = r10
                        goto L54
                    L45:
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent r10 = r2
                        java.lang.Object r10 = r10.f91678a
                        int r10 = r2.b(r10)
                        if (r10 == r1) goto L43
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent r0 = r2
                        r0.f91680c = r10
                        goto L43
                    L54:
                        if (r4 == r1) goto L6d
                        r10 = -660479623(0xffffffffd8a1e179, float:-1.4239182E15)
                        r9.y(r10)
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory r10 = r1
                        androidx.compose.runtime.saveable.b r3 = r10.f91675a
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent r10 = r2
                        java.lang.Object r5 = r10.f91678a
                        r7 = 0
                        r6 = r9
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt.a(r2, r3, r4, r5, r6, r7)
                        r6.u()
                        goto L77
                    L6d:
                        r6 = r9
                        r9 = -660272047(0xffffffffd8a50c51, float:-1.4517785E15)
                        r6.y(r9)
                        r6.u()
                    L77:
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent r9 = r2
                        java.lang.Object r10 = r9.f91678a
                        boolean r9 = r6.c0(r9)
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent r0 = r2
                        java.lang.Object r1 = r6.a0()
                        if (r9 != 0) goto L90
                        androidx.compose.runtime.s$a r9 = androidx.compose.runtime.InterfaceC1946s.f99968a
                        r9.getClass()
                        java.lang.Object r9 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
                        if (r1 != r9) goto L98
                    L90:
                        androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1 r1 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1
                        r1.<init>()
                        r6.S(r1)
                    L98:
                        ed.l r1 = (ed.l) r1
                        r9 = 0
                        androidx.compose.runtime.EffectsKt.b(r10, r1, r6, r9)
                        boolean r9 = androidx.compose.runtime.C1968u.c0()
                        if (r9 == 0) goto La7
                        androidx.compose.runtime.C1968u.o0()
                    La7:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1.e(androidx.compose.runtime.s, int):void");
                }

                @Override // ed.p
                public /* bridge */ /* synthetic */ L0 invoke(InterfaceC1946s interfaceC1946s, Integer num) {
                    e(interfaceC1946s, num.intValue());
                    return L0.f217464a;
                }
            });
        }

        @NotNull
        public final ed.p<InterfaceC1946s, Integer, L0> d() {
            ed.p pVar = this.f91681d;
            if (pVar != null) {
                return pVar;
            }
            ed.p<InterfaceC1946s, Integer, L0> pVarC = c();
            this.f91681d = pVarC;
            return pVarC;
        }

        @Nullable
        public final Object e() {
            return this.f91679b;
        }

        public final int f() {
            return this.f91680c;
        }

        @NotNull
        public final Object g() {
            return this.f91678a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutItemContentFactory(@NotNull androidx.compose.runtime.saveable.b bVar, @NotNull InterfaceC4376a<? extends InterfaceC1743q> interfaceC4376a) {
        this.f91675a = bVar;
        this.f91676b = interfaceC4376a;
    }

    @NotNull
    public final ed.p<InterfaceC1946s, Integer, L0> b(int i10, @NotNull Object obj, @Nullable Object obj2) {
        CachedItemContent cachedItemContent = this.f91677c.get(obj);
        if (cachedItemContent != null && cachedItemContent.f91680c == i10 && kotlin.jvm.internal.G.g(cachedItemContent.f91679b, obj2)) {
            return cachedItemContent.d();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(i10, obj, obj2);
        this.f91677c.put(obj, cachedItemContent2);
        return cachedItemContent2.d();
    }

    @Nullable
    public final Object c(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = this.f91677c.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.f91679b;
        }
        InterfaceC1743q interfaceC1743qInvoke = this.f91676b.invoke();
        int iB = interfaceC1743qInvoke.b(obj);
        if (iB != -1) {
            return interfaceC1743qInvoke.d(iB);
        }
        return null;
    }

    @NotNull
    public final InterfaceC4376a<InterfaceC1743q> d() {
        return this.f91676b;
    }
}
