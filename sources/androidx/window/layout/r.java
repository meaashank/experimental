package androidx.window.layout;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface r extends m {

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0342a f120153b = new C0342a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dd.g
        @NotNull
        public static final a f120154c = new a("NONE");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dd.g
        @NotNull
        public static final a f120155d = new a("FULL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f120156a;

        /* JADX INFO: renamed from: androidx.window.layout.r$a$a, reason: collision with other inner class name */
        public static final class C0342a {
            public C0342a() {
            }

            public C0342a(C4969v c4969v) {
            }
        }

        public a(String str) {
            this.f120156a = str;
        }

        @NotNull
        public String toString() {
            return this.f120156a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f120157b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dd.g
        @NotNull
        public static final b f120158c = new b("VERTICAL");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dd.g
        @NotNull
        public static final b f120159d = new b("HORIZONTAL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f120160a;

        public static final class a {
            public a() {
            }

            public a(C4969v c4969v) {
            }
        }

        public b(String str) {
            this.f120160a = str;
        }

        @NotNull
        public String toString() {
            return this.f120160a;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f120161b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dd.g
        @NotNull
        public static final c f120162c = new c("FLAT");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dd.g
        @NotNull
        public static final c f120163d = new c("HALF_OPENED");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f120164a;

        public static final class a {
            public a() {
            }

            public a(C4969v c4969v) {
            }
        }

        public c(String str) {
            this.f120164a = str;
        }

        @NotNull
        public String toString() {
            return this.f120164a;
        }
    }

    @NotNull
    b a();

    boolean b();

    @NotNull
    a c();

    @NotNull
    c getState();
}
