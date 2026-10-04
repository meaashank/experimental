package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.AbstractC2307d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2314k implements AbstractC2307d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2314k f104626a = new C2314k();

    @Override // androidx.compose.ui.text.font.AbstractC2307d.a
    @Nullable
    public Typeface a(@NotNull Context context, @NotNull AbstractC2307d abstractC2307d) {
        AbstractC2313j abstractC2313j = abstractC2307d instanceof AbstractC2313j ? (AbstractC2313j) abstractC2307d : null;
        if (abstractC2313j != null) {
            return abstractC2313j.h(context);
        }
        return null;
    }

    @Override // androidx.compose.ui.text.font.AbstractC2307d.a
    @Nullable
    public Object b(@NotNull Context context, @NotNull AbstractC2307d abstractC2307d, @NotNull kotlin.coroutines.e<?> eVar) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }
}
