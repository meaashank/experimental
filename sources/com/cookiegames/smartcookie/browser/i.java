package com.cookiegames.smartcookie.browser;

import android.os.Bundle;
import java.util.Stack;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f141025b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Stack<Bundle> f141026a = new Stack<>();

    public final boolean a(@NotNull Bundle savedBundle) {
        G.p(savedBundle, "savedBundle");
        return this.f141026a.add(savedBundle);
    }

    @Nullable
    public final Bundle b() {
        return (Bundle) d4.m.a(this.f141026a);
    }
}
