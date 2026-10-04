package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 2, 2}, l = {503, 337, 339}, m = "updateData", n = {"transform", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "newData"}, s = {"L$0", "L$1", "L$0", "L$0", "L$2"})
public final class SingleProcessDataStore$readAndInit$api$1$updateData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f112392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f112393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f112394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f112395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f112396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore$readAndInit$api$1 f112397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f112398h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInit$api$1$updateData$1(SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1, kotlin.coroutines.e<? super SingleProcessDataStore$readAndInit$api$1$updateData$1> eVar) {
        super(eVar);
        this.f112397g = singleProcessDataStore$readAndInit$api$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f112396f = obj;
        this.f112398h |= Integer.MIN_VALUE;
        return this.f112397g.a(null, this);
    }
}
