package androidx.compose.foundation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0}, l = {119}, m = "emitExit", n = {"this"}, s = {"L$0"})
public final class HoverableNode$emitExit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f88717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f88718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HoverableNode f88719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitExit$1(HoverableNode hoverableNode, kotlin.coroutines.e<? super HoverableNode$emitExit$1> eVar) {
        super(eVar);
        this.f88719c = hoverableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88718b = obj;
        this.f88720d |= Integer.MIN_VALUE;
        return this.f88719c.h3(this);
    }
}
