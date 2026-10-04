package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.InterfaceC2168g0;
import androidx.compose.ui.layout.InterfaceC2188x;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nAwaitFirstLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwaitFirstLayoutModifier.kt\nandroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class AwaitFirstLayoutModifier implements InterfaceC2168g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f91526c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f91527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public kotlin.coroutines.e<? super L0> f91528b;

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object M(Object obj, ed.p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public /* synthetic */ boolean O(ed.l lVar) {
        return androidx.compose.ui.q.b(this, lVar);
    }

    @Override // androidx.compose.ui.p
    public /* synthetic */ androidx.compose.ui.p P0(androidx.compose.ui.p pVar) {
        return androidx.compose.ui.o.a(this, pVar);
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public /* synthetic */ boolean S(ed.l lVar) {
        return androidx.compose.ui.q.a(this, lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1) r0
            int r1 = r0.f91533e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91533e = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f91531c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f91533e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.f91530b
            kotlin.coroutines.e r1 = (kotlin.coroutines.e) r1
            java.lang.Object r0 = r0.f91529a
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier) r0
            kotlin.C4885d0.n(r5)
            goto L59
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.C4885d0.n(r5)
            boolean r5 = r4.f91527a
            if (r5 != 0) goto L60
            kotlin.coroutines.e<? super kotlin.L0> r5 = r4.f91528b
            r0.f91529a = r4
            r0.f91530b = r5
            r0.f91533e = r3
            kotlin.coroutines.l r2 = new kotlin.coroutines.l
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)
            r2.<init>(r0)
            r4.f91528b = r2
            java.lang.Object r0 = r2.a()
            if (r0 != r1) goto L58
            return r1
        L58:
            r1 = r5
        L59:
            if (r1 == 0) goto L60
            kotlin.L0 r5 = kotlin.L0.f217464a
            r1.resumeWith(r5)
        L60:
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.a(kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object l0(Object obj, ed.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // androidx.compose.ui.layout.InterfaceC2168g0
    public void n0(@NotNull InterfaceC2188x interfaceC2188x) {
        if (this.f91527a) {
            return;
        }
        this.f91527a = true;
        kotlin.coroutines.e<? super L0> eVar = this.f91528b;
        if (eVar != null) {
            eVar.resumeWith(L0.f217464a);
        }
        this.f91528b = null;
    }
}
