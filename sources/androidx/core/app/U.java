package androidx.core.app;

import android.content.res.Configuration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f110979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e.T(26)
    @Nullable
    public Configuration f110980b;

    public U(boolean z10) {
        this.f110979a = z10;
    }

    @e.T(26)
    @NotNull
    public final Configuration a() {
        Configuration configuration = this.f110980b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?");
    }

    public final boolean b() {
        return this.f110979a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e.T(26)
    public U(boolean z10, @NotNull Configuration newConfig) {
        this(z10);
        kotlin.jvm.internal.G.p(newConfig, "newConfig");
        this.f110980b = newConfig;
    }
}
