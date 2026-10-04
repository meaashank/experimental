package com.cookiegames.smartcookie.browser.activity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import androidx.appcompat.app.ActivityC1486c;
import androidx.core.view.S;
import com.cookiegames.smartcookie.AppTheme;
import com.cookiegames.smartcookie.di.K;
import com.cookiegames.smartcookie.p;
import e.a0;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nThemableBrowserActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemableBrowserActivity.kt\ncom/cookiegames/smartcookie/browser/activity/ThemableBrowserActivity\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n52#2,8:102\n60#2:113\n32#3:110\n33#3:112\n1#4:111\n*S KotlinDebug\n*F\n+ 1 ThemableBrowserActivity.kt\ncom/cookiegames/smartcookie/browser/activity/ThemableBrowserActivity\n*L\n52#1:102,8\n52#1:113\n54#1:110\n54#1:112\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class F extends ActivityC1486c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f140896e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Inject
    public u4.e f140897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public AppTheme f140898b = AppTheme.LIGHT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f140899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f140900d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f140901a;

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
            f140901a = iArr;
        }
    }

    @NotNull
    public final u4.e U0() {
        u4.e eVar = this.f140897a;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.G.S("userPreferences");
        throw null;
    }

    public void V0() {
    }

    @a0
    @Nullable
    public Integer W0() {
        return null;
    }

    public final void X0() {
        if (U0().a1() || !U0().M0()) {
            getWindow().setStatusBarColor(-16777216);
        }
    }

    public final void Y0() {
        finish();
        startActivity(new Intent(this, getClass()));
    }

    public final void Z0(@NotNull u4.e eVar) {
        kotlin.jvm.internal.G.p(eVar, "<set-?>");
        this.f140897a = eVar;
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        int iIntValue;
        K.b(this).u(this);
        this.f140898b = U0().b1();
        this.f140899c = U0().M0();
        Integer numW0 = W0();
        if (numW0 != null) {
            iIntValue = numW0.intValue();
        } else {
            int i10 = a.f140901a[U0().b1().ordinal()];
            if (i10 == 1) {
                iIntValue = p.t.f146555dd;
            } else if (i10 == 2) {
                iIntValue = p.t.f146411Tc;
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iIntValue = p.t.f146381Rc;
            }
        }
        setTheme(iIntValue);
        super.onCreate(bundle);
        X0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        kotlin.jvm.internal.G.p(menu, "menu");
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(null, new int[]{p.d.f141682Ma}, 0, 0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        S.b bVar = new S.b(menu);
        while (bVar.hasNext()) {
            Drawable icon = bVar.next().getIcon();
            if (icon != null) {
                icon.setTintList(colorStateList);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return super.onCreateOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onResume() {
        super.onResume();
        X0();
        this.f140900d = true;
        boolean zM0 = U0().M0();
        if (this.f140898b == U0().b1() && this.f140899c == zM0) {
            return;
        }
        Y0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10 && this.f140900d) {
            this.f140900d = false;
            V0();
        }
    }
}
