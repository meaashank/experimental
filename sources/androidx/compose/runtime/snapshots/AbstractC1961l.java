package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public abstract class AbstractC1961l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f100182a = 0;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.l$a */
    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class a extends AbstractC1961l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f100183c = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final AbstractC1960k f100184b;

        public a(@NotNull AbstractC1960k abstractC1960k) {
            this.f100184b = abstractC1960k;
        }

        @Override // androidx.compose.runtime.snapshots.AbstractC1961l
        public void a() throws SnapshotApplyConflictException {
            this.f100184b.d();
            throw new SnapshotApplyConflictException(this.f100184b);
        }

        @Override // androidx.compose.runtime.snapshots.AbstractC1961l
        public boolean b() {
            return false;
        }

        @NotNull
        public final AbstractC1960k c() {
            return this.f100184b;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.l$b */
    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class b extends AbstractC1961l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f100185b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f100186c = 0;

        @Override // androidx.compose.runtime.snapshots.AbstractC1961l
        public void a() {
        }

        @Override // androidx.compose.runtime.snapshots.AbstractC1961l
        public boolean b() {
            return true;
        }
    }

    public AbstractC1961l() {
    }

    public abstract void a();

    public abstract boolean b();

    public AbstractC1961l(C4969v c4969v) {
    }
}
