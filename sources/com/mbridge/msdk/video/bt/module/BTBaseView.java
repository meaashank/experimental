package com.mbridge.msdk.video.bt.module;

import Z3.f;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.bt.component.d;
import com.mbridge.msdk.videocommon.setting.c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static int f160214n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static int f160215o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f160216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected CampaignEx f160217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f160218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f160219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected c f160220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected LayoutInflater f160221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f160222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f160223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected float f160224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f160225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected Rect f160226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f160227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f160228m;

    public BTBaseView(Context context) {
        this(context, null);
    }

    public JSONObject a(int i10) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e10) {
            e = e10;
        }
        try {
            jSONObject.put(a.f156324h, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f160224i));
            jSONObject.put(a.f156325i, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f160225j));
            jSONObject.put(a.f156329m, i10);
            try {
                this.f160222g = getContext().getResources().getConfiguration().orientation;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            jSONObject.put(a.f156327k, this.f160222g);
            jSONObject.put(a.f156328l, v0.d(getContext()));
            return jSONObject;
        } catch (JSONException e12) {
            e = e12;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            return jSONObject2;
        }
    }

    public void b() {
    }

    public void defaultShow() {
        q0.a(TAG, "defaultShow");
    }

    public int findColor(String str) {
        return i0.a(this.f160216a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return i0.a(this.f160216a.getApplicationContext(), str, AppIntroBaseFragmentKt.ARG_DRAWABLE);
    }

    public int findID(String str) {
        return i0.a(this.f160216a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(this.f160216a.getApplicationContext(), str, "layout");
    }

    public CampaignEx getCampaign() {
        return this.f160217b;
    }

    public String getInstanceId() {
        return this.f160219d;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public Rect getRect() {
        return this.f160226k;
    }

    public String getUnitId() {
        return this.f160218c;
    }

    public int getViewHeight() {
        return this.f160228m;
    }

    public int getViewWidth() {
        return this.f160227l;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.f160216a.getResources().getConfiguration().orientation == 2;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            if (viewArr[i10] == null) {
                return false;
            }
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f160222g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f160224i = motionEvent.getRawX();
        this.f160225j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f160222g = configuration.orientation;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f160217b = campaignEx;
    }

    public void setInstanceId(String str) {
        this.f160219d = str;
    }

    public void setLayout(int i10, int i11) {
        this.f160227l = i10;
        this.f160228m = i11;
    }

    public void setLayoutCenter(int i10, int i11) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i10 != -999) {
                parentRelativeLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentRelativeLayoutParams.height = i11;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentLinearLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentLinearLayoutParams.height = i11;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentFrameLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentFrameLayoutParams.height = i11;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i11;
            parentRelativeLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentRelativeLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentRelativeLayoutParams.height = i13;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i11;
            parentLinearLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentLinearLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentLinearLayoutParams.height = i13;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i11;
            parentFrameLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentFrameLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentFrameLayoutParams.height = i13;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setRect(Rect rect) {
        this.f160226k = rect;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f160220e = cVar;
    }

    public void setUnitId(String str) {
        this.f160218c = str;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
    }

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f160219d = "";
        this.f160222g = 1;
        this.f160223h = false;
        this.f160216a = context;
        this.f160221f = LayoutInflater.from(context);
        init(context);
    }

    public static void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f.f79422s, f160214n);
            jSONObject.put("id", str2);
            jSONObject.put("data", new JSONObject());
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            d.c().a(webView, e10.getMessage());
            q0.a(TAG, e10.getMessage());
        }
    }
}
