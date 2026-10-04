package com.inmobi.media;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class Ra {

    @NotNull
    public static final Qa Companion = new Qa();

    @NotNull
    public static final String DEFAULT_POSITION = "top-right";
    private static final String TAG = "Ra";
    private boolean allowOffscreen;

    @Nullable
    private String customClosePosition;
    private int height;
    private int offsetX;
    private int offsetY;
    private int width;

    public Ra(@Nullable String str, boolean z10) {
        this.customClosePosition = str;
        this.allowOffscreen = z10;
    }

    public final boolean a() {
        return this.allowOffscreen;
    }

    public final String b() {
        return this.customClosePosition;
    }

    public final int c() {
        return this.height;
    }

    public final int d() {
        return this.offsetX;
    }

    public final int e() {
        return this.offsetY;
    }

    public final int f() {
        return this.width;
    }

    public final void a(boolean z10) {
        this.allowOffscreen = z10;
    }

    public final void a(String str) {
        this.customClosePosition = str;
    }
}
