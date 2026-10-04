package androidx.activity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt$reportWhenComplete$1\n*L\n1#1,190:1\n*E\n"})
@Vc.d(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {Opcodes.INVOKEINTERFACE}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"})
public final class FullyDrawnReporterKt$reportWhenComplete$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f84857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f84858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84859c;

    public FullyDrawnReporterKt$reportWhenComplete$1(kotlin.coroutines.e<? super FullyDrawnReporterKt$reportWhenComplete$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f84858b = obj;
        this.f84859c |= Integer.MIN_VALUE;
        return FullyDrawnReporterKt.a(null, null, this);
    }
}
