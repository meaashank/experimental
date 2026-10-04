package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nWeakCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,77:1\n1208#2:78\n1187#2,2:79\n728#3,2:81\n48#3:83\n*S KotlinDebug\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n*L\n29#1:78\n29#1:79,2\n38#1:81,2\n49#1:83\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class N1<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f103610c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.collection.c<Reference<T>> f103611a = new androidx.compose.runtime.collection.c<>(new Reference[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ReferenceQueue<T> f103612b = new ReferenceQueue<>();

    public final void a() {
        Reference<? extends T> referencePoll;
        do {
            referencePoll = this.f103612b.poll();
            if (referencePoll != null) {
                this.f103611a.h0(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final int b() {
        a();
        return this.f103611a.f99566c;
    }

    @Nullable
    public final T c() {
        a();
        while (this.f103611a.V()) {
            T t10 = this.f103611a.l0(r0.f99566c - 1).get();
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public final void d(T t10) {
        a();
        this.f103611a.b(new WeakReference(t10, this.f103612b));
    }
}
