package com.prism.hider.ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC1486c;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public class HowToHideActivity extends ActivityC1486c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f167972a = com.prism.commons.utils.l0.b("HowToHideActivity");

    public class a implements ViewPager.i {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
        }
    }

    public class b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OkHttpClient f167974a;

        public b(OkHttpClient okHttpClient) {
            this.f167974a = okHttpClient;
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            String string;
            String str;
            String str2;
            String str3 = "text/html";
            Log.d(HowToHideActivity.f167972a, "shouldInterceptRequest: " + webResourceRequest.getUrl());
            HowToHideActivity.this.c1("shouldInterceptRequest", webResourceRequest.getRequestHeaders());
            try {
                Log.d(HowToHideActivity.f167972a, "okhttp for: " + webResourceRequest.getUrl());
                Request.Builder builderUrl = new Request.Builder().url(webResourceRequest.getUrl().toString());
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                if (requestHeaders != null) {
                    for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                        builderUrl.header(entry.getKey(), entry.getValue());
                    }
                }
                HowToHideActivity.this.c1("requestHeader ", requestHeaders);
                Response responseExecute = ((okhttp3.internal.connection.e) this.f167974a.a(builderUrl.build())).execute();
                HashMap map = new HashMap();
                for (String str4 : responseExecute.f225297f.o()) {
                    Log.d(HowToHideActivity.f167972a, "response header " + str4 + " : " + responseExecute.T0(str4));
                    map.put(str4, responseExecute.X0(str4, null));
                }
                String strX0 = responseExecute.X0("Content-Type", null);
                okhttp3.q qVarJ = okhttp3.q.j(strX0);
                String strX02 = responseExecute.X0("Content-Encoding", null);
                if (qVarJ != null) {
                    String str5 = qVarJ.f225820b + RemoteSettings.FORWARD_SLASH_STRING + qVarJ.f225821c;
                    Charset charsetG = okhttp3.q.g(qVarJ, null, 1, null);
                    if (charsetG != null) {
                        string = charsetG.toString();
                        str = strX02;
                        str2 = str5;
                    } else {
                        str = strX02;
                        str2 = str5;
                        string = null;
                    }
                } else {
                    string = null;
                    str = strX02;
                    str2 = null;
                }
                int i10 = responseExecute.f225295d;
                if (!strX0.startsWith("text/html")) {
                    str3 = strX0;
                }
                Log.d(HowToHideActivity.f167972a, "ddmime: " + str2 + " charset: " + string + " ct: " + str3 + " ce:" + str + " code:" + i10 + " phrase:" + responseExecute.f225294c);
                String str6 = responseExecute.f225294c;
                if (str6 == null) {
                    str6 = "null";
                }
                if (str6.length() == 0) {
                    str6 = "Empty";
                }
                return new WebResourceResponse(str2, string, i10, str6, map, responseExecute.f225298g.d());
            } catch (Exception e10) {
                Log.e(HowToHideActivity.f167972a, "ok http err" + e10, e10);
                return null;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, webResourceRequest);
            Uri url = webResourceRequest.getUrl();
            if ("snssdk1128".equalsIgnoreCase(url.getScheme())) {
                Intent intent = new Intent("android.intent.action.VIEW", url);
                intent.setFlags(4194304);
                webView.getContext().startActivity(intent);
                zShouldOverrideUrlLoading = true;
            }
            Log.d(HowToHideActivity.f167972a, "shouldOverrideUrlLoading request:" + webResourceRequest.getUrl() + " return" + zShouldOverrideUrlLoading);
            return zShouldOverrideUrlLoading;
        }
    }

    public final void X0(Activity activity) {
        Window window = activity.getWindow();
        window.addFlags(67108864);
        window.getDecorView().setFitsSystemWindows(true);
        window.setNavigationBarColor(activity.getResources().getColor(R.color.transparent));
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        window.addFlags(16777216);
    }

    public final View Y0(Context context, String str) {
        View viewInflate = LayoutInflater.from(context).inflate(com.app.hider.master.promax.R.layout.hider_activity_guide_video, (ViewGroup) null);
        WebView webView = (WebView) viewInflate.findViewById(com.app.hider.master.promax.R.id.wv_content);
        new HashMap().put("X-Requested-With", "com.android.browser");
        webView.setWebViewClient(new b(new OkHttpClient()));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setLoadWithOverviewMode(true);
        Log.d(f167972a, "ua:" + settings.getUserAgentString());
        webView.loadUrl(str);
        return viewInflate;
    }

    public final View Z0(Context context) {
        String string = context.getString(com.app.hider.master.promax.R.string.hider_video_guide_url);
        if (string.isEmpty()) {
            return null;
        }
        return Y0(context, string);
    }

    public final void a1() {
        ViewPager viewPager = (ViewPager) findViewById(com.app.hider.master.promax.R.id.pager);
        getLayoutInflater();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        View viewInflate = layoutInflaterFrom.inflate(com.app.hider.master.promax.R.layout.hider_activity_guide1, (ViewGroup) null);
        View viewInflate2 = layoutInflaterFrom.inflate(com.app.hider.master.promax.R.layout.hider_activity_guide2, (ViewGroup) null);
        View viewInflate3 = layoutInflaterFrom.inflate(com.app.hider.master.promax.R.layout.hider_activity_guide3, (ViewGroup) null);
        View viewZ0 = Z0(this);
        ArrayList arrayList = new ArrayList(3);
        if (viewZ0 != null) {
            arrayList.add(viewZ0);
        }
        arrayList.add(viewInflate);
        arrayList.add(viewInflate2);
        arrayList.add(viewInflate3);
        viewInflate3.findViewById(com.app.hider.master.promax.R.id.guide_done).setOnClickListener(new View.OnClickListener() { // from class: com.prism.hider.ui.B
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167910a.finish();
            }
        });
        ViewPagerIndicator viewPagerIndicator = (ViewPagerIndicator) findViewById(com.app.hider.master.promax.R.id.indicator);
        viewPager.setAdapter(new C5.a(arrayList));
        viewPagerIndicator.u(viewPager);
        viewPager.setCurrentItem(0);
        viewPager.setOnPageChangeListener(new a());
    }

    public final /* synthetic */ void b1(View view) {
        finish();
    }

    public final void c1(String str, Map<String, String> map) {
        if (map == null) {
            Log.d(f167972a, str + " logHeaders null");
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String str2 = f167972a;
            StringBuilder sbA = android.support.v4.media.f.a(str, " logHeaders ");
            sbA.append(entry.getKey());
            sbA.append(" : ");
            sbA.append(entry.getValue());
            Log.d(str2, sbA.toString());
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.app.hider.master.promax.R.layout.hider_activity_how_to_hide);
        X0(this);
        a1();
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
