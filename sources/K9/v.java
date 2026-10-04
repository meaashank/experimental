package K9;

import U6.o;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.utils.y;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f58524i = "asdf-".concat(v.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f58525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f58526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f58527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f58528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f58529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f58530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap<String, Bitmap> f58531g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f58532h = false;

    public final View a(Context context, RemoteViews remoteViews) {
        View viewInflate;
        ArrayList arrayList;
        try {
            viewInflate = LayoutInflater.from(context).inflate(remoteViews.getLayoutId(), (ViewGroup) null, false);
            try {
                new y(viewInflate).f("setTagInternal", y.y("com.android.internal.R$id").k("widget_frame").f165228a, Integer.valueOf(remoteViews.getLayoutId()));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            viewInflate = null;
        }
        if (viewInflate != null && (arrayList = (ArrayList) new y(remoteViews).k("mActions").f165228a) != null) {
            arrayList.size();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                try {
                    new y(obj).f("apply", viewInflate, null, null);
                } catch (Exception unused3) {
                }
            }
        }
        return viewInflate;
    }

    public Bitmap b(View view) {
        if (view == null) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        return view.getDrawingCache();
    }

    public final View c(Context context, RemoteViews remoteViews, boolean z10, boolean z11) {
        if (remoteViews == null) {
            return null;
        }
        Context contextN = GaiaContext.j().n();
        f(contextN);
        int i10 = z10 ? this.f58526b : this.f58525a;
        int iE = w.e(contextN, this.f58528d, i10, this.f58529e);
        FrameLayout frameLayout = new FrameLayout(context);
        View viewA = a(context, remoteViews);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        frameLayout.addView(viewA, layoutParams);
        if (viewA instanceof ViewGroup) {
            d((ViewGroup) viewA);
        }
        int i11 = (!z11 && z10) ? Integer.MIN_VALUE : 1073741824;
        frameLayout.layout(0, 0, iE, i10);
        frameLayout.measure(View.MeasureSpec.makeMeasureSpec(iE, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, i11));
        frameLayout.layout(0, 0, iE, frameLayout.getMeasuredHeight());
        frameLayout.getMeasuredWidth();
        frameLayout.getMeasuredHeight();
        return frameLayout;
    }

    public final void d(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (g(textView)) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(1);
                }
            } else if (childAt instanceof ViewGroup) {
                d((ViewGroup) childAt);
            }
        }
    }

    public final int e(Context context, Context context2, String str, int i10) {
        int identifier;
        if (context2 != null && (identifier = context2.getResources().getIdentifier(str, "dimen", "com.android.systemui")) != 0) {
            try {
                return Math.round(context2.getResources().getDimension(identifier));
            } catch (Exception unused) {
            }
        }
        if (i10 == 0) {
            return 0;
        }
        return Math.round(context.getResources().getDimension(i10));
    }

    public final void f(Context context) {
        Context contextCreatePackageContext;
        if (this.f58532h) {
            return;
        }
        this.f58532h = true;
        if (this.f58528d == 0) {
            try {
                contextCreatePackageContext = context.createPackageContext("com.android.systemui", 2);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            this.f58529e = e(context, contextCreatePackageContext, "notification_side_padding", o.f.f70553Md);
            int iE = e(context, contextCreatePackageContext, "notification_panel_width", o.f.f70508Jd);
            this.f58528d = iE;
            if (iE <= 0) {
                this.f58528d = context.getResources().getDisplayMetrics().widthPixels;
            }
            this.f58525a = e(context, contextCreatePackageContext, "notification_min_height", o.f.f70478Hd);
            this.f58526b = e(context, contextCreatePackageContext, "notification_max_height", o.f.f70433Ed);
            this.f58527c = e(context, contextCreatePackageContext, "notification_mid_height", o.f.f70463Gd);
            this.f58530f = e(context, contextCreatePackageContext, "notification_padding", o.f.f70493Id);
        }
    }

    public final boolean g(TextView textView) {
        try {
            return ((Boolean) new y(textView).k("mSingleLine").f165228a).booleanValue();
        } catch (Exception unused) {
            return (textView.getInputType() & 131072) != 0;
        }
    }

    public RemoteViews h(String str, Context context, RemoteViews remoteViews, boolean z10, boolean z11) {
        Bitmap bitmap;
        if (remoteViews == null) {
            return null;
        }
        u uVar = new u(remoteViews);
        int i10 = (!z11 || uVar.b() <= 0) ? o.k.f71906J : o.k.f71904I;
        RemoteViews remoteViews2 = new RemoteViews(GaiaContext.j().v(), i10);
        View viewI = i(context, remoteViews, z10, false);
        Bitmap bitmapB = b(viewI);
        if (bitmapB == null) {
            remoteViews.toString();
        } else {
            bitmapB.getWidth();
            bitmapB.getHeight();
        }
        synchronized (this.f58531g) {
            bitmap = this.f58531g.get(str);
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        remoteViews2.setImageViewBitmap(o.h.f71484R2, bitmapB);
        synchronized (this.f58531g) {
            this.f58531g.put(str, bitmapB);
        }
        if (z11 && i10 == o.k.f71904I) {
            try {
                uVar.g(remoteViews2, i(GaiaContext.f164212y.n(), remoteViews2, z10, false), viewI);
            } catch (Exception unused) {
            }
        }
        return remoteViews2;
    }

    public View i(Context context, RemoteViews remoteViews, boolean z10, boolean z11) {
        try {
            return c(context, remoteViews, z10, z11);
        } catch (Throwable unused) {
            try {
                return LayoutInflater.from(context).inflate(remoteViews.getLayoutId(), (ViewGroup) null);
            } catch (Throwable unused2) {
                return null;
            }
        }
    }
}
