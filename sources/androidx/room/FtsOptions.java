package androidx.room;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FtsOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final FtsOptions f117067a = new FtsOptions();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f117068b = "simple";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f117069c = "porter";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f117070d = "icu";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e.T(21)
    @NotNull
    public static final String f117071e = "unicode61";

    public enum MatchInfo {
        FTS3,
        FTS4
    }

    public enum Order {
        ASC,
        DESC
    }
}
