package D0;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import e.T;
import e.b0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@T(26)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f17665a = new l();

    @dd.o
    @NotNull
    public static final Typeface a(@NotNull TypedArray typedArray, @b0 int i10) {
        Typeface font = typedArray.getFont(i10);
        G.m(font);
        return font;
    }
}
