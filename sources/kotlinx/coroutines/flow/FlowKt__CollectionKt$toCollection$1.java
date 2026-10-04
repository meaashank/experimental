package kotlinx.coroutines.flow;

import java.util.Collection;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {22}, m = "toCollection", n = {"destination"}, s = {"L$0"})
public final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f219417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f219419c;

    public FlowKt__CollectionKt$toCollection$1(kotlin.coroutines.e<? super FlowKt__CollectionKt$toCollection$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219418b = obj;
        this.f219419c |= Integer.MIN_VALUE;
        return FlowKt__CollectionKt.a(null, null, this);
    }
}
