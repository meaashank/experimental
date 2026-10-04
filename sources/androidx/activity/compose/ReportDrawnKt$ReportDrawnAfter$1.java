package androidx.activity.compose;

import androidx.activity.z;
import ed.l;
import ed.p;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1\n+ 2 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt\n*L\n1#1,176:1\n180#2,10:177\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1\n*L\n173#1:177,10\n*E\n"})
@Vc.d(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1", f = "ReportDrawn.kt", i = {0}, l = {Opcodes.INVOKEVIRTUAL}, m = "invokeSuspend", n = {"$this$reportWhenComplete$iv"}, s = {"L$0"})
public final class ReportDrawnKt$ReportDrawnAfter$1 extends SuspendLambda implements p<L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f84979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f84981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l<kotlin.coroutines.e<? super L0>, Object> f84982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReportDrawnKt$ReportDrawnAfter$1(z zVar, l<? super kotlin.coroutines.e<? super L0>, ? extends Object> lVar, kotlin.coroutines.e<? super ReportDrawnKt$ReportDrawnAfter$1> eVar) {
        super(2, eVar);
        this.f84981c = zVar;
        this.f84982d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new ReportDrawnKt$ReportDrawnAfter$1(this.f84981c, this.f84982d, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        z zVar;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f84980b;
        if (i10 == 0) {
            C4885d0.n(obj);
            z zVar2 = this.f84981c;
            l<kotlin.coroutines.e<? super L0>, Object> lVar = this.f84982d;
            zVar2.c();
            if (!zVar2.e()) {
                try {
                    this.f84979a = zVar2;
                    this.f84980b = 1;
                    if (lVar.invoke(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    zVar = zVar2;
                    zVar.h();
                } catch (Throwable th2) {
                    zVar = zVar2;
                    th = th2;
                    zVar.h();
                    throw th;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = (z) this.f84979a;
            try {
                C4885d0.n(obj);
                zVar.h();
            } catch (Throwable th3) {
                th = th3;
                zVar.h();
                throw th;
            }
        }
        return L0.f217464a;
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((ReportDrawnKt$ReportDrawnAfter$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
