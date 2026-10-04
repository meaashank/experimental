package i0;

import dd.h;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: i0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@h
public final class C4542a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0747a f202768b = new C0747a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f202769c = "Enter";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f202770d = "Exit";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f202771a;

    /* JADX INFO: renamed from: i0.a$a, reason: collision with other inner class name */
    public static final class C0747a {
        public C0747a() {
        }

        @NotNull
        public final String a() {
            return C4542a.f202769c;
        }

        @NotNull
        public final String b() {
            return C4542a.f202770d;
        }

        public C0747a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C4542a(String str) {
        this.f202771a = str;
    }

    public static final /* synthetic */ C4542a c(String str) {
        return new C4542a(str);
    }

    public static boolean e(String str, Object obj) {
        return (obj instanceof C4542a) && G.g(str, ((C4542a) obj).f202771a);
    }

    public static final boolean f(String str, String str2) {
        return G.g(str, str2);
    }

    public static int h(String str) {
        return str.hashCode();
    }

    public boolean equals(Object obj) {
        return e(this.f202771a, obj);
    }

    @NotNull
    public final String g() {
        return this.f202771a;
    }

    public int hashCode() {
        return this.f202771a.hashCode();
    }

    public final /* synthetic */ String j() {
        return this.f202771a;
    }

    @NotNull
    public String toString() {
        return this.f202771a;
    }

    public static String d(String str) {
        return str;
    }

    @NotNull
    public static String i(String str) {
        return str;
    }
}
