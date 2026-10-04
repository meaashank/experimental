package androidx.compose.ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.collection.T0;
import androidx.compose.ui.node.AbstractC2206j;
import androidx.compose.ui.node.C2204h;
import androidx.compose.ui.p;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,154:1\n267#2,4:155\n237#2,7:159\n248#2,3:167\n251#2,2:171\n272#2:173\n273#2:284\n254#2,6:285\n274#2:291\n267#2,4:292\n237#2,7:296\n248#2,3:304\n251#2,2:308\n272#2:310\n273#2:421\n254#2,6:422\n274#2:428\n267#2,4:429\n237#2,7:433\n248#2,3:441\n251#2,2:445\n272#2,2:447\n254#2,6:449\n274#2:455\n1810#3:166\n1672#3:170\n1810#3:303\n1672#3:307\n1810#3:440\n1672#3:444\n96#4:174\n96#4:311\n303#5:175\n432#5,6:176\n442#5,2:183\n444#5,8:188\n452#5,9:199\n461#5,8:211\n304#5:219\n137#5:220\n138#5,8:222\n146#5,9:231\n432#5,37:240\n155#5,6:277\n305#5:283\n303#5:312\n432#5,6:313\n442#5,2:320\n444#5,8:325\n452#5,9:336\n461#5,8:348\n304#5:356\n137#5:357\n138#5,8:359\n146#5,9:368\n432#5,37:377\n155#5,6:414\n305#5:420\n249#6:182\n249#6:319\n245#7,3:185\n248#7,3:208\n245#7,3:322\n248#7,3:345\n1208#8:196\n1187#8,2:197\n1208#8:333\n1187#8,2:334\n1#9:221\n1#9:358\n48#10:230\n48#10:367\n42#11,7:456\n42#11,7:463\n42#11,7:470\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n*L\n70#1:155,4\n70#1:159,7\n70#1:167,3\n70#1:171,2\n70#1:173\n70#1:284\n70#1:285,6\n70#1:291\n82#1:292,4\n82#1:296,7\n82#1:304,3\n82#1:308,2\n82#1:310\n82#1:421\n82#1:422,6\n82#1:428\n130#1:429,4\n130#1:433,7\n130#1:441,3\n130#1:445,2\n130#1:447,2\n130#1:449,6\n130#1:455\n70#1:166\n70#1:170\n82#1:303\n82#1:307\n130#1:440\n130#1:444\n75#1:174\n96#1:311\n75#1:175\n75#1:176,6\n75#1:183,2\n75#1:188,8\n75#1:199,9\n75#1:211,8\n75#1:219\n75#1:220\n75#1:222,8\n75#1:231,9\n75#1:240,37\n75#1:277,6\n75#1:283\n96#1:312\n96#1:313,6\n96#1:320,2\n96#1:325,8\n96#1:336,9\n96#1:348,8\n96#1:356\n96#1:357\n96#1:359,8\n96#1:368,9\n96#1:377,37\n96#1:414,6\n96#1:420\n75#1:182\n96#1:319\n75#1:185,3\n75#1:208,3\n96#1:322,3\n96#1:345,3\n75#1:196\n75#1:197,2\n96#1:333\n96#1:334,2\n75#1:221\n96#1:358\n75#1:230\n96#1:367\n149#1:456,7\n150#1:463,7\n151#1:470,7\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class FocusInvalidationManager {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f100543g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.l<InterfaceC4376a<L0>, L0> f100544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<L0> f100545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableScatterSet<FocusTargetNode> f100546c = T0.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableScatterSet<InterfaceC1993h> f100547d = T0.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableScatterSet<x> f100548e = T0.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableScatterSet<FocusTargetNode> f100549f = T0.b();

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(@NotNull ed.l<? super InterfaceC4376a<L0>, L0> lVar, @NotNull InterfaceC4376a<L0> interfaceC4376a) {
        this.f100544a = lVar;
        this.f100545b = interfaceC4376a;
    }

    public final boolean b() {
        return this.f100546c.s() || this.f100548e.s() || this.f100547d.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.compose.ui.focus.FocusTargetNode] */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.p$d] */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    public final void c() {
        char c10;
        long j10;
        long j11;
        Throwable th;
        int i10;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        long j12;
        H hY1;
        androidx.compose.runtime.collection.c cVar;
        ?? cVar2;
        ?? L10;
        androidx.compose.runtime.collection.c cVar3;
        ?? r14;
        Object[] objArr3;
        long j13;
        ?? cVar4;
        ?? L11;
        long[] jArr3;
        long[] jArr4;
        char c11;
        int i11;
        long[] jArr5;
        long[] jArr6;
        int i12;
        MutableScatterSet<x> mutableScatterSet = this.f100548e;
        Object[] objArr4 = mutableScatterSet.f86877b;
        long[] jArr7 = mutableScatterSet.f86876a;
        int length = jArr7.length - 2;
        char c12 = 7;
        int i13 = 16;
        int i14 = 8;
        int i15 = 1;
        if (length >= 0) {
            int i16 = 0;
            j10 = 255;
            while (true) {
                long j14 = jArr7[i16];
                j11 = -9187201950435737472L;
                if ((((~j14) << c12) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j14 & 255) < 128) {
                            x xVar = (x) objArr4[(i16 << 3) + i18];
                            c11 = c12;
                            if (xVar.g0().f103127m) {
                                p.d dVarG0 = xVar.g0();
                                androidx.compose.runtime.collection.c cVar5 = null;
                                while (dVarG0 != null) {
                                    if (dVarG0 instanceof FocusTargetNode) {
                                        this.f100546c.C((FocusTargetNode) dVarG0);
                                    } else if ((dVarG0.f103117c & 1024) != 0 && (dVarG0 instanceof AbstractC2206j)) {
                                        p.d dVar = ((AbstractC2206j) dVarG0).f103066p;
                                        i12 = i14;
                                        int i19 = 0;
                                        while (dVar != null) {
                                            if ((dVar.f103117c & 1024) != 0) {
                                                i19++;
                                                if (i19 == i15) {
                                                    dVarG0 = dVar;
                                                } else {
                                                    androidx.compose.runtime.collection.c cVar6 = cVar5 == null ? new androidx.compose.runtime.collection.c(new p.d[i13], 0) : cVar5;
                                                    if (dVarG0 != null) {
                                                        cVar6.b(dVarG0);
                                                        dVarG0 = null;
                                                    }
                                                    cVar6.b(dVar);
                                                    cVar5 = cVar6;
                                                }
                                            }
                                            dVar = dVar.f103120f;
                                            i13 = 16;
                                            i15 = 1;
                                        }
                                        int i20 = i15;
                                        if (i19 == i20) {
                                            i15 = i20;
                                            i14 = i12;
                                            i13 = 16;
                                        } else {
                                            dVarG0 = C2204h.l(cVar5);
                                            i14 = i12;
                                            i13 = 16;
                                            i15 = 1;
                                        }
                                    }
                                    i12 = i14;
                                    dVarG0 = C2204h.l(cVar5);
                                    i14 = i12;
                                    i13 = 16;
                                    i15 = 1;
                                }
                                i11 = i14;
                                if (!xVar.g0().f103127m) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                androidx.compose.runtime.collection.c cVar7 = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                p.d dVar2 = xVar.g0().f103120f;
                                if (dVar2 == null) {
                                    C2204h.c(cVar7, xVar.g0());
                                } else {
                                    cVar7.b(dVar2);
                                }
                                while (cVar7.V()) {
                                    p.d dVarL = (p.d) cVar7.l0(cVar7.f99566c - 1);
                                    if ((dVarL.f103118d & 1024) == 0) {
                                        C2204h.c(cVar7, dVarL);
                                    } else {
                                        while (true) {
                                            if (dVarL == null) {
                                                break;
                                            }
                                            if ((dVarL.f103117c & 1024) != 0) {
                                                androidx.compose.runtime.collection.c cVar8 = null;
                                                while (dVarL != null) {
                                                    if (dVarL instanceof FocusTargetNode) {
                                                        this.f100546c.C((FocusTargetNode) dVarL);
                                                    } else {
                                                        if ((dVarL.f103117c & 1024) != 0 && (dVarL instanceof AbstractC2206j)) {
                                                            p.d dVar3 = ((AbstractC2206j) dVarL).f103066p;
                                                            int i21 = 0;
                                                            while (dVar3 != null) {
                                                                if ((dVar3.f103117c & 1024) != 0) {
                                                                    i21++;
                                                                    if (i21 == 1) {
                                                                        jArr6 = jArr7;
                                                                        dVarL = dVar3;
                                                                    } else {
                                                                        if (cVar8 == null) {
                                                                            jArr6 = jArr7;
                                                                            cVar8 = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                                                        } else {
                                                                            jArr6 = jArr7;
                                                                        }
                                                                        if (dVarL != null) {
                                                                            cVar8.b(dVarL);
                                                                            dVarL = null;
                                                                        }
                                                                        cVar8.b(dVar3);
                                                                    }
                                                                } else {
                                                                    jArr6 = jArr7;
                                                                }
                                                                dVar3 = dVar3.f103120f;
                                                                jArr7 = jArr6;
                                                            }
                                                            jArr5 = jArr7;
                                                            if (i21 == 1) {
                                                            }
                                                            jArr7 = jArr5;
                                                        }
                                                        dVarL = C2204h.l(cVar8);
                                                        jArr7 = jArr5;
                                                    }
                                                    jArr5 = jArr7;
                                                    dVarL = C2204h.l(cVar8);
                                                    jArr7 = jArr5;
                                                }
                                            } else {
                                                dVarL = dVarL.f103120f;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i11 = i14;
                            }
                            jArr4 = jArr7;
                        } else {
                            jArr4 = jArr7;
                            c11 = c12;
                            i11 = i14;
                        }
                        j14 >>= i11;
                        i18++;
                        jArr7 = jArr4;
                        c12 = c11;
                        i14 = i11;
                        i13 = 16;
                        i15 = 1;
                    }
                    jArr3 = jArr7;
                    c10 = c12;
                    th = null;
                    if (i17 != i14) {
                        break;
                    }
                } else {
                    jArr3 = jArr7;
                    c10 = c12;
                    th = null;
                }
                if (i16 == length) {
                    break;
                }
                i16++;
                jArr7 = jArr3;
                c12 = c10;
                i13 = 16;
                i14 = 8;
                i15 = 1;
            }
        } else {
            c10 = 7;
            j10 = 255;
            j11 = -9187201950435737472L;
            th = null;
        }
        this.f100548e.K();
        MutableScatterSet<InterfaceC1993h> mutableScatterSet2 = this.f100547d;
        Object[] objArr5 = mutableScatterSet2.f86877b;
        long[] jArr8 = mutableScatterSet2.f86876a;
        int length2 = jArr8.length - 2;
        if (length2 >= 0) {
            int i22 = 0;
            while (true) {
                long j15 = jArr8[i22];
                if ((((~j15) << c10) & j15 & j11) != j11) {
                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                    int i24 = 0;
                    while (i24 < i23) {
                        if ((j15 & j10) < 128) {
                            InterfaceC1993h interfaceC1993h = (InterfaceC1993h) objArr5[(i22 << 3) + i24];
                            if (interfaceC1993h.g0().f103127m) {
                                Throwable th2 = th;
                                ?? r15 = th2;
                                boolean z10 = false;
                                boolean z11 = true;
                                ?? G02 = interfaceC1993h.g0();
                                ?? r142 = th2;
                                while (G02 != 0) {
                                    long[] jArr9 = jArr8;
                                    if (G02 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode = (FocusTargetNode) G02;
                                        if (r142 != 0) {
                                            z10 = true;
                                        }
                                        if (this.f100546c.e(focusTargetNode)) {
                                            this.f100549f.C(focusTargetNode);
                                            z11 = false;
                                        }
                                        objArr3 = objArr5;
                                        j13 = j15;
                                        r142 = focusTargetNode;
                                        cVar4 = r15;
                                    } else if ((G02.f103117c & 1024) == 0 || !(G02 instanceof AbstractC2206j)) {
                                        objArr3 = objArr5;
                                        j13 = j15;
                                        r142 = r142;
                                        cVar4 = r15;
                                    } else {
                                        p.d dVar4 = ((AbstractC2206j) G02).f103066p;
                                        objArr3 = objArr5;
                                        int i25 = 0;
                                        L11 = G02;
                                        cVar4 = r15;
                                        while (dVar4 != null) {
                                            long j16 = j15;
                                            if ((dVar4.f103117c & 1024) != 0) {
                                                i25++;
                                                cVar4 = cVar4;
                                                if (i25 == 1) {
                                                    L11 = dVar4;
                                                } else {
                                                    if (cVar4 == 0) {
                                                        cVar4 = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                                    }
                                                    if (L11 != 0) {
                                                        cVar4.b(L11);
                                                        L11 = th;
                                                    }
                                                    cVar4.b(dVar4);
                                                }
                                            }
                                            dVar4 = dVar4.f103120f;
                                            j15 = j16;
                                            L11 = L11;
                                            cVar4 = cVar4;
                                        }
                                        j13 = j15;
                                        r142 = r142;
                                        cVar4 = cVar4;
                                        if (i25 == 1) {
                                        }
                                        jArr8 = jArr9;
                                        objArr5 = objArr3;
                                        j15 = j13;
                                        G02 = L11;
                                        r142 = r142;
                                        r15 = cVar4;
                                    }
                                    L11 = C2204h.l(cVar4);
                                    jArr8 = jArr9;
                                    objArr5 = objArr3;
                                    j15 = j13;
                                    G02 = L11;
                                    r142 = r142;
                                    r15 = cVar4;
                                }
                                jArr2 = jArr8;
                                objArr2 = objArr5;
                                j12 = j15;
                                if (!interfaceC1993h.g0().f103127m) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                androidx.compose.runtime.collection.c cVar9 = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                p.d dVar5 = interfaceC1993h.g0().f103120f;
                                if (dVar5 == null) {
                                    C2204h.c(cVar9, interfaceC1993h.g0());
                                } else {
                                    cVar9.b(dVar5);
                                }
                                while (cVar9.V()) {
                                    p.d dVar6 = (p.d) cVar9.l0(cVar9.f99566c - 1);
                                    int i26 = dVar6.f103118d & 1024;
                                    if (i26 == 0) {
                                        C2204h.c(cVar9, dVar6);
                                    } else {
                                        for (p.d dVar7 = dVar6; dVar7 != null; dVar7 = dVar7.f103120f) {
                                            if ((dVar7.f103117c & 1024) != 0) {
                                                ?? r52 = th;
                                                ?? r22 = dVar7;
                                                r142 = r142;
                                                while (r22 != 0) {
                                                    if (r22 instanceof FocusTargetNode) {
                                                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) r22;
                                                        if (r142 != 0) {
                                                            z10 = true;
                                                        }
                                                        if (this.f100546c.e(focusTargetNode2)) {
                                                            this.f100549f.C(focusTargetNode2);
                                                            z11 = false;
                                                        }
                                                        cVar = cVar9;
                                                        r14 = focusTargetNode2;
                                                    } else if ((r22.f103117c & 1024) == 0 || !(r22 instanceof AbstractC2206j)) {
                                                        cVar = cVar9;
                                                        r14 = r142;
                                                    } else {
                                                        p.d dVar8 = ((AbstractC2206j) r22).f103066p;
                                                        int i27 = 0;
                                                        L10 = r22;
                                                        cVar2 = r52;
                                                        while (dVar8 != null) {
                                                            if ((dVar8.f103117c & 1024) != 0) {
                                                                i27++;
                                                                if (i27 == 1) {
                                                                    cVar3 = cVar9;
                                                                    L10 = dVar8;
                                                                } else {
                                                                    if (cVar2 == 0) {
                                                                        cVar3 = cVar9;
                                                                        cVar2 = new androidx.compose.runtime.collection.c(new p.d[16], 0);
                                                                    } else {
                                                                        cVar3 = cVar9;
                                                                        cVar2 = cVar2;
                                                                    }
                                                                    if (L10 != 0) {
                                                                        cVar2.b(L10);
                                                                        L10 = th;
                                                                    }
                                                                    cVar2.b(dVar8);
                                                                    dVar8 = dVar8.f103120f;
                                                                    cVar9 = cVar3;
                                                                    L10 = L10;
                                                                    cVar2 = cVar2;
                                                                }
                                                            } else {
                                                                cVar3 = cVar9;
                                                                L10 = L10;
                                                            }
                                                            dVar8 = dVar8.f103120f;
                                                            cVar9 = cVar3;
                                                            L10 = L10;
                                                            cVar2 = cVar2;
                                                        }
                                                        cVar = cVar9;
                                                        cVar2 = cVar2;
                                                        r142 = r142;
                                                        if (i27 != 1) {
                                                            L10 = C2204h.l(cVar2);
                                                        }
                                                        cVar9 = cVar;
                                                        r22 = L10;
                                                        r52 = cVar2;
                                                        r142 = r142;
                                                    }
                                                    cVar2 = r52;
                                                    r142 = r14;
                                                    L10 = C2204h.l(cVar2);
                                                    cVar9 = cVar;
                                                    r22 = L10;
                                                    r52 = cVar2;
                                                    r142 = r142;
                                                }
                                            } else {
                                                cVar9 = cVar9;
                                            }
                                        }
                                    }
                                    cVar9 = cVar9;
                                }
                                if (z11) {
                                    if (z10) {
                                        hY1 = C1994i.a(interfaceC1993h);
                                    } else if (r142 == 0 || (hY1 = r142.y1()) == null) {
                                        hY1 = FocusStateImpl.Inactive;
                                    }
                                    interfaceC1993h.a0(hY1);
                                }
                            } else {
                                interfaceC1993h.a0(FocusStateImpl.Inactive);
                                jArr2 = jArr8;
                                objArr2 = objArr5;
                                j12 = j15;
                            }
                        } else {
                            jArr2 = jArr8;
                            objArr2 = objArr5;
                            j12 = j15;
                        }
                        j15 = j12 >> 8;
                        i24++;
                        jArr8 = jArr2;
                        objArr5 = objArr2;
                    }
                    jArr = jArr8;
                    objArr = objArr5;
                    i10 = 0;
                    if (i23 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr8;
                    objArr = objArr5;
                    i10 = 0;
                }
                if (i22 == length2) {
                    break;
                }
                i22++;
                jArr8 = jArr;
                objArr5 = objArr;
            }
        } else {
            i10 = 0;
        }
        this.f100547d.K();
        MutableScatterSet<FocusTargetNode> mutableScatterSet3 = this.f100546c;
        Object[] objArr6 = mutableScatterSet3.f86877b;
        long[] jArr10 = mutableScatterSet3.f86876a;
        int length3 = jArr10.length - 2;
        if (length3 >= 0) {
            int i28 = i10;
            while (true) {
                long j17 = jArr10[i28];
                if ((((~j17) << c10) & j17 & j11) != j11) {
                    int i29 = 8 - ((~(i28 - length3)) >>> 31);
                    for (int i30 = i10; i30 < i29; i30++) {
                        if ((j17 & j10) < 128) {
                            FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr6[(i28 << 3) + i30];
                            if (focusTargetNode3.f103127m) {
                                FocusStateImpl focusStateImplY1 = focusTargetNode3.y1();
                                focusTargetNode3.u3();
                                if (focusStateImplY1 != focusTargetNode3.y1() || this.f100549f.e(focusTargetNode3)) {
                                    C1994i.c(focusTargetNode3);
                                }
                            }
                        }
                        j17 >>= 8;
                    }
                    if (i29 != 8) {
                        break;
                    }
                }
                if (i28 == length3) {
                    break;
                } else {
                    i28++;
                }
            }
        }
        this.f100546c.K();
        this.f100549f.K();
        this.f100545b.invoke();
        if (!this.f100548e.r()) {
            W.a.g("Unprocessed FocusProperties nodes");
            throw th;
        }
        if (!this.f100547d.r()) {
            W.a.g("Unprocessed FocusEvent nodes");
            throw th;
        }
        if (this.f100546c.r()) {
            return;
        }
        W.a.g("Unprocessed FocusTarget nodes");
        throw th;
    }

    public final <T> void d(MutableScatterSet<T> mutableScatterSet, T t10) {
        if (mutableScatterSet.C(t10) && this.f100546c.f86879d + this.f100547d.f86879d + this.f100548e.f86879d == 1) {
            this.f100544a.invoke(new FocusInvalidationManager$scheduleInvalidation$1(this));
        }
    }

    public final void e(@NotNull InterfaceC1993h interfaceC1993h) {
        d(this.f100547d, interfaceC1993h);
    }

    public final void f(@NotNull x xVar) {
        d(this.f100548e, xVar);
    }

    public final void g(@NotNull FocusTargetNode focusTargetNode) {
        d(this.f100546c, focusTargetNode);
    }
}
