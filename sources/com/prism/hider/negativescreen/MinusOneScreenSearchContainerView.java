package com.prism.hider.negativescreen;

import android.app.Activity;
import android.app.Fragment;
import android.app.SearchManager;
import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.launcher3.AppWidgetResizeFrame;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherSettings;
import com.android.launcher3.Utilities;
import com.app.hider.master.promax.R;
import ga.v;

/* JADX INFO: loaded from: classes6.dex */
public class MinusOneScreenSearchContainerView extends FrameLayout {

    public static class a extends AppWidgetHost {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f167774a = 2026;

        public a(Context context) {
            super(context, f167774a);
        }

        @Override // android.appwidget.AppWidgetHost
        public AppWidgetHostView onCreateView(Context context, int i10, AppWidgetProviderInfo appWidgetProviderInfo) {
            return new v(context);
        }
    }

    public static class b extends Fragment implements View.OnClickListener {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f167775i = "MinusOneSearch";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f167776j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f167777k = "negative_screen_search_widget_id";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f167778l = "pending_search_widget_id";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f167779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AppWidgetProviderInfo f167780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public v f167781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public FrameLayout f167782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f167783e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f167785g;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f167784f = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f167786h = 0;

        /* JADX WARN: Finally extract failed */
        public final View a(ViewGroup viewGroup) {
            Activity activity = getActivity();
            AppWidgetProviderInfo appWidgetProviderInfoA = MinusOneScreenSearchContainerView.a(activity);
            this.f167780b = appWidgetProviderInfoA;
            if (appWidgetProviderInfoA == null) {
                return v.a(viewGroup);
            }
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(activity);
            Bundle bundleG = g();
            int i10 = -1;
            int i11 = Utilities.getPrefs(activity).getInt(f167777k, -1);
            AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(i11);
            boolean zBindAppWidgetIdIfAllowed = appWidgetInfo != null && appWidgetInfo.provider.equals(this.f167780b.provider) && appWidgetInfo.getProfile().equals(this.f167780b.getProfile());
            if (!zBindAppWidgetIdIfAllowed) {
                if (i11 > -1) {
                    this.f167779a.deleteAppWidgetId(i11);
                }
                int iAllocateAppWidgetId = this.f167779a.allocateAppWidgetId();
                try {
                    zBindAppWidgetIdIfAllowed = appWidgetManager.bindAppWidgetIdIfAllowed(iAllocateAppWidgetId, this.f167780b.getProfile(), this.f167780b.provider, bundleG);
                    if (zBindAppWidgetIdIfAllowed) {
                        i10 = iAllocateAppWidgetId;
                    } else {
                        this.f167779a.deleteAppWidgetId(iAllocateAppWidgetId);
                    }
                    c(i10);
                    i11 = i10;
                } catch (Throwable th) {
                    if (zBindAppWidgetIdIfAllowed) {
                        i10 = iAllocateAppWidgetId;
                    } else {
                        this.f167779a.deleteAppWidgetId(iAllocateAppWidgetId);
                    }
                    c(i10);
                    throw th;
                }
            }
            if (!zBindAppWidgetIdIfAllowed) {
                View viewA = v.a(viewGroup);
                View viewFindViewById = viewA.findViewById(R.id.btn_qsb_setup);
                viewFindViewById.setVisibility(0);
                viewFindViewById.setEnabled(this.f167786h == 0);
                viewFindViewById.setOnClickListener(this);
                return viewA;
            }
            v vVar = (v) this.f167779a.createView(activity, i11, this.f167780b);
            this.f167781c = vVar;
            vVar.setId(R.id.qsb_widget);
            if (!Utilities.containsAll(appWidgetManager.getAppWidgetOptions(i11), bundleG)) {
                this.f167781c.updateAppWidgetOptions(bundleG);
            }
            this.f167781c.setPadding(0, 0, 0, 0);
            return this.f167781c;
        }

        public final void b() {
            int i10 = this.f167786h;
            if (i10 != 0) {
                this.f167779a.deleteAppWidgetId(i10);
                this.f167786h = 0;
            }
        }

        public final void c(int i10) {
            Utilities.getPrefs(getActivity()).edit().putInt(f167777k, i10).apply();
        }

        public void d(boolean z10) {
            this.f167783e = z10;
            f();
        }

        public final void e() {
            if (this.f167785g) {
                this.f167785g = false;
                this.f167779a.stopListening();
            }
        }

        public final void f() {
            View viewA;
            if (!this.f167783e || !isResumed() || this.f167782d == null) {
                e();
                return;
            }
            if (this.f167784f) {
                e();
                this.f167781c = null;
                this.f167782d.removeAllViews();
                try {
                    viewA = a(this.f167782d);
                } catch (RuntimeException e10) {
                    Log.w("MinusOneSearch", "Unable to bind the search widget", e10);
                    this.f167781c = null;
                    viewA = v.a(this.f167782d);
                }
                this.f167782d.addView(viewA);
                this.f167784f = false;
            }
            if (this.f167781c == null || this.f167785g) {
                return;
            }
            try {
                this.f167779a.startListening();
                this.f167785g = true;
            } catch (RuntimeException e11) {
                Log.w("MinusOneSearch", "Unable to listen for search widget updates", e11);
                this.f167779a.stopListening();
            }
        }

