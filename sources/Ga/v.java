package ga;

import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import com.android.launcher3.Launcher;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes6.dex */
public class v extends AppWidgetHostView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ViewDebug.ExportedProperty(category = "launcher")
    public int f202333a;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.updateAppWidget(new RemoteViews(v.this.getAppWidgetInfo().provider.getPackageName(), 0));
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Launcher.getLauncher(v.this.getContext()).startSearch("", false, null, true);
        }
    }

    public class c implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Launcher.getLauncher(view.getContext()).startSearch("", false, null, true);
        }
    }

    public v(Context context) {
        super(context);
    }

    public static View a(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.qsb_default_view, viewGroup, false);
        viewInflate.findViewById(R.id.btn_qsb_search).setOnClickListener(new c());
        return viewInflate;
    }

    public boolean b(int i10) {
        return this.f202333a != i10;
    }

    @Override // android.appwidget.AppWidgetHostView
    public View getDefaultView() {
        View defaultView = super.getDefaultView();
        defaultView.setOnClickListener(new b());
        return defaultView;
    }

    @Override // android.appwidget.AppWidgetHostView
    public View getErrorView() {
        return a(this);
    }

    @Override // android.appwidget.AppWidgetHostView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } catch (RuntimeException unused) {
            post(new a());
        }
    }

    @Override // android.appwidget.AppWidgetHostView
    public void updateAppWidget(RemoteViews remoteViews) {
        this.f202333a = getResources().getConfiguration().orientation;
        super.updateAppWidget(remoteViews);
    }
}
