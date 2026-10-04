package com.cookiegames.smartcookie.settings.fragment;

import androidx.preference.Preference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f147833b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Preference f147834a;

    public C2(@NotNull Preference preference) {
        kotlin.jvm.internal.G.p(preference, "preference");
        this.f147834a = preference;
    }

    public final void a(@NotNull String text) {
        kotlin.jvm.internal.G.p(text, "text");
        this.f147834a.a1(text);
    }
}
