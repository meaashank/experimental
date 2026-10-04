package com.github.appintro.internal;

import D0.i;
import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomFontCache {

    @NotNull
    public static final CustomFontCache INSTANCE = new CustomFontCache();

    @NotNull
    private static final String TAG = LogHelper.INSTANCE.makeLogTag((d<?>) O.f217893a.d(CustomFontCache.class));

    @NotNull
    private static final HashMap<String, Typeface> cache = new HashMap<>();

    private CustomFontCache() {
    }

    public final void getFont(@NotNull Context ctx, @Nullable String str, @NotNull i.f fontCallback) {
        G.p(ctx, "ctx");
        G.p(fontCallback, "fontCallback");
        L0 l02 = null;
        if (str == null || str.length() == 0) {
            LogHelper.w$default(TAG, "Empty typeface path provided!", null, 4, null);
            return;
        }
        HashMap<String, Typeface> map = cache;
        Typeface typeface = map.get(str);
        if (typeface != null) {
            fontCallback.onFontRetrieved(typeface);
            l02 = L0.f217464a;
        }
        if (l02 == null) {
            Typeface newTypeface = Typeface.createFromAsset(ctx.getAssets(), str);
            G.o(newTypeface, "newTypeface");
            map.put(str, newTypeface);
            fontCallback.onFontRetrieved(newTypeface);
        }
    }
}
