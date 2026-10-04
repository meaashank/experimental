package com.inmobi.media;

import F5.ViewOnTouchListenerC1038a3;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import com.inmobi.media.C3781wa;

/* JADX INFO: renamed from: com.inmobi.media.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3781wa extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3809ya f153509a;

    public C3781wa(GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya) {
        this.f153509a = gestureDetectorOnGestureListenerC3809ya;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final void b(JsResult result, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.G.p(result, "$result");
        result.confirm();
    }

    public static final void c(JsResult result, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.G.p(result, "$result");
        result.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : defaultVideoPoster;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage cm) {
        kotlin.jvm.internal.G.p(cm, "cm");
        String str = cm.message() + " -- From line " + cm.lineNumber() + " of " + cm.sourceId();
        N4 n42 = this.f153509a.f153620i;
        if (n42 == null) {
            return true;
        }
        String str2 = GestureDetectorOnGestureListenerC3809ya.f153566Q0;
        ((O4) n42).c(str2, P5.a(str2, "access$getTAG$cp(...)", "Console message:", str));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(final String origin, final GeolocationPermissions.Callback callback) {
        kotlin.jvm.internal.G.p(origin, "origin");
        kotlin.jvm.internal.G.p(callback, "callback");
        if (this.f153509a.f153626l.get() != null) {
            new AlertDialog.Builder((Context) this.f153509a.f153626l.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: F5.X2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    C3781wa.a(callback, origin, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: F5.Y2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    C3781wa.b(callback, origin, dialogInterface, i10);
                }
            }).create().show();
        }
        super.onGeolocationPermissionsShowPrompt(origin, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        a();
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView view, String url, String message, final JsResult result) {
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(message, "message");
        kotlin.jvm.internal.G.p(result, "result");
        N4 n42 = this.f153509a.f153620i;
        if (n42 != null) {
            String str = GestureDetectorOnGestureListenerC3809ya.f153566Q0;
            kotlin.jvm.internal.G.o(str, "access$getTAG$cp(...)");
            ((O4) n42).a(str, "jsAlert called with: " + message + url);
        }
        if (!GestureDetectorOnGestureListenerC3809ya.a(this.f153509a, result)) {
            return true;
        }
        Activity fullScreenActivity = this.f153509a.getFullScreenActivity();
        if (fullScreenActivity != null) {
            new AlertDialog.Builder(fullScreenActivity).setMessage(message).setTitle(url).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: F5.Z2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    C3781wa.a(result, dialogInterface, i10);
                }
            }).setCancelable(false).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView view, String url, String message, final JsResult result) {
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(message, "message");
        kotlin.jvm.internal.G.p(result, "result");
        N4 n42 = this.f153509a.f153620i;
        if (n42 != null) {
            String str = GestureDetectorOnGestureListenerC3809ya.f153566Q0;
            kotlin.jvm.internal.G.o(str, "access$getTAG$cp(...)");
            ((O4) n42).a(str, "jsConfirm called with: " + message + url);
        }
        if (!GestureDetectorOnGestureListenerC3809ya.a(this.f153509a, result)) {
            return true;
        }
        if (this.f153509a.getFullScreenActivity() != null) {
            new AlertDialog.Builder(this.f153509a.getFullScreenActivity()).setMessage(message).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: F5.c3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    C3781wa.b(result, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: F5.d3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    C3781wa.c(result, dialogInterface, i10);
                }
            }).create().show();
            return true;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(message, "message");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        kotlin.jvm.internal.G.p(result, "result");
        N4 n42 = this.f153509a.f153620i;
        if (n42 != null) {
            String str = GestureDetectorOnGestureListenerC3809ya.f153566Q0;
            kotlin.jvm.internal.G.o(str, "access$getTAG$cp(...)");
            ((O4) n42).a(str, "jsPrompt called with: " + message + url);
        }
        if (!GestureDetectorOnGestureListenerC3809ya.a(this.f153509a, result)) {
            return true;
        }
        if (this.f153509a.getFullScreenActivity() != null) {
            return false;
        }
        result.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        N4 n42 = this.f153509a.f153620i;
        if (n42 != null) {
            String str = GestureDetectorOnGestureListenerC3809ya.f153566Q0;
            kotlin.jvm.internal.G.o(str, "access$getTAG$cp(...)");
            ((O4) n42).c(str, "webview progress changed - " + i10);
        }
        super.onProgressChanged(webView, i10);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(callback, "callback");
        if (this.f153509a.f153626l.get() != null) {
            GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya = this.f153509a;
            gestureDetectorOnGestureListenerC3809ya.f153594N = view;
            gestureDetectorOnGestureListenerC3809ya.f153596O = callback;
            view.setOnTouchListener(new ViewOnTouchListenerC1038a3());
            Activity activity = (Activity) this.f153509a.f153626l.get();
            FrameLayout frameLayout = activity != null ? (FrameLayout) activity.findViewById(R.id.content) : null;
            View view2 = this.f153509a.f153594N;
            if (view2 != null) {
                view2.setBackgroundColor(-16777216);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.f153509a.f153594N, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
            }
            View view3 = this.f153509a.f153594N;
            if (view3 != null) {
                view3.requestFocus();
            }
            final GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya2 = this.f153509a;
            View view4 = gestureDetectorOnGestureListenerC3809ya2.f153594N;
            View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: F5.b3
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view5, int i10, KeyEvent keyEvent) {
                    return C3781wa.a(gestureDetectorOnGestureListenerC3809ya2, this, view5, i10, keyEvent);
                }
            };
            if (view4 != null) {
                view4.setOnKeyListener(onKeyListener);
            }
            if (view4 != null) {
                view4.setFocusable(true);
            }
            if (view4 != null) {
                view4.setFocusableInTouchMode(true);
            }
            if (view4 != null) {
                view4.requestFocus();
            }
        }
    }

    public static final void a(JsResult result, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.G.p(result, "$result");
        result.confirm();
    }

    public static final void b(GeolocationPermissions.Callback callback, String origin, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.G.p(callback, "$callback");
        kotlin.jvm.internal.G.p(origin, "$origin");
        callback.invoke(origin, false, false);
    }

    public static final boolean a(GestureDetectorOnGestureListenerC3809ya this$0, C3781wa this$1, View view, int i10, KeyEvent keyEvent) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(this$1, "this$1");
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
            return false;
        }
        N4 n42 = this$0.f153620i;
        if (n42 != null) {
            String str = GestureDetectorOnGestureListenerC3809ya.f153566Q0;
            kotlin.jvm.internal.G.o(str, "access$getTAG$cp(...)");
            ((O4) n42).a(str, "Back pressed when HTML5 video is playing.");
        }
        this$1.a();
        return true;
    }

    public final void a() {
        GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya = this.f153509a;
        if (gestureDetectorOnGestureListenerC3809ya.f153594N == null) {
            return;
        }
        WebChromeClient.CustomViewCallback customViewCallback = gestureDetectorOnGestureListenerC3809ya.f153596O;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya2 = this.f153509a;
        gestureDetectorOnGestureListenerC3809ya2.f153596O = null;
        View view = gestureDetectorOnGestureListenerC3809ya2.f153594N;
        if ((view != null ? view.getParent() : null) != null) {
            View view2 = this.f153509a.f153594N;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f153509a.f153594N);
            }
            this.f153509a.f153594N = null;
        }
    }

    public static final void a(GeolocationPermissions.Callback callback, String origin, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.G.p(callback, "$callback");
        kotlin.jvm.internal.G.p(origin, "$origin");
        callback.invoke(origin, true, false);
    }
}
