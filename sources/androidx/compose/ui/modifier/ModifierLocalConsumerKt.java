package androidx.compose.ui.modifier;

import androidx.compose.runtime.T1;
import androidx.compose.ui.platform.C2278s0;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nModifierLocalConsumer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,75:1\n135#2:76\n*S KotlinDebug\n*F\n+ 1 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n*L\n51#1:76\n*E\n"})
public final class ModifierLocalConsumerKt {
    @T1
    @androidx.compose.ui.i
    @NotNull
    public static final androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, @NotNull final ed.l<? super n, L0> lVar) {
        return pVar.P0(new f(lVar, InspectableValueKt.e() ? new ed.l<C2278s0, L0>() { // from class: androidx.compose.ui.modifier.ModifierLocalConsumerKt$modifierLocalConsumer$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void e(@NotNull C2278s0 c2278s0) {
                c2278s0.f103927a = "modifierLocalConsumer";
                c2278s0.f103929c.c("consumer", lVar);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(C2278s0 c2278s0) {
                e(c2278s0);
                return L0.f217464a;
            }
        } : InspectableValueKt.f103595a));
    }
}
