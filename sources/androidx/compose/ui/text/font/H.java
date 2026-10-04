package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104527b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104528c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104529d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104530a;

    public static final class a {
        public a() {
        }

        public static /* synthetic */ void b() {
        }

        public static /* synthetic */ void d() {
        }

        public final int a() {
            return H.f104529d;
        }

        public final int c() {
            return H.f104528c;
        }

        @NotNull
        public final List<H> e() {
            return kotlin.collections.I.Q(new H(H.f104528c), new H(H.f104529d));
        }

        public a(C4969v c4969v) {
        }
    }

    @InterfaceC4982o(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @InterfaceC4852c0(expression = "FontStyle.", imports = {}))
    public /* synthetic */ H(int i10) {
        this.f104530a = i10;
    }

    public static final /* synthetic */ H c(int i10) {
        return new H(i10);
    }

    @InterfaceC4982o(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @InterfaceC4852c0(expression = "FontStyle.", imports = {}))
    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof H) && i10 == ((H) obj).f104530a;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    @NotNull
    public static String i(int i10) {
        return i10 == f104528c ? "Normal" : i10 == f104529d ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f104530a, obj);
    }

    public final int g() {
        return this.f104530a;
    }

    public int hashCode() {
        return this.f104530a;
    }

    public final /* synthetic */ int j() {
        return this.f104530a;
    }

    @NotNull
    public String toString() {
        return i(this.f104530a);
    }
}
