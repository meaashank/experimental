package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.b0;
import androidx.compose.ui.text.font.AbstractC2325w;
import java.util.List;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTextDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegateKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,349:1\n26#2:350\n*S KotlinDebug\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegateKt\n*L\n304#1:350\n*E\n"})
public final class z {
    public static final int a(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    @NotNull
    public static final y b(@NotNull y yVar, @NotNull AnnotatedString annotatedString, @NotNull b0 b0Var, @NotNull InterfaceC4814e interfaceC4814e, @NotNull AbstractC2325w.b bVar, boolean z10, int i10, int i11, int i12, @NotNull List<AnnotatedString.b<androidx.compose.ui.text.B>> list) {
        return (kotlin.jvm.internal.G.g(yVar.f95051a, annotatedString) && kotlin.jvm.internal.G.g(yVar.f95052b, b0Var) && yVar.f95055e == z10 && yVar.f95056f == i10 && yVar.f95053c == i11 && yVar.f95054d == i12 && kotlin.jvm.internal.G.g(yVar.f95057g, interfaceC4814e) && kotlin.jvm.internal.G.g(yVar.f95059i, list) && yVar.f95058h == bVar) ? yVar : new y(annotatedString, b0Var, i11, i12, z10, i10, interfaceC4814e, bVar, list);
    }

    public static y c(y yVar, AnnotatedString annotatedString, b0 b0Var, InterfaceC4814e interfaceC4814e, AbstractC2325w.b bVar, boolean z10, int i10, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            z10 = true;
        }
        if ((i13 & 64) != 0) {
            androidx.compose.ui.text.style.s.f105056b.getClass();
            i10 = androidx.compose.ui.text.style.s.f105057c;
        }
        if ((i13 & 128) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i13 & 256) != 0) {
            i12 = 1;
        }
        return b(yVar, annotatedString, b0Var, interfaceC4814e, bVar, z10, i10, i11, i12, list);
    }
}
