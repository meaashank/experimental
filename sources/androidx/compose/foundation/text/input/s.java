package androidx.compose.foundation.text.input;

import androidx.compose.runtime.L0;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.snapshots.AbstractC1960k;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.collections.H;
import kotlin.collections.I;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n81#2:267\n107#2,2:268\n602#3,8:270\n602#3,8:278\n1#4:286\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager\n*L\n46#1:267\n46#1:268,2\n72#1:270,8\n97#1:278,8\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f94389c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94390d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final G.c<G.a> f94391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final L0 f94392b;

    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.s$a$a, reason: collision with other inner class name */
        @V({"SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager$Companion$Saver\n+ 2 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion\n*L\n1#1,266:1\n125#2:267\n171#2:268\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager$Companion$Saver\n*L\n104#1:267\n104#1:268\n*E\n"})
        @androidx.compose.runtime.internal.r(parameters = 0)
        public static final class C0217a implements androidx.compose.runtime.saveable.e<s, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0217a f94393a = new C0217a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final androidx.compose.runtime.saveable.e<G.c<G.a>, Object> f94394b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f94395c;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.s$a$a$a, reason: collision with other inner class name */
            @V({"SMAP\nUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,174:1\n33#2,6:175\n33#2,6:181\n*S KotlinDebug\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n*L\n140#1:175,6\n145#1:181,6\n*E\n"})
            public static final class C0218a implements androidx.compose.runtime.saveable.e<G.c<G.a>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.runtime.saveable.e f94396a;

                public C0218a(androidx.compose.runtime.saveable.e eVar) {
                    this.f94396a = eVar;
                }

                @Override // androidx.compose.runtime.saveable.e
                @NotNull
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public G.c<G.a> b(@NotNull Object obj) {
                    G.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                    List list = (List) obj;
                    int iIntValue = ((Number) list.get(0)).intValue();
                    int iIntValue2 = ((Number) list.get(1)).intValue();
                    int iIntValue3 = ((Number) list.get(2)).intValue();
                    androidx.compose.runtime.saveable.e eVar = this.f94396a;
                    List listJ = H.j();
                    int i10 = 3;
                    while (i10 < iIntValue2 + 3) {
                        Object objB = eVar.b(list.get(i10));
                        G.m(objB);
                        ((ListBuilder) listJ).add(objB);
                        i10++;
                    }
                    List listB = H.b(listJ);
                    androidx.compose.runtime.saveable.e eVar2 = this.f94396a;
                    List listJ2 = H.j();
                    while (i10 < iIntValue2 + iIntValue3 + 3) {
                        Object objB2 = eVar2.b(list.get(i10));
                        G.m(objB2);
                        ((ListBuilder) listJ2).add(objB2);
                        i10++;
                    }
                    return new G.c<>(listB, H.b(listJ2), iIntValue);
                }

                @Override // androidx.compose.runtime.saveable.e
                @NotNull
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public Object a(@NotNull androidx.compose.runtime.saveable.f fVar, @NotNull G.c<G.a> cVar) {
                    androidx.compose.runtime.saveable.e eVar = this.f94396a;
                    List listJ = H.j();
                    ListBuilder listBuilder = (ListBuilder) listJ;
                    listBuilder.add(Integer.valueOf(cVar.f40024a));
                    listBuilder.add(Integer.valueOf(cVar.f40025b.getSize()));
                    listBuilder.add(Integer.valueOf(cVar.f40026c.getSize()));
                    SnapshotStateList<G.a> snapshotStateList = cVar.f40025b;
                    int size = snapshotStateList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        listBuilder.add(eVar.a(fVar, snapshotStateList.get(i10)));
                    }
                    SnapshotStateList<G.a> snapshotStateList2 = cVar.f40026c;
                    int size2 = snapshotStateList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        listBuilder.add(eVar.a(fVar, snapshotStateList2.get(i11)));
                    }
                    return H.b(listJ);
                }
            }

            static {
                G.a.f40011i.getClass();
                f94394b = new C0218a(G.a.f40013k);
                f94395c = 8;
            }

            @Override // androidx.compose.runtime.saveable.e
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public s b(@NotNull Object obj) {
                G.a aVarB;
                G.n(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                if (obj2 != null) {
                    G.a.f40011i.getClass();
                    aVarB = G.a.f40013k.b(obj2);
                } else {
                    aVarB = null;
                }
                androidx.compose.runtime.saveable.e<G.c<G.a>, Object> eVar = f94394b;
                G.m(obj3);
                G.c<G.a> cVarB = eVar.b(obj3);
                G.m(cVarB);
                return new s(aVarB, cVarB);
            }

            @Override // androidx.compose.runtime.saveable.e
            @NotNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object a(@NotNull androidx.compose.runtime.saveable.f fVar, @NotNull s sVar) {
                Object objA;
                G.a aVarG = sVar.g();
                if (aVarG != null) {
                    G.a.f40011i.getClass();
                    objA = G.a.f40013k.a(fVar, aVarG);
                } else {
                    objA = null;
                }
                return I.Q(objA, f94394b.a(fVar, sVar.f94391a));
            }
        }

        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final void c() {
        j(null);
        this.f94391a.d();
    }

    public final void d() {
        AbstractC1960k.a aVar = AbstractC1960k.f100175e;
        AbstractC1960k abstractC1960kG = aVar.g();
        ed.l<Object, kotlin.L0> lVarK = abstractC1960kG != null ? abstractC1960kG.k() : null;
        AbstractC1960k abstractC1960kM = aVar.m(abstractC1960kG);
        try {
            G.a aVarG = g();
            if (aVarG != null) {
                this.f94391a.h(aVarG);
            }
            j(null);
        } finally {
            aVar.x(abstractC1960kG, abstractC1960kM, lVarK);
        }
    }

    public final boolean e() {
        return this.f94391a.e() && g() == null;
    }

    public final boolean f() {
        return this.f94391a.f() || g() != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final G.a g() {
        return (G.a) this.f94392b.getValue();
    }

    public final void h(@NotNull G.a aVar) {
        AbstractC1960k.a aVar2 = AbstractC1960k.f100175e;
        AbstractC1960k abstractC1960kG = aVar2.g();
        ed.l<Object, kotlin.L0> lVarK = abstractC1960kG != null ? abstractC1960kG.k() : null;
        AbstractC1960k abstractC1960kM = aVar2.m(abstractC1960kG);
        try {
            G.a aVarG = g();
            if (aVarG == null) {
                j(aVar);
                return;
            }
            G.a aVarB = t.b(aVarG, aVar);
            if (aVarB != null) {
                j(aVarB);
            } else {
                d();
                j(aVar);
            }
        } finally {
            aVar2.x(abstractC1960kG, abstractC1960kM, lVarK);
        }
    }

    public final void i(@NotNull p pVar) {
        if (e()) {
            G.b.a(pVar, this.f94391a.i());
        }
    }

    public final void j(G.a aVar) {
        this.f94392b.setValue(aVar);
    }

    public final void k(@NotNull p pVar) {
        if (f()) {
            d();
            G.b.b(pVar, this.f94391a.j());
        }
    }

    public s(@Nullable G.a aVar, @NotNull G.c<G.a> cVar) {
        this.f94391a = cVar;
        this.f94392b = M1.g(aVar, null, 2, null);
    }

    public /* synthetic */ s(G.a aVar, G.c cVar, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? new G.c(null, null, 100, 3, null) : cVar);
    }
}
