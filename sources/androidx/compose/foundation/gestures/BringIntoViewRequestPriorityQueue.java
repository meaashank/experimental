package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import java.util.concurrent.CancellationException;
import kotlin.L0;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.InterfaceC5100n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nBringIntoViewRequestPriorityQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1208#2:139\n1187#2,2:140\n53#3:142\n523#3:143\n523#3:144\n492#3,11:145\n53#3:156\n523#3:157\n48#3:158\n664#3,2:159\n523#3:161\n13579#4,2:162\n1#5:164\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n*L\n43#1:139\n43#1:140,2\n72#1:142\n73#1:143\n91#1:144\n107#1:145,11\n111#1:156\n112#1:157\n121#1:158\n132#1:159,2\n132#1:161\n132#1:162,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class BringIntoViewRequestPriorityQueue {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f89250b = androidx.compose.runtime.collection.c.f99563d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.collection.c<ContentInViewNode.a> f89251a = new androidx.compose.runtime.collection.c<>(new ContentInViewNode.a[16], 0);

    public final void b(@Nullable Throwable th) {
        androidx.compose.runtime.collection.c<ContentInViewNode.a> cVar = this.f89251a;
        int i10 = cVar.f99566c;
        InterfaceC5100n[] interfaceC5100nArr = new InterfaceC5100n[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC5100nArr[i11] = cVar.f99564a[i11].f89274b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            interfaceC5100nArr[i12].g(th);
        }
        if (!this.f89251a.U()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public final boolean c(@NotNull final ContentInViewNode.a aVar) {
        P.j jVarInvoke = aVar.f89273a.invoke();
        if (jVarInvoke == null) {
            aVar.f89274b.resumeWith(L0.f217464a);
            return false;
        }
        aVar.f89274b.k0(new ed.l<Throwable, L0>() { // from class: androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue$enqueue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(@Nullable Throwable th) {
                this.f89252d.f89251a.h0(aVar);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(Throwable th) {
                e(th);
                return L0.f217464a;
            }
        });
        int i10 = new md.l(0, this.f89251a.f99566c - 1, 1).f221140b;
        if (i10 >= 0) {
            while (true) {
                P.j jVarInvoke2 = this.f89251a.f99564a[i10].f89273a.invoke();
                if (jVarInvoke2 != null) {
                    P.j jVarK = jVarInvoke.K(jVarInvoke2);
                    if (jVarK.equals(jVarInvoke)) {
                        this.f89251a.a(i10 + 1, aVar);
                        return true;
                    }
                    if (!jVarK.equals(jVarInvoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int i11 = this.f89251a.f99566c - 1;
                        if (i11 <= i10) {
                            while (true) {
                                this.f89251a.f99564a[i10].f89274b.g(cancellationException);
                                if (i11 == i10) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                }
                if (i10 == 0) {
                    break;
                }
                i10--;
            }
        }
        this.f89251a.a(0, aVar);
        return true;
    }

    public final void d(@NotNull ed.l<? super P.j, L0> lVar) {
        androidx.compose.runtime.collection.c<ContentInViewNode.a> cVar = this.f89251a;
        int i10 = cVar.f99566c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ContentInViewNode.a[] aVarArr = cVar.f99564a;
            do {
                lVar.invoke(aVarArr[i11].f89273a.invoke());
                i11--;
            } while (i11 >= 0);
        }
    }

    public final int e() {
        return this.f89251a.f99566c;
    }

    public final boolean f() {
        return this.f89251a.U();
    }

    public final void g() {
        int i10 = 0;
        int i11 = new md.l(0, this.f89251a.f99566c - 1, 1).f221140b;
        if (i11 >= 0) {
            while (true) {
                this.f89251a.f99564a[i10].f89274b.resumeWith(L0.f217464a);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f89251a.q();
    }

    public final void h(@NotNull ed.l<? super P.j, Boolean> lVar) {
        while (this.f89251a.V() && lVar.invoke(this.f89251a.W().f89273a.invoke()).booleanValue()) {
            this.f89251a.l0(r0.f99566c - 1).f89274b.resumeWith(L0.f217464a);
        }
    }
}
