package w;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import e.InterfaceC4337k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w.u;
import x.C5775a;
import x.C5776b;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f240003i = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f240004j = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f240005k = "androidx.browser.trusted.extra.SHARE_TARGET";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f240006l = "androidx.browser.trusted.extra.SHARE_DATA";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f240007m = "androidx.browser.trusted.extra.DISPLAY_MODE";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f240008n = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Uri f240009a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<String> f240011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Bundle f240012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public C5775a f240013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public C5776b f240014f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CustomTabsIntent.Builder f240010b = new CustomTabsIntent.Builder();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public u f240015g = new u.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f240016h = 0;

    public w(@NonNull Uri uri) {
        this.f240009a = uri;
    }

    @NonNull
    public v a(@NonNull androidx.browser.customtabs.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        this.f240010b.setSession(bVar);
        Intent intent = this.f240010b.build().f86571a;
        intent.setData(this.f240009a);
        intent.putExtra(v.t.f239755a, true);
        if (this.f240011c != null) {
            intent.putExtra(f240004j, new ArrayList(this.f240011c));
        }
        Bundle bundle = this.f240012d;
        if (bundle != null) {
            intent.putExtra(f240003i, bundle);
        }
        List<Uri> list = Collections.EMPTY_LIST;
        C5776b c5776b = this.f240014f;
        if (c5776b != null && this.f240013e != null) {
            intent.putExtra(f240005k, c5776b.b());
            intent.putExtra(f240006l, this.f240013e.b());
            List<Uri> list2 = this.f240013e.f240246c;
            if (list2 != null) {
                list = list2;
            }
        }
        intent.putExtra(f240007m, this.f240015g.toBundle());
        intent.putExtra(f240008n, this.f240016h);
        return new v(intent, list);
    }

    @NonNull
    public CustomTabsIntent b() {
        return this.f240010b.build();
    }

    @NonNull
    public u c() {
        return this.f240015g;
    }

    @NonNull
    public Uri d() {
        return this.f240009a;
    }

    @NonNull
    public w e(@NonNull List<String> list) {
        this.f240011c = list;
        return this;
    }

    @NonNull
    public w f(int i10) {
        this.f240010b.setColorScheme(i10);
        return this;
    }

    @NonNull
    public w g(int i10, @NonNull CustomTabColorSchemeParams customTabColorSchemeParams) {
        this.f240010b.setColorSchemeParams(i10, customTabColorSchemeParams);
        return this;
    }

    @NonNull
    public w h(@NonNull CustomTabColorSchemeParams customTabColorSchemeParams) {
        this.f240010b.setDefaultColorSchemeParams(customTabColorSchemeParams);
        return this;
    }

    @NonNull
    public w i(@NonNull u uVar) {
        this.f240015g = uVar;
        return this;
    }

    @NonNull
    @Deprecated
    public w j(@InterfaceC4337k int i10) {
        this.f240010b.setNavigationBarColor(i10);
        return this;
    }

    @NonNull
    @Deprecated
    public w k(@InterfaceC4337k int i10) {
        this.f240010b.setNavigationBarDividerColor(i10);
        return this;
    }

    @NonNull
    public w l(int i10) {
        this.f240016h = i10;
        return this;
    }

    @NonNull
    public w m(@NonNull C5776b c5776b, @NonNull C5775a c5775a) {
        this.f240014f = c5776b;
        this.f240013e = c5775a;
        return this;
    }

    @NonNull
    public w n(@NonNull Bundle bundle) {
        this.f240012d = bundle;
        return this;
    }

    @NonNull
    @Deprecated
    public w o(@InterfaceC4337k int i10) {
        this.f240010b.setToolbarColor(i10);
        return this;
    }
}
