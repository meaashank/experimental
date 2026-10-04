package q1;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.t;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
@T(19)
public abstract class h extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final m f226707b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f226706a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f226708c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public short f226709d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f226710e = 1.0f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public h(@NonNull m mVar) {
        t.m(mVar, "rasterizer cannot be null");
        this.f226707b = mVar;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public final int a() {
        return this.f226709d;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public final int b() {
        return this.f226707b.g();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final float c() {
        return this.f226710e;
    }

    @NonNull
    public final m d() {
        return this.f226707b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final int e() {
        return this.f226708c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f226706a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f226706a;
        this.f226710e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f226707b.f();
        this.f226709d = (short) (this.f226707b.f() * this.f226710e);
        short sK = (short) (this.f226707b.k() * this.f226710e);
        this.f226708c = sK;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f226706a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sK;
    }
}
