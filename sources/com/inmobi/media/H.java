package com.inmobi.media;

import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f151998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f151999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Map<String, String> f152000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f152001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f152002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f152003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private String f152004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f152005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private String f152006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private String f152007j;

    public H(@NotNull String mAdType) {
        kotlin.jvm.internal.G.p(mAdType, "mAdType");
        this.f151998a = mAdType;
        this.f151999b = Long.MIN_VALUE;
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        this.f152003f = string;
        this.f152004g = "";
        this.f152006i = "activity";
    }

    private static /* synthetic */ void b() {
    }

    private static /* synthetic */ void c() {
    }

    @NotNull
    public final H a(long j10) {
        this.f151999b = j10;
        return this;
    }

    @NotNull
    public final H d(@NotNull String m10Context) {
        kotlin.jvm.internal.G.p(m10Context, "m10Context");
        this.f152006i = m10Context;
        return this;
    }

    @NotNull
    public final H e(@Nullable String str) {
        this.f152002e = str;
        return this;
    }

    @NotNull
    public final H a(@NotNull J placement) {
        kotlin.jvm.internal.G.p(placement, "placement");
        this.f151999b = placement.g();
        this.f152006i = placement.j();
        this.f152000c = placement.f();
        this.f152004g = placement.a();
        return this;
    }

    @NotNull
    public final H b(@Nullable String str) {
        this.f152007j = str;
        return this;
    }

    @NotNull
    public final H c(@Nullable String str) {
        this.f152001d = str;
        return this;
    }

    @NotNull
    public final H a(@NotNull String adSize) {
        kotlin.jvm.internal.G.p(adSize, "adSize");
        this.f152004g = adSize;
        return this;
    }

    @NotNull
    public final H a(@Nullable Map<String, String> map) {
        this.f152000c = map;
        return this;
    }

    @NotNull
    public final H a(boolean z10) {
        this.f152005h = z10;
        return this;
    }

    @NotNull
    public final J a() throws IllegalStateException {
        String str;
        long j10 = this.f151999b;
        if (j10 != Long.MIN_VALUE) {
            Map<String, String> map = this.f152000c;
            if (map == null || (str = map.get("tp")) == null) {
                str = "";
            }
            J j11 = new J(j10, str, this.f151998a, this.f152002e, null);
            j11.f152078d = this.f152001d;
            j11.a(this.f152000c);
            j11.a(this.f152004g);
            j11.b(this.f152006i);
            j11.f152081g = this.f152003f;
            j11.f152084j = this.f152005h;
            j11.f152085k = this.f152007j;
            return j11;
        }
        throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
    }
}
