package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import e.InterfaceC4345t;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T(28)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p f104927a = new p();

    @InterfaceC4345t
    @NotNull
    public final TypefaceSpan a(@NotNull Typeface typeface) {
        return new TypefaceSpan(typeface);
    }
}