        public final Bundle g() {
            Rect widgetSizeRanges = AppWidgetResizeFrame.getWidgetSizeRanges(getActivity(), LauncherAppState.getIDP(getActivity()).numColumns, 1, null);
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetMinWidth", widgetSizeRanges.left);
            bundle.putInt("appWidgetMinHeight", widgetSizeRanges.top);
            bundle.putInt("appWidgetMaxWidth", widgetSizeRanges.right);
            bundle.putInt("appWidgetMaxHeight", widgetSizeRanges.bottom);
            return bundle;
        }

        @Override // android.app.Fragment
        public void onActivityResult(int i10, int i11, Intent intent) {
            super.onActivityResult(i10, i11, intent);
            if (i10 != 10) {
                return;
            }
            int i12 = this.f167786h;
            AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(getActivity()).getAppWidgetInfo(i12);
            AppWidgetProviderInfo appWidgetProviderInfoA = MinusOneScreenSearchContainerView.a(getActivity());
            if (i11 == -1 && appWidgetInfo != null && appWidgetProviderInfoA != null && appWidgetInfo.provider.equals(appWidgetProviderInfoA.provider) && appWidgetInfo.getProfile().equals(appWidgetProviderInfoA.getProfile())) {
                c(i12);
                this.f167786h = 0;
            } else {
                b();
            }
            this.f167784f = true;
            f();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f167780b == null || this.f167786h != 0) {
                return;
            }
            this.f167786h = this.f167779a.allocateAppWidgetId();
            Intent intentPutExtra = new Intent("android.appwidget.action.APPWIDGET_BIND").putExtra(LauncherSettings.Favorites.APPWIDGET_ID, this.f167786h).putExtra(LauncherSettings.Favorites.APPWIDGET_PROVIDER, this.f167780b.provider).putExtra("appWidgetProviderProfile", this.f167780b.getProfile()).putExtra("appWidgetOptions", g());
            view.setEnabled(false);
            try {
                startActivityForResult(intentPutExtra, 10);
            } catch (ActivityNotFoundException | SecurityException e10) {
                Log.w("MinusOneSearch", "Search widget binding is unavailable", e10);
                b();
                view.setEnabled(true);
            }
        }

        @Override // android.app.Fragment, android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            this.f167784f = true;
            f();
        }

        @Override // android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.f167779a = new a(getActivity());
            if (bundle != null) {
                this.f167786h = bundle.getInt(f167778l, 0);
            }
        }

        @Override // android.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            FrameLayout frameLayout = new FrameLayout(getActivity());
            this.f167782d = frameLayout;
            frameLayout.addView(v.a(frameLayout));
            this.f167784f = true;
            return this.f167782d;
        }

        @Override // android.app.Fragment
        public void onDestroy() {
            e();
            if (getActivity().isFinishing()) {
                b();
            }
            this.f167779a = null;
            super.onDestroy();
        }

        @Override // android.app.Fragment
        public void onDestroyView() {
            e();
            this.f167783e = false;
            this.f167782d = null;
            this.f167781c = null;
            this.f167780b = null;
            super.onDestroyView();
        }

        @Override // android.app.Fragment
        public void onPause() {
            e();
            super.onPause();
        }

        @Override // android.app.Fragment
        public void onResume() {
            super.onResume();
            this.f167784f = true;
            f();
        }

        @Override // android.app.Fragment
        public void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            bundle.putInt(f167778l, this.f167786h);
        }
    }

    public MinusOneScreenSearchContainerView(Context context) {
        super(context);
    }

    public static AppWidgetProviderInfo a(Context context) {
        SearchManager searchManager = (SearchManager) context.getSystemService("search");
        AppWidgetProviderInfo appWidgetProviderInfo = null;
        ComponentName globalSearchActivity = searchManager == null ? null : searchManager.getGlobalSearchActivity();
        if (globalSearchActivity == null) {
            return null;
        }
        String packageName = globalSearchActivity.getPackageName();
        for (AppWidgetProviderInfo appWidgetProviderInfo2 : AppWidgetManager.getInstance(context).getInstalledProviders()) {
            if (appWidgetProviderInfo2.provider.getPackageName().equals(packageName) && appWidgetProviderInfo2.configure == null) {
                if ((appWidgetProviderInfo2.widgetCategory & 4) != 0) {
                    return appWidgetProviderInfo2;
                }
                if (appWidgetProviderInfo == null) {
                    appWidgetProviderInfo = appWidgetProviderInfo2;
                }
            }
        }
        return appWidgetProviderInfo;
    }

    public void b(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(0, 0, 0, 0);
    }

    public MinusOneScreenSearchContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MinusOneScreenSearchContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
