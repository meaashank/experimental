package kotlin;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4976l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f217993a = CoroutineSingletons.COROUTINE_SUSPENDED;

    @InterfaceC4887e0(version = "1.7")
    public static final <T, R> R b(@NotNull C4974k<T, R> c4974k, T t10) {
        kotlin.jvm.internal.G.p(c4974k, "<this>");
        return (R) new C4980n(c4974k.f217992a, t10).i();
    }
}
