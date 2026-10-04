package Fd;

import kotlin.jvm.internal.G;
import okhttp3.q;
import okhttp3.u;
import okio.InterfaceC5362l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f39996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC5362l f39998e;

    public h(@Nullable String str, long j10, @NotNull InterfaceC5362l source) {
        G.p(source, "source");
        this.f39996c = str;
        this.f39997d = j10;
        this.f39998e = source;
    }

    @Override // okhttp3.u
    @NotNull
    public InterfaceC5362l L0() {
        return this.f39998e;
    }

    @Override // okhttp3.u
    public long p() {
        return this.f39997d;
    }

    @Override // okhttp3.u
    @Nullable
    public q q() {
        String str = this.f39996c;
        if (str == null) {
            return null;
        }
        return q.f225814e.d(str);
    }
}
