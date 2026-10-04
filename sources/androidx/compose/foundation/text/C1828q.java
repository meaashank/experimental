package androidx.compose.foundation.text;

import androidx.collection.G0;
import androidx.compose.foundation.interaction.b;
import androidx.compose.foundation.interaction.c;
import androidx.compose.foundation.interaction.i;
import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.H0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.text.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLinkStateInteractionSourceObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkStateInteractionSourceObserver.kt\nandroidx/compose/foundation/text/LinkStateInteractionSourceObserver\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1#1,68:1\n1580#2:69\n*S KotlinDebug\n*F\n+ 1 LinkStateInteractionSourceObserver.kt\nandroidx/compose/foundation/text/LinkStateInteractionSourceObserver\n*L\n34#1:69\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C1828q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f94592e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94593a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94594b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94595c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final H0 f94596d = ActualAndroid_androidKt.c(0);

    /* JADX INFO: renamed from: androidx.compose.foundation.text.q$a */
    @kotlin.jvm.internal.V({"SMAP\nLinkStateInteractionSourceObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkStateInteractionSourceObserver.kt\nandroidx/compose/foundation/text/LinkStateInteractionSourceObserver$collectInteractionsForLinks$2\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,68:1\n305#2,6:69\n*S KotlinDebug\n*F\n+ 1 LinkStateInteractionSourceObserver.kt\nandroidx/compose/foundation/text/LinkStateInteractionSourceObserver$collectInteractionsForLinks$2\n*L\n48#1:69,6\n*E\n"})
    public static final class a<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G0<androidx.compose.foundation.interaction.d> f94597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1828q f94598b;

        public a(G0<androidx.compose.foundation.interaction.d> g02, C1828q c1828q) {
            this.f94597a = g02;
            this.f94598b = c1828q;
        }

        @Override // kotlinx.coroutines.flow.f
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@NotNull androidx.compose.foundation.interaction.d dVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
            int i10;
            if (dVar instanceof c.a ? true : dVar instanceof b.a ? true : dVar instanceof i.b) {
                this.f94597a.Z(dVar);
            } else if (dVar instanceof c.b) {
                this.f94597a.B0(((c.b) dVar).f90152a);
            } else if (dVar instanceof b.C0197b) {
                this.f94597a.B0(((b.C0197b) dVar).f90149a);
            } else if (dVar instanceof i.c) {
                this.f94597a.B0(((i.c) dVar).f90159a);
            } else if (dVar instanceof i.a) {
                this.f94597a.B0(((i.a) dVar).f90155a);
            }
            G0<androidx.compose.foundation.interaction.d> g02 = this.f94597a;
            C1828q c1828q = this.f94598b;
            Object[] objArr = g02.f86809a;
            int i11 = g02.f86810b;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                androidx.compose.foundation.interaction.d dVar2 = (androidx.compose.foundation.interaction.d) objArr[i13];
                if (dVar2 instanceof c.a) {
                    i10 = c1828q.f94594b;
                } else if (dVar2 instanceof b.a) {
                    i10 = c1828q.f94593a;
                } else if (dVar2 instanceof i.b) {
                    i10 = c1828q.f94595c;
                }
                i12 |= i10;
            }
            this.f94598b.f94596d.setIntValue(i12);
            return L0.f217464a;
        }
    }

    @Nullable
    public final Object e(@NotNull androidx.compose.foundation.interaction.e eVar, @NotNull kotlin.coroutines.e<? super L0> eVar2) {
        Object objCollect = eVar.c().collect(new a(new G0(0, 1, null), this), eVar2);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : L0.f217464a;
    }

    public final boolean f() {
        return (this.f94596d.getIntValue() & this.f94593a) != 0;
    }

    public final boolean g() {
        return (this.f94596d.getIntValue() & this.f94594b) != 0;
    }

    public final boolean h() {
        return (this.f94596d.getIntValue() & this.f94595c) != 0;
    }
}
