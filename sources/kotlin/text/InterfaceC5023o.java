package kotlin.text;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.text.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC5023o {

    /* JADX INFO: renamed from: kotlin.text.o$a */
    public static final class a {
        @NotNull
        public static b a(@NotNull InterfaceC5023o interfaceC5023o) {
            return new b(interfaceC5023o);
        }
    }

    /* JADX INFO: renamed from: kotlin.text.o$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final InterfaceC5023o f218362a;

        public b(@NotNull InterfaceC5023o match) {
            kotlin.jvm.internal.G.p(match, "match");
            this.f218362a = match;
        }

        @Xc.f
        public final String a() {
            return this.f218362a.c().get(1);
        }

        @Xc.f
        public final String b() {
            return this.f218362a.c().get(10);
        }

        @Xc.f
        public final String c() {
            return this.f218362a.c().get(2);
        }

        @Xc.f
        public final String d() {
            return this.f218362a.c().get(3);
        }

        @Xc.f
        public final String e() {
            return this.f218362a.c().get(4);
        }

        @Xc.f
        public final String f() {
            return this.f218362a.c().get(5);
        }

        @Xc.f
        public final String g() {
            return this.f218362a.c().get(6);
        }

        @Xc.f
        public final String h() {
            return this.f218362a.c().get(7);
        }

        @Xc.f
        public final String i() {
            return this.f218362a.c().get(8);
        }

        @Xc.f
        public final String j() {
            return this.f218362a.c().get(9);
        }

        @NotNull
        public final InterfaceC5023o k() {
            return this.f218362a;
        }

        @NotNull
        public final List<String> l() {
            return this.f218362a.c().subList(1, this.f218362a.c().size());
        }
    }

    @NotNull
    b a();

    @NotNull
    InterfaceC5021m b();

    @NotNull
    List<String> c();

    @NotNull
    md.l d();

    @NotNull
    String getValue();

    @Nullable
    InterfaceC5023o next();
}
