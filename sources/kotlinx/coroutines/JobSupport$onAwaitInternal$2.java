package kotlinx.coroutines;

import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class JobSupport$onAwaitInternal$2 extends FunctionReferenceImpl implements ed.q<JobSupport, Object, Object, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JobSupport$onAwaitInternal$2 f218766a = new JobSupport$onAwaitInternal$2();

    public JobSupport$onAwaitInternal$2() {
        super(3, JobSupport.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Nullable
    public final Object e(@NotNull JobSupport jobSupport, @Nullable Object obj, @Nullable Object obj2) throws Throwable {
        JobSupport.M(jobSupport, obj, obj2);
        return obj2;
    }

    @Override // ed.q
    public Object invoke(JobSupport jobSupport, Object obj, Object obj2) throws Throwable {
        JobSupport.M(jobSupport, obj, obj2);
        return obj2;
    }
}
