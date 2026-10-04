package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.input.pointer.InterfaceC2138e;
import ed.InterfaceC4376a;
import ed.p;
import kotlin.L0;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nPressDownGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressDownGesture.kt\nandroidx/compose/foundation/text/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,49:1\n101#2,2:50\n33#2,6:52\n103#2:58\n*S KotlinDebug\n*F\n+ 1 PressDownGesture.kt\nandroidx/compose/foundation/text/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2\n*L\n40#1:50,2\n40#1:52,6\n40#1:58\n*E\n"})
@Vc.d(c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", i = {0, 1, 1}, l = {33, 39}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
public final class PressDownGestureKt$detectPressDownGesture$2 extends RestrictedSuspendLambda implements p<InterfaceC2138e, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f94120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f94122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f94123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4376a<L0> f94124f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressDownGestureKt$detectPressDownGesture$2(b bVar, InterfaceC4376a<L0> interfaceC4376a, kotlin.coroutines.e<? super PressDownGestureKt$detectPressDownGesture$2> eVar) {
        super(2, eVar);
        this.f94123e = bVar;
        this.f94124f = interfaceC4376a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        PressDownGestureKt$detectPressDownGesture$2 pressDownGestureKt$detectPressDownGesture$2 = new PressDownGestureKt$detectPressDownGesture$2(this.f94123e, this.f94124f, eVar);
        pressDownGestureKt$detectPressDownGesture$2.f94122d = obj;
        return pressDownGestureKt$detectPressDownGesture$2;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull InterfaceC2138e interfaceC2138e, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((PressDownGestureKt$detectPressDownGesture$2) create(interfaceC2138e, eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r14 != r0) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005d -> B:20:0x0060). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.f94121c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r13.f94120b
            androidx.compose.ui.input.pointer.A r1 = (androidx.compose.ui.input.pointer.A) r1
            java.lang.Object r4 = r13.f94122d
            androidx.compose.ui.input.pointer.e r4 = (androidx.compose.ui.input.pointer.InterfaceC2138e) r4
            kotlin.C4885d0.n(r14)
            r7 = r13
            goto L60
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            java.lang.Object r1 = r13.f94122d
            androidx.compose.ui.input.pointer.e r1 = (androidx.compose.ui.input.pointer.InterfaceC2138e) r1
            kotlin.C4885d0.n(r14)
            r7 = r13
            goto L43
        L2a:
            kotlin.C4885d0.n(r14)
            java.lang.Object r14 = r13.f94122d
            r4 = r14
            androidx.compose.ui.input.pointer.e r4 = (androidx.compose.ui.input.pointer.InterfaceC2138e) r4
            r13.f94122d = r4
            r13.f94121c = r3
            r5 = 0
            r6 = 0
            r8 = 2
            r9 = 0
            r7 = r13
            java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f(r4, r5, r6, r7, r8, r9)
            if (r14 != r0) goto L42
            goto L5f
        L42:
            r1 = r4
        L43:
            androidx.compose.ui.input.pointer.A r14 = (androidx.compose.ui.input.pointer.A) r14
            androidx.compose.foundation.text.input.internal.selection.b r4 = r7.f94123e
            long r5 = r14.f102148c
            r4.a(r5)
            ed.a<kotlin.L0> r4 = r7.f94124f
            if (r4 == 0) goto L88
            r4 = r1
            r1 = r14
        L52:
            r7.f94122d = r4
            r7.f94120b = r1
            r7.f94121c = r2
            r14 = 0
            java.lang.Object r14 = androidx.compose.ui.input.pointer.C2137d.t(r4, r14, r13, r3, r14)
            if (r14 != r0) goto L60
        L5f:
            return r0
        L60:
            androidx.compose.ui.input.pointer.q r14 = (androidx.compose.ui.input.pointer.C2150q) r14
            java.util.List<androidx.compose.ui.input.pointer.A> r14 = r14.f102318a
            int r5 = r14.size()
            r6 = 0
        L69:
            if (r6 >= r5) goto L83
            java.lang.Object r8 = r14.get(r6)
            androidx.compose.ui.input.pointer.A r8 = (androidx.compose.ui.input.pointer.A) r8
            long r9 = r8.f102146a
            long r11 = r1.f102146a
            boolean r9 = androidx.compose.ui.input.pointer.z.d(r9, r11)
            if (r9 == 0) goto L80
            boolean r8 = r8.f102149d
            if (r8 == 0) goto L80
            goto L52
        L80:
            int r6 = r6 + 1
            goto L69
        L83:
            ed.a<kotlin.L0> r14 = r7.f94124f
            r14.invoke()
        L88:
            kotlin.L0 r14 = kotlin.L0.f217464a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
