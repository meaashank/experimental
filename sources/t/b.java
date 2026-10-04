package T;

import dd.h;
import java.util.List;
import kotlin.collections.I;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@h
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f68172b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68173a;

    public static final class a {
        public a() {
        }

        public final int a() {
            d.f68176a.getClass();
            return d.f68177b;
        }

        public final int b() {
            d.f68176a.getClass();
            return d.f68178c;
        }

        @NotNull
        public final List<b> c() {
            return I.Q(new b(a()), new b(b()));
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ b(int i10) {
        this.f68173a = i10;
    }

    public static final /* synthetic */ b a(int i10) {
        return new b(i10);
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof b) && i10 == ((b) obj).f68173a;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    public static String f(int i10) {
        a aVar = f68172b;
        return i10 == aVar.a() ? "LongPress" : i10 == aVar.b() ? "TextHandleMove" : "Invalid";
    }

    public boolean equals(Object obj) {
        return c(this.f68173a, obj);
    }

    public final /* synthetic */ int g() {
        return this.f68173a;
    }

    public int hashCode() {
        return this.f68173a;
    }

    @NotNull
    public String toString() {
        return f(this.f68173a);
    }

    public static int b(int i10) {
        return i10;
    }

    public static int e(int i10) {
        return i10;
    }
}
