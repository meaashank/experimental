package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.graphics.AbstractC2131z0;
import androidx.compose.ui.graphics.d3;
import k0.InterfaceC4814e;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,627:1\n702#2:628\n149#3:629\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierKt\n*L\n587#1:628\n581#1:629\n*E\n"})
public final class Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f94055a = 2;

    public static final P.j d(InterfaceC4814e interfaceC4814e, P.j jVar, boolean z10, int i10) {
        return P.j.h(jVar, z10 ? i10 - jVar.f65513c : jVar.f65511a, 0.0f, (z10 ? i10 - jVar.f65513c : jVar.f65511a) + interfaceC4814e.I1(f94055a), 0.0f, 10, null);
    }

    public static final boolean e(AbstractC2131z0 abstractC2131z0) {
        return ((abstractC2131z0 instanceof d3) && ((d3) abstractC2131z0).f101064c == 16) ? false : true;
    }

    public static final float f(float f10) {
        if (Float.isNaN(f10) || Float.isInfinite(f10)) {
            return f10;
        }
        return (float) (f10 > 0.0f ? Math.ceil(f10) : Math.floor(f10));
    }
}
