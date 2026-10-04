package com.mbridge.msdk.foundation.feedback;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.compose.runtime.changelist.j;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.bean.a;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f156246d = -2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f156247e = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f156248f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RelativeLayout.LayoutParams f156249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.mbridge.msdk.foundation.feedback.bean.a> f156250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f156251c;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.b$b, reason: collision with other inner class name */
    public static class C0566b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f156252a = new b();
    }

    public static b b() {
        return C0566b.f156252a;
    }

    private com.mbridge.msdk.foundation.feedback.bean.a c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = c.n().b();
        }
        if (this.f156250b.containsKey(str)) {
            return this.f156250b.get(str);
        }
        return null;
    }

    public void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, com.mbridge.msdk.foundation.feedback.a aVar) {
        if (a()) {
            com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
            if (aVar != null) {
                aVarB.a(new a.g(str, aVar));
            }
            FeedBackButton feedBackButtonI = aVarB.i();
            if (feedBackButtonI != null) {
                if (layoutParams == null) {
                    int iA = com.mbridge.msdk.advanced.signal.c.a(10.0f);
                    this.f156249a.setMargins(iA, iA, iA, iA);
                    layoutParams = this.f156249a;
                }
                ViewGroup viewGroup2 = (ViewGroup) feedBackButtonI.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(feedBackButtonI);
                }
                Activity activityA = a(context);
                if (activityA != null && viewGroup == null) {
                    viewGroup = (ViewGroup) activityA.findViewById(R.id.content);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(feedBackButtonI);
                    viewGroup.addView(feedBackButtonI, layoutParams);
                }
            }
        }
    }

    public void d(String str) {
        try {
            com.mbridge.msdk.foundation.feedback.bean.a aVarC = c(str);
            if (aVarC != null) {
                aVarC.f();
            }
            this.f156250b.remove(str);
            f156248f = false;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private b() {
        this.f156249a = new RelativeLayout.LayoutParams(f156247e, f156246d);
        this.f156250b = new ConcurrentHashMap<>();
    }

    public com.mbridge.msdk.foundation.feedback.bean.a b(String str) {
        com.mbridge.msdk.foundation.feedback.bean.a aVar;
        if (TextUtils.isEmpty(str)) {
            str = c.n().b();
        }
        if (this.f156250b.containsKey(str)) {
            aVar = this.f156250b.get(str);
        } else {
            aVar = new com.mbridge.msdk.foundation.feedback.bean.a(str);
            this.f156250b.put(str, aVar);
        }
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.foundation.feedback.bean.a aVar2 = new com.mbridge.msdk.foundation.feedback.bean.a(str);
        this.f156250b.put(str, aVar2);
        return aVar2;
    }

    public void b(String str, int i10) {
        b(str).c(i10);
    }

    public boolean a() {
        g gVarA = com.mbridge.msdk.advanced.manager.g.a(i.b());
        this.f156251c = gVarA;
        if (gVarA != null) {
            return false;
        }
        this.f156251c = i.b().a();
        return false;
    }

    public Activity a(Context context) {
        Activity activity;
        Activity activity2;
        Context contextF = c.n().f();
        Activity activity3 = null;
        try {
            activity = contextF instanceof Activity ? (Activity) contextF : null;
        } catch (Exception e10) {
            e = e10;
        }
        try {
            if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                activity = (Activity) context;
            }
            WeakReference<Activity> weakReferenceA = c.n().a();
            if (weakReferenceA != null && (activity2 = weakReferenceA.get()) != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                activity = activity2;
            }
            if (activity != null && !activity.isFinishing()) {
                if (!activity.isDestroyed()) {
                    return activity;
                }
            }
            return null;
        } catch (Exception e11) {
            e = e11;
            activity3 = activity;
            e.printStackTrace();
            return activity3;
        }
    }

    public void a(String str, int i10, ViewGroup viewGroup) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        if (aVarB.i() != null) {
            aVarB.d(i10);
            if (i10 == 0) {
                a(str, c.n().d(), viewGroup, (ViewGroup.LayoutParams) null, (com.mbridge.msdk.foundation.feedback.a) null);
            }
        }
    }

    public void a(String str, int i10, int i11, int i12, float f10, float f11, float f12, String str2, String str3, float f13, JSONArray jSONArray) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        Context contextD = c.n().d();
        aVarB.a(v0.a(contextD, f10), v0.a(contextD, f11), v0.a(contextD, i10), v0.a(contextD, i11), v0.a(contextD, i12), f12, str2, str3, f13, jSONArray);
    }

    public void a(String str, int i10, com.mbridge.msdk.foundation.feedback.a aVar) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        aVarB.a(new a.g(str, aVar));
        if (i10 == 1) {
            aVarB.g();
        } else {
            aVarB.p();
        }
    }

    public FeedBackButton a(String str) {
        return b(str).i();
    }

    public void a(String str, int i10, int i11, String str2, String str3) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarC = c(j.a(str, "_1"));
        if (aVarC == null) {
            aVarC = c(j.a(str, "_2"));
            if (aVarC == null && (aVarC = c(j.a(str, "_3"))) == null && (aVarC = c(j.a(str, "_4"))) == null) {
                aVarC = b(str);
            } else {
                aVarC.c(0);
            }
        }
        if (aVarC != null) {
            CampaignEx campaignExH = aVarC.h();
            com.mbridge.msdk.foundation.same.report.j.a(campaignExH, campaignExH != null ? campaignExH.getCampaignUnitId() : "", aVarC.k(), aVarC.j(), !TextUtils.isEmpty(str2) ? str2 : "", i10, campaignExH != null ? campaignExH.getAdType() : 0, i11, str3);
        }
    }

    public void a(String str, CampaignEx campaignEx) {
        b(str).a(campaignEx);
    }

    public void a(String str, String str2) {
        b(str).b(str2);
    }

    public void a(String str, FeedBackButton feedBackButton) {
        b(str).a(feedBackButton);
    }

    public void a(String str, com.mbridge.msdk.foundation.feedback.a aVar) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        if (aVar != null) {
            aVarB.a(new a.g(str, aVar));
        }
    }

    public void a(String str, int i10) {
        b(str).b(i10);
    }

    public boolean a(String str, Context context, MBFeedBackDialog mBFeedBackDialog) {
        if (mBFeedBackDialog == null) {
            q0.c("", "mbAlertDialog  is null");
            return false;
        }
        return a(context, mBFeedBackDialog);
    }

    private boolean a(Context context, MBFeedBackDialog mBFeedBackDialog) {
        Activity activityA = a(context);
        if (activityA == null || mBFeedBackDialog == null || activityA.isDestroyed()) {
            return false;
        }
        try {
            if (!mBFeedBackDialog.isShowing() && !activityA.isFinishing()) {
                mBFeedBackDialog.show();
                return true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }
}
