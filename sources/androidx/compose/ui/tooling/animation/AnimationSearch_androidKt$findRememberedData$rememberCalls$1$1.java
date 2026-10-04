package androidx.compose.ui.tooling.animation;

import ed.l;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1\n*L\n1#1,463:1\n*E\n"})
public final class AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1 extends Lambda implements l<androidx.compose.ui.tooling.data.e, Boolean> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1 f105247d = new AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1();

    public AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1() {
        super(1);
    }

    @Override // ed.l
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(@NotNull androidx.compose.ui.tooling.data.e eVar) {
        return Boolean.valueOf(G.g(eVar.f105365b, "remember"));
    }
}
