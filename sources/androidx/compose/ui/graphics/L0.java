package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public class L0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f100753b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ColorFilter f100754a;

    public static final class a {
        public a() {
        }

        public static L0 d(a aVar, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                C2099r0.f101402b.getClass();
                i10 = C2099r0.f101408h;
            }
            aVar.getClass();
            return new C2103s0(j10, i10);
        }

        @androidx.compose.runtime.T1
        @NotNull
        public final L0 a(@NotNull float[] fArr) {
            return new O0(fArr);
        }

        @androidx.compose.runtime.T1
        @NotNull
        public final L0 b(long j10, long j11) {
            return new C2049k2(j10, j11);
        }

        @androidx.compose.runtime.T1
        @NotNull
        public final L0 c(long j10, int i10) {
            return new C2103s0(j10, i10);
        }

        public a(C4969v c4969v) {
        }
    }

    public L0(@NotNull ColorFilter colorFilter) {
        this.f100754a = colorFilter;
    }

    @NotNull
    public final ColorFilter a() {
        return this.f100754a;
    }
}
