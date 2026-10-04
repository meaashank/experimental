package androidx.compose.foundation.content;

import androidx.compose.animation.core.C1610t;
import androidx.compose.foundation.L;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.C2225a0;
import androidx.compose.ui.platform.Z;
import dd.h;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@L
@r(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f88938e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Z f88939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C2225a0 f88940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final b f88942d;

    @L
    @h
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0186a f88943b = new C0186a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f88944c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f88945d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f88946e = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f88947a;

        /* JADX INFO: renamed from: androidx.compose.foundation.content.f$a$a, reason: collision with other inner class name */
        public static final class C0186a {
            public C0186a() {
            }

            public final int a() {
                return a.f88946e;
            }

            public final int b() {
                return a.f88945d;
            }

            public final int c() {
                return a.f88944c;
            }

            public C0186a(C4969v c4969v) {
            }
        }

        public /* synthetic */ a(int i10) {
            this.f88947a = i10;
        }

        public static final /* synthetic */ a d(int i10) {
            return new a(i10);
        }

        public static int e(int i10) {
            return i10;
        }

        public static boolean f(int i10, Object obj) {
            return (obj instanceof a) && i10 == ((a) obj).f88947a;
        }

        public static final boolean g(int i10, int i11) {
            return i10 == i11;
        }

        public static int h(int i10) {
            return i10;
        }

        @NotNull
        public static String i(int i10) {
            return i10 == f88944c ? "Source.Keyboard" : i10 == f88945d ? "Source.DragAndDrop" : i10 == f88946e ? "Source.Clipboard" : C1610t.a("Invalid (", i10, ')');
        }

        public boolean equals(Object obj) {
            return f(this.f88947a, obj);
        }

        public int hashCode() {
            return this.f88947a;
        }

        public final /* synthetic */ int j() {
            return this.f88947a;
        }

        @NotNull
        public String toString() {
            return i(this.f88947a);
        }
    }

    public /* synthetic */ f(Z z10, C2225a0 c2225a0, int i10, b bVar, int i11, C4969v c4969v) {
        this(z10, c2225a0, i10, (i11 & 8) != 0 ? null : bVar);
    }

    @NotNull
    public final Z a() {
        return this.f88939a;
    }

    @NotNull
    public final C2225a0 b() {
        return this.f88940b;
    }

    @Nullable
    public final b c() {
        return this.f88942d;
    }

    public final int d() {
        return this.f88941c;
    }

    public /* synthetic */ f(Z z10, C2225a0 c2225a0, int i10, b bVar, C4969v c4969v) {
        this(z10, c2225a0, i10, bVar);
    }

    public f(Z z10, C2225a0 c2225a0, int i10, b bVar) {
        this.f88939a = z10;
        this.f88940b = c2225a0;
        this.f88941c = i10;
        this.f88942d = bVar;
    }
}
