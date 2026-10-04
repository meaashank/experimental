package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1960k;
import androidx.compose.runtime.snapshots.SnapshotKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSnapshotIntState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotMutableIntStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,200:1\n2420#2:201\n2341#2,2:202\n1843#2:204\n2343#2,5:206\n2420#2:211\n2420#2:212\n89#3:205\n*S KotlinDebug\n*F\n+ 1 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotMutableIntStateImpl\n*L\n148#1:201\n150#1:202,2\n150#1:204\n150#1:206,5\n181#1:211\n188#1:212\n150#1:205\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public class SnapshotMutableIntStateImpl extends androidx.compose.runtime.snapshots.K implements H0, androidx.compose.runtime.snapshots.v<Integer> {
    public static final int $stable = 0;

    @NotNull
    private a next;

    public static final class a extends androidx.compose.runtime.snapshots.L {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f99346d;

        public a(int i10) {
            this.f99346d = i10;
        }

        @Override // androidx.compose.runtime.snapshots.L
        public void c(@NotNull androidx.compose.runtime.snapshots.L l10) {
            kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.f99346d = ((a) l10).f99346d;
        }

        @Override // androidx.compose.runtime.snapshots.L
        @NotNull
        public androidx.compose.runtime.snapshots.L d() {
            return new a(this.f99346d);
        }

        public final int i() {
            return this.f99346d;
        }

        public final void j(int i10) {
            this.f99346d = i10;
        }
    }

    public SnapshotMutableIntStateImpl(int i10) {
        a aVar = new a(i10);
        if (AbstractC1960k.f100175e.l()) {
            a aVar2 = new a(i10);
            aVar2.f100056a = 1;
            aVar.f100057b = aVar2;
        }
        this.next = aVar;
    }

    @InterfaceC1936o0
    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // androidx.compose.runtime.H0
    public void c(int i10) {
        setIntValue(i10);
    }

    @Override // androidx.compose.runtime.L0
    @NotNull
    public ed.l<Integer, kotlin.L0> component2() {
        return new ed.l<Integer, kotlin.L0>() { // from class: androidx.compose.runtime.SnapshotMutableIntStateImpl.component2.1
            {
                super(1);
            }

            public final void e(int i10) {
                SnapshotMutableIntStateImpl.this.setIntValue(i10);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Integer num) {
                e(num.intValue());
                return kotlin.L0.f217464a;
            }
        };
    }

    @dd.j(name = "getDebuggerDisplayValue")
    public final int getDebuggerDisplayValue() {
        return ((a) SnapshotKt.G(this.next)).f99346d;
    }

    @Override // androidx.compose.runtime.snapshots.J
    @NotNull
    public androidx.compose.runtime.snapshots.L getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.H0, androidx.compose.runtime.InterfaceC1933n0
    public int getIntValue() {
        return ((a) SnapshotKt.c0(this.next, this)).f99346d;
    }

    @Override // androidx.compose.runtime.snapshots.v
    @NotNull
    public H1<Integer> getPolicy() {
        return L1.c();
    }

    @Override // androidx.compose.runtime.H0, androidx.compose.runtime.InterfaceC1933n0, androidx.compose.runtime.X1
    public /* bridge */ /* synthetic */ Integer getValue() {
        return getValue();
    }

    @Override // androidx.compose.runtime.snapshots.K, androidx.compose.runtime.snapshots.J
    @Nullable
    public androidx.compose.runtime.snapshots.L mergeRecords(@NotNull androidx.compose.runtime.snapshots.L l10, @NotNull androidx.compose.runtime.snapshots.L l11, @NotNull androidx.compose.runtime.snapshots.L l12) {
        kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        kotlin.jvm.internal.G.n(l12, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((a) l11).f99346d == ((a) l12).f99346d) {
            return l11;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.J
    public void prependStateRecord(@NotNull androidx.compose.runtime.snapshots.L l10) {
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.next = (a) l10;
    }

    @Override // androidx.compose.runtime.H0
    public void setIntValue(int i10) {
        AbstractC1960k abstractC1960kI;
        a aVar = (a) SnapshotKt.G(this.next);
        if (aVar.f99346d != i10) {
            a aVar2 = this.next;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                ((a) SnapshotKt.X(aVar2, this, abstractC1960kI, aVar)).f99346d = i10;
            }
            SnapshotKt.U(abstractC1960kI, this);
        }
    }

    @Override // androidx.compose.runtime.H0, androidx.compose.runtime.L0
    public /* bridge */ /* synthetic */ void setValue(Integer num) {
        c(num.intValue());
    }

    @NotNull
    public String toString() {
        return "MutableIntState(value=" + ((a) SnapshotKt.G(this.next)).f99346d + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.L0
    @NotNull
    public Integer component1() {
        return Integer.valueOf(getIntValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.H0, androidx.compose.runtime.InterfaceC1933n0, androidx.compose.runtime.X1
    public Integer getValue() {
        return Integer.valueOf(getIntValue());
    }
}
