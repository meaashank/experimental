package K9;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes6.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f58533a = "asdf-".concat(w.class.getSimpleName());

    public static ViewGroup a(Context context, int i10) {
        try {
            return (ViewGroup) LayoutInflater.from(context).inflate(i10, (ViewGroup) null);
        } catch (Throwable unused) {
            return new FrameLayout(context);
        }
    }

    public static int b(int i10, int i11) {
        return i10 - (i11 * 2);
    }

    public static int c(Context context, int i10, int i11) {
        try {
            Context contextCreatePackageContext = context.createPackageContext("com.android.systemui", 3);
            int iF = f(contextCreatePackageContext, "time_axis", "layout");
            if (iF != 0) {
                ViewGroup viewGroupA = a(contextCreatePackageContext, iF);
                g(viewGroupA, i10, i11);
                int identifier = contextCreatePackageContext.getResources().getIdentifier("content_view_group", "id", "com.android.systemui");
                if (identifier != 0) {
                    View viewFindViewById = viewGroupA.findViewById(identifier);
                    return ((i10 - viewFindViewById.getLeft()) - viewFindViewById.getPaddingLeft()) - viewFindViewById.getPaddingRight();
                }
                int childCount = viewGroupA.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = viewGroupA.getChildAt(i12);
                    if (childAt instanceof LinearLayout) {
                        return ((i10 - childAt.getLeft()) - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                    }
                }
            }
        } catch (Exception unused) {
        }
        return i10;
    }

    public static int d(Context context, int i10, int i11) {
        int i12;
        try {
            Context contextCreatePackageContext = context.createPackageContext("com.android.systemui", 3);
            int iF = f(contextCreatePackageContext, "status_bar_notification_row", "layout");
            if (iF != 0) {
                ViewGroup viewGroupA = a(contextCreatePackageContext, iF);
                int identifier = contextCreatePackageContext.getResources().getIdentifier("adaptive", "id", "com.android.systemui");
                if (identifier == 0) {
                    identifier = contextCreatePackageContext.getResources().getIdentifier("content", "id", "com.android.systemui");
                } else {
                    View viewFindViewById = viewGroupA.findViewById(identifier);
                    if (viewFindViewById instanceof ViewGroup) {
                        ((ViewGroup) viewFindViewById).addView(new View(contextCreatePackageContext));
                    }
                }
                g(viewGroupA, i10, i11);
                if (identifier == 0) {
                    int childCount = viewGroupA.getChildCount();
                    while (i12 < childCount) {
                        View childAt = viewGroupA.getChildAt(i12);
                        i12 = ((childAt instanceof FrameLayout) || "LatestItemView".equals(childAt.getClass().getName()) || "SizeAdaptiveLayout".equals(childAt.getClass().getName())) ? 0 : i12 + 1;
                        return ((i10 - childAt.getLeft()) - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                    }
                }
                View viewFindViewById2 = viewGroupA.findViewById(identifier);
                if (viewFindViewById2 != null) {
                    return ((i10 - viewFindViewById2.getLeft()) - viewFindViewById2.getPaddingLeft()) - viewFindViewById2.getPaddingRight();
                }
            }
        } catch (Exception unused) {
        }
        return i10;
    }

    public static int e(Context context, int i10, int i11, int i12) {
        return com.prism.gaia.helper.utils.t.a().d() ? c(context, i10, i11) : com.prism.gaia.helper.utils.t.f165218i.f() ? d(context, i10 - (Math.round(TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics())) * 2), i11) : i10 - (i12 * 2);
    }

    public static int f(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, "com.android.systemui");
    }

    public static void g(View view, int i10, int i11) {
        view.layout(0, 0, i10, i11);
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        view.layout(0, 0, i10, i11);
    }
}
