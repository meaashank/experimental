package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.C2278s0;
import androidx.compose.ui.platform.InspectableValueKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,725:1\n135#2:726\n77#3:727\n77#3:728\n77#3:729\n1225#4,6:730\n1225#4,6:736\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n77#1:726\n113#1:727\n115#1:728\n116#1:729\n117#1:730,6\n120#1:736,6\n*E\n"})
public final class WindowInsetsConnection_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f90714a = 0.35f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f90715b = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f90716c = 9.80665f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f90717d = 39.37f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f90718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double f90719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f90720g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f90721h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f90722i = 0.175f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f90723j = 0.35000002f;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f90718e = dLog;
        f90719f = dLog - 1.0d;
    }

    @E
    @NotNull
    public static final androidx.compose.ui.p d(@NotNull androidx.compose.ui.p pVar) {
        if (Build.VERSION.SDK_INT < 30) {
            return pVar;
        }
        return ComposedModifierKt.b(pVar, InspectableValueKt.e() ? new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$imeNestedScroll$$inlined$debugInspectorInfo$1
            public final void e(@NotNull C2278s0 c2278s0) {
                c2278s0.f103927a = "imeNestedScroll";
            }

            @Override // ed.l
            public kotlin.L0 invoke(C2278s0 c2278s0) {
                c2278s0.f103927a = "imeNestedScroll";
                return kotlin.L0.f217464a;
            }
        } : InspectableValueKt.f103595a, new ed.q<androidx.compose.ui.p, InterfaceC1946s, Integer, androidx.compose.ui.p>() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$imeNestedScroll$2
            @InterfaceC1917i
            @NotNull
            public final androidx.compose.ui.p e(@NotNull androidx.compose.ui.p pVar2, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
                interfaceC1946s.y(-369978792);
                if (C1968u.c0()) {
                    C1968u.p0(-369978792, i10, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:80)");
                }
                C1677f c1677f = WindowInsetsHolder.f90728x.c(interfaceC1946s, 6).f90733c;
                b1.f90872b.getClass();
                androidx.compose.ui.p pVarB = androidx.compose.ui.input.nestedscroll.c.b(pVar2, WindowInsetsConnection_androidKt.e(c1677f, b1.f90880j, interfaceC1946s, 48), null, 2, null);
                if (C1968u.c0()) {
                    C1968u.o0();
                }
                interfaceC1946s.u();
                return pVarB;
            }

            @Override // ed.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.p invoke(androidx.compose.ui.p pVar2, InterfaceC1946s interfaceC1946s, Integer num) {
                return e(pVar2, interfaceC1946s, num.intValue());
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    @androidx.compose.foundation.layout.E
    @androidx.compose.runtime.InterfaceC1917i
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.input.nestedscroll.b e(@org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.C1677f r5, int r6, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r7, int r8) {
        /*
            r0 = -1011341039(0xffffffffc3b82911, float:-368.32083)
            r7.y(r0)
            boolean r1 = androidx.compose.runtime.C1968u.c0()
            if (r1 == 0) goto L12
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:108)"
            androidx.compose.runtime.C1968u.p0(r0, r8, r1, r2)
        L12:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto L27
            androidx.compose.foundation.layout.C r5 = androidx.compose.foundation.layout.C.f90293a
            boolean r6 = androidx.compose.runtime.C1968u.c0()
            if (r6 == 0) goto L23
            androidx.compose.runtime.C1968u.o0()
        L23:
            r7.u()
            return r5
        L27:
            androidx.compose.runtime.a1 r0 = androidx.compose.ui.platform.CompositionLocalsKt.q()
            java.lang.Object r0 = r7.Q(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.ui.unit.LayoutDirection) r0
            androidx.compose.foundation.layout.I0$a r1 = androidx.compose.foundation.layout.I0.f90525a
            androidx.compose.foundation.layout.I0 r6 = r1.a(r6, r0)
            androidx.compose.runtime.a1 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.l()
            java.lang.Object r0 = r7.Q(r0)
            android.view.View r0 = (android.view.View) r0
            androidx.compose.runtime.a1<k0.e> r1 = androidx.compose.ui.platform.CompositionLocalsKt.f103485f
            java.lang.Object r1 = r7.Q(r1)
            k0.e r1 = (k0.InterfaceC4814e) r1
            r2 = r8 & 14
            r2 = r2 ^ 6
            r3 = 0
            r4 = 4
            if (r2 <= r4) goto L57
            boolean r2 = r7.x(r5)
            if (r2 != 0) goto L5b
        L57:
            r8 = r8 & 6
            if (r8 != r4) goto L5d
        L5b:
            r8 = 1
            goto L5e
        L5d:
            r8 = r3
        L5e:
            boolean r2 = r7.x(r0)
            r8 = r8 | r2
            boolean r2 = r7.x(r6)
            r8 = r8 | r2
            boolean r2 = r7.x(r1)
            r8 = r8 | r2
            java.lang.Object r2 = r7.a0()
            if (r8 != 0) goto L7c
            androidx.compose.runtime.s$a r8 = androidx.compose.runtime.InterfaceC1946s.f99968a
            r8.getClass()
            java.lang.Object r8 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
            if (r2 != r8) goto L84
        L7c:
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r2 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection
            r2.<init>(r5, r0, r6, r1)
            r7.S(r2)
        L84:
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r2 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) r2
            boolean r5 = r7.c0(r2)
            java.lang.Object r6 = r7.a0()
            if (r5 != 0) goto L99
            androidx.compose.runtime.s$a r5 = androidx.compose.runtime.InterfaceC1946s.f99968a
            r5.getClass()
            java.lang.Object r5 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
            if (r6 != r5) goto La1
        L99:
            androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1 r6 = new androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1
            r6.<init>()
            r7.S(r6)
        La1:
            ed.l r6 = (ed.l) r6
            androidx.compose.runtime.EffectsKt.b(r2, r6, r7, r3)
            boolean r5 = androidx.compose.runtime.C1968u.c0()
            if (r5 == 0) goto Laf
            androidx.compose.runtime.C1968u.o0()
        Laf:
            r7.u()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt.e(androidx.compose.foundation.layout.f, int, androidx.compose.runtime.s, int):androidx.compose.ui.input.nestedscroll.b");
    }
}
