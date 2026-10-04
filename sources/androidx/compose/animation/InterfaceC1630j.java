package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.animation.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,885:1\n135#2:886\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n662#1:886\n*E\n"})
public interface InterfaceC1630j {

    /* JADX INFO: renamed from: androidx.compose.animation.j$a */
    public static final class a {
        @Deprecated
        @NotNull
        public static androidx.compose.ui.p a(@NotNull InterfaceC1630j interfaceC1630j, @NotNull androidx.compose.ui.p pVar, @NotNull AbstractC1640u abstractC1640u, @NotNull AbstractC1642w abstractC1642w, @NotNull String str) {
            return AnimatedVisibilityScope$CC.a(interfaceC1630j, pVar, abstractC1640u, abstractC1642w, str);
        }
    }

    @NotNull
    androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, @NotNull AbstractC1640u abstractC1640u, @NotNull AbstractC1642w abstractC1642w, @NotNull String str);

    @NotNull
    Transition<EnterExitState> b();
}
