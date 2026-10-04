package xd;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC5107q0;
import kotlinx.coroutines.internal.C5085t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final b f240606i = new b();

    public b() {
        super(m.f240630c, m.f240631d, m.f240632e, m.f240628a);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InterfaceC5107q0
    @NotNull
    public CoroutineDispatcher R2(int i10) {
        C5085t.a(i10);
        return i10 >= m.f240630c ? this : super.R2(i10);
    }

    @Override // xd.g, kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return "Dispatchers.Default";
    }

    public final void x3() {
        super.close();
    }
}
