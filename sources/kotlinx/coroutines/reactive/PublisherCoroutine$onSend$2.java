package kotlinx.coroutines.reactive;

import ed.q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class PublisherCoroutine$onSend$2 extends FunctionReferenceImpl implements q<PublisherCoroutine<?>, Object, Object, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PublisherCoroutine$onSend$2 f220497a = new PublisherCoroutine$onSend$2();

    public PublisherCoroutine$onSend$2() {
        super(3, PublisherCoroutine.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Nullable
    public final Object e(@NotNull PublisherCoroutine<?> publisherCoroutine, @Nullable Object obj, @Nullable Object obj2) {
        PublisherCoroutine.T1(publisherCoroutine, obj, obj2);
        return publisherCoroutine;
    }

    @Override // ed.q
    public Object invoke(PublisherCoroutine<?> publisherCoroutine, Object obj, Object obj2) {
        PublisherCoroutine<?> publisherCoroutine2 = publisherCoroutine;
        PublisherCoroutine.T1(publisherCoroutine2, obj, obj2);
        return publisherCoroutine2;
    }
}
