package androidx.compose.ui.platform;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {Opcodes.D2L}, m = "establishTextInputSession", n = {}, s = {})
public final class PlatformTextInputModifierNodeKt$establishTextInputSession$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f103619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f103620b;

    public PlatformTextInputModifierNodeKt$establishTextInputSession$1(kotlin.coroutines.e<? super PlatformTextInputModifierNodeKt$establishTextInputSession$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f103619a = obj;
        this.f103620b |= Integer.MIN_VALUE;
        return PlatformTextInputModifierNodeKt.c(null, null, this);
    }
}
