package androidx.compose.runtime;

import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nActualJvm.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,146:1\n89#2:147\n*S KotlinDebug\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n*L\n74#1:147\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class N1<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99160d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicReference<androidx.compose.runtime.internal.s> f99161a = new AtomicReference<>(androidx.compose.runtime.internal.t.f99946a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f99162b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public T f99163c;

    @Nullable
    public final T a() {
        long id2 = Thread.currentThread().getId();
        return id2 == ActualAndroid_androidKt.h() ? this.f99163c : (T) this.f99161a.get().b(id2);
    }

    public final void b(@Nullable T t10) {
        long id2 = Thread.currentThread().getId();
        if (id2 == ActualAndroid_androidKt.h()) {
            this.f99163c = t10;
            return;
        }
        synchronized (this.f99162b) {
            androidx.compose.runtime.internal.s sVar = this.f99161a.get();
            if (sVar.d(id2, t10)) {
                return;
            }
            this.f99161a.set(sVar.c(id2, t10));
        }
    }
}
