package androidx.compose.ui.text;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f104288a = a.f104289a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f104289a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final O f104290b = new L();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final O f104291c = new M();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final O f104292d = new N();

        public static boolean c(P.j jVar, P.j jVar2) {
            return jVar.R(jVar2);
        }

        public static final boolean d(P.j jVar, P.j jVar2) {
            return jVar.R(jVar2);
        }

        public static final boolean e(P.j jVar, P.j jVar2) {
            return !jVar2.L() && jVar.f65511a >= jVar2.f65511a && jVar.f65513c <= jVar2.f65513c && jVar.f65512b >= jVar2.f65512b && jVar.f65514d <= jVar2.f65514d;
        }

        public static final boolean f(P.j jVar, P.j jVar2) {
            return jVar2.f(jVar.o());
        }

        @NotNull
        public final O g() {
            return f104290b;
        }

        @NotNull
        public final O h() {
            return f104291c;
        }

        @NotNull
        public final O i() {
            return f104292d;
        }
    }

    boolean a(@NotNull P.j jVar, @NotNull P.j jVar2);
}
