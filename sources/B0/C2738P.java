package b0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b0.P, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2738P {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f120631h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CharSequence f120632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TextPaint f120633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f120634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f120635d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f120636e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public BoringLayout.Metrics f120637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f120638g;

    public C2738P(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i10) {
        this.f120632a = charSequence;
        this.f120633b = textPaint;
        this.f120634c = i10;
    }

    @Nullable
    public final BoringLayout.Metrics a() {
        if (!this.f120638g) {
            this.f120637f = C2758k.f120647a.d(this.f120632a, this.f120633b, t0.k(this.f120634c));
            this.f120638g = true;
        }
        return this.f120637f;
    }

    public final float b() {
        if (!Float.isNaN(this.f120635d)) {
            return this.f120635d;
        }
        BoringLayout.Metrics metricsA = a();
        float fCeil = metricsA != null ? metricsA.width : -1;
        if (fCeil < 0.0f) {
            CharSequence charSequence = this.f120632a;
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f120633b));
        }
        if (C2740S.e(fCeil, this.f120632a, this.f120633b)) {
            fCeil += 0.5f;
        }
        this.f120635d = fCeil;
        return fCeil;
    }

    public final float c() {
        if (!Float.isNaN(this.f120636e)) {
            return this.f120636e;
        }
        float fC = C2740S.c(this.f120632a, this.f120633b);
        this.f120636e = fC;
        return fC;
    }
}
