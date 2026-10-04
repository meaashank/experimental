package androidx.compose.ui.layout;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.layout.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2169h {

    /* JADX INFO: renamed from: androidx.compose.ui.layout.h$a */
    public interface a {
        boolean a();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.h$b */
    @dd.h
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f102564b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f102565c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f102566d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f102567e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f102568f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f102569g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f102570h = 6;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f102571a;

        /* JADX INFO: renamed from: androidx.compose.ui.layout.h$b$a */
        public static final class a {
            public a() {
            }

            public final int a() {
                return b.f102569g;
            }

            public final int b() {
                return b.f102566d;
            }

            public final int c() {
                return b.f102565c;
            }

            public final int d() {
                return b.f102570h;
            }

            public final int e() {
                return b.f102567e;
            }

            public final int f() {
                return b.f102568f;
            }

            public a(C4969v c4969v) {
            }
        }

        public /* synthetic */ b(int i10) {
            this.f102571a = i10;
        }

        public static final /* synthetic */ b g(int i10) {
            return new b(i10);
        }

        public static int h(int i10) {
            return i10;
        }

        public static boolean i(int i10, Object obj) {
            return (obj instanceof b) && i10 == ((b) obj).f102571a;
        }

        public static final boolean j(int i10, int i11) {
            return i10 == i11;
        }

        public static int k(int i10) {
            return i10;
        }

        @NotNull
        public static String l(int i10) {
            return i10 == f102565c ? "Before" : i10 == f102566d ? "After" : i10 == f102567e ? "Left" : i10 == f102568f ? "Right" : i10 == f102569g ? "Above" : i10 == f102570h ? "Below" : "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return i(this.f102571a, obj);
        }

        public int hashCode() {
            return this.f102571a;
        }

        public final /* synthetic */ int m() {
            return this.f102571a;
        }

        @NotNull
        public String toString() {
            return l(this.f102571a);
        }
    }

    @Nullable
    <T> T a(int i10, @NotNull ed.l<? super a, ? extends T> lVar);
}
