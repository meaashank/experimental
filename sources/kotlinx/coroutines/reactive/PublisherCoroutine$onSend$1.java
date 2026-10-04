package kotlinx.coroutines.reactive;

import ed.q;
import kotlin.L0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class PublisherCoroutine$onSend$1 extends FunctionReferenceImpl implements q<PublisherCoroutine<?>, j<?>, Object, L0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PublisherCoroutine$onSend$1 f220496a = new PublisherCoroutine$onSend$1();

    public PublisherCoroutine$onSend$1() {
        super(3, PublisherCoroutine.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void e(@NotNull PublisherCoroutine<?> publisherCoroutine, @NotNull j<?> jVar, @Nullable Object obj) {
        publisherCoroutine.g2(jVar, obj);
    }

    @Override // ed.q
    public L0 invoke(PublisherCoroutine<?> publisherCoroutine, j<?> jVar, Object obj) {
        publisherCoroutine.g2(jVar, obj);
        return L0.f217464a;
    }
}
