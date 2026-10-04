package com.android.launcher3.qsb;

import android.app.Activity;
import android.app.Fragment;
import android.app.SearchManager;
import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.launcher3.AppWidgetResizeFrame;
import com.android.launcher3.InvariantDeviceProfile;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherSettings;
import com.android.launcher3.Utilities;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class QsbContainerView extends FrameLayout {

    public static class QsbFragment extends Fragment implements View.OnClickListener {
        private static final String QSB_WIDGET_ID = "qsb_widget_id";
        private static final int REQUEST_BIND_QSB = 1;
        private int mOrientation;
        private QsbWidgetHostView mQsb;
        private QsbWidgetHost mQsbWidgetHost;
        private AppWidgetProviderInfo mWidgetInfo;
        private FrameLayout mWrapper;

        private View createQsb(ViewGroup viewGroup) {
            Activity activity = getActivity();
            AppWidgetProviderInfo searchWidgetProvider = QsbContainerView.getSearchWidgetProvider(activity);
            this.mWidgetInfo = searchWidgetProvider;
            if (searchWidgetProvider == null) {
                return QsbWidgetHostView.getDefaultView(viewGroup);
            }
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(activity);
            InvariantDeviceProfile idp = LauncherAppState.getIDP(activity);
            Bundle bundle = new Bundle();
            Rect widgetSizeRanges = AppWidgetResizeFrame.getWidgetSizeRanges(activity, idp.numColumns, 1, null);
            bundle.putInt("appWidgetMinWidth", widgetSizeRanges.left);
            bundle.putInt("appWidgetMinHeight", widgetSizeRanges.top);
            bundle.putInt("appWidgetMaxWidth", widgetSizeRanges.right);
            bundle.putInt("appWidgetMaxHeight", widgetSizeRanges.bottom);
            int i10 = -1;
            int i11 = Utilities.getPrefs(activity).getInt(QSB_WIDGET_ID, -1);
            AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(i11);
            boolean zBindAppWidgetIdIfAllowed = appWidgetInfo != null && appWidgetInfo.provider.equals(this.mWidgetInfo.provider);
            if (!zBindAppWidgetIdIfAllowed) {
                if (i11 > -1) {
                    this.mQsbWidgetHost.deleteHost();
                }
                int iAllocateAppWidgetId = this.mQsbWidgetHost.allocateAppWidgetId();
                zBindAppWidgetIdIfAllowed = appWidgetManager.bindAppWidgetIdIfAllowed(iAllocateAppWidgetId, this.mWidgetInfo.getProfile(), this.mWidgetInfo.provider, bundle);
                if (zBindAppWidgetIdIfAllowed) {
                    i10 = iAllocateAppWidgetId;
                } else {
                    this.mQsbWidgetHost.deleteAppWidgetId(iAllocateAppWidgetId);
                }
                if (i11 != i10) {
                    saveWidgetId(i10);
                }
                i11 = i10;
            }
            if (!zBindAppWidgetIdIfAllowed) {
                View defaultView = QsbWidgetHostView.getDefaultView(viewGroup);
                View viewFindViewById = defaultView.findViewById(R.id.btn_qsb_setup);
                viewFindViewById.setVisibility(0);
                viewFindViewById.setOnClickListener(this);
                return defaultView;
            }
            QsbWidgetHostView qsbWidgetHostView = (QsbWidgetHostView) this.mQsbWidgetHost.createView(activity, i11, this.mWidgetInfo);
            this.mQsb = qsbWidgetHostView;
            qsbWidgetHostView.setId(R.id.qsb_widget);
            if (!Utilities.containsAll(AppWidgetManager.getInstance(activity).getAppWidgetOptions(i11), bundle)) {
                this.mQsb.updateAppWidgetOptions(bundle);
            }
            this.mQsb.setPadding(0, 0, 0, 0);
            this.mQsbWidgetHost.startListening();
            return this.mQsb;
        }

        private void rebindFragment() {
        }

        private void saveWidgetId(int i10) {
            Utilities.getPrefs(getActivity()).edit().putInt(QSB_WIDGET_ID, i10).apply();
        }

        public boolean isQsbEnabled() {
            return false;
        }

        @Override // android.app.Fragment
        public void onActivityResult(int i10, int i11, Intent intent) {
            if (i10 == 1) {
                if (i11 != -1) {
                    this.mQsbWidgetHost.deleteHost();
                } else {
                    saveWidgetId(intent.getIntExtra(LauncherSettings.Favorites.APPWIDGET_ID, -1));
                    rebindFragment();
                }
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent("android.appwidget.action.APPWIDGET_BIND");
            intent.putExtra(LauncherSettings.Favorites.APPWIDGET_ID, this.mQsbWidgetHost.allocateAppWidgetId());
            intent.putExtra(LauncherSettings.Favorites.APPWIDGET_PROVIDER, this.mWidgetInfo.provider);
            startActivityForResult(intent, 1);
        }

        @Override // android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.mQsbWidgetHost = new QsbWidgetHost(getActivity());
            this.mOrientation = getContext().getResources().getConfiguration().orientation;
        }

        @Override // android.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            FrameLayout frameLayout = new FrameLayout(getActivity());
            this.mWrapper = frameLayout;
            return frameLayout;
        }

        @Override // android.app.Fragment
        public void onDestroy() {
            this.mQsbWidgetHost.stopListening();
            super.onDestroy();
        }

        @Override // android.app.Fragment
        public void onResume() {
            super.onResume();
            QsbWidgetHostView qsbWidgetHostView = this.mQsb;
            if (qsbWidgetHostView == null || !qsbWidgetHostView.isReinflateRequired(this.mOrientation)) {
                return;
            }
            rebindFragment();
        }
    }

    public static class QsbWidgetHost extends AppWidgetHost {
        private static final int QSB_WIDGET_HOST_ID = 1026;

        public QsbWidgetHost(Context context) {
            super(context, QSB_WIDGET_HOST_ID);
        }

        @Override // android.appwidget.AppWidgetHost
        public AppWidgetHostView onCreateView(Context context, int i10, AppWidgetProviderInfo appWidgetProviderInfo) {
            return new QsbWidgetHostView(context);
        }
    }

    public QsbContainerView(Context context) {
        super(context);
    }

    public static AppWidgetProviderInfo getSearchWidgetProvider(Context context) {
        ComponentName globalSearchActivity = ((SearchManager) context.getSystemService("search")).getGlobalSearchActivity();
        AppWidgetProviderInfo appWidgetProviderInfo = null;
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

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(0, 0, 0, 0);
    }

    public void setPaddingUnchecked(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
    }

    public QsbContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QsbContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
