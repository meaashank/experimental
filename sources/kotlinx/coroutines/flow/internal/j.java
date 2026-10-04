package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements kotlin.coroutines.e<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f220219a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final kotlin.coroutines.i f220220b = EmptyCoroutineContext.f217673a;

    @Override // kotlin.coroutines.e
    @NotNull
    public kotlin.coroutines.i getContext() {
        return f220220b;
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(@NotNull Object obj) {
    }
}
