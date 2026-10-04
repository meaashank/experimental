package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5074h {
    public static final <T> T a(@NotNull AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static /* synthetic */ void b(AtomicReference atomicReference) {
    }

    public static final <T> void c(@NotNull AtomicReference<T> atomicReference, @NotNull ed.p<? super AtomicReference<T>, ? super T, L0> pVar) {
        while (true) {
            pVar.invoke(atomicReference, atomicReference.get());
        }
    }

    public static final <T> void d(@NotNull AtomicReference<T> atomicReference, T t10) {
        atomicReference.set(t10);
    }
}
