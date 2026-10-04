package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 1, 1, 2}, l = {322, 348, 505}, m = "readAndInit", n = {"updateLock", "initData", "updateLock", "initData", "initializationComplete", "$this$withLock_u24default$iv"}, s = {"L$1", "L$2", "L$1", "L$2", "L$3", "L$3"})
public final class SingleProcessDataStore$readAndInit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f112379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f112380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f112381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f112382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f112383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f112384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<T> f112385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f112386i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInit$1(SingleProcessDataStore<T> singleProcessDataStore, kotlin.coroutines.e<? super SingleProcessDataStore$readAndInit$1> eVar) {
        super(eVar);
        this.f112385h = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f112384g = obj;
        this.f112386i |= Integer.MIN_VALUE;
        return this.f112385h.u(this);
    }
}
