package K9;

import android.app.PendingIntent;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.prism.commons.utils.l0;
import com.prism.gaia.helper.utils.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f58517c = l0.b(u.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RemoteViews f58518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<Integer, PendingIntent> f58519b;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f58520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PendingIntent f58521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f58522c;

        public a(Rect rect, PendingIntent pendingIntent, int i10) {
            this.f58520a = rect;
            this.f58521b = pendingIntent;
            this.f58522c = i10;
        }

        public String toString() {
            return "RectInfo{rect=" + this.f58520a + '}';
        }
    }

    public u(RemoteViews remoteViews) {
        this.f58518a = remoteViews;
    }

    public final a a(Rect rect, List<a> list) {
        int i10 = 0;
        a aVar = null;
        for (a aVar2 : list) {
            int iD = d(rect, aVar2.f58520a);
            if (iD > i10) {
                if (iD == 0) {
                    Objects.toString(aVar2.f58520a);
                }
                aVar = aVar2;
                i10 = iD;
            }
        }
        return aVar;
    }

    public int b() {
        if (this.f58519b == null) {
            this.f58519b = c(this.f58518a);
        }
        return this.f58519b.size();
    }

    public final Map<Integer, PendingIntent> c(RemoteViews remoteViews) {
        Object obj;
        String simpleName;
        HashMap map = new HashMap();
        if (remoteViews != null) {
            try {
                obj = new y(remoteViews).k("mActions").f165228a;
            } catch (Exception e10) {
                e10.printStackTrace();
                obj = null;
            }
            if (obj != null && (obj instanceof Collection)) {
                for (Object obj2 : (Collection) obj) {
                    if (obj2 != null) {
                        try {
                            simpleName = (String) new y(obj2).e("getActionName").f165228a;
                        } catch (Exception unused) {
                            simpleName = obj2.getClass().getSimpleName();
                        }
                        if ("SetOnClickPendingIntent".equalsIgnoreCase(simpleName)) {
                            Integer num = (Integer) new y(obj2).k("viewId").f165228a;
                            num.getClass();
                            map.put(num, (PendingIntent) new y(obj2).k(BaseGmsClient.KEY_PENDING_INTENT).f165228a);
                        }
                    }
                }
            }
        }
        return map;
    }

    public final int d(Rect rect, Rect rect2) {
        int i10;
        Rect rect3 = new Rect();
        rect3.left = Math.max(rect.left, rect2.left);
        rect3.top = Math.max(rect.top, rect2.top);
        rect3.right = Math.min(rect.right, rect2.right);
        int iMin = Math.min(rect.bottom, rect2.bottom);
        rect3.bottom = iMin;
        int i11 = rect3.left;
        int i12 = rect3.right;
        if (i11 >= i12 || (i10 = rect3.top) >= iMin) {
            return 0;
        }
        return (iMin - i10) * (i12 - i11);
    }

    public final Rect e(View view) {
        Rect rect = new Rect();
        rect.top = view.getTop();
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            Rect rectE = e((ViewGroup) parent);
            rect.top += rectE.top;
            rect.left += rectE.left;
            rect.right += rectE.left;
            rect.bottom += rectE.top;
        }
        return rect;
    }

    public final void f(RemoteViews remoteViews, ViewGroup viewGroup, List<a> list) {
        a aVarA;
        int childCount = viewGroup.getChildCount();
        viewGroup.getHitRect(new Rect());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ViewGroup) {
                f(remoteViews, (ViewGroup) childAt, list);
            } else if (((childAt instanceof TextView) || (childAt instanceof ImageView)) && (aVarA = a(e(childAt), list)) != null) {
                remoteViews.setOnClickPendingIntent(childAt.getId(), aVarA.f58521b);
            }
        }
    }

    public void g(RemoteViews remoteViews, View view, View view2) {
        if (b() > 0) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (Map.Entry<Integer, PendingIntent> entry : this.f58519b.entrySet()) {
                View viewFindViewById = view2.findViewById(entry.getKey().intValue());
                if (viewFindViewById != null) {
                    arrayList.add(new a(e(viewFindViewById), entry.getValue(), i10));
                    i10++;
                }
            }
            arrayList.toString();
            if (view instanceof ViewGroup) {
                f(remoteViews, (ViewGroup) view, arrayList);
            }
        }
    }
}
