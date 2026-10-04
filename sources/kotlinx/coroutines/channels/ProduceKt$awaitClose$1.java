package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {150}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
public final class ProduceKt$awaitClose$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f219153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f219154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f219155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f219156d;

    public ProduceKt$awaitClose$1(kotlin.coroutines.e<? super ProduceKt$awaitClose$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219155c = obj;
        this.f219156d |= Integer.MIN_VALUE;
        return ProduceKt.a(null, null, this);
    }
}
