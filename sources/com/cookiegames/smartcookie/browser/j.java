package com.cookiegames.smartcookie.browser;

import android.app.Application;
import bc.InterfaceC2859i;
import com.cookiegames.smartcookie.p;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
@InterfaceC2859i
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f141027c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final u4.e f141028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f141029b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141030a;

        static {
            int[] iArr = new int[SearchBoxDisplayChoice.values().length];
            try {
                iArr[SearchBoxDisplayChoice.URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchBoxDisplayChoice.DOMAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchBoxDisplayChoice.TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f141030a = iArr;
        }
    }

    @Inject
    public j(@NotNull u4.e userPreferences, @NotNull Application application) {
        G.p(userPreferences, "userPreferences");
        G.p(application, "application");
        this.f141028a = userPreferences;
        String string = application.getString(p.s.fi);
        G.o(string, "getString(...)");
        this.f141029b = string;
    }

    @NotNull
    public final String a(@NotNull String url, @Nullable String str, boolean z10) {
        G.p(url, "url");
        if (C4.s.d(url)) {
            return "";
        }
        if (z10) {
            return url;
        }
        int i10 = a.f141030a[this.f141028a.Z0().ordinal()];
        if (i10 == 1) {
            return url;
        }
        if (i10 == 2) {
            return C4.u.f17587a.m(url);
        }
        if (i10 == 3) {
            return (str == null || str.length() == 0) ? this.f141029b : str;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String b(String str) {
        return C4.u.f17587a.m(str);
    }
}
