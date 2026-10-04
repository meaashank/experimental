package androidx.datastore.core;

import com.prism.gaia.helper.utils.l;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 1, 2, 2}, l = {359, 362, l.b.f165186t}, m = "readDataOrHandleCorruption", n = {"this", "ex", "ex", "newData"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class SingleProcessDataStore$readDataOrHandleCorruption$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f112414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f112415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<T> f112416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f112417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readDataOrHandleCorruption$1(SingleProcessDataStore<T> singleProcessDataStore, kotlin.coroutines.e<? super SingleProcessDataStore$readDataOrHandleCorruption$1> eVar) {
        super(eVar);
        this.f112416d = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f112415c = obj;
        this.f112417e |= Integer.MIN_VALUE;
        return this.f112416d.y(this);
    }
}
