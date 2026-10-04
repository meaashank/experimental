package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {381}, m = "readData", n = {"this"}, s = {"L$0"})
public final class SingleProcessDataStore$readData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f112408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f112409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f112410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<T> f112411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f112412f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readData$1(SingleProcessDataStore<T> singleProcessDataStore, kotlin.coroutines.e<? super SingleProcessDataStore$readData$1> eVar) {
        super(eVar);
        this.f112411e = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f112410d = obj;
        this.f112412f |= Integer.MIN_VALUE;
        return this.f112411e.x(this);
    }
}
