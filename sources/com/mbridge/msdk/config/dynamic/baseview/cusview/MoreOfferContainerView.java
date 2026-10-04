package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C1498d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.q0;
import com.prism.gaia.server.pm.C4182q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MoreOfferContainerView extends ComponentHorizontalScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f154986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f154987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.config.dynamic.binddata.wrapper.a f154988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    List<Map<String, Object>> f154989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ViewGroup f154990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View.OnTouchListener f154991f;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f154992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.dynamic.binddata.wrapper.a f154993b;

        public a(List list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
            this.f154992a = list;
            this.f154993b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MoreOfferContainerView.this.updateMoreOfferData(this.f154992a, this.f154993b);
        }
    }

    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            MoreOfferContainerView.this.a();
            return false;
        }
    }

    public MoreOfferContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f154986a = "MoreOfferContainerView";
        this.f154987b = "";
        this.f154991f = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getVisibleViews, reason: merged with bridge method [inline-methods] */
    public void a() {
        XMLView xMLView;
        ViewGroup viewGroup = this.f154990e;
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < this.f154990e.getChildCount(); i10++) {
            View childAt = this.f154990e.getChildAt(i10);
            Rect rect = new Rect();
            boolean globalVisibleRect = childAt.getGlobalVisibleRect(rect);
            boolean z10 = rect.width() > childAt.getMeasuredWidth() / 5;
            if (globalVisibleRect && z10 && (xMLView = this.xmlView) != null && xMLView.getXmlViewActionListener() != null) {
                HashMap map = new HashMap();
                map.put("view_tag", childAt.getTag());
                HashMap map2 = new HashMap();
                map2.put(FirebaseAnalytics.Param.INDEX, String.valueOf(childAt.getId()));
                map.put(C4182q.f167624d, map2);
                this.xmlView.getXmlViewActionListener().a(map);
            }
        }
    }

    public void setData(List<Map<String, Object>> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f154988c = aVar;
        this.f154989d = list;
        postDelayed(new a(list, aVar), 1000L);
    }

    public void setItemXMLPath(String str) {
        this.f154987b = str;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        com.mbridge.msdk.config.component.common.file.b bVarF;
        if (map == null) {
            return;
        }
        try {
            if (String.valueOf(map.get("clickable")).equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("parentPath");
            String strSubstring = "";
            if (obj instanceof String) {
                String strValueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(strValueOf) && (bVarF = com.mbridge.msdk.config.component.common.file.a.f(strValueOf)) != null && !TextUtils.isEmpty(bVarF.c())) {
                    strSubstring = bVarF.c();
                }
            }
            String strValueOf2 = String.valueOf(map.get("parentLayoutFilePath"));
            if (!TextUtils.isEmpty(strValueOf2) && !strValueOf2.equalsIgnoreCase("null")) {
                strSubstring = strValueOf2.substring(0, strValueOf2.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING) + 1);
            }
            Object obj2 = map.get("itemXml");
            if (obj2 instanceof String) {
                setItemXMLPath(strSubstring.concat(obj2.toString()).concat(C1498d.f86308y));
            }
            Object obj3 = map.get("globalModel");
            if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                this.f154988c = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3;
            }
            Object obj4 = map.get("data");
            if (obj4 instanceof List) {
                setData((List) obj4, this.f154988c);
            }
        } catch (Throwable th) {
            q0.b("MoreOfferContainerView", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof List) {
                setData((List) obj, this.f154988c);
            }
        } catch (Throwable th) {
            q0.b("MoreOfferContainerView", th.getMessage());
        }
    }

    public void updateMoreOfferData(List<Map<String, Object>> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        this.f154990e = linearLayout;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Map<String, Object> map = list.get(i10);
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
            aVar2.a((Map<? extends String, ?>) map);
            aVar.a("listData", aVar2);
            View viewA = new com.mbridge.msdk.config.dynamic.a().a(this.f154987b, null, aVar);
            if (viewA != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, 20, 0);
                viewA.setLayoutParams(layoutParams);
                viewA.setId(i10);
                viewA.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.cusview.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f155017a.b(view);
                    }
                });
                linearLayout.addView(viewA);
            }
        }
        if (linearLayout.getChildCount() > 0) {
            if (getChildCount() > 0) {
                removeAllViews();
            }
            addView(linearLayout);
            setOnTouchListener(this.f154991f);
            linearLayout.postDelayed(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.baseview.cusview.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155018a.a();
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        String string = view.getTag().toString();
        int id2 = view.getId();
        a(String.valueOf(id2), string, this.f154989d.get(id2));
    }

    public void a(String str, String str2, Map<String, Object> map) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(this);
        }
        HashMap mapA = com.bytedance.sdk.openadsdk.activity.b.a("viewTag", str2);
        HashMap mapA2 = com.bytedance.sdk.openadsdk.activity.b.a(FirebaseAnalytics.Param.INDEX, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        mapA2.put("selectedContents", arrayList);
        mapA.put(C4182q.f167624d, mapA2);
        f.a(this.xmlView, str2, mapA);
    }
}
