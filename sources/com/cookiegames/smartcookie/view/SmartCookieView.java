package com.cookiegames.smartcookie.view;

import I2.H0;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintJob;
import android.print.PrintManager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.collection.C1520a;
import com.cookiegames.smartcookie.DeviceCapabilities;
import com.cookiegames.smartcookie.dialog.LightningDialogBuilder;
import io.reactivex.internal.functions.Functions;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.L0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.FunctionReferenceImpl;
import nc.InterfaceC5271g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p4.InterfaceC5390c;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.V({"SMAP\nSmartCookieView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartCookieView.kt\ncom/cookiegames/smartcookie/view/SmartCookieView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1005:1\n1#2:1006\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class SmartCookieView {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f148323E = 8;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public static final String f148324F = "SmartCookieView";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public static final String f148325G = "X-Requested-With";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public static final String f148326H = "X-Wap-Profile";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public static final String f148327I = "DNT";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public static final String f148328J = "Save-Data";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Inject
    public q4.c f148333A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final SmartCookieWebClient f148334B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final io.reactivex.disposables.b f148335C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Activity f148336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f148337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C3237i f148338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C3241m f148339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C3230b f148340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C3233e f148341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C3235g f148342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final InterfaceC5390c f148343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f148344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final F f148345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public WebView f148346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final S3.b f148347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final GestureDetector f148348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Paint f148349n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f148350o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f148351p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f148352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f148353r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final d f148354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final C1520a<String, String> f148355t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f148356u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Inject
    public u4.e f148357v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Inject
    public LightningDialogBuilder f148358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Inject
    public C4.n f148359x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Inject
    public hc.H f148360y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Inject
    public hc.H f148361z;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public static final a f148322D = new a();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f148329K = Build.VERSION.SDK_INT;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f148330L = C4.u.l(10.0f);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public static final float[] f148331M = {-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public static final float[] f148332N = {2.0f, 0.0f, 0.0f, 0.0f, -160.0f, 0.0f, 2.0f, 0.0f, 0.0f, -160.0f, 0.0f, 0.0f, 2.0f, 0.0f, -160.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: com.cookiegames.smartcookie.view.SmartCookieView$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ed.l<Boolean, L0> {
        public AnonymousClass1(Object obj) {
            super(1, obj, SmartCookieView.class, "setNetworkAvailable", "setNetworkAvailable(Z)V", 0);
        }

        public final void e(boolean z10) {
            ((SmartCookieView) this.receiver).q0(z10);
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ L0 invoke(Boolean bool) {
            e(bool.booleanValue());
            return L0.f217464a;
        }
    }

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public final class b extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f148362a = true;

        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(@NotNull MotionEvent e10) {
            kotlin.jvm.internal.G.p(e10, "e");
            this.f148362a = false;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(@Nullable MotionEvent motionEvent, @NotNull MotionEvent e22, float f10, float f11) {
            kotlin.jvm.internal.G.p(e22, "e2");
            int i10 = (int) ((100 * f11) / SmartCookieView.this.f148356u);
            if (i10 < -10) {
                SmartCookieView.this.f148347l.n();
            } else if (i10 > 15) {
                SmartCookieView.this.f148347l.u();
            }
            return super.onFling(motionEvent, e22, f10, f11);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(@NotNull MotionEvent e10) {
            kotlin.jvm.internal.G.p(e10, "e");
            if (this.f148362a) {
                Message messageObtainMessage = SmartCookieView.this.f148354s.obtainMessage();
                kotlin.jvm.internal.G.o(messageObtainMessage, "obtainMessage(...)");
                messageObtainMessage.setTarget(SmartCookieView.this.f148354s);
                WebView webView = SmartCookieView.this.f148346k;
                if (webView != null) {
                    webView.requestFocusNodeHref(messageObtainMessage);
                }
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(@NotNull MotionEvent e10) {
            kotlin.jvm.internal.G.p(e10, "e");
            this.f148362a = true;
        }
    }

    public final class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f148364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f148365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f148366c;

        public c() {
        }

        public final int a() {
            return this.f148366c;
        }

        public final float b() {
            return this.f148364a;
        }

        public final float c() {
            return this.f148365b;
        }

        public final void d(int i10) {
            this.f148366c = i10;
        }

        public final void e(float f10) {
            this.f148364a = f10;
        }

        public final void f(float f10) {
            this.f148365b = f10;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(@Nullable View view, @NotNull MotionEvent arg1) {
            kotlin.jvm.internal.G.p(arg1, "arg1");
            if (view == null) {
                return false;
            }
            if (!view.hasFocus()) {
                view.requestFocus();
            }
            this.f148366c = arg1.getAction();
            float y10 = arg1.getY();
            this.f148365b = y10;
            int i10 = this.f148366c;
            if (i10 == 0) {
                this.f148364a = y10;
            } else if (i10 == 1) {
                float f10 = y10 - this.f148364a;
                if (f10 > SmartCookieView.f148330L && view.getScrollY() < SmartCookieView.f148330L) {
                    SmartCookieView.this.f148347l.u();
                } else if (f10 < (-SmartCookieView.f148330L)) {
                    SmartCookieView.this.f148347l.n();
                }
                this.f148364a = 0.0f;
            }
            SmartCookieView.this.f148348m.onTouchEvent(arg1);
            return false;
        }
    }

    public static final class d extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final WeakReference<SmartCookieView> f148368a;

        public d(@NotNull SmartCookieView view) {
            kotlin.jvm.internal.G.p(view, "view");
            this.f148368a = new WeakReference<>(view);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            kotlin.jvm.internal.G.p(msg, "msg");
            super.handleMessage(msg);
            Bundle data = msg.getData();
            String string = data != null ? data.getString("url") : null;
            SmartCookieView smartCookieView = this.f148368a.get();
            if (smartCookieView != null) {
                smartCookieView.a0(string);
            }
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148369a;

        static {
            int[] iArr = new int[RenderingMode.values().length];
            try {
                iArr[RenderingMode.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingMode.INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RenderingMode.GRAYSCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RenderingMode.INVERTED_GRAYSCALE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RenderingMode.INCREASE_CONTRAST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f148369a = iArr;
        }
    }

    public static final class f implements D4.a {
        public f() {
        }

        @Override // D4.a
        public void a() {
            WebView webView = SmartCookieView.this.f148346k;
            if (webView != null) {
                webView.findNext(true);
            }
        }

        @Override // D4.a
        public void b() {
            WebView webView = SmartCookieView.this.f148346k;
            if (webView != null) {
                webView.clearMatches();
            }
        }

        @Override // D4.a
        public void c() {
            WebView webView = SmartCookieView.this.f148346k;
            if (webView != null) {
                webView.findNext(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SmartCookieView(@NotNull Activity activity, @NotNull r0 tabInitializer, boolean z10, @NotNull C3237i homePageInitializer, @NotNull C3241m incognitoPageInitializer, @NotNull C3230b bookmarkPageInitializer, @NotNull C3233e downloadPageInitializer, @NotNull C3235g historyPageInitializer, @NotNull InterfaceC5390c logger) {
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(tabInitializer, "tabInitializer");
        kotlin.jvm.internal.G.p(homePageInitializer, "homePageInitializer");
        kotlin.jvm.internal.G.p(incognitoPageInitializer, "incognitoPageInitializer");
        kotlin.jvm.internal.G.p(bookmarkPageInitializer, "bookmarkPageInitializer");
        kotlin.jvm.internal.G.p(downloadPageInitializer, "downloadPageInitializer");
        kotlin.jvm.internal.G.p(historyPageInitializer, "historyPageInitializer");
        kotlin.jvm.internal.G.p(logger, "logger");
        this.f148336a = activity;
        this.f148337b = z10;
        this.f148338c = homePageInitializer;
        this.f148339d = incognitoPageInitializer;
        this.f148340e = bookmarkPageInitializer;
        this.f148341f = downloadPageInitializer;
        this.f148342g = historyPageInitializer;
        this.f148343h = logger;
        int iGenerateViewId = View.generateViewId();
        this.f148344i = iGenerateViewId;
        this.f148349n = new Paint();
        this.f148354s = new d(this);
        C1520a<String, String> c1520a = new C1520a<>();
        this.f148355t = c1520a;
        com.cookiegames.smartcookie.di.K.b(activity).h(this);
        this.f148347l = (S3.b) activity;
        this.f148345j = new F(activity);
        this.f148356u = ViewConfiguration.get(activity).getScaledMaximumFlingVelocity();
        SmartCookieWebClient smartCookieWebClient = new SmartCookieWebClient(activity, this);
        this.f148334B = smartCookieWebClient;
        this.f148348m = new GestureDetector(activity, new b());
        WebView webView = new WebView(activity);
        this.f148346k = webView;
        webView.setId(iGenerateViewId);
        webView.setFocusableInTouchMode(true);
        webView.setFocusable(true);
        int i10 = Build.VERSION.SDK_INT;
        webView.setBackgroundColor(-1);
        if (i10 >= 26) {
            webView.setImportantForAutofill(1);
        }
        webView.setScrollbarFadingEnabled(true);
        webView.setSaveEnabled(true);
        webView.setNetworkAvailable(true);
        webView.setWebChromeClient(new SmartCookieChromeClient(activity, this));
        webView.setWebViewClient(smartCookieWebClient);
        webView.setDownloadListener(new com.cookiegames.smartcookie.download.i(activity));
        webView.setOnTouchListener(new c());
        O(webView);
        N();
        tabInitializer.a(webView, c1520a);
        hc.z<Boolean> zVarV3 = x().c().V3(w());
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this);
        this.f148335C = zVarV3.B5(new InterfaceC5271g() { // from class: com.cookiegames.smartcookie.view.D
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                SmartCookieView.a(anonymousClass1, obj);
            }
        }, Functions.f202952f, Functions.f202949c, Functions.f202950d);
        if (H0.d("FORCE_DARK") && J().r()) {
            WebView webView2 = this.f148346k;
            kotlin.jvm.internal.G.m(webView2);
            H2.s.u(webView2.getSettings(), 2);
        }
    }

    public static final L0 P(WebSettings webSettings, File file) {
        webSettings.setGeolocationDatabasePath(file.getPath());
        return L0.f217464a;
    }

    public static final void Q(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static void a(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static void b(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void e(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final File z(SmartCookieView smartCookieView, String str) {
        return smartCookieView.f148336a.getDir(str, 0);
    }

    public final int A() {
        WebView webView = this.f148346k;
        if (webView != null) {
            return webView.getProgress();
        }
        return 100;
    }

    public final void A0(boolean z10) {
        this.f148334B.f148385L = z10;
    }

    @NotNull
    public final C4.n B() {
        C4.n nVar = this.f148359x;
        if (nVar != null) {
            return nVar;
        }
        kotlin.jvm.internal.G.S("proxyUtils");
        throw null;
    }

    public final void B0(@NotNull WebView view, @NotNull String requestUrl) {
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(requestUrl, "requestUrl");
    }

    @NotNull
    public final C1520a<String, String> C() {
        return this.f148355t;
    }

    @NotNull
    public final hc.z<B4.e> C0() {
        return this.f148334B.k1();
    }

    @Nullable
    public final SslCertificate D() {
        WebView webView = this.f148346k;
        if (webView != null) {
            return webView.getCertificate();
        }
        return null;
    }

    public final void D0() {
        WebView webView = this.f148346k;
        if (webView != null) {
            webView.stopLoading();
        }
    }

    @NotNull
    public final String E() {
        String str = this.f148345j.f148286b;
        return str == null ? "" : str;
    }

    public final void E0() {
        WebSettings settings;
        WebView webView = this.f148346k;
        if (webView != null && (settings = webView.getSettings()) != null) {
            settings.setUserAgentString(R3.a.f67723a);
        }
        this.f148353r = !this.f148353r;
    }

    @NotNull
    public final F F() {
        return this.f148345j;
    }

    public final boolean G() {
        return this.f148353r;
    }

    @NotNull
    public final String H() {
        String url;
        WebView webView = this.f148346k;
        return (webView == null || (url = webView.getUrl()) == null) ? "" : url;
    }

    public final String I() {
        WebSettings settings;
        String userAgentString;
        WebView webView = this.f148346k;
        return (webView == null || (settings = webView.getSettings()) == null || (userAgentString = settings.getUserAgentString()) == null) ? "" : userAgentString;
    }

    @NotNull
    public final u4.e J() {
        u4.e eVar = this.f148357v;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.G.S("userPreferences");
        throw null;
    }

    @Nullable
    public final WebView K() {
        return this.f148346k;
    }

    public final void L() {
        if (!kotlin.text.M.p3(H(), R3.a.f67732j, false, 2, null)) {
            WebView webView = this.f148346k;
            if (webView != null) {
                webView.goBack();
                return;
            }
            return;
        }
        WebView webView2 = this.f148346k;
        if (webView2 != null) {
            webView2.goBack();
        }
        WebView webView3 = this.f148346k;
        if (webView3 != null) {
            webView3.goBack();
        }
    }

    public final void M() {
        WebView webView = this.f148346k;
        if (webView != null) {
            webView.goForward();
        }
    }

    @SuppressLint({"NewApi", "SetJavaScriptEnabled"})
    public final void N() {
        WebSettings settings;
        int i10;
        WebView webView = this.f148346k;
        if (webView == null || (settings = webView.getSettings()) == null) {
            return;
        }
        this.f148334B.m1();
        if (!J().s() && !J().E0()) {
            J().B0();
        }
        if (J().s()) {
            this.f148355t.put("DNT", "1");
        } else {
            this.f148355t.remove("DNT");
        }
        if (J().E0()) {
            this.f148355t.put("Save-Data", kotlinx.coroutines.N.f218776d);
        } else {
            this.f148355t.remove("Save-Data");
        }
        if (J().B0()) {
            this.f148355t.put("X-Requested-With", "");
            this.f148355t.put(f148326H, "");
        } else {
            this.f148355t.remove("X-Requested-With");
            this.f148355t.remove(f148326H);
        }
        settings.setDefaultTextEncodingName(J().U0());
        k0(J().C0());
        if (this.f148337b) {
            settings.setGeolocationEnabled(false);
        } else {
            settings.setGeolocationEnabled(J().k0());
        }
        x0(J());
        settings.setSaveFormData(J().F0() && !this.f148337b);
        if (J().P()) {
            settings.setJavaScriptEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
        } else {
            settings.setJavaScriptEnabled(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
        }
        if (J().V0()) {
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            try {
                settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
            } catch (Exception unused) {
                this.f148343h.log(f148324F, "Problem setting LayoutAlgorithm to TEXT_AUTOSIZING");
            }
        } else {
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        }
        settings.setBlockNetworkImage(J().c());
        settings.setSupportMultipleWindows(J().v0());
        settings.setUseWideViewPort(false);
        settings.setLoadWithOverviewMode(J().q0());
        switch (J().W0()) {
            case 0:
                i10 = 200;
                break;
            case 1:
                i10 = 150;
                break;
            case 2:
                i10 = 125;
                break;
            case 3:
                i10 = 100;
                break;
            case 4:
                i10 = 75;
                break;
            case 5:
                i10 = 50;
                break;
            case 6:
                i10 = 25;
                break;
            case 7:
                i10 = 20;
                break;
            default:
                throw new IllegalArgumentException("Unsupported text size");
        }
        settings.setTextZoom(i10);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f148346k, !J().f());
    }

    @SuppressLint({"NewApi"})
    public final void O(WebView webView) {
        final WebSettings settings = webView.getSettings();
        settings.setMediaPlaybackRequiresUserGesture(true);
        int i10 = f148329K;
        if (i10 >= 21 && !this.f148337b) {
            settings.setMixedContentMode(2);
        } else if (i10 >= 21) {
            settings.setMixedContentMode(1);
        }
        if (!this.f148337b || com.cookiegames.smartcookie.l.a(DeviceCapabilities.FULL_INCOGNITO)) {
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setCacheMode(-1);
        } else {
            settings.setDomStorageEnabled(false);
            settings.setDatabaseEnabled(false);
            settings.setCacheMode(2);
        }
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (Build.VERSION.SDK_INT < 24) {
            hc.I<File> iE0 = y("geolocation").Z0(r()).E0(w());
            final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.view.B
                @Override // ed.l
                public final Object invoke(Object obj) {
                    return SmartCookieView.P(settings, (File) obj);
                }
            };
            iE0.X0(new InterfaceC5271g() { // from class: com.cookiegames.smartcookie.view.C
                @Override // nc.InterfaceC5271g
                public final void accept(Object obj) {
                    SmartCookieView.b(lVar, obj);
                }
            }, Functions.f202952f);
        }
    }

    public final boolean R() {
        return this.f148351p;
    }

    public final boolean S() {
        return this.f148337b;
    }

    public final boolean T() {
        return this.f148350o;
    }

    public final boolean U() {
        WebView webView = this.f148346k;
        return webView != null && webView.isShown();
    }

    public final void V() {
        f0(this.f148340e);
    }

    public final void W() {
        f0(this.f148341f);
    }

    public final void X() {
        f0(this.f148342g);
    }

    public final void Y() {
        if (this.f148337b) {
            f0(this.f148339d);
        } else {
            f0(this.f148338c);
        }
    }

    public final void Z(@NotNull String url) {
        WebView webView;
        kotlin.jvm.internal.G.p(url, "url");
        if (B().d(this.f148336a) && (webView = this.f148346k) != null) {
            webView.loadUrl(url, this.f148355t);
        }
    }

    public final void a0(String str) {
        WebView webView = this.f148346k;
        WebView.HitTestResult hitTestResult = webView != null ? webView.getHitTestResult() : null;
        WebView webView2 = this.f148346k;
        String url = webView2 != null ? webView2.getUrl() : null;
        String extra = hitTestResult != null ? hitTestResult.getExtra() : null;
        if (url != null && C4.s.d(url)) {
            if (C4.s.a(url)) {
                if (str != null) {
                    s().r0(this.f148336a, this.f148347l, str);
                    return;
                } else {
                    if (extra != null) {
                        s().r0(this.f148336a, this.f148347l, extra);
                        return;
                    }
                    return;
                }
            }
            if (C4.s.b(url)) {
                if (str != null) {
                    s().D0(this.f148336a, this.f148347l, str);
                    return;
                } else {
                    if (extra != null) {
                        s().D0(this.f148336a, this.f148347l, extra);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (str == null) {
            if (extra != null) {
                if (hitTestResult.getType() != 8 && hitTestResult.getType() != 5) {
                    s().k0(this.f148336a, this.f148347l, extra);
                    return;
                }
                LightningDialogBuilder lightningDialogBuilderS = s();
                Activity activity = this.f148336a;
                S3.b bVar = this.f148347l;
                String extra2 = hitTestResult.getExtra();
                kotlin.jvm.internal.G.m(extra2);
                lightningDialogBuilderS.d0(activity, bVar, extra, extra2, I());
                return;
            }
            return;
        }
        if (hitTestResult == null) {
            s().k0(this.f148336a, this.f148347l, str);
            return;
        }
        if (hitTestResult.getType() != 8 && hitTestResult.getType() != 5) {
            s().k0(this.f148336a, this.f148347l, str);
            return;
        }
        LightningDialogBuilder lightningDialogBuilderS2 = s();
        Activity activity2 = this.f148336a;
        S3.b bVar2 = this.f148347l;
        String extra3 = hitTestResult.getExtra();
        kotlin.jvm.internal.G.m(extra3);
        lightningDialogBuilderS2.d0(activity2, bVar2, str, extra3, I());
    }

    public final void b0() {
        this.f148335C.dispose();
        WebView webView = this.f148346k;
        if (webView != null) {
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                this.f148343h.log(f148324F, "WebView was not detached from window before onDestroy");
                viewGroup.removeView(this.f148346k);
            }
            webView.stopLoading();
            webView.onPause();
            webView.clearHistory();
            webView.setVisibility(8);
            webView.removeAllViews();
            webView.destroyDrawingCache();
            webView.destroy();
            this.f148346k = null;
        }
    }

    public final void c0() {
        WebView webView = this.f148346k;
        if (webView != null) {
            webView.onPause();
        }
        InterfaceC5390c interfaceC5390c = this.f148343h;
        WebView webView2 = this.f148346k;
        interfaceC5390c.log(f148324F, "WebView onPause: " + (webView2 != null ? Integer.valueOf(webView2.getId()) : null));
    }

    public final void d0() {
        WebView webView = this.f148346k;
        if (webView != null) {
            webView.onResume();
        }
        InterfaceC5390c interfaceC5390c = this.f148343h;
        WebView webView2 = this.f148346k;
        interfaceC5390c.log(f148324F, "WebView onResume: " + (webView2 != null ? Integer.valueOf(webView2.getId()) : null));
    }

    public final void e0() {
        WebView webView = this.f148346k;
        if (webView != null) {
            webView.pauseTimers();
        }
        this.f148343h.log(f148324F, "Pausing JS timers");
    }

    public final void f0(r0 r0Var) {
        WebView webView = this.f148346k;
        if (webView != null) {
            r0Var.a(webView, this.f148355t);
        }
    }

    public final void g0() {
        if (B().d(this.f148336a)) {
            this.f148334B.L0(this.f148346k);
        }
    }

    public final void h0() {
        WebView webView;
        WebView webView2 = this.f148346k;
        if (webView2 == null || webView2.hasFocus() || (webView = this.f148346k) == null) {
            return;
        }
        webView.requestFocus();
    }

    public final void i0() {
        WebView webView = this.f148346k;
        if (webView != null) {
            webView.resumeTimers();
        }
        this.f148343h.log(f148324F, "Resuming JS timers");
    }

    @NotNull
    public final Bundle j0() {
        Bundle bundle = new Bundle(ClassLoader.getSystemClassLoader());
        WebView webView = this.f148346k;
        if (webView != null) {
            webView.saveState(bundle);
        }
        return bundle;
    }

    public final void k0(RenderingMode renderingMode) {
        this.f148352q = false;
        int i10 = e.f148369a[renderingMode.ordinal()];
        if (i10 == 1) {
            this.f148349n.setColorFilter(null);
            t0();
            this.f148352q = false;
            return;
        }
        if (i10 == 2) {
            this.f148349n.setColorFilter(new ColorMatrixColorFilter(f148331M));
            o0();
            this.f148352q = true;
            return;
        }
        if (i10 == 3) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.f148349n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            o0();
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            this.f148349n.setColorFilter(new ColorMatrixColorFilter(f148332N));
            o0();
            return;
        }
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.set(f148331M);
        ColorMatrix colorMatrix3 = new ColorMatrix();
        colorMatrix3.setSaturation(0.0f);
        ColorMatrix colorMatrix4 = new ColorMatrix();
        colorMatrix4.setConcat(colorMatrix2, colorMatrix3);
        this.f148349n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
        o0();
        this.f148352q = true;
    }

    public final void l0(@NotNull hc.H h10) {
        kotlin.jvm.internal.G.p(h10, "<set-?>");
        this.f148360y = h10;
    }

    public final boolean m() {
        WebView webView = this.f148346k;
        return webView != null && webView.canGoBack();
    }

    public final void m0(@NotNull LightningDialogBuilder lightningDialogBuilder) {
        kotlin.jvm.internal.G.p(lightningDialogBuilder, "<set-?>");
        this.f148358w = lightningDialogBuilder;
    }

    public final boolean n() {
        WebView webView = this.f148346k;
        return webView != null && webView.canGoForward();
    }

    public final void n0(boolean z10) {
        this.f148351p = z10;
        this.f148347l.T(this);
    }

    public final void o(@NotNull WebView webView) {
        kotlin.jvm.internal.G.p(webView, "webView");
        Object systemService = this.f148336a.getSystemService("print");
        kotlin.jvm.internal.G.n(systemService, "null cannot be cast to non-null type android.print.PrintManager");
        PrintDocumentAdapter printDocumentAdapterCreatePrintDocumentAdapter = webView.createPrintDocumentAdapter();
        kotlin.jvm.internal.G.o(printDocumentAdapterCreatePrintDocumentAdapter, "createPrintDocumentAdapter(...)");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setMediaSize(PrintAttributes.MediaSize.ISO_A5);
        PrintJob printJobPrint = ((PrintManager) systemService).print(" Document", printDocumentAdapterCreatePrintDocumentAdapter, builder.build());
        kotlin.jvm.internal.G.o(printJobPrint, "print(...)");
        if (printJobPrint.isCompleted()) {
            Toast.makeText(this.f148336a, R.string.yes, 1).show();
        } else if (printJobPrint.isFailed()) {
            Toast.makeText(this.f148336a, R.string.no, 1).show();
        }
    }

    public final void o0() {
        WebView webView = this.f148346k;
        if (webView != null) {
            webView.setLayerType(2, this.f148349n);
        }
    }

    @NotNull
    public final B4.e p() {
        return this.f148334B.f148384K;
    }

    public final void p0(@NotNull hc.H h10) {
        kotlin.jvm.internal.G.p(h10, "<set-?>");
        this.f148361z = h10;
    }

    @SuppressLint({"NewApi"})
    @NotNull
    public final D4.a q(@NotNull String text) {
        kotlin.jvm.internal.G.p(text, "text");
        WebView webView = this.f148346k;
        if (webView != null) {
            webView.findAllAsync(text);
        }
        return new f();
    }

    public final void q0(boolean z10) {
        WebView webView = this.f148346k;
        if (webView != null) {
            webView.setNetworkAvailable(z10);
        }
    }

    @NotNull
    public final hc.H r() {
        hc.H h10 = this.f148360y;
        if (h10 != null) {
            return h10;
        }
        kotlin.jvm.internal.G.S("databaseScheduler");
        throw null;
    }

    public final void r0(@NotNull q4.c cVar) {
        kotlin.jvm.internal.G.p(cVar, "<set-?>");
        this.f148333A = cVar;
    }

    @NotNull
    public final LightningDialogBuilder s() {
        LightningDialogBuilder lightningDialogBuilder = this.f148358w;
        if (lightningDialogBuilder != null) {
            return lightningDialogBuilder;
        }
        kotlin.jvm.internal.G.S("dialogBuilder");
        throw null;
    }

    public final void s0(boolean z10) {
        this.f148350o = z10;
    }

    @Nullable
    public final Bitmap t() {
        return this.f148345j.f148285a;
    }

    public final void t0() {
        WebView webView = this.f148346k;
        if (webView != null) {
            webView.setLayerType(0, null);
        }
    }

    public final int u() {
        return this.f148344i;
    }

    public final void u0(@NotNull C4.n nVar) {
        kotlin.jvm.internal.G.p(nVar, "<set-?>");
        this.f148359x = nVar;
    }

    public final boolean v() {
        return this.f148352q;
    }

    public final void v0() {
        WebView webView = this.f148346k;
        if (webView != null) {
            webView.setLayerType(1, null);
        }
    }

    @NotNull
    public final hc.H w() {
        hc.H h10 = this.f148361z;
        if (h10 != null) {
            return h10;
        }
        kotlin.jvm.internal.G.S("mainScheduler");
        throw null;
    }

    public final void w0(boolean z10) {
        this.f148353r = z10;
    }

    @NotNull
    public final q4.c x() {
        q4.c cVar = this.f148333A;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.G.S("networkConnectivityModel");
        throw null;
    }

    public final void x0(u4.e eVar) {
        WebSettings settings;
        WebView webView = this.f148346k;
        if (webView == null || (settings = webView.getSettings()) == null) {
            return;
        }
        settings.setUserAgentString(R3.a.f67723a);
    }

    public final hc.I<File> y(final String str) {
        return hc.I.f0(new Callable() { // from class: com.cookiegames.smartcookie.view.E
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SmartCookieView.z(this.f148282a, str);
            }
        });
    }

    public final void y0(@NotNull u4.e eVar) {
        kotlin.jvm.internal.G.p(eVar, "<set-?>");
        this.f148357v = eVar;
    }

    public final void z0(int i10) {
        WebView webView = this.f148346k;
        if (webView != null) {
            webView.setVisibility(i10);
        }
    }
}
