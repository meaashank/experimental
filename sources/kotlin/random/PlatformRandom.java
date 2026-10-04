package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
final class PlatformRandom extends kotlin.random.a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f218005d = new a();
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final java.util.Random f218006c;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public PlatformRandom(@NotNull java.util.Random impl) {
        G.p(impl, "impl");
        this.f218006c = impl;
    }

    @Override // kotlin.random.a
    @NotNull
    public java.util.Random v() {
        return this.f218006c;
    }
}
