package e0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class l extends CharacterStyle {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f199987e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f199988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f199989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f199990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f199991d;

    public l(int i10, float f10, float f11, float f12) {
        this.f199988a = i10;
        this.f199989b = f10;
        this.f199990c = f11;
        this.f199991d = f12;
    }

    public final int a() {
        return this.f199988a;
    }

    public final float b() {
        return this.f199989b;
    }

    public final float c() {
        return this.f199990c;
    }

    public final float d() {
        return this.f199991d;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setShadowLayer(this.f199991d, this.f199989b, this.f199990c, this.f199988a);
    }
}
