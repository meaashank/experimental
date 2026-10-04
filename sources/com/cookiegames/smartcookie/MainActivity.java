package com.cookiegames.smartcookie;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.webkit.CookieManager;
import androidx.compose.runtime.internal.r;
import com.cookiegames.smartcookie.IncognitoActivity;
import com.cookiegames.smartcookie.browser.activity.BrowserActivity;
import com.cookiegames.smartcookie.p;
import ed.InterfaceC4376a;
import hc.AbstractC4521a;
import kotlin.L0;
import kotlin.jvm.internal.G;
import nc.InterfaceC5265a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
public final class MainActivity extends BrowserActivity {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f140691v0 = 8;

    public static final L0 d4(MainActivity mainActivity) {
        mainActivity.m3();
        mainActivity.moveTaskToBack(true);
        mainActivity.finishAndRemoveTask();
        return L0.f217464a;
    }

    public static final void e4(MainActivity mainActivity) {
        CookieManager.getInstance().setAcceptCookie(mainActivity.U0().q());
    }

    @Override // com.cookiegames.smartcookie.browser.activity.BrowserActivity, S3.b
    public void B0(@Nullable String str, @NotNull String url) {
        G.p(url, "url");
        Q1(str, url);
    }

    @Override // com.cookiegames.smartcookie.browser.activity.BrowserActivity
    @NotNull
    public AbstractC4521a Z3() {
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: com.cookiegames.smartcookie.o
            @Override // nc.InterfaceC5265a
            public final void run() {
                MainActivity.e4(this.f141371a);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // com.cookiegames.smartcookie.browser.activity.BrowserActivity
    public boolean b3() {
        return false;
    }

    @Override // com.cookiegames.smartcookie.browser.activity.BrowserActivity, androidx.appcompat.app.ActivityC1486c, androidx.core.app.ActivityC2390m, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        G.p(event, "event");
        if (event.getAction() != 0 || !event.isCtrlPressed() || event.getKeyCode() != 44 || !event.isShiftPressed()) {
            return super.dispatchKeyEvent(event);
        }
        startActivity(IncognitoActivity.a.b(IncognitoActivity.f140689v0, this, null, 2, null));
        overridePendingTransition(p.a.f141403c0, p.a.f141380I);
        return true;
    }

    @Override // com.cookiegames.smartcookie.browser.activity.BrowserActivity, com.cookiegames.smartcookie.browser.f
    public void j() {
        Y1(new InterfaceC4376a() { // from class: com.cookiegames.smartcookie.n
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return MainActivity.d4(this.f141370a);
            }
        });
    }

    @Override // com.cookiegames.smartcookie.browser.activity.BrowserActivity, com.cookiegames.smartcookie.browser.activity.F, android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        G.p(menu, "menu");
        return false;
    }

    @Override // androidx.activity.k, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        G.p(intent, "intent");
        if (G.g(intent.getAction(), BrowserActivity.f140779r0)) {
            l3();
            throw null;
        }
        J2(intent);
        super.onNewIntent(intent);
    }

    @Override // com.cookiegames.smartcookie.browser.activity.BrowserActivity, androidx.fragment.app.r, android.app.Activity
    public void onPause() {
        super.onPause();
        p3();
    }

    @Override // com.cookiegames.smartcookie.browser.activity.BrowserActivity, com.cookiegames.smartcookie.browser.activity.F, androidx.fragment.app.r, android.app.Activity
    public void onResume() {
        super.onResume();
        invalidateOptionsMenu();
    }
}
