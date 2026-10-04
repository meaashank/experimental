package U3;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@dd.h
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f68500a;

    public /* synthetic */ a(String str) {
        this.f68500a = str;
    }

    public static final /* synthetic */ a a(String str) {
        return new a(str);
    }

    @NotNull
    public static String b(@NotNull String name) {
        G.p(name, "name");
        return name;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof a) && G.g(str, ((a) obj).f68500a);
    }

    public static final boolean d(String str, String str2) {
        return G.g(str, str2);
    }

    public static int f(String str) {
        return str.hashCode();
    }

    public static String g(String str) {
        return android.support.v4.media.i.a("Host(name=", str, ")");
    }

    @NotNull
    public final String e() {
        return this.f68500a;
    }

    public boolean equals(Object obj) {
        return c(this.f68500a, obj);
    }

    public final /* synthetic */ String h() {
        return this.f68500a;
    }

    public int hashCode() {
        return this.f68500a.hashCode();
    }

    public String toString() {
        return g(this.f68500a);
    }
}
