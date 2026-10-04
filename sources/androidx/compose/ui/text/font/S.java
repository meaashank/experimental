package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.AbstractC2307d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class S implements AbstractC2307d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final S f104582a = new S();

    @Override // androidx.compose.ui.text.font.AbstractC2307d.a
    @Nullable
    public Typeface a(@NotNull Context context, @NotNull AbstractC2307d abstractC2307d) {
        r rVar = abstractC2307d instanceof r ? (r) abstractC2307d : null;
        if (rVar != null) {
            return rVar.e(context);
        }
        return null;
    }

    @Override // androidx.compose.ui.text.font.AbstractC2307d.a
    @Nullable
    public Object b(@NotNull Context context, @NotNull AbstractC2307d abstractC2307d, @NotNull kotlin.coroutines.e<? super Typeface> eVar) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }
}
