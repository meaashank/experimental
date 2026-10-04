package kotlinx.coroutines.selects;

import ed.q;
import kotlin.L0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements q<OnTimeout, j<?>, Object, L0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OnTimeout$selectClause$1 f220680a = new OnTimeout$selectClause$1();

    public OnTimeout$selectClause$1() {
        super(3, OnTimeout.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void e(@NotNull OnTimeout onTimeout, @NotNull j<?> jVar, @Nullable Object obj) {
        onTimeout.d(jVar, obj);
    }

    @Override // ed.q
    public L0 invoke(OnTimeout onTimeout, j<?> jVar, Object obj) {
        onTimeout.d(jVar, obj);
        return L0.f217464a;
    }
}
