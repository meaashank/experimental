package com.github.appintro.internal;

import D0.i;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.activity.C1477d;
import e.InterfaceC4349x;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TypefaceContainer {
    private int typeFaceResource;

    @Nullable
    private String typeFaceUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public TypefaceContainer() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TypefaceContainer copy$default(TypefaceContainer typefaceContainer, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = typefaceContainer.typeFaceUrl;
        }
        if ((i11 & 2) != 0) {
            i10 = typefaceContainer.typeFaceResource;
        }
        return typefaceContainer.copy(str, i10);
    }

    public final void applyTo(@Nullable final TextView textView) {
        if (textView == null || textView.getContext() == null) {
            return;
        }
        if (this.typeFaceUrl == null && this.typeFaceResource == 0) {
            return;
        }
        i.f fVar = new i.f() { // from class: com.github.appintro.internal.TypefaceContainer$applyTo$callback$1
            @Override // D0.i.f
            public void onFontRetrievalFailed(int i10) {
            }

            @Override // D0.i.f
            public void onFontRetrieved(@NotNull Typeface typeface) {
                G.p(typeface, "typeface");
                textView.setTypeface(typeface);
            }
        };
        if (this.typeFaceResource != 0) {
            i.l(textView.getContext(), this.typeFaceResource, fVar, null);
            return;
        }
        CustomFontCache customFontCache = CustomFontCache.INSTANCE;
        Context context = textView.getContext();
        G.o(context, "textView.context");
        customFontCache.getFont(context, this.typeFaceUrl, fVar);
    }

    @Nullable
    public final String component1() {
        return this.typeFaceUrl;
    }

    public final int component2() {
        return this.typeFaceResource;
    }

    @NotNull
    public final TypefaceContainer copy(@Nullable String str, @InterfaceC4349x int i10) {
        return new TypefaceContainer(str, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceContainer)) {
            return false;
        }
        TypefaceContainer typefaceContainer = (TypefaceContainer) obj;
        return G.g(this.typeFaceUrl, typefaceContainer.typeFaceUrl) && this.typeFaceResource == typefaceContainer.typeFaceResource;
    }

    public final int getTypeFaceResource() {
        return this.typeFaceResource;
    }

    @Nullable
    public final String getTypeFaceUrl() {
        return this.typeFaceUrl;
    }

    public int hashCode() {
        String str = this.typeFaceUrl;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.typeFaceResource;
    }

    public final void setTypeFaceResource(int i10) {
        this.typeFaceResource = i10;
    }

    public final void setTypeFaceUrl(@Nullable String str) {
        this.typeFaceUrl = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceContainer(typeFaceUrl=");
        sb2.append((Object) this.typeFaceUrl);
        sb2.append(", typeFaceResource=");
        return C1477d.a(sb2, this.typeFaceResource, ')');
    }

    public TypefaceContainer(@Nullable String str, @InterfaceC4349x int i10) {
        this.typeFaceUrl = str;
        this.typeFaceResource = i10;
    }

    public /* synthetic */ TypefaceContainer(String str, int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? 0 : i10);
    }
}
