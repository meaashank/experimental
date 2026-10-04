package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ChannelIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {599}, m = "next", n = {"$this"}, s = {"L$0"})
public final class ChannelIterator$next0$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f218934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f218935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f218936c;

    public ChannelIterator$next0$1(kotlin.coroutines.e<? super ChannelIterator$next0$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f218935b = obj;
        this.f218936c |= Integer.MIN_VALUE;
        return ChannelIterator.DefaultImpls.a(null, this);
    }
}
