package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {311}, m = "readAndInitOrPropagateFailure", n = {"this"}, s = {"L$0"})
public final class SingleProcessDataStore$readAndInitOrPropagateFailure$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f112404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<T> f112405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112406d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInitOrPropagateFailure$1(SingleProcessDataStore<T> singleProcessDataStore, kotlin.coroutines.e<? super SingleProcessDataStore$readAndInitOrPropagateFailure$1> eVar) {
        super(eVar);
        this.f112405c = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f112404b = obj;
        this.f112406d |= Integer.MIN_VALUE;
        return this.f112405c.w(this);
    }
}
