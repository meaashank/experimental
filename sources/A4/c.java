package A4;

import android.os.Bundle;
import androidx.compose.runtime.internal.r;
import com.cookiegames.smartcookie.AppTheme;
import com.cookiegames.smartcookie.di.K;
import com.cookiegames.smartcookie.p;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u4.e;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
public abstract class c extends A4.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f2344e = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public AppTheme f2345c = AppTheme.LIGHT;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Inject
    public e f2346d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2347a;

        static {
            int[] iArr = new int[AppTheme.values().length];
            try {
                iArr[AppTheme.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppTheme.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppTheme.BLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2347a = iArr;
        }
    }

    @NotNull
    public final e c() {
        e eVar = this.f2346d;
        if (eVar != null) {
            return eVar;
        }
        G.S("userPreferences");
        throw null;
    }

    public final void d() {
        if (c().a1()) {
            getWindow().setStatusBarColor(-16777216);
        } else {
            getWindow().setStatusBarColor(C4.r.j(this));
        }
    }

    public final void e(@NotNull e eVar) {
        G.p(eVar, "<set-?>");
        this.f2346d = eVar;
    }

    @Override // A4.a, android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        K.b(this).n(this);
        AppTheme appThemeB1 = c().b1();
        this.f2345c = appThemeB1;
        int i10 = a.f2347a[appThemeB1.ordinal()];
        if (i10 == 1) {
            setTheme(p.t.Ae);
        } else if (i10 == 2) {
            setTheme(p.t.Ce);
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            setTheme(p.t.Be);
        }
        super.onCreate(bundle);
        d();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        d();
        if (c().b1() != this.f2345c) {
            recreate();
        }
    }
}
