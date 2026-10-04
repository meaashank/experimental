package androidx.compose.ui.input.key;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f102101b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102102c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f102103d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f102104e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102105a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return d.f102104e;
        }

        public final int b() {
            return d.f102103d;
        }

        public final int c() {
            return d.f102102c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ d(int i10) {
        this.f102105a = i10;
    }

    public static final /* synthetic */ d d(int i10) {
        return new d(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof d) && i10 == ((d) obj).f102105a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    @NotNull
    public static String i(int i10) {
        return i10 == f102103d ? "KeyUp" : i10 == f102104e ? "KeyDown" : i10 == f102102c ? "Unknown" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f102105a, obj);
    }

    public int hashCode() {
        return this.f102105a;
    }

    public final /* synthetic */ int j() {
        return this.f102105a;
    }

    @NotNull
    public String toString() {
        return i(this.f102105a);
    }
}
