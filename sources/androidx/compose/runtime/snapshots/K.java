package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.AtomicInt;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nStateObjectImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n+ 2 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind\n*L\n1#1,56:1\n48#2:57\n46#2:58\n48#2:59\n*S KotlinDebug\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n*L\n33#1:57\n35#1:58\n40#1:59\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public abstract class K implements J {
    public static final int $stable = 0;

    @NotNull
    private final AtomicInt readerKind = new AtomicInt(0);

    /* JADX INFO: renamed from: isReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final boolean m3isReadInh_f27i8$runtime_release(int i10) {
        return (i10 & this.readerKind.get()) != 0;
    }

    @Override // androidx.compose.runtime.snapshots.J
    public /* synthetic */ L mergeRecords(L l10, L l11, L l12) {
        return null;
    }

    /* JADX INFO: renamed from: recordReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final void m4recordReadInh_f27i8$runtime_release(int i10) {
        int i11;
        do {
            i11 = this.readerKind.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(i11, i11 | i10));
    }
}
