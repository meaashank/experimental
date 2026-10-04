package Jb;

import android.util.Log;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f58204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f58205b;

    public f(boolean z10, @NotNull String loggingTag) {
        G.p(loggingTag, "loggingTag");
        this.f58204a = z10;
        this.f58205b = loggingTag;
    }

    @Override // Jb.q
    public void a(@NotNull String message, @NotNull Throwable throwable) {
        G.p(message, "message");
        G.p(throwable, "throwable");
        if (e()) {
            Log.d(f(), message, throwable);
        }
    }

    @Override // Jb.q
    public void b(@NotNull String message, @NotNull Throwable throwable) {
        G.p(message, "message");
        G.p(throwable, "throwable");
        if (e()) {
            Log.e(f(), message, throwable);
        }
    }

    @Override // Jb.q
    public void c(@NotNull String message) {
        G.p(message, "message");
        if (e()) {
            Log.e(f(), message);
        }
    }

    @Override // Jb.q
    public void d(@NotNull String message) {
        G.p(message, "message");
        if (e()) {
            Log.d(f(), message);
        }
    }

    @Override // Jb.q
    public boolean e() {
        return this.f58204a;
    }

    public final String f() {
        return this.f58205b.length() > 23 ? c.f58154a : this.f58205b;
    }

    @NotNull
    public final String g() {
        return this.f58205b;
    }

    public final void h(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f58205b = str;
    }

    @Override // Jb.q
    public void setEnabled(boolean z10) {
        this.f58204a = z10;
    }

    public f() {
        this(false, c.f58154a);
    }
}
