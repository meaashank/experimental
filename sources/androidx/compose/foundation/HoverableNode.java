package androidx.compose.foundation;

import androidx.compose.foundation.interaction.c;
import androidx.compose.ui.input.pointer.C2150q;
import androidx.compose.ui.input.pointer.C2152t;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.p;
import kotlinx.coroutines.C5092j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class HoverableNode extends p.d implements androidx.compose.ui.node.r0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public androidx.compose.foundation.interaction.g f88710o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public c.a f88711p;

    public HoverableNode(@NotNull androidx.compose.foundation.interaction.g gVar) {
        this.f88710o = gVar;
    }

    @Override // androidx.compose.ui.node.r0
    public void A1(@NotNull C2150q c2150q, @NotNull PointerEventPass pointerEventPass, long j10) {
        if (pointerEventPass == PointerEventPass.Main) {
            int i10 = c2150q.f102322e;
            C2152t.a aVar = C2152t.f102323b;
            aVar.getClass();
            if (i10 == C2152t.f102328g) {
                C5092j.f(B2(), null, null, new HoverableNode$onPointerEvent$1(this, null), 3, null);
                return;
            }
            aVar.getClass();
            if (i10 == C2152t.f102329h) {
                C5092j.f(B2(), null, null, new HoverableNode$onPointerEvent$2(this, null), 3, null);
            }
        }
    }

    @Override // androidx.compose.ui.p.d
    public void P2() {
        i3();
    }

    @Override // androidx.compose.ui.node.r0
    public void d1() {
        i3();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g3(kotlin.coroutines.e<? super kotlin.L0> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.HoverableNode$emitEnter$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.HoverableNode$emitEnter$1 r0 = (androidx.compose.foundation.HoverableNode$emitEnter$1) r0
            int r1 = r0.f88716e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f88716e = r1
            goto L18
        L13:
            androidx.compose.foundation.HoverableNode$emitEnter$1 r0 = new androidx.compose.foundation.HoverableNode$emitEnter$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f88714c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f88716e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.f88713b
            androidx.compose.foundation.interaction.c$a r1 = (androidx.compose.foundation.interaction.c.a) r1
            java.lang.Object r0 = r0.f88712a
            androidx.compose.foundation.HoverableNode r0 = (androidx.compose.foundation.HoverableNode) r0
            kotlin.C4885d0.n(r5)
            goto L54
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.C4885d0.n(r5)
            androidx.compose.foundation.interaction.c$a r5 = r4.f88711p
            if (r5 != 0) goto L56
            androidx.compose.foundation.interaction.c$a r5 = new androidx.compose.foundation.interaction.c$a
            r5.<init>()
            androidx.compose.foundation.interaction.g r2 = r4.f88710o
            r0.f88712a = r4
            r0.f88713b = r5
            r0.f88716e = r3
            java.lang.Object r0 = r2.b(r5, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r0 = r4
            r1 = r5
        L54:
            r0.f88711p = r1
        L56:
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.g3(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h3(kotlin.coroutines.e<? super kotlin.L0> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.HoverableNode$emitExit$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.HoverableNode$emitExit$1 r0 = (androidx.compose.foundation.HoverableNode$emitExit$1) r0
            int r1 = r0.f88720d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f88720d = r1
            goto L18
        L13:
            androidx.compose.foundation.HoverableNode$emitExit$1 r0 = new androidx.compose.foundation.HoverableNode$emitExit$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f88718b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f88720d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f88717a
            androidx.compose.foundation.HoverableNode r0 = (androidx.compose.foundation.HoverableNode) r0
            kotlin.C4885d0.n(r5)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C4885d0.n(r5)
            androidx.compose.foundation.interaction.c$a r5 = r4.f88711p
            if (r5 == 0) goto L50
            androidx.compose.foundation.interaction.c$b r2 = new androidx.compose.foundation.interaction.c$b
            r2.<init>(r5)
            androidx.compose.foundation.interaction.g r5 = r4.f88710o
            r0.f88717a = r4
            r0.f88720d = r3
            java.lang.Object r5 = r5.b(r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r0 = r4
        L4d:
            r5 = 0
            r0.f88711p = r5
        L50:
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.h3(kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.node.r0
    public void i2() {
        d1();
    }

    public final void i3() {
        c.a aVar = this.f88711p;
        if (aVar != null) {
            this.f88710o.a(new c.b(aVar));
            this.f88711p = null;
        }
    }

    public final void j3(@NotNull androidx.compose.foundation.interaction.g gVar) {
        if (kotlin.jvm.internal.G.g(this.f88710o, gVar)) {
            return;
        }
        i3();
        this.f88710o = gVar;
    }

    @Override // androidx.compose.ui.node.r0
    public /* synthetic */ boolean q2() {
        return false;
    }

    @Override // androidx.compose.ui.node.r0
    public void u2() {
        d1();
    }

    @Override // androidx.compose.ui.node.r0
    public /* synthetic */ boolean w0() {
        return false;
    }
}
