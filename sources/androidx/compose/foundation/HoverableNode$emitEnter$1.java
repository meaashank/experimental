package androidx.compose.foundation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0, 0}, l = {111}, m = "emitEnter", n = {"this", "interaction"}, s = {"L$0", "L$1"})
public final class HoverableNode$emitEnter$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f88712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f88713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f88714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HoverableNode f88715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitEnter$1(HoverableNode hoverableNode, kotlin.coroutines.e<? super HoverableNode$emitEnter$1> eVar) {
        super(eVar);
        this.f88715d = hoverableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88714c = obj;
        this.f88716e |= Integer.MIN_VALUE;
        return this.f88715d.g3(this);
    }
}
