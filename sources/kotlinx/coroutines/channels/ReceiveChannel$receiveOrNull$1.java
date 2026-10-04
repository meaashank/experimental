package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {380}, m = "receiveOrNull", n = {}, s = {})
public final class ReceiveChannel$receiveOrNull$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f219159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f219160b;

    public ReceiveChannel$receiveOrNull$1(kotlin.coroutines.e<? super ReceiveChannel$receiveOrNull$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219159a = obj;
        this.f219160b |= Integer.MIN_VALUE;
        return ReceiveChannel.DefaultImpls.i(null, this);
    }
}
