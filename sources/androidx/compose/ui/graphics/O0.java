package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import androidx.compose.runtime.InterfaceC1924k0;
import java.util.Arrays;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class O0 extends L0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public float[] f100785c;

    public /* synthetic */ O0(float[] fArr, ColorFilter colorFilter, C4969v c4969v) {
        this(fArr, colorFilter);
    }

    public static /* synthetic */ float[] c(O0 o02, float[] fArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fArr = N0.c(null, 1, null);
        }
        o02.b(fArr);
        return fArr;
    }

    @NotNull
    public final float[] b(@NotNull float[] fArr) {
        C4875q.H0(d(), fArr, 0, 0, 0, 14, null);
        return fArr;
    }

    public final float[] d() {
        float[] fArr = this.f100785c;
        if (fArr != null) {
            return fArr;
        }
        float[] fArrB = M.b(this.f100754a);
        this.f100785c = fArrB;
        return fArrB;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O0) && Arrays.equals(d(), ((O0) obj).d());
    }

    public int hashCode() {
        float[] fArr = this.f100785c;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f100785c;
        sb2.append((Object) (fArr == null ? "null" : N0.v(fArr)));
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ O0(float[] fArr, C4969v c4969v) {
        this(fArr);
    }

    public O0(float[] fArr) {
        this(fArr, new ColorMatrixColorFilter(fArr));
    }

    public O0(float[] fArr, ColorFilter colorFilter) {
        super(colorFilter);
        this.f100785c = fArr;
    }
}
