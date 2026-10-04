package androidx.compose.ui.text;

import androidx.compose.animation.core.C1610t;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class C2330h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104672b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104673c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104674d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104675e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104676a;

    /* JADX INFO: renamed from: androidx.compose.ui.text.h$a */
    public static final class a {
        public a() {
        }

        public final int a() {
            return C2330h.f104675e;
        }

        public final int b() {
            return C2330h.f104673c;
        }

        public final int c() {
            return C2330h.f104674d;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C2330h(int i10) {
        this.f104676a = i10;
    }

    public static final /* synthetic */ C2330h d(int i10) {
        return new C2330h(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof C2330h) && i10 == ((C2330h) obj).f104676a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    @NotNull
    public static String i(int i10) {
        return i10 == f104673c ? "EmojiSupportMatch.Default" : i10 == f104674d ? "EmojiSupportMatch.None" : i10 == f104675e ? "EmojiSupportMatch.All" : C1610t.a("Invalid(value=", i10, ')');
    }

    public boolean equals(Object obj) {
        return f(this.f104676a, obj);
    }

    public int hashCode() {
        return this.f104676a;
    }

    public final /* synthetic */ int j() {
        return this.f104676a;
    }

    @NotNull
    public String toString() {
        return i(this.f104676a);
    }
}
