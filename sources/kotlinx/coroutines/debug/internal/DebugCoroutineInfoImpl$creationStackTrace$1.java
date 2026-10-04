package kotlinx.coroutines.debug.internal;

import ed.p;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5002o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {Opcodes.IF_ICMPGE}, m = "invokeSuspend", n = {}, s = {})
public final class DebugCoroutineInfoImpl$creationStackTrace$1 extends RestrictedSuspendLambda implements p<AbstractC5002o<? super StackTraceElement>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f219234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f219235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DebugCoroutineInfoImpl f219236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f219237e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$creationStackTrace$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, i iVar, kotlin.coroutines.e<? super DebugCoroutineInfoImpl$creationStackTrace$1> eVar) {
        super(2, eVar);
        this.f219236d = debugCoroutineInfoImpl;
        this.f219237e = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        DebugCoroutineInfoImpl$creationStackTrace$1 debugCoroutineInfoImpl$creationStackTrace$1 = new DebugCoroutineInfoImpl$creationStackTrace$1(this.f219236d, this.f219237e, eVar);
        debugCoroutineInfoImpl$creationStackTrace$1.f219235c = obj;
        return debugCoroutineInfoImpl$creationStackTrace$1;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull AbstractC5002o<? super StackTraceElement> abstractC5002o, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((DebugCoroutineInfoImpl$creationStackTrace$1) create(abstractC5002o, eVar)).invokeSuspend(L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f219234b;
        if (i10 == 0) {
            C4885d0.n(obj);
            AbstractC5002o<? super StackTraceElement> abstractC5002o = (AbstractC5002o) this.f219235c;
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = this.f219236d;
            Vc.c cVar = this.f219237e.f219290a;
            this.f219234b = 1;
            if (debugCoroutineInfoImpl.k(abstractC5002o, cVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
        }
        return L0.f217464a;
    }
}
