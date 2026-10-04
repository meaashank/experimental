package androidx.activity;

import android.content.res.Resources;
import e.InterfaceC4337k;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class SystemBarStyle {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Companion f84902e = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ed.l<Resources, Boolean> f84906d;

    public static final class Companion {
        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SystemBarStyle c(Companion companion, int i10, int i11, ed.l lVar, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                lVar = new ed.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$auto$1
                    @Override // ed.l
                    @NotNull
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(@NotNull Resources resources) {
                        kotlin.jvm.internal.G.p(resources, "resources");
                        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
                    }
                };
            }
            return companion.b(i10, i11, lVar);
        }

        @dd.k
        @dd.o
        @NotNull
        public final SystemBarStyle a(@InterfaceC4337k int i10, @InterfaceC4337k int i11) {
            return c(this, i10, i11, null, 4, null);
        }

        @dd.k
        @dd.o
        @NotNull
        public final SystemBarStyle b(@InterfaceC4337k int i10, @InterfaceC4337k int i11, @NotNull ed.l<? super Resources, Boolean> detectDarkMode) {
            kotlin.jvm.internal.G.p(detectDarkMode, "detectDarkMode");
            return new SystemBarStyle(i10, i11, 0, detectDarkMode);
        }

        @dd.o
        @NotNull
        public final SystemBarStyle d(@InterfaceC4337k int i10) {
            return new SystemBarStyle(i10, i10, 2, new ed.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$dark$1
                @NotNull
                public final Boolean e(@NotNull Resources resources) {
                    kotlin.jvm.internal.G.p(resources, "<anonymous parameter 0>");
                    return Boolean.TRUE;
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ Boolean invoke(Resources resources) {
                    e(resources);
                    return Boolean.TRUE;
                }
            });
        }

        @dd.o
        @NotNull
        public final SystemBarStyle e(@InterfaceC4337k int i10, @InterfaceC4337k int i11) {
            return new SystemBarStyle(i10, i11, 1, new ed.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$light$1
                @NotNull
                public final Boolean e(@NotNull Resources resources) {
                    kotlin.jvm.internal.G.p(resources, "<anonymous parameter 0>");
                    return Boolean.FALSE;
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ Boolean invoke(Resources resources) {
                    e(resources);
                    return Boolean.FALSE;
                }
            });
        }

        public Companion(C4969v c4969v) {
        }
    }

    public /* synthetic */ SystemBarStyle(int i10, int i11, int i12, ed.l lVar, C4969v c4969v) {
        this(i10, i11, i12, lVar);
    }

    @dd.k
    @dd.o
    @NotNull
    public static final SystemBarStyle a(@InterfaceC4337k int i10, @InterfaceC4337k int i11) {
        return f84902e.a(i10, i11);
    }

    @dd.k
    @dd.o
    @NotNull
    public static final SystemBarStyle b(@InterfaceC4337k int i10, @InterfaceC4337k int i11, @NotNull ed.l<? super Resources, Boolean> lVar) {
        return f84902e.b(i10, i11, lVar);
    }

    @dd.o
    @NotNull
    public static final SystemBarStyle c(@InterfaceC4337k int i10) {
        return f84902e.d(i10);
    }

    @dd.o
    @NotNull
    public static final SystemBarStyle i(@InterfaceC4337k int i10, @InterfaceC4337k int i11) {
        return f84902e.e(i10, i11);
    }

    public final int d() {
        return this.f84904b;
    }

    @NotNull
    public final ed.l<Resources, Boolean> e() {
        return this.f84906d;
    }

    public final int f() {
        return this.f84905c;
    }

    public final int g(boolean z10) {
        return z10 ? this.f84904b : this.f84903a;
    }

    public final int h(boolean z10) {
        if (this.f84905c == 0) {
            return 0;
        }
        return z10 ? this.f84904b : this.f84903a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SystemBarStyle(int i10, int i11, int i12, ed.l<? super Resources, Boolean> lVar) {
        this.f84903a = i10;
        this.f84904b = i11;
        this.f84905c = i12;
        this.f84906d = lVar;
    }
}
