package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1960k;
import androidx.compose.runtime.snapshots.SnapshotKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,313:1\n2420#2:314\n2341#2,2:315\n1843#2:317\n2343#2,5:319\n2420#2:324\n2420#2:325\n89#3:318\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n*L\n136#1:314\n138#1:315,2\n138#1:317\n138#1:319,5\n185#1:324\n221#1:325\n138#1:318\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 2)
public class SnapshotMutableStateImpl<T> extends androidx.compose.runtime.snapshots.K implements androidx.compose.runtime.snapshots.v<T> {
    public static final int $stable = 0;

    @NotNull
    private a<T> next;

    @NotNull
    private final H1<T> policy;

    public static final class a<T> extends androidx.compose.runtime.snapshots.L {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f99350d;

        public a(T t10) {
            this.f99350d = t10;
        }

        @Override // androidx.compose.runtime.snapshots.L
        public void c(@NotNull androidx.compose.runtime.snapshots.L l10) {
            kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f99350d = ((a) l10).f99350d;
        }

        @Override // androidx.compose.runtime.snapshots.L
        @NotNull
        public androidx.compose.runtime.snapshots.L d() {
            return new a(this.f99350d);
        }

        public final T i() {
            return this.f99350d;
        }

        public final void j(T t10) {
            this.f99350d = t10;
        }
    }

    public SnapshotMutableStateImpl(T t10, @NotNull H1<T> h12) {
        this.policy = h12;
        a<T> aVar = new a<>(t10);
        if (AbstractC1960k.f100175e.l()) {
            a aVar2 = new a(t10);
            aVar2.f100056a = 1;
            aVar.f100057b = aVar2;
        }
        this.next = aVar;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    @Override // androidx.compose.runtime.L0
    public T component1() {
        return getValue();
    }

    @Override // androidx.compose.runtime.L0
    @NotNull
    public ed.l<T, kotlin.L0> component2() {
        return new ed.l<T, kotlin.L0>(this) { // from class: androidx.compose.runtime.SnapshotMutableStateImpl.component2.1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ SnapshotMutableStateImpl<T> f99351d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f99351d = this;
            }

            public final void e(T t10) {
                this.f99351d.setValue(t10);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Object obj) {
                e(obj);
                return kotlin.L0.f217464a;
            }
        };
    }

    @dd.j(name = "getDebuggerDisplayValue")
    public final T getDebuggerDisplayValue() {
        return ((a) SnapshotKt.G(this.next)).f99350d;
    }

    @Override // androidx.compose.runtime.snapshots.J
    @NotNull
    public androidx.compose.runtime.snapshots.L getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.snapshots.v
    @NotNull
    public H1<T> getPolicy() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.L0, androidx.compose.runtime.X1
    public T getValue() {
        return ((a) SnapshotKt.c0(this.next, this)).f99350d;
    }

    @Override // androidx.compose.runtime.snapshots.K, androidx.compose.runtime.snapshots.J
    @Nullable
    public androidx.compose.runtime.snapshots.L mergeRecords(@NotNull androidx.compose.runtime.snapshots.L l10, @NotNull androidx.compose.runtime.snapshots.L l11, @NotNull androidx.compose.runtime.snapshots.L l12) {
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        kotlin.jvm.internal.G.n(l12, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        if (getPolicy().a(((a) l11).f99350d, ((a) l12).f99350d)) {
            return l11;
        }
        getPolicy().getClass();
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.J
    public void prependStateRecord(@NotNull androidx.compose.runtime.snapshots.L l10) {
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.next = (a) l10;
    }

    @Override // androidx.compose.runtime.L0
    public void setValue(T t10) {
        AbstractC1960k abstractC1960kI;
        a aVar = (a) SnapshotKt.G(this.next);
        if (getPolicy().a(aVar.f99350d, t10)) {
            return;
        }
        a<T> aVar2 = this.next;
        AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
        synchronized (SnapshotKt.f100097d) {
            AbstractC1960k.f100175e.getClass();
            abstractC1960kI = SnapshotKt.I();
            ((a) SnapshotKt.X(aVar2, this, abstractC1960kI, aVar)).f99350d = t10;
        }
        SnapshotKt.U(abstractC1960kI, this);
    }

    @NotNull
    public String toString() {
        return "MutableState(value=" + ((a) SnapshotKt.G(this.next)).f99350d + ")@" + hashCode();
    }
}
