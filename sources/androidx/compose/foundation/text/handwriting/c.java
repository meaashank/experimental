package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.p;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nStylusHandwriting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,223:1\n149#2:224\n149#2:225\n*S KotlinDebug\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingKt\n*L\n221#1:224\n222#1:225\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f93600a = 40;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f93601b = 10;

    public static final float a() {
        return f93601b;
    }

    public static final float b() {
        return f93600a;
    }

    @NotNull
    public static final p c(@NotNull p pVar, boolean z10, @NotNull InterfaceC4376a<Boolean> interfaceC4376a) {
        return (z10 && d.a()) ? PaddingKt.l(pVar.P0(new StylusHandwritingElementWithNegativePadding(interfaceC4376a)), f93601b, f93600a) : pVar;
    }
}
