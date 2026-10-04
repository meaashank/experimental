package com.cookiegames.smartcookie.settings.activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActivityC1486c;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.r;
import androidx.fragment.app.U;
import com.cookiegames.smartcookie.AppTheme;
import com.cookiegames.smartcookie.di.K;
import com.cookiegames.smartcookie.p;
import com.cookiegames.smartcookie.settings.fragment.B2;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u4.e;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
public final class SettingsActivity extends ActivityC1486c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f147784b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Inject
    public e f147785a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f147786a;

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
            f147786a = iArr;
        }
    }

    @NotNull
    public final e U0() {
        e eVar = this.f147785a;
        if (eVar != null) {
            return eVar;
        }
        G.S("userPreferences");
        throw null;
    }

    public final void V0(@NotNull e eVar) {
        G.p(eVar, "<set-?>");
        this.f147785a = eVar;
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        K.b(this).q(this);
        int i10 = a.f147786a[U0().b1().ordinal()];
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
        setContentView(p.m.f145122I);
        View viewFindViewById = findViewById(p.j.f144805mc);
        G.o(viewFindViewById, "findViewById(...)");
        Toolbar toolbar = (Toolbar) viewFindViewById;
        try {
            setSupportActionBar(toolbar);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.c0(false);
                supportActionBar.X(true);
                supportActionBar.b0(true);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        toolbar.setTitle(getString(p.s.Cf));
        U u10 = getSupportFragmentManager().u();
        u10.z(p.j.f144825o2, new B2(), null);
        u10.m();
        overridePendingTransition(p.a.f141399a0, p.a.f141380I);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        G.p(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }
}
