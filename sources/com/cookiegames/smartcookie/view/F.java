package com.cookiegames.smartcookie.view;

import android.content.Context;
import android.graphics.Bitmap;
import com.cookiegames.smartcookie.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class F {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f148284c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Bitmap f148285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f148286b;

    public F(@NotNull Context context) {
        kotlin.jvm.internal.G.p(context, "context");
        String string = context.getString(p.s.f145739b0);
        kotlin.jvm.internal.G.o(string, "getString(...)");
        this.f148286b = string;
    }

    @Nullable
    public final Bitmap a() {
        return this.f148285a;
    }

    @Nullable
    public final String b() {
        return this.f148286b;
    }

    public final void c(@Nullable Bitmap bitmap) {
        this.f148285a = bitmap != null ? d4.d.b(bitmap) : null;
    }

    public final void d(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        this.f148286b = str;
    }
}
