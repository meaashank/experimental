package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {1, 1}, l = {276, 281, 284}, m = "handleUpdate", n = {"update", "$this$handleUpdate_u24lambda_u2d0"}, s = {"L$0", "L$1"})
public final class SingleProcessDataStore$handleUpdate$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f112373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f112374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f112375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<T> f112376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f112377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$handleUpdate$1(SingleProcessDataStore<T> singleProcessDataStore, kotlin.coroutines.e<? super SingleProcessDataStore$handleUpdate$1> eVar) {
        super(eVar);
        this.f112376e = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f112375d = obj;
        this.f112377f |= Integer.MIN_VALUE;
        return this.f112376e.t(null, this);
    }
}
