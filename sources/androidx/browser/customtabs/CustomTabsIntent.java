package androidx.browser.customtabs;

import B0.C0920d;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.b;
import androidx.core.app.C2382e;
import e.InterfaceC4327a;
import e.InterfaceC4337k;
import e.InterfaceC4343q;
import e.InterfaceC4345t;
import e.T;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabsIntent {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f86491A = "android.support.customtabs.customaction.DESCRIPTION";

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final int f86492A0 = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f86493B = "android.support.customtabs.customaction.PENDING_INTENT";

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final int f86494B0 = 5;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f86495C = "android.support.customtabs.extra.TINT_ACTION_BUTTON";

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final int f86496C0 = 16;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f86497D = "android.support.customtabs.extra.MENU_ITEMS";

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static final String f86498D0 = "Accept-Language";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f86499E = "android.support.customtabs.customaction.MENU_ITEM_TITLE";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f86500F = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f86501G = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f86502H = 1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f86503I = 2;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f86504J = 2;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f86505K = "androidx.browser.customtabs.extra.SHARE_STATE";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Deprecated
    public static final String f86506L = "android.support.customtabs.extra.SHARE_MENU_ITEM";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final String f86507M = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f86508N = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f86509O = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f86510P = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f86511Q = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f86512R = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f86513S = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final String f86514T = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f86515U = 0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int f86516V = 1;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int f86517W = 2;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f86518X = 2;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f86519Y = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f86520Z = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f86521a0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f86522b0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f86523c = "android.support.customtabs.extra.user_opt_out";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f86524c0 = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f86525d = "android.support.customtabs.extra.SESSION";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f86526d0 = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f86527e = "android.support.customtabs.extra.SESSION_ID";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f86528e0 = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f86529f = 0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f86530f0 = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f86531g = 1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f86532g0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86533h = 2;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f86534h0 = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f86535i = 2;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f86536i0 = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f86537j = "androidx.browser.customtabs.extra.COLOR_SCHEME";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f86538j0 = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f86539k = "android.support.customtabs.extra.TOOLBAR_COLOR";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f86540k0 = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f86541l = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f86542l0 = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f86543m = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f86544m0 = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f86545n = "android.support.customtabs.extra.TITLE_VISIBILITY";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f86546n0 = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f86547o = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f86548o0 = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f86549p = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f86550p0 = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f86551q = "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f86552q0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f86553r = "androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f86554r0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f86555s = "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f86556s0 = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f86557t = "androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f86558t0 = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f86559u = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f86560u0 = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f86561v = 1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f86562v0 = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f86563w = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f86564w0 = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f86565x = "android.support.customtabs.extra.TOOLBAR_ITEMS";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f86566x0 = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f86567y = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f86568y0 = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f86569z = "android.support.customtabs.customaction.ICON";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f86570z0 = "android.support.customtabs.customaction.ID";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Intent f86571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Bundle f86572b;

    public static final class Builder {

        @Nullable
        private ArrayList<Bundle> mActionButtons;

        @Nullable
        private ActivityOptions mActivityOptions;

        @Nullable
        private SparseArray<Bundle> mColorSchemeParamBundles;

        @Nullable
        private Bundle mDefaultColorSchemeBundle;

        @Nullable
        private ArrayList<Bundle> mMenuItems;
        private boolean mShareIdentity;
        private final Intent mIntent = new Intent("android.intent.action.VIEW");
        private final CustomTabColorSchemeParams.Builder mDefaultColorSchemeBuilder = new CustomTabColorSchemeParams.Builder();
        private int mShareState = 0;
        private boolean mInstantAppsEnabled = true;

        public Builder() {
        }

        @T(api = 24)
        private void setCurrentLocaleAsDefaultAcceptLanguage() {
            String strA = g.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.mIntent.hasExtra("com.android.browser.headers") ? this.mIntent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.mIntent.putExtra("com.android.browser.headers", bundleExtra);
        }

        @T(api = 24)
        private void setLanguageTag(@NonNull Locale locale) {
            e.b(this.mIntent, locale);
        }

        private void setSessionParameters(@Nullable IBinder iBinder, @Nullable PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder(CustomTabsIntent.f86525d, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(CustomTabsIntent.f86527e, pendingIntent);
            }
            this.mIntent.putExtras(bundle);
        }

        @NonNull
        @Deprecated
        public Builder addDefaultShareMenuItem() {
            setShareState(1);
            return this;
        }

        @NonNull
        public Builder addMenuItem(@NonNull String str, @NonNull PendingIntent pendingIntent) {
            if (this.mMenuItems == null) {
                this.mMenuItems = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString(CustomTabsIntent.f86499E, str);
            bundle.putParcelable(CustomTabsIntent.f86493B, pendingIntent);
            this.mMenuItems.add(bundle);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder addToolbarItem(int i10, @NonNull Bitmap bitmap, @NonNull String str, @NonNull PendingIntent pendingIntent) throws IllegalStateException {
            if (this.mActionButtons == null) {
                this.mActionButtons = new ArrayList<>();
            }
            if (this.mActionButtons.size() >= 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            Bundle bundle = new Bundle();
            bundle.putInt(CustomTabsIntent.f86570z0, i10);
            bundle.putParcelable(CustomTabsIntent.f86569z, bitmap);
            bundle.putString(CustomTabsIntent.f86491A, str);
            bundle.putParcelable(CustomTabsIntent.f86493B, pendingIntent);
            this.mActionButtons.add(bundle);
            return this;
        }

        @NonNull
        public CustomTabsIntent build() {
            if (!this.mIntent.hasExtra(CustomTabsIntent.f86525d)) {
                setSessionParameters(null, null);
            }
            ArrayList<Bundle> arrayList = this.mMenuItems;
            if (arrayList != null) {
                this.mIntent.putParcelableArrayListExtra(CustomTabsIntent.f86497D, arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.mActionButtons;
            if (arrayList2 != null) {
                this.mIntent.putParcelableArrayListExtra(CustomTabsIntent.f86565x, arrayList2);
            }
            this.mIntent.putExtra(CustomTabsIntent.f86511Q, this.mInstantAppsEnabled);
            this.mIntent.putExtras(this.mDefaultColorSchemeBuilder.build().b());
            Bundle bundle = this.mDefaultColorSchemeBundle;
            if (bundle != null) {
                this.mIntent.putExtras(bundle);
            }
            if (this.mColorSchemeParamBundles != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray(CustomTabsIntent.f86512R, this.mColorSchemeParamBundles);
                this.mIntent.putExtras(bundle2);
            }
            this.mIntent.putExtra(CustomTabsIntent.f86505K, this.mShareState);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                setCurrentLocaleAsDefaultAcceptLanguage();
            }
            if (i10 >= 34) {
                setShareIdentityEnabled();
            }
            ActivityOptions activityOptions = this.mActivityOptions;
            return new CustomTabsIntent(this.mIntent, activityOptions != null ? activityOptions.toBundle() : null);
        }

        @NonNull
        @Deprecated
        public Builder enableUrlBarHiding() {
            this.mIntent.putExtra(CustomTabsIntent.f86541l, true);
            return this;
        }

        @NonNull
        public Builder setActionButton(@NonNull Bitmap bitmap, @NonNull String str, @NonNull PendingIntent pendingIntent, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putInt(CustomTabsIntent.f86570z0, 0);
            bundle.putParcelable(CustomTabsIntent.f86569z, bitmap);
            bundle.putString(CustomTabsIntent.f86491A, str);
            bundle.putParcelable(CustomTabsIntent.f86493B, pendingIntent);
            this.mIntent.putExtra(CustomTabsIntent.f86563w, bundle);
            this.mIntent.putExtra(CustomTabsIntent.f86495C, z10);
            return this;
        }

        @NonNull
        public Builder setActivitySideSheetBreakpointDp(@InterfaceC4343q(unit = 0) int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.mIntent.putExtra(CustomTabsIntent.f86522b0, i10);
            return this;
        }

        @NonNull
        public Builder setActivitySideSheetDecorationType(int i10) {
            if (i10 < 0 || i10 > 3) {
                throw new IllegalArgumentException("Invalid value for the decorationType argument");
            }
            this.mIntent.putExtra(CustomTabsIntent.f86552q0, i10);
            return this;
        }

        @NonNull
        public Builder setActivitySideSheetMaximizationEnabled(boolean z10) {
            this.mIntent.putExtra(CustomTabsIntent.f86521a0, z10);
            return this;
        }

        @NonNull
        public Builder setActivitySideSheetPosition(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the sideSheetPosition argument");
            }
            this.mIntent.putExtra(CustomTabsIntent.f86532g0, i10);
            return this;
        }

        @NonNull
        public Builder setActivitySideSheetRoundedCornersPosition(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the roundedCornersPosition./ argument");
            }
            this.mIntent.putExtra(CustomTabsIntent.f86554r0, i10);
            return this;
        }

        @NonNull
        public Builder setBackgroundInteractionEnabled(boolean z10) {
            this.mIntent.putExtra(CustomTabsIntent.f86555s, !z10);
            return this;
        }

        @NonNull
        public Builder setBookmarksButtonEnabled(boolean z10) {
            this.mIntent.putExtra(CustomTabsIntent.f86547o, !z10);
            return this;
        }

        @NonNull
        public Builder setCloseButtonIcon(@NonNull Bitmap bitmap) {
            this.mIntent.putExtra(CustomTabsIntent.f86543m, bitmap);
            return this;
        }

        @NonNull
        public Builder setCloseButtonPosition(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.mIntent.putExtra(CustomTabsIntent.f86566x0, i10);
            return this;
        }

        @NonNull
        public Builder setColorScheme(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            this.mIntent.putExtra(CustomTabsIntent.f86537j, i10);
            return this;
        }

        @NonNull
        public Builder setColorSchemeParams(int i10, @NonNull CustomTabColorSchemeParams customTabColorSchemeParams) {
            if (i10 < 0 || i10 > 2 || i10 == 0) {
                throw new IllegalArgumentException(android.support.v4.media.c.a("Invalid colorScheme: ", i10));
            }
            if (this.mColorSchemeParamBundles == null) {
                this.mColorSchemeParamBundles = new SparseArray<>();
            }
            this.mColorSchemeParamBundles.put(i10, customTabColorSchemeParams.b());
            return this;
        }

        @NonNull
        public Builder setDefaultColorSchemeParams(@NonNull CustomTabColorSchemeParams customTabColorSchemeParams) {
            this.mDefaultColorSchemeBundle = customTabColorSchemeParams.b();
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setDefaultShareMenuItemEnabled(boolean z10) {
            if (z10) {
                setShareState(1);
                return this;
            }
            setShareState(2);
            return this;
        }

        @NonNull
        public Builder setDownloadButtonEnabled(boolean z10) {
            this.mIntent.putExtra(CustomTabsIntent.f86549p, !z10);
            return this;
        }

        @NonNull
        public Builder setExitAnimations(@NonNull Context context, @InterfaceC4327a int i10, @InterfaceC4327a int i11) {
            this.mIntent.putExtra(CustomTabsIntent.f86500F, ((C2382e.a) C2382e.d(context, i10, i11)).f111021c.toBundle());
            return this;
        }

        @NonNull
        public Builder setInitialActivityHeightPx(@InterfaceC4343q(unit = 1) int i10, int i11) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.mIntent.putExtra(CustomTabsIntent.f86514T, i10);
            this.mIntent.putExtra(CustomTabsIntent.f86519Y, i11);
            return this;
        }

        @NonNull
        public Builder setInitialActivityWidthPx(@InterfaceC4343q(unit = 1) int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.mIntent.putExtra(CustomTabsIntent.f86520Z, i10);
            return this;
        }

        @NonNull
        public Builder setInstantAppsEnabled(boolean z10) {
            this.mInstantAppsEnabled = z10;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setNavigationBarColor(@InterfaceC4337k int i10) {
            this.mDefaultColorSchemeBuilder.setNavigationBarColor(i10);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setNavigationBarDividerColor(@InterfaceC4337k int i10) {
            this.mDefaultColorSchemeBuilder.setNavigationBarDividerColor(i10);
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setPendingSession(@NonNull b.d dVar) {
            setSessionParameters(null, dVar.b());
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSecondaryToolbarColor(@InterfaceC4337k int i10) {
            this.mDefaultColorSchemeBuilder.setSecondaryToolbarColor(i10);
            return this;
        }

        @NonNull
        public Builder setSecondaryToolbarSwipeUpGesture(@Nullable PendingIntent pendingIntent) {
            this.mIntent.putExtra(CustomTabsIntent.f86557t, pendingIntent);
            return this;
        }

        @NonNull
        public Builder setSecondaryToolbarViews(@NonNull RemoteViews remoteViews, @Nullable int[] iArr, @Nullable PendingIntent pendingIntent) {
            this.mIntent.putExtra(CustomTabsIntent.f86507M, remoteViews);
            this.mIntent.putExtra(CustomTabsIntent.f86508N, iArr);
            this.mIntent.putExtra(CustomTabsIntent.f86509O, pendingIntent);
            return this;
        }

        @NonNull
        public Builder setSendToExternalDefaultHandlerEnabled(boolean z10) {
            this.mIntent.putExtra(CustomTabsIntent.f86551q, z10);
            return this;
        }

        @NonNull
        public Builder setSession(@NonNull androidx.browser.customtabs.b bVar) {
            this.mIntent.setPackage(bVar.f86619d.getPackageName());
            setSessionParameters(bVar.f86618c.asBinder(), bVar.f86620e);
            return this;
        }

        @NonNull
        public Builder setShareIdentityEnabled(boolean z10) {
            this.mShareIdentity = z10;
            return this;
        }

        @NonNull
        public Builder setShareState(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.mShareState = i10;
            if (i10 == 1) {
                this.mIntent.putExtra(CustomTabsIntent.f86506L, true);
                return this;
            }
            if (i10 == 2) {
                this.mIntent.putExtra(CustomTabsIntent.f86506L, false);
                return this;
            }
            this.mIntent.removeExtra(CustomTabsIntent.f86506L);
            return this;
        }

        @NonNull
        public Builder setShowTitle(boolean z10) {
            this.mIntent.putExtra(CustomTabsIntent.f86545n, z10 ? 1 : 0);
            return this;
        }

        @NonNull
        public Builder setStartAnimations(@NonNull Context context, @InterfaceC4327a int i10, @InterfaceC4327a int i11) {
            this.mActivityOptions = ActivityOptions.makeCustomAnimation(context, i10, i11);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setToolbarColor(@InterfaceC4337k int i10) {
            this.mDefaultColorSchemeBuilder.setToolbarColor(i10);
            return this;
        }

        @NonNull
        public Builder setToolbarCornerRadiusDp(@InterfaceC4343q(unit = 0) int i10) {
            if (i10 < 0 || i10 > 16) {
                throw new IllegalArgumentException("Invalid value for the cornerRadiusDp argument");
            }
            this.mIntent.putExtra(CustomTabsIntent.f86556s0, i10);
            return this;
        }

        @NonNull
        public Builder setTranslateLocale(@NonNull Locale locale) {
            if (Build.VERSION.SDK_INT >= 24) {
                setLanguageTag(locale);
            }
            return this;
        }

        @NonNull
        public Builder setUrlBarHidingEnabled(boolean z10) {
            this.mIntent.putExtra(CustomTabsIntent.f86541l, z10);
            return this;
        }

        @T(api = 34)
        private void setShareIdentityEnabled() {
            if (this.mActivityOptions == null) {
                this.mActivityOptions = f.a();
            }
            h.a(this.mActivityOptions, this.mShareIdentity);
        }

        @NonNull
        public Builder setInitialActivityHeightPx(@InterfaceC4343q(unit = 1) int i10) {
            return setInitialActivityHeightPx(i10, 0);
        }

        public Builder(@Nullable androidx.browser.customtabs.b bVar) {
            if (bVar != null) {
                setSession(bVar);
            }
        }

        @NonNull
        public Builder setActionButton(@NonNull Bitmap bitmap, @NonNull String str, @NonNull PendingIntent pendingIntent) {
            return setActionButton(bitmap, str, pendingIntent, false);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface d {
    }

    @T(api = 21)
    public static class e {
        @Nullable
        @InterfaceC4345t
        public static Locale a(Intent intent) {
            String stringExtra = intent.getStringExtra(CustomTabsIntent.f86553r);
            if (stringExtra != null) {
                return Locale.forLanguageTag(stringExtra);
            }
            return null;
        }

        @InterfaceC4345t
        public static void b(Intent intent, Locale locale) {
            intent.putExtra(CustomTabsIntent.f86553r, locale.toLanguageTag());
        }
    }

    @T(api = 23)
    public static class f {
        @InterfaceC4345t
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    @T(api = 24)
    public static class g {
        @Nullable
        @InterfaceC4345t
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    @T(api = 34)
    public static class h {
        @InterfaceC4345t
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface i {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface j {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface k {
    }

    public CustomTabsIntent(@NonNull Intent intent, @Nullable Bundle bundle) {
        this.f86571a = intent;
        this.f86572b = bundle;
    }

    public static int a(@NonNull Intent intent) {
        return intent.getIntExtra(f86519Y, 0);
    }

    @InterfaceC4343q(unit = 0)
    public static int b(@NonNull Intent intent) {
        return intent.getIntExtra(f86522b0, 0);
    }

    public static int c(@NonNull Intent intent) {
        return intent.getIntExtra(f86552q0, 0);
    }

    public static int d(@NonNull Intent intent) {
        return intent.getIntExtra(f86532g0, 0);
    }

    public static int e(@NonNull Intent intent) {
        return intent.getIntExtra(f86554r0, 0);
    }

    public static int f(@NonNull Intent intent) {
        return intent.getIntExtra(f86566x0, 0);
    }

    @NonNull
    public static CustomTabColorSchemeParams g(@NonNull Intent intent, int i10) {
        Bundle bundle;
        if (i10 < 0 || i10 > 2 || i10 == 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Invalid colorScheme: ", i10));
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return CustomTabColorSchemeParams.a(null);
        }
        CustomTabColorSchemeParams customTabColorSchemeParamsA = CustomTabColorSchemeParams.a(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray(f86512R);
        return (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i10)) == null) ? customTabColorSchemeParamsA : CustomTabColorSchemeParams.a(bundle).c(customTabColorSchemeParamsA);
    }

    @InterfaceC4343q(unit = 1)
    public static int h(@NonNull Intent intent) {
        return intent.getIntExtra(f86514T, 0);
    }

    @InterfaceC4343q(unit = 1)
    public static int i(@NonNull Intent intent) {
        return intent.getIntExtra(f86520Z, 0);
    }

    @Nullable
    @T(api = 24)
    public static Locale j(Intent intent) {
        return e.a(intent);
    }

    public static int k() {
        return 5;
    }

    @Nullable
    public static PendingIntent l(@NonNull Intent intent) {
        return (PendingIntent) intent.getParcelableExtra(f86557t);
    }

    @InterfaceC4343q(unit = 0)
    public static int m(@NonNull Intent intent) {
        return intent.getIntExtra(f86556s0, 16);
    }

    @Nullable
    public static Locale n(@NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(intent);
        }
        return null;
    }

    public static boolean o(@NonNull Intent intent) {
        return intent.getBooleanExtra(f86521a0, false);
    }

    public static boolean p(@NonNull Intent intent) {
        return !intent.getBooleanExtra(f86555s, false);
    }

    public static boolean q(@NonNull Intent intent) {
        return !intent.getBooleanExtra(f86547o, false);
    }

    public static boolean r(@NonNull Intent intent) {
        return !intent.getBooleanExtra(f86549p, false);
    }

    public static boolean s(@NonNull Intent intent) {
        return intent.getBooleanExtra(f86551q, false);
    }

    @NonNull
    public static Intent u(@Nullable Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(f86523c, true);
        return intent;
    }

    public static boolean v(@NonNull Intent intent) {
        return intent.getBooleanExtra(f86523c, false) && (intent.getFlags() & 268435456) != 0;
    }

    public void t(@NonNull Context context, @NonNull Uri uri) {
        this.f86571a.setData(uri);
        C0920d.startActivity(context, this.f86571a, this.f86572b);
    }
}
