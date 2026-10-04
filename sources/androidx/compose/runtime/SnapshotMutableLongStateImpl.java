package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1960k;
import androidx.compose.runtime.snapshots.SnapshotKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSnapshotLongState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotMutableLongStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,191:1\n2420#2:192\n2341#2,2:193\n1843#2:195\n2343#2,5:197\n2420#2:202\n89#3:196\n*S KotlinDebug\n*F\n+ 1 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotMutableLongStateImpl\n*L\n144#1:192\n146#1:193,2\n146#1:195\n146#1:197,5\n177#1:202\n146#1:196\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public class SnapshotMutableLongStateImpl extends androidx.compose.runtime.snapshots.K implements J0, androidx.compose.runtime.snapshots.v<Long> {
    public static final int $stable = 0;

    @NotNull
    private a next;

    public static final class a extends androidx.compose.runtime.snapshots.L {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f99348d;

        public a(long j10) {
            this.f99348d = j10;
        }

        @Override // androidx.compose.runtime.snapshots.L
        public void c(@NotNull androidx.compose.runtime.snapshots.L l10) {
            kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f99348d = ((a) l10).f99348d;
        }

        @Override // androidx.compose.runtime.snapshots.L
        @NotNull
        public androidx.compose.runtime.snapshots.L d() {
            return new a(this.f99348d);
        }

        public final long i() {
            return this.f99348d;
        }

        public final void j(long j10) {
            this.f99348d = j10;
        }
    }

    public SnapshotMutableLongStateImpl(long j10) {
        a aVar = new a(j10);
        if (AbstractC1960k.f100175e.l()) {
            a aVar2 = new a(j10);
            aVar2.f100056a = 1;
            aVar.f100057b = aVar2;
        }
        this.next = aVar;
    }

    @Override // androidx.compose.runtime.J0
    public void b(long j10) {
        setLongValue(j10);
    }

    @Override // androidx.compose.runtime.L0
    @NotNull
    public ed.l<Long, kotlin.L0> component2() {
        return new ed.l<Long, kotlin.L0>() { // from class: androidx.compose.runtime.SnapshotMutableLongStateImpl.component2.1
            {
                super(1);
            }

            public final void e(long j10) {
                SnapshotMutableLongStateImpl.this.setLongValue(j10);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Long l10) {
                e(l10.longValue());
                return kotlin.L0.f217464a;
            }
        };
    }

    @Override // androidx.compose.runtime.snapshots.J
    @NotNull
    public androidx.compose.runtime.snapshots.L getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.J0, androidx.compose.runtime.InterfaceC1975w0
    public long getLongValue() {
        return ((a) SnapshotKt.c0(this.next, this)).f99348d;
    }

    @Override // androidx.compose.runtime.snapshots.v
    @NotNull
    public H1<Long> getPolicy() {
        return L1.c();
    }

    @Override // androidx.compose.runtime.J0, androidx.compose.runtime.InterfaceC1975w0, androidx.compose.runtime.X1
    public /* bridge */ /* synthetic */ Long getValue() {
        return getValue();
    }

    @Override // androidx.compose.runtime.snapshots.K, androidx.compose.runtime.snapshots.J
    @Nullable
    public androidx.compose.runtime.snapshots.L mergeRecords(@NotNull androidx.compose.runtime.snapshots.L l10, @NotNull androidx.compose.runtime.snapshots.L l11, @NotNull androidx.compose.runtime.snapshots.L l12) {
        kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        kotlin.jvm.internal.G.n(l12, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((a) l11).f99348d == ((a) l12).f99348d) {
            return l11;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.J
    public void prependStateRecord(@NotNull androidx.compose.runtime.snapshots.L l10) {
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.next = (a) l10;
    }

    @Override // androidx.compose.runtime.J0
    public void setLongValue(long j10) {
        AbstractC1960k abstractC1960kI;
        a aVar = (a) SnapshotKt.G(this.next);
        if (aVar.f99348d != j10) {
            a aVar2 = this.next;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                ((a) SnapshotKt.X(aVar2, this, abstractC1960kI, aVar)).f99348d = j10;
            }
            SnapshotKt.U(abstractC1960kI, this);
        }
    }

    @Override // androidx.compose.runtime.J0, androidx.compose.runtime.L0
    public /* bridge */ /* synthetic */ void setValue(Long l10) {
        b(l10.longValue());
    }

    @NotNull
    public String toString() {
        return "MutableLongState(value=" + ((a) SnapshotKt.G(this.next)).f99348d + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.L0
    @NotNull
    public Long component1() {
        return Long.valueOf(getLongValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.J0, androidx.compose.runtime.InterfaceC1975w0, androidx.compose.runtime.X1
    public Long getValue() {
        return Long.valueOf(getLongValue());
    }
}
