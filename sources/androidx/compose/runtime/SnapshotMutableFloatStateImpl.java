package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC1960k;
import androidx.compose.runtime.snapshots.SnapshotKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSnapshotFloatState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFloatState.kt\nandroidx/compose/runtime/SnapshotMutableFloatStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 FloatingPointEquality.android.kt\nandroidx/compose/runtime/internal/FloatingPointEquality_androidKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,192:1\n2420#2:193\n2341#2,2:199\n1843#2:201\n2343#2,5:203\n2420#2:213\n41#3,5:194\n41#3,5:208\n89#4:202\n*S KotlinDebug\n*F\n+ 1 SnapshotFloatState.kt\nandroidx/compose/runtime/SnapshotMutableFloatStateImpl\n*L\n145#1:193\n147#1:199,2\n147#1:201\n147#1:203,5\n178#1:213\n146#1:194,5\n171#1:208,5\n147#1:202\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public class SnapshotMutableFloatStateImpl extends androidx.compose.runtime.snapshots.K implements F0, androidx.compose.runtime.snapshots.v<Float> {
    public static final int $stable = 0;

    @NotNull
    private a next;

    public static final class a extends androidx.compose.runtime.snapshots.L {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f99344d;

        public a(float f10) {
            this.f99344d = f10;
        }

        @Override // androidx.compose.runtime.snapshots.L
        public void c(@NotNull androidx.compose.runtime.snapshots.L l10) {
            kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.f99344d = ((a) l10).f99344d;
        }

        @Override // androidx.compose.runtime.snapshots.L
        @NotNull
        public androidx.compose.runtime.snapshots.L d() {
            return new a(this.f99344d);
        }

        public final float i() {
            return this.f99344d;
        }

        public final void j(float f10) {
            this.f99344d = f10;
        }
    }

    public SnapshotMutableFloatStateImpl(float f10) {
        a aVar = new a(f10);
        if (AbstractC1960k.f100175e.l()) {
            a aVar2 = new a(f10);
            aVar2.f100056a = 1;
            aVar.f100057b = aVar2;
        }
        this.next = aVar;
    }

    @Override // androidx.compose.runtime.L0
    @NotNull
    public ed.l<Float, kotlin.L0> component2() {
        return new ed.l<Float, kotlin.L0>() { // from class: androidx.compose.runtime.SnapshotMutableFloatStateImpl.component2.1
            {
                super(1);
            }

            public final void e(float f10) {
                SnapshotMutableFloatStateImpl.this.setFloatValue(f10);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Float f10) {
                e(f10.floatValue());
                return kotlin.L0.f217464a;
            }
        };
    }

    @Override // androidx.compose.runtime.F0
    public void e(float f10) {
        setFloatValue(f10);
    }

    @Override // androidx.compose.runtime.snapshots.J
    @NotNull
    public androidx.compose.runtime.snapshots.L getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.F0, androidx.compose.runtime.InterfaceC1902d0
    public float getFloatValue() {
        return ((a) SnapshotKt.c0(this.next, this)).f99344d;
    }

    @Override // androidx.compose.runtime.snapshots.v
    @NotNull
    public H1<Float> getPolicy() {
        return L1.c();
    }

    @Override // androidx.compose.runtime.F0, androidx.compose.runtime.InterfaceC1902d0, androidx.compose.runtime.X1
    public /* bridge */ /* synthetic */ Float getValue() {
        return getValue();
    }

    @Override // androidx.compose.runtime.snapshots.K, androidx.compose.runtime.snapshots.J
    @Nullable
    public androidx.compose.runtime.snapshots.L mergeRecords(@NotNull androidx.compose.runtime.snapshots.L l10, @NotNull androidx.compose.runtime.snapshots.L l11, @NotNull androidx.compose.runtime.snapshots.L l12) {
        kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        kotlin.jvm.internal.G.n(l12, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((a) l11).f99344d == ((a) l12).f99344d) {
            return l11;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.J
    public void prependStateRecord(@NotNull androidx.compose.runtime.snapshots.L l10) {
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.next = (a) l10;
    }

    @Override // androidx.compose.runtime.F0
    public void setFloatValue(float f10) {
        AbstractC1960k abstractC1960kI;
        a aVar = (a) SnapshotKt.G(this.next);
        if (aVar.f99344d == f10) {
            return;
        }
        a aVar2 = this.next;
        AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
        synchronized (SnapshotKt.f100097d) {
            AbstractC1960k.f100175e.getClass();
            abstractC1960kI = SnapshotKt.I();
            ((a) SnapshotKt.X(aVar2, this, abstractC1960kI, aVar)).f99344d = f10;
        }
        SnapshotKt.U(abstractC1960kI, this);
    }

    @Override // androidx.compose.runtime.F0, androidx.compose.runtime.L0
    public /* bridge */ /* synthetic */ void setValue(Float f10) {
        e(f10.floatValue());
    }

    @NotNull
    public String toString() {
        return "MutableFloatState(value=" + ((a) SnapshotKt.G(this.next)).f99344d + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.L0
    @NotNull
    public Float component1() {
        return Float.valueOf(getFloatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.F0, androidx.compose.runtime.InterfaceC1902d0, androidx.compose.runtime.X1
    public Float getValue() {
        return Float.valueOf(getFloatValue());
    }
}
