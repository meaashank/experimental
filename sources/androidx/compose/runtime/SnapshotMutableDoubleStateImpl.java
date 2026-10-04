package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1960k;
import androidx.compose.runtime.snapshots.SnapshotKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSnapshotDoubleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotDoubleState.kt\nandroidx/compose/runtime/SnapshotMutableDoubleStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 FloatingPointEquality.android.kt\nandroidx/compose/runtime/internal/FloatingPointEquality_androidKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,195:1\n2420#2:196\n2341#2,2:202\n1843#2:204\n2343#2,5:206\n2420#2:216\n49#3,5:197\n49#3,5:211\n89#4:205\n*S KotlinDebug\n*F\n+ 1 SnapshotDoubleState.kt\nandroidx/compose/runtime/SnapshotMutableDoubleStateImpl\n*L\n148#1:196\n150#1:202,2\n150#1:204\n150#1:206,5\n181#1:216\n149#1:197,5\n174#1:211,5\n150#1:205\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public class SnapshotMutableDoubleStateImpl extends androidx.compose.runtime.snapshots.K implements D0, androidx.compose.runtime.snapshots.v<Double> {
    public static final int $stable = 0;

    @NotNull
    private a next;

    public static final class a extends androidx.compose.runtime.snapshots.L {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f99342d;

        public a(double d10) {
            this.f99342d = d10;
        }

        @Override // androidx.compose.runtime.snapshots.L
        public void c(@NotNull androidx.compose.runtime.snapshots.L l10) {
            kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.f99342d = ((a) l10).f99342d;
        }

        @Override // androidx.compose.runtime.snapshots.L
        @NotNull
        public androidx.compose.runtime.snapshots.L d() {
            return new a(this.f99342d);
        }

        public final double i() {
            return this.f99342d;
        }

        public final void j(double d10) {
            this.f99342d = d10;
        }
    }

    public SnapshotMutableDoubleStateImpl(double d10) {
        a aVar = new a(d10);
        if (AbstractC1960k.f100175e.l()) {
            a aVar2 = new a(d10);
            aVar2.f100056a = 1;
            aVar.f100057b = aVar2;
        }
        this.next = aVar;
    }

    @Override // androidx.compose.runtime.L0
    @NotNull
    public ed.l<Double, kotlin.L0> component2() {
        return new ed.l<Double, kotlin.L0>() { // from class: androidx.compose.runtime.SnapshotMutableDoubleStateImpl.component2.1
            {
                super(1);
            }

            public final void e(double d10) {
                SnapshotMutableDoubleStateImpl.this.setDoubleValue(d10);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Double d10) {
                e(d10.doubleValue());
                return kotlin.L0.f217464a;
            }
        };
    }

    @Override // androidx.compose.runtime.D0
    public void f(double d10) {
        setDoubleValue(d10);
    }

    @Override // androidx.compose.runtime.D0, androidx.compose.runtime.W
    public double getDoubleValue() {
        return ((a) SnapshotKt.c0(this.next, this)).f99342d;
    }

    @Override // androidx.compose.runtime.snapshots.J
    @NotNull
    public androidx.compose.runtime.snapshots.L getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.snapshots.v
    @NotNull
    public H1<Double> getPolicy() {
        return L1.c();
    }

    @Override // androidx.compose.runtime.D0, androidx.compose.runtime.W, androidx.compose.runtime.X1
    public /* bridge */ /* synthetic */ Double getValue() {
        return getValue();
    }

    @Override // androidx.compose.runtime.snapshots.K, androidx.compose.runtime.snapshots.J
    @Nullable
    public androidx.compose.runtime.snapshots.L mergeRecords(@NotNull androidx.compose.runtime.snapshots.L l10, @NotNull androidx.compose.runtime.snapshots.L l11, @NotNull androidx.compose.runtime.snapshots.L l12) {
        kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        kotlin.jvm.internal.G.n(l12, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        if (((a) l11).f99342d == ((a) l12).f99342d) {
            return l11;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.J
    public void prependStateRecord(@NotNull androidx.compose.runtime.snapshots.L l10) {
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.next = (a) l10;
    }

    @Override // androidx.compose.runtime.D0
    public void setDoubleValue(double d10) {
        AbstractC1960k abstractC1960kI;
        a aVar = (a) SnapshotKt.G(this.next);
        if (aVar.f99342d == d10) {
            return;
        }
        a aVar2 = this.next;
        AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
        synchronized (SnapshotKt.f100097d) {
            AbstractC1960k.f100175e.getClass();
            abstractC1960kI = SnapshotKt.I();
            ((a) SnapshotKt.X(aVar2, this, abstractC1960kI, aVar)).f99342d = d10;
        }
        SnapshotKt.U(abstractC1960kI, this);
    }

    @Override // androidx.compose.runtime.D0, androidx.compose.runtime.L0
    public /* bridge */ /* synthetic */ void setValue(Double d10) {
        f(d10.doubleValue());
    }

    @NotNull
    public String toString() {
        return "MutableDoubleState(value=" + ((a) SnapshotKt.G(this.next)).f99342d + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.L0
    @NotNull
    public Double component1() {
        return Double.valueOf(getDoubleValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.D0, androidx.compose.runtime.W, androidx.compose.runtime.X1
    public Double getValue() {
        return Double.valueOf(getDoubleValue());
    }
}
