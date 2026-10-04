package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C2103s0 extends L0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f101428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f101429d;

    public /* synthetic */ C2103s0(long j10, int i10, ColorFilter colorFilter, C4969v c4969v) {
        this(j10, i10, colorFilter);
    }

    public final int b() {
        return this.f101429d;
    }

    public final long c() {
        return this.f101428c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2103s0)) {
            return false;
        }
        C2103s0 c2103s0 = (C2103s0) obj;
        return K0.y(this.f101428c, c2103s0.f101428c) && this.f101429d == c2103s0.f101429d;
    }

    public int hashCode() {
        return (K0.K(this.f101428c) * 31) + this.f101429d;
    }

    @NotNull
    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) K0.L(this.f101428c)) + ", blendMode=" + ((Object) C2099r0.I(this.f101429d)) + ')';
    }

    public /* synthetic */ C2103s0(long j10, int i10, C4969v c4969v) {
        this(j10, i10);
    }

    public C2103s0(long j10, int i10, ColorFilter colorFilter) {
        super(colorFilter);
        this.f101428c = j10;
        this.f101429d = i10;
    }

    public C2103s0(long j10, int i10) {
        this(j10, i10, M.d(j10, i10));
    }
}
