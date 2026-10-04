package androidx.compose.ui.scrollcapture;

import androidx.compose.foundation.text.C1758e;
import ed.p;
import jd.C4806d;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.V;
import md.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nComposeScrollCaptureCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeScrollCaptureCallback.android.kt\nandroidx/compose/ui/scrollcapture/RelativeScroller\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,319:1\n1#2:320\n*E\n"})
public final class RelativeScroller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final p<Float, kotlin.coroutines.e<? super Float>, Object> f104000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f104001c;

    /* JADX WARN: Multi-variable type inference failed */
    public RelativeScroller(int i10, @NotNull p<? super Float, ? super kotlin.coroutines.e<? super Float>, ? extends Object> pVar) {
        this.f103999a = i10;
        this.f104000b = pVar;
    }

    public final float b() {
        return this.f104001c;
    }

    public final int c(int i10) {
        return u.K(i10 - C4806d.L0(this.f104001c), 0, this.f103999a);
    }

    public final void d() {
        this.f104001c = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(float r5, kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = (androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1) r0
            int r1 = r0.f104005d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f104005d = r1
            goto L18
        L13:
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = new androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f104003b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f104005d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f104002a
            androidx.compose.ui.scrollcapture.RelativeScroller r5 = (androidx.compose.ui.scrollcapture.RelativeScroller) r5
            kotlin.C4885d0.n(r6)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C4885d0.n(r6)
            ed.p<java.lang.Float, kotlin.coroutines.e<? super java.lang.Float>, java.lang.Object> r6 = r4.f104000b
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.f104002a = r4
            r0.f104005d = r3
            java.lang.Object r6 = r6.invoke(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.f104001c
            float r0 = r0 + r6
            r5.f104001c = r0
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.RelativeScroller.e(float, kotlin.coroutines.e):java.lang.Object");
    }

    @Nullable
    public final Object f(int i10, int i11, @NotNull kotlin.coroutines.e<? super L0> eVar) throws Throwable {
        if (i10 > i11) {
            throw new IllegalArgumentException(C1758e.a("Expected min=", i10, " ≤ max=", i11).toString());
        }
        int i12 = i11 - i10;
        int i13 = this.f103999a;
        if (i12 > i13) {
            StringBuilder sbA = android.support.v4.media.a.a("Expected range (", i12, ") to be ≤ viewportSize=");
            sbA.append(this.f103999a);
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        float f10 = i10;
        float f11 = this.f104001c;
        if (f10 >= f11 && i11 <= i13 + f11) {
            return L0.f217464a;
        }
        if (f10 >= f11) {
            i10 = i11 - i13;
        }
        Object objG = g(i10, eVar);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : L0.f217464a;
    }

    @Nullable
    public final Object g(float f10, @NotNull kotlin.coroutines.e<? super L0> eVar) throws Throwable {
        Object objE = e(f10 - this.f104001c, eVar);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : L0.f217464a;
    }
}
