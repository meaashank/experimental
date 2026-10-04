package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AbstractC1661i;
import androidx.compose.foundation.interaction.a;
import androidx.compose.ui.input.pointer.C2150q;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.T;
import androidx.compose.ui.node.AbstractC2206j;
import androidx.compose.ui.node.InterfaceC2199e;
import androidx.compose.ui.node.r0;
import kotlin.L0;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5092j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DragGestureNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,652:1\n1#2:653\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class DragGestureNode extends AbstractC2206j implements r0, InterfaceC2199e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f89502A = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Orientation f89503r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public ed.l<? super androidx.compose.ui.input.pointer.A, Boolean> f89504s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f89505t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public androidx.compose.foundation.interaction.g f89506u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final ed.l<androidx.compose.ui.input.pointer.A, Boolean> f89507v = new ed.l<androidx.compose.ui.input.pointer.A, Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$_canDrag$1
        {
            super(1);
        }

        @Override // ed.l
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull androidx.compose.ui.input.pointer.A a10) {
            return this.f89512d.f89504s.invoke(a10);
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public kotlinx.coroutines.channels.g<AbstractC1661i> f89508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public a.b f89509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f89510y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.input.pointer.V f89511z;

    public DragGestureNode(@NotNull ed.l<? super androidx.compose.ui.input.pointer.A, Boolean> lVar, boolean z10, @Nullable androidx.compose.foundation.interaction.g gVar, @Nullable Orientation orientation) {
        this.f89503r = orientation;
        this.f89504s = lVar;
        this.f89505t = z10;
        this.f89506u = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void L3(DragGestureNode dragGestureNode, ed.l lVar, boolean z10, androidx.compose.foundation.interaction.g gVar, Orientation orientation, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i10 & 1) != 0) {
            lVar = dragGestureNode.f89504s;
        }
        if ((i10 & 2) != 0) {
            z10 = dragGestureNode.f89505t;
        }
        if ((i10 & 4) != 0) {
            gVar = dragGestureNode.f89506u;
        }
        if ((i10 & 8) != 0) {
            orientation = dragGestureNode.f89503r;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        androidx.compose.foundation.interaction.g gVar2 = gVar;
        ed.l lVar2 = lVar;
        dragGestureNode.K3(lVar2, z10, gVar2, orientation, z12);
    }

    @Override // androidx.compose.ui.node.r0
    public void A1(@NotNull C2150q c2150q, @NotNull PointerEventPass pointerEventPass, long j10) {
        if (this.f89505t && this.f89511z == null) {
            androidx.compose.ui.input.pointer.V vC3 = C3();
            e3(vC3);
            this.f89511z = vC3;
        }
        androidx.compose.ui.input.pointer.V v10 = this.f89511z;
        if (v10 != null) {
            v10.A1(c2150q, pointerEventPass, j10);
        }
    }

    public final boolean A3() {
        return this.f89505t;
    }

    @Nullable
    public final androidx.compose.foundation.interaction.g B3() {
        return this.f89506u;
    }

    public final androidx.compose.ui.input.pointer.V C3() {
        return T.a(new DragGestureNode$initializePointerInputNode$1(this, null));
    }

    public abstract void D3(long j10);

    public abstract void E3(long j10);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object F3(kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1) r0
            int r1 = r0.f89536d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89536d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f89534b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f89536d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f89533a
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.C4885d0.n(r6)
            goto L4f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.C4885d0.n(r6)
            androidx.compose.foundation.interaction.a$b r6 = r5.f89509x
            if (r6 == 0) goto L53
            androidx.compose.foundation.interaction.g r2 = r5.f89506u
            if (r2 == 0) goto L4e
            androidx.compose.foundation.interaction.a$a r4 = new androidx.compose.foundation.interaction.a$a
            r4.<init>(r6)
            r0.f89533a = r5
            r0.f89536d = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            r6 = 0
            r0.f89509x = r6
            goto L54
        L53:
            r0 = r5
        L54:
            k0.E$a r6 = k0.E.f214279b
            r6.getClass()
            long r1 = k0.E.f214280c
            r0.E3(r1)
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.F3(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r2.b(r5, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G3(androidx.compose.foundation.gestures.AbstractC1661i.c r7, kotlin.coroutines.e<? super kotlin.L0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1) r0
            int r1 = r0.f89542f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89542f = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f89540d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f89542f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r7 = r0.f89539c
            androidx.compose.foundation.interaction.a$b r7 = (androidx.compose.foundation.interaction.a.b) r7
            java.lang.Object r1 = r0.f89538b
            androidx.compose.foundation.gestures.i$c r1 = (androidx.compose.foundation.gestures.AbstractC1661i.c) r1
            java.lang.Object r0 = r0.f89537a
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.C4885d0.n(r8)
            goto L83
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            java.lang.Object r7 = r0.f89538b
            androidx.compose.foundation.gestures.i$c r7 = (androidx.compose.foundation.gestures.AbstractC1661i.c) r7
            java.lang.Object r2 = r0.f89537a
            androidx.compose.foundation.gestures.DragGestureNode r2 = (androidx.compose.foundation.gestures.DragGestureNode) r2
            kotlin.C4885d0.n(r8)
            goto L68
        L4a:
            kotlin.C4885d0.n(r8)
            androidx.compose.foundation.interaction.a$b r8 = r6.f89509x
            if (r8 == 0) goto L67
            androidx.compose.foundation.interaction.g r2 = r6.f89506u
            if (r2 == 0) goto L67
            androidx.compose.foundation.interaction.a$a r5 = new androidx.compose.foundation.interaction.a$a
            r5.<init>(r8)
            r0.f89537a = r6
            r0.f89538b = r7
            r0.f89542f = r4
            java.lang.Object r8 = r2.b(r5, r0)
            if (r8 != r1) goto L67
            goto L7f
        L67:
            r2 = r6
        L68:
            androidx.compose.foundation.interaction.a$b r8 = new androidx.compose.foundation.interaction.a$b
            r8.<init>()
            androidx.compose.foundation.interaction.g r4 = r2.f89506u
            if (r4 == 0) goto L86
            r0.f89537a = r2
            r0.f89538b = r7
            r0.f89539c = r8
            r0.f89542f = r3
            java.lang.Object r0 = r4.b(r8, r0)
            if (r0 != r1) goto L80
        L7f:
            return r1
        L80:
            r1 = r7
            r7 = r8
            r0 = r2
        L83:
            r8 = r7
            r2 = r0
            r7 = r1
        L86:
            r2.f89509x = r8
            long r7 = r7.f90036b
            r2.D3(r7)
            kotlin.L0 r7 = kotlin.L0.f217464a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.G3(androidx.compose.foundation.gestures.i$c, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H3(androidx.compose.foundation.gestures.AbstractC1661i.d r6, kotlin.coroutines.e<? super kotlin.L0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1) r0
            int r1 = r0.f89547e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89547e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f89545c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f89547e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f89544b
            androidx.compose.foundation.gestures.i$d r6 = (androidx.compose.foundation.gestures.AbstractC1661i.d) r6
            java.lang.Object r0 = r0.f89543a
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.C4885d0.n(r7)
            goto L55
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C4885d0.n(r7)
            androidx.compose.foundation.interaction.a$b r7 = r5.f89509x
            if (r7 == 0) goto L59
            androidx.compose.foundation.interaction.g r2 = r5.f89506u
            if (r2 == 0) goto L54
            androidx.compose.foundation.interaction.a$c r4 = new androidx.compose.foundation.interaction.a$c
            r4.<init>(r7)
            r0.f89543a = r5
            r0.f89544b = r6
            r0.f89547e = r3
            java.lang.Object r7 = r2.b(r4, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r5
        L55:
            r7 = 0
            r0.f89509x = r7
            goto L5a
        L59:
            r0 = r5
        L5a:
            long r6 = r6.f90038b
            r0.E3(r6)
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.H3(androidx.compose.foundation.gestures.i$d, kotlin.coroutines.e):java.lang.Object");
    }

    public abstract boolean I3();

    public final void J3() {
        this.f89510y = true;
        C5092j.f(B2(), null, null, new DragGestureNode$startListeningForEvents$1(this, null), 3, null);
    }

    public final void K3(@NotNull ed.l<? super androidx.compose.ui.input.pointer.A, Boolean> lVar, boolean z10, @Nullable androidx.compose.foundation.interaction.g gVar, @Nullable Orientation orientation, boolean z11) {
        androidx.compose.ui.input.pointer.V v10;
        this.f89504s = lVar;
        boolean z12 = true;
        if (this.f89505t != z10) {
            this.f89505t = z10;
            if (!z10) {
                x3();
                androidx.compose.ui.input.pointer.V v11 = this.f89511z;
                if (v11 != null) {
                    l3(v11);
                }
                this.f89511z = null;
            }
            z11 = true;
        }
        if (!kotlin.jvm.internal.G.g(this.f89506u, gVar)) {
            x3();
            this.f89506u = gVar;
        }
        if (this.f89503r != orientation) {
            this.f89503r = orientation;
        } else {
            z12 = z11;
        }
        if (!z12 || (v10 = this.f89511z) == null) {
            return;
        }
        v10.Q1();
    }

    @Override // androidx.compose.ui.p.d
    public void P2() {
        this.f89510y = false;
        x3();
    }

    @Override // androidx.compose.ui.node.r0
    public void d1() {
        androidx.compose.ui.input.pointer.V v10 = this.f89511z;
        if (v10 != null) {
            v10.d1();
        }
    }

    @Override // androidx.compose.ui.node.r0
    public void i2() {
        d1();
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

    public final void x3() {
        a.b bVar = this.f89509x;
        if (bVar != null) {
            androidx.compose.foundation.interaction.g gVar = this.f89506u;
            if (gVar != null) {
                gVar.a(new a.C0196a(bVar));
            }
            this.f89509x = null;
        }
    }

    @Nullable
    public abstract Object y3(@NotNull ed.p<? super ed.l<? super AbstractC1661i.b, L0>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super L0> eVar);

    @NotNull
    public final ed.l<androidx.compose.ui.input.pointer.A, Boolean> z3() {
        return this.f89504s;
    }
}
