package kotlinx.coroutines.reactive;

import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes5.dex */
public final class b<T> implements Publisher<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.flow.e<T> f220512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final i f220513b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull kotlinx.coroutines.flow.e<? extends T> eVar, @NotNull i iVar) {
        this.f220512a = eVar;
        this.f220513b = iVar;
    }

    @Override // org.reactivestreams.Publisher
    public void subscribe(@Nullable Subscriber<? super T> subscriber) {
        subscriber.getClass();
        subscriber.onSubscribe(new FlowSubscription(this.f220512a, subscriber, this.f220513b));
    }
}
