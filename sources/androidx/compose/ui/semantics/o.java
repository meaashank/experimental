package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.C1;
import androidx.compose.ui.platform.C2278s0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.L0;
import kotlin.collections.J;
import kotlin.collections.m0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,195:1\n1179#2,2:196\n1253#2,4:198\n*S KotlinDebug\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n191#1:196,2\n191#1:198,4\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static AtomicInteger f104175a = new AtomicInteger(0);

    public static final void b(C2278s0 c2278s0, l lVar) {
        C1 c12 = c2278s0.f103929c;
        int iJ = m0.j(J.d0(lVar, 10));
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> entry : lVar) {
            linkedHashMap.put(entry.getKey().f104094a, entry.getValue());
        }
        c12.c("properties", linkedHashMap);
    }

    @NotNull
    public static final androidx.compose.ui.p c(@NotNull androidx.compose.ui.p pVar, @NotNull ed.l<? super u, L0> lVar) {
        return pVar.P0(new ClearAndSetSemanticsElement(lVar));
    }

    public static final int d() {
        return f104175a.addAndGet(1);
    }

    @NotNull
    public static final androidx.compose.ui.p e(@NotNull androidx.compose.ui.p pVar, boolean z10, @NotNull ed.l<? super u, L0> lVar) {
        return pVar.P0(new AppendedSemanticsElement(z10, lVar));
    }

    public static /* synthetic */ androidx.compose.ui.p f(androidx.compose.ui.p pVar, boolean z10, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(pVar, z10, lVar);
    }
}
