package kotlinx.coroutines.selects;

import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.Y;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nOnTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,62:1\n13#2:63\n*S KotlinDebug\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n52#1:63\n*E\n"})
public final class OnTimeout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f220677a;

    @V({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n1#1,14:1\n53#2,2:15\n*E\n"})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f220678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnTimeout f220679b;

        public a(j jVar, OnTimeout onTimeout) {
            this.f220678a = jVar;
            this.f220679b = onTimeout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f220678a.j(this.f220679b, L0.f217464a);
        }
    }

    public OnTimeout(long j10) {
        this.f220677a = j10;
    }

    public static /* synthetic */ void c() {
    }

    @NotNull
    public final c b() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.f220680a;
        G.n(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Y.q(onTimeout$selectClause$1, 3);
        return new d(this, onTimeout$selectClause$1, null, 4, null);
    }

    public final void d(j<?> jVar, Object obj) {
        if (this.f220677a <= 0) {
            jVar.f(L0.f217464a);
            return;
        }
        a aVar = new a(jVar, this);
        G.n(jVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        kotlin.coroutines.i context = jVar.getContext();
        jVar.g(DelayKt.d(context).h1(this.f220677a, aVar, context));
    }
}
