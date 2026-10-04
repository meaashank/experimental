package androidx.compose.foundation.gestures;

import androidx.collection.E0;
import androidx.collection.I0;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.L;
import androidx.compose.foundation.k0;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n+ 2 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1220:1\n1216#1,4:1221\n428#2,3:1225\n373#2,6:1228\n383#2,3:1235\n386#2,2:1239\n431#2,2:1241\n389#2,6:1243\n433#2:1249\n428#2,3:1250\n373#2,6:1253\n383#2,3:1260\n386#2,2:1264\n431#2,2:1266\n389#2,6:1268\n433#2:1274\n1810#3:1234\n1672#3:1238\n1810#3:1259\n1672#3:1263\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n*L\n996#1:1221,4\n1195#1:1225,3\n1195#1:1228,6\n1195#1:1235,3\n1195#1:1239,2\n1195#1:1241,2\n1195#1:1243,6\n1195#1:1249\n1206#1:1250,3\n1206#1:1253,6\n1206#1:1260,3\n1206#1:1264,2\n1206#1:1266,2\n1206#1:1268,6\n1206#1:1274\n1195#1:1234\n1195#1:1238\n1206#1:1259\n1206#1:1263\n*E\n"})
public final class AnchoredDraggableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ed.l<androidx.compose.ui.input.pointer.A, Boolean> f89128a = new ed.l<androidx.compose.ui.input.pointer.A, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AlwaysDrag$1
        @NotNull
        public final Boolean e(@NotNull androidx.compose.ui.input.pointer.A a10) {
            return Boolean.TRUE;
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.pointer.A a10) {
            return Boolean.TRUE;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f89129b = false;

    @L
    @NotNull
    public static final <T> m<T> a(@NotNull ed.l<? super n<T>, L0> lVar) {
        n nVar = new n();
        lVar.invoke(nVar);
        return new r(nVar.f90040a);
    }

    @L
    @NotNull
    public static final <T> androidx.compose.ui.p i(@NotNull androidx.compose.ui.p pVar, @NotNull AnchoredDraggableState<T> anchoredDraggableState, @NotNull Orientation orientation, boolean z10, @Nullable androidx.compose.foundation.interaction.g gVar, @Nullable k0 k0Var, boolean z11) {
        return pVar.P0(new AnchoredDraggableElement(anchoredDraggableState, orientation, z10, null, gVar, z11, k0Var));
    }

    @L
    @NotNull
    public static final <T> androidx.compose.ui.p j(@NotNull androidx.compose.ui.p pVar, @NotNull AnchoredDraggableState<T> anchoredDraggableState, boolean z10, @NotNull Orientation orientation, boolean z11, @Nullable androidx.compose.foundation.interaction.g gVar, @Nullable k0 k0Var, boolean z12) {
        return pVar.P0(new AnchoredDraggableElement(anchoredDraggableState, orientation, z11, Boolean.valueOf(z10), gVar, z12, k0Var));
    }

    public static /* synthetic */ androidx.compose.ui.p k(androidx.compose.ui.p pVar, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z10, androidx.compose.foundation.interaction.g gVar, k0 k0Var, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        androidx.compose.foundation.interaction.g gVar2 = (i10 & 8) != 0 ? null : gVar;
        k0 k0Var2 = (i10 & 16) != 0 ? null : k0Var;
        if ((i10 & 32) != 0) {
            z11 = anchoredDraggableState.B();
        }
        return i(pVar, anchoredDraggableState, orientation, z12, gVar2, k0Var2, z11);
    }

    public static /* synthetic */ androidx.compose.ui.p l(androidx.compose.ui.p pVar, AnchoredDraggableState anchoredDraggableState, boolean z10, Orientation orientation, boolean z11, androidx.compose.foundation.interaction.g gVar, k0 k0Var, boolean z12, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return j(pVar, anchoredDraggableState, z10, orientation, z11, (i10 & 16) != 0 ? null : gVar, (i10 & 32) != 0 ? null : k0Var, (i10 & 64) != 0 ? anchoredDraggableState.B() : z12);
    }

    public static final <T> Object m(AnchoredDraggableState<T> anchoredDraggableState, float f10, final InterfaceC1654b interfaceC1654b, m<T> mVar, T t10, kotlin.coroutines.e<? super L0> eVar) {
        Object objC;
        float fE = mVar.e(t10);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.f217901a = Float.isNaN(anchoredDraggableState.f89208j.getFloatValue()) ? 0.0f : anchoredDraggableState.f89208j.getFloatValue();
        if (!Float.isNaN(fE)) {
            float f11 = floatRef.f217901a;
            if (f11 != fE && (objC = SuspendAnimationKt.c(f11, fE, f10, anchoredDraggableState.f89201c, new ed.p<Float, Float, L0>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void e(float f12, float f13) {
                    interfaceC1654b.a(f12, f13);
                    floatRef.f217901a = f12;
                }

                @Override // ed.p
                public /* bridge */ /* synthetic */ L0 invoke(Float f12, Float f13) {
                    e(f12.floatValue(), f13.floatValue());
                    return L0.f217464a;
                }
            }, eVar)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objC;
            }
        }
        return L0.f217464a;
    }

    @L
    @Nullable
    public static final <T> Object n(@NotNull AnchoredDraggableState<T> anchoredDraggableState, T t10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objK = AnchoredDraggableState.k(anchoredDraggableState, t10, null, new AnchoredDraggableKt$animateTo$4(anchoredDraggableState, null), eVar, 2, null);
        return objK == CoroutineSingletons.COROUTINE_SUSPENDED ? objK : L0.f217464a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @androidx.compose.foundation.L
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object o(@org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.AnchoredDraggableState<T> r8, T r9, float r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Float> r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            if (r0 == 0) goto L14
            r0 = r11
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1) r0
            int r1 = r0.f89141d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f89141d = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.f89140c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.f89141d
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            float r10 = r5.f89138a
            java.lang.Object r8 = r5.f89139b
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref.FloatRef) r8
            kotlin.C4885d0.n(r11)
            goto L5a
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.C4885d0.n(r11)
            kotlin.jvm.internal.Ref$FloatRef r11 = new kotlin.jvm.internal.Ref$FloatRef
            r11.<init>()
            r11.f217901a = r10
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 r4 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2
            r1 = 0
            r4.<init>(r8, r10, r11, r1)
            r5.f89139b = r11
            r5.f89138a = r10
            r5.f89141d = r2
            r3 = 0
            r6 = 2
            r7 = 0
            r1 = r8
            r2 = r9
            java.lang.Object r8 = androidx.compose.foundation.gestures.AnchoredDraggableState.k(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L59
            return r0
        L59:
            r8 = r11
        L5a:
            float r8 = r8.f217901a
            float r10 = r10 - r8
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.o(androidx.compose.foundation.gestures.AnchoredDraggableState, java.lang.Object, float, kotlin.coroutines.e):java.lang.Object");
    }

    public static final float p(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return (f11 <= 0.0f ? f10 >= f11 : f10 <= f11) ? f10 : f11;
    }

    public static final <T> r<T> r() {
        return new r<>(new E0(0, 1, null));
    }

    public static final <K> float s(I0<K> i02) {
        if (i02.f86714e == 1) {
            return Float.NaN;
        }
        float[] fArr = i02.f86712c;
        long[] jArr = i02.f86710a;
        int length = jArr.length - 2;
        float f10 = Float.NEGATIVE_INFINITY;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            float f11 = fArr[(i10 << 3) + i12];
                            if (f11 >= f10) {
                                f10 = f11;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return f10;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return f10;
    }

    public static final <K> float t(I0<K> i02) {
        if (i02.f86714e == 1) {
            return Float.NaN;
        }
        float[] fArr = i02.f86712c;
        long[] jArr = i02.f86710a;
        int length = jArr.length - 2;
        float f10 = Float.POSITIVE_INFINITY;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            float f11 = fArr[(i10 << 3) + i12];
                            if (f11 <= f10) {
                                f10 = f11;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return f10;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <I> java.lang.Object u(ed.InterfaceC4376a<? extends I> r4, ed.p<? super I, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends java.lang.Object> r5, kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.f89154b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89154b = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f89153a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f89154b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.C4885d0.n(r6)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.C4885d0.n(r6)
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            r0.f89154b = r3     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            java.lang.Object r4 = kotlinx.coroutines.M.g(r6, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlin.L0 r4 = kotlin.L0.f217464a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.u(ed.a, ed.p, kotlin.coroutines.e):java.lang.Object");
    }

    @L
    @Nullable
    public static final <T> Object v(@NotNull AnchoredDraggableState<T> anchoredDraggableState, T t10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objK = AnchoredDraggableState.k(anchoredDraggableState, t10, null, new AnchoredDraggableKt$snapTo$2(4, null), eVar, 2, null);
        return objK == CoroutineSingletons.COROUTINE_SUSPENDED ? objK : L0.f217464a;
    }

    public static final void q(InterfaceC4376a<String> interfaceC4376a) {
    }
}
