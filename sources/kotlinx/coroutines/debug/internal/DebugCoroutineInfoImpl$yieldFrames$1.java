package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import s0.x;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {0, 0, 0}, l = {Opcodes.GOTO}, m = "yieldFrames", n = {"this", "$this$yieldFrames", x.a.f238230L}, s = {"L$0", "L$1", "L$2"})
public final class DebugCoroutineInfoImpl$yieldFrames$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f219238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f219239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f219240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f219241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DebugCoroutineInfoImpl f219242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f219243f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$yieldFrames$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, kotlin.coroutines.e<? super DebugCoroutineInfoImpl$yieldFrames$1> eVar) {
        super(eVar);
        this.f219242e = debugCoroutineInfoImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219241d = obj;
        this.f219243f |= Integer.MIN_VALUE;
        return this.f219242e.k(null, null, this);
    }
}
