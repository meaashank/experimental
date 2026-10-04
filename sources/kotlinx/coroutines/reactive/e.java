package kotlinx.coroutines.reactive;

import ed.p;
import kotlin.coroutines.i;
import kotlinx.coroutines.L;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements Publisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f220514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f220515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f220516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f220517d;

    public /* synthetic */ e(L l10, i iVar, p pVar, p pVar2) {
        this.f220514a = l10;
        this.f220515b = iVar;
        this.f220516c = pVar;
        this.f220517d = pVar2;
    }

    @Override // org.reactivestreams.Publisher
    public final void subscribe(Subscriber subscriber) {
        PublishKt.g(this.f220514a, this.f220515b, this.f220516c, this.f220517d, subscriber);
    }
}
