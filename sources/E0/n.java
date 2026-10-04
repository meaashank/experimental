package e0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class n extends CharacterStyle {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f199994c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f199995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f199996b;

    public n(boolean z10, boolean z11) {
        this.f199995a = z10;
        this.f199996b = z11;
    }

    public final boolean a() {
        return this.f199996b;
    }

    public final boolean b() {
        return this.f199995a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.f199995a);
        textPaint.setStrikeThruText(this.f199996b);
    }
}
