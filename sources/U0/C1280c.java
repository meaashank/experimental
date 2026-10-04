package U0;

import android.text.Html;
import android.text.Spanned;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: U0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1280c {
    @NotNull
    public static final Spanned a(@NotNull String str, int i10, @Nullable Html.ImageGetter imageGetter, @Nullable Html.TagHandler tagHandler) {
        return C1279b.b(str, i10, imageGetter, tagHandler);
    }

    public static /* synthetic */ Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            imageGetter = null;
        }
        if ((i11 & 4) != 0) {
            tagHandler = null;
        }
        return C1279b.b(str, i10, imageGetter, tagHandler);
    }

    @NotNull
    public static final String c(@NotNull Spanned spanned, int i10) {
        return C1279b.c(spanned, i10);
    }

    public static /* synthetic */ String d(Spanned spanned, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return C1279b.c(spanned, i10);
    }
}
