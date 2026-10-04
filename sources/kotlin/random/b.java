package kotlin.random;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends kotlin.random.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f218017c = new a();

    public static final class a extends ThreadLocal<java.util.Random> {
        public java.util.Random a() {
            return new java.util.Random();
        }

        @Override // java.lang.ThreadLocal
        public java.util.Random initialValue() {
            return new java.util.Random();
        }
    }

    @Override // kotlin.random.a
    @NotNull
    public java.util.Random v() {
        java.util.Random random = this.f218017c.get();
        G.o(random, "get(...)");
        return random;
    }
}
