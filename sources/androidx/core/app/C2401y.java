package androidx.core.app;

import android.content.res.Configuration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.core.app.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2401y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e.T(26)
    @Nullable
    public Configuration f111121b;

    public C2401y(boolean z10) {
        this.f111120a = z10;
    }

    @e.T(26)
    @NotNull
    public final Configuration a() {
        Configuration configuration = this.f111121b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?");
    }

    public final boolean b() {
        return this.f111120a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e.T(26)
    public C2401y(boolean z10, @NotNull Configuration newConfig) {
        this(z10);
        kotlin.jvm.internal.G.p(newConfig, "newConfig");
        this.f111121b = newConfig;
    }
}
