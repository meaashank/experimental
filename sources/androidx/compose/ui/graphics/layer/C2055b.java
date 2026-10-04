package androidx.compose.ui.graphics.layer;

import androidx.compose.animation.core.C1610t;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class C2055b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f101303b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f101304c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f101305d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f101306e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101307a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.b$a */
    public static final class a {
        public a() {
        }

        public final int a() {
            return C2055b.f101304c;
        }

        public final int b() {
            return C2055b.f101306e;
        }

        public final int c() {
            return C2055b.f101305d;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C2055b(int i10) {
        this.f101307a = i10;
    }

    public static final /* synthetic */ C2055b d(int i10) {
        return new C2055b(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof C2055b) && i10 == ((C2055b) obj).f101307a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    public static String i(int i10) {
        return C1610t.a("CompositingStrategy(value=", i10, ')');
    }

    public boolean equals(Object obj) {
        return f(this.f101307a, obj);
    }

    public int hashCode() {
        return this.f101307a;
    }

    public final /* synthetic */ int j() {
        return this.f101307a;
    }

    public String toString() {
        return i(this.f101307a);
    }
}
