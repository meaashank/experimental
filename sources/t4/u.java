package t4;

import B0.C0920d;
import T3.a;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import c4.C2902i;
import c4.C2903j;
import com.cookiegames.smartcookie.AppTheme;
import com.cookiegames.smartcookie.IncognitoActivity;
import com.cookiegames.smartcookie.browser.C;
import com.cookiegames.smartcookie.browser.JavaScriptChoice;
import com.cookiegames.smartcookie.browser.activity.BrowserActivity;
import com.cookiegames.smartcookie.di.K;
import com.cookiegames.smartcookie.dialog.LightningDialogBuilder;
import com.cookiegames.smartcookie.history.HistoryActivity;
import com.cookiegames.smartcookie.p;
import com.cookiegames.smartcookie.reading.activity.ReadingActivity;
import com.cookiegames.smartcookie.settings.activity.SettingsActivity;
import com.cookiegames.smartcookie.view.SmartCookieView;
import com.github.ahmadaghazadeh.editor.widget.CodeEditor;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import d4.C4297a;
import ed.InterfaceC4376a;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import javax.inject.Inject;
import jd.C4806d;
import kotlin.L0;
import kotlin.collections.EmptyList;
import kotlin.collections.I;
import kotlin.collections.N;
import kotlin.collections.U;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.F;
import kotlin.text.M;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.y;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nPopUpClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopUpClass.kt\ncom/cookiegames/smartcookie/popup/PopUpClass\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ContextExtensions.kt\ncom/cookiegames/smartcookie/extensions/ContextExtensionsKt\n*L\n1#1,414:1\n1855#2,2:415\n731#2,9:418\n731#2,9:429\n1#3:417\n37#4,2:427\n37#4,2:438\n41#5:440\n41#5:441\n41#5:442\n41#5:443\n41#5:444\n25#5:445\n41#5:446\n*S KotlinDebug\n*F\n+ 1 PopUpClass.kt\ncom/cookiegames/smartcookie/popup/PopUpClass\n*L\n311#1:415,2\n259#1:418,9\n261#1:429,9\n259#1:427,2\n261#1:438,2\n272#1:440\n282#1:441\n296#1:442\n320#1:443\n349#1:444\n350#1:445\n361#1:446\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f239198f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ListView f239199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public S3.b f239200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Inject
    public u4.e f239201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Inject
    public C f239202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Inject
    public com.cookiegames.smartcookie.adblock.allowlist.a f239203e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f239204a;

        static {
            int[] iArr = new int[AppTheme.values().length];
            try {
                iArr[AppTheme.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppTheme.BLACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f239204a = iArr;
        }
    }

    public static final void A(SmartCookieView smartCookieView, View view) {
        if (smartCookieView != null) {
            smartCookieView.M();
        }
    }

    public static final void B(BrowserActivity browserActivity, View view) {
        browserActivity.finishAndRemoveTask();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void C(List list, final u uVar, View view, final BrowserActivity browserActivity, String str, SmartCookieView smartCookieView, Intent intent, PopupWindow popupWindow, AdapterView adapterView, View view2, int i10, long j10) {
        Collection collectionO5;
        final String[] strArr;
        Collection collectionO52;
        if (list.get(i10) instanceof com.cookiegames.smartcookie.browser.h) {
            Object obj = list.get(i10);
            G.n(obj, "null cannot be cast to non-null type com.cookiegames.smartcookie.browser.MenuItemClass");
            String str2 = ((com.cookiegames.smartcookie.browser.h) obj).f141020a;
            switch (str2.hashCode()) {
                case -1731134828:
                    if (str2.equals("add_to_homepage") && smartCookieView != null && !M.Q3(smartCookieView.H()) && !C4.s.d(smartCookieView.H())) {
                        T3.d dVar = new T3.d(smartCookieView.H(), smartCookieView.E(), 0L, 4, null);
                        C4.u uVar2 = C4.u.f17587a;
                        Bitmap bitmap = smartCookieView.f148345j.f148285a;
                        if (bitmap == null) {
                            bitmap = browserActivity.f140815f0;
                            G.m(bitmap);
                        }
                        uVar2.j(browserActivity, dVar, bitmap);
                    }
                    break;
                case -1354987678:
                    if (str2.equals("exit_private")) {
                        view.getContext().startActivity(new Intent(view.getContext(), (Class<?>) BrowserActivity.class));
                        browserActivity.finish();
                    }
                    break;
                case -1319150730:
                    if (str2.equals("reading_mode") && str != null) {
                        ReadingActivity.a aVar = ReadingActivity.f147679m;
                        Context context = view.getContext();
                        G.o(context, "getContext(...)");
                        aVar.c(context, str, false);
                    }
                    break;
                case -400149830:
                    if (str2.equals("new_private_tab")) {
                        view.getContext().startActivity(new Intent(view.getContext(), (Class<?>) IncognitoActivity.class));
                    }
                    break;
                case -337400932:
                    if (str2.equals("open_in_app")) {
                        ComponentName[] componentNameArr = {new ComponentName(browserActivity, (Class<?>) BrowserActivity.class)};
                        if (Build.VERSION.SDK_INT >= 24) {
                            browserActivity.startActivity(Intent.createChooser(intent, null).putExtra("android.intent.extra.EXCLUDE_COMPONENTS", componentNameArr));
                        } else {
                            browserActivity.startActivity(intent);
                        }
                        popupWindow.dismiss();
                    }
                    break;
                case 83972323:
                    if (str2.equals("find_in_page")) {
                        browserActivity.c2();
                    }
                    break;
                case 106934957:
                    if (str2.equals("print")) {
                        G.m(smartCookieView);
                        WebView webView = smartCookieView.f148346k;
                        if (webView != null) {
                            smartCookieView.o(webView);
                        }
                    }
                    break;
                case 109400031:
                    if (str2.equals(FirebaseAnalytics.Event.SHARE)) {
                        new C4.f(browserActivity).b(str, smartCookieView != null ? smartCookieView.E() : null);
                    }
                    break;
                case 926934164:
                    if (str2.equals(Y3.f.f79134g)) {
                        view.getContext().startActivity(new Intent(view.getContext(), (Class<?>) HistoryActivity.class));
                    }
                    break;
                case 1052832078:
                    if (str2.equals("translate")) {
                        Locale locale = Resources.getSystem().getConfiguration().locale;
                        if (smartCookieView != null) {
                            smartCookieView.Z("https://www.translatetheweb.com/?from=&to=" + locale + "&dl=" + locale + "&a=" + str);
                        }
                    }
                    break;
                case 1312704747:
                    if (str2.equals("downloads") && smartCookieView != null) {
                        smartCookieView.W();
                    }
                    break;
                case 1434631203:
                    if (str2.equals("settings")) {
                        view.getContext().startActivity(new Intent(view.getContext(), (Class<?>) SettingsActivity.class));
                    }
                    break;
                case 1505434244:
                    if (str2.equals("copy_link") && str != null && !C4.s.d(str)) {
                        d4.e.a(browserActivity.j2(), str);
                        C4297a.a(browserActivity, p.s.f145455H9);
                    }
                    break;
                case 1630611499:
                    if (str2.equals("page_tools")) {
                        final SmartCookieView smartCookieView2 = browserActivity.G2().f140757n;
                        if (smartCookieView2 == null) {
                            return;
                        }
                        final boolean zC = uVar.s().c(smartCookieView2.H());
                        int i11 = zC ? p.s.f145553O2 : p.s.f145538N2;
                        String strN = uVar.u().N();
                        if (M.p3(strN, U6.j.f68738d, false, 2, null)) {
                            List<String> listR = new Regex(U6.j.f68738d).r(strN, 0);
                            if (listR.isEmpty()) {
                                collectionO52 = EmptyList.f217510a;
                                strArr = (String[]) collectionO52.toArray(new String[0]);
                            } else {
                                ListIterator<String> listIterator = listR.listIterator(listR.size());
                                while (listIterator.hasPrevious()) {
                                    if (listIterator.previous().length() != 0) {
                                        collectionO52 = U.O5(listR, listIterator.nextIndex() + 1);
                                        strArr = (String[]) collectionO52.toArray(new String[0]);
                                    }
                                }
                                collectionO52 = EmptyList.f217510a;
                                strArr = (String[]) collectionO52.toArray(new String[0]);
                            }
                        } else {
                            List<String> listR2 = new Regex(",").r(strN, 0);
                            if (listR2.isEmpty()) {
                                collectionO5 = EmptyList.f217510a;
                                strArr = (String[]) collectionO5.toArray(new String[0]);
                            } else {
                                ListIterator<String> listIterator2 = listR2.listIterator(listR2.size());
                                while (listIterator2.hasPrevious()) {
                                    if (listIterator2.previous().length() != 0) {
                                        collectionO5 = U.O5(listR2, listIterator2.nextIndex() + 1);
                                        strArr = (String[]) collectionO5.toArray(new String[0]);
                                    }
                                }
                                collectionO5 = EmptyList.f217510a;
                                strArr = (String[]) collectionO5.toArray(new String[0]);
                            }
                        }
                        int i12 = ((uVar.u().O() != JavaScriptChoice.BLACKLIST || C4.g.a(smartCookieView2.H(), strArr)) && !(uVar.u().O() == JavaScriptChoice.WHITELIST && C4.g.a(smartCookieView2.H(), strArr))) ? p.s.f145725a1 : p.s.f146039v0;
                        C2902i c2902i = C2902i.f126148a;
                        String string = browserActivity.getString(p.s.f145569P3);
                        Drawable drawable = C0920d.getDrawable(browserActivity, p.h.f143946Q1);
                        G.m(drawable);
                        C2903j c2903j = new C2903j(drawable, null, p.s.f145554O3, false, new InterfaceC4376a() { // from class: t4.e
                            @Override // ed.InterfaceC4376a
                            public final Object invoke() {
                                return u.D(browserActivity);
                            }
                        }, 10, null);
                        Drawable drawable2 = C0920d.getDrawable(browserActivity, p.h.f143868G3);
                        G.m(drawable2);
                        C2903j c2903j2 = new C2903j(drawable2, null, p.s.f146076x7, false, new InterfaceC4376a() { // from class: t4.f
                            @Override // ed.InterfaceC4376a
                            public final Object invoke() {
                                return u.E(browserActivity, smartCookieView2);
                            }
                        }, 10, null);
                        Drawable drawable3 = C0920d.getDrawable(browserActivity, p.h.f144128l4);
                        G.m(drawable3);
                        C2903j c2903j3 = new C2903j(drawable3, null, p.s.f145405E4, false, new InterfaceC4376a() { // from class: t4.g
                            @Override // ed.InterfaceC4376a
                            public final Object invoke() {
                                return u.G(smartCookieView2, browserActivity);
                            }
                        }, 10, null);
                        Drawable drawable4 = C0920d.getDrawable(browserActivity, p.h.f144184s2);
                        G.m(drawable4);
                        C2903j c2903j4 = new C2903j(drawable4, null, p.s.f145679Wb, false, new InterfaceC4376a() { // from class: t4.h
                            @Override // ed.InterfaceC4376a
                            public final Object invoke() {
                                return u.I(smartCookieView2, browserActivity);
                            }
                        }, 10, null);
                        Drawable drawable5 = C0920d.getDrawable(browserActivity, p.h.f144200u2);
                        G.m(drawable5);
                        C2903j c2903j5 = new C2903j(drawable5, zC ? Integer.valueOf(C0920d.getColor(browserActivity, p.f.f142362G1)) : null, i11, !C4.s.d(smartCookieView2.H()), new InterfaceC4376a() { // from class: t4.i
                            @Override // ed.InterfaceC4376a
                            public final Object invoke() {
                                return u.L(zC, uVar, smartCookieView2, browserActivity);
                            }
                        });
                        Drawable drawable6 = C0920d.getDrawable(browserActivity, p.h.f143938P1);
                        G.m(drawable6);
                        c2902i.y(browserActivity, string, c2903j, c2903j2, c2903j3, c2903j4, c2903j5, new C2903j(drawable6, null, i12, !C4.s.d(smartCookieView2.H()), new InterfaceC4376a() { // from class: t4.j
                            @Override // ed.InterfaceC4376a
                            public final Object invoke() {
                                return u.M(smartCookieView2, uVar, strArr, browserActivity);
                            }
                        }, 2, null));
                    }
                    break;
                case 1845545078:
                    if (str2.equals("new_tab")) {
                        S3.b bVar = uVar.f239200b;
                        G.m(bVar);
                        bVar.k();
                    }
                    break;
                case 2037187069:
                    if (str2.equals("bookmarks")) {
                        browserActivity.g3();
                    }
                    break;
            }
            popupWindow.dismiss();
        }
    }

    public static final L0 D(BrowserActivity browserActivity) {
        SmartCookieView smartCookieView = browserActivity.G2().f140757n;
        if (smartCookieView != null) {
            smartCookieView.E0();
            smartCookieView.g0();
        }
        return L0.f217464a;
    }

    public static final L0 E(BrowserActivity browserActivity, final SmartCookieView smartCookieView) {
        AlertDialog.Builder builder = new AlertDialog.Builder(browserActivity);
        LayoutInflater layoutInflater = browserActivity.getLayoutInflater();
        G.o(layoutInflater, "getLayoutInflater(...)");
        builder.setTitle(p.s.f146076x7);
        View viewInflate = layoutInflater.inflate(p.m.f145255m0, (ViewGroup) null);
        final EditText editText = (EditText) viewInflate.findViewById(p.j.f144601Z2);
        builder.setView(viewInflate);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: t4.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                u.F(smartCookieView, editText, dialogInterface, i10);
            }
        });
        builder.show();
        return L0.f217464a;
    }

    public static final void F(SmartCookieView smartCookieView, EditText editText, DialogInterface dialogInterface, int i10) {
        smartCookieView.Z("javascript:(function() {" + ((Object) editText.getText()) + "})()");
    }

    public static final L0 G(final SmartCookieView smartCookieView, BrowserActivity browserActivity) {
        CookieManager cookieManager = CookieManager.getInstance();
        if (cookieManager.getCookie(smartCookieView.H()) != null) {
            MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(browserActivity);
            LayoutInflater layoutInflater = browserActivity.getLayoutInflater();
            G.o(layoutInflater, "getLayoutInflater(...)");
            materialAlertDialogBuilder.setTitle(p.s.f145405E4);
            View viewInflate = layoutInflater.inflate(p.m.f145270p0, (ViewGroup) null);
            final EditText editText = (EditText) viewInflate.findViewById(p.j.f144631b3);
            editText.setText(cookieManager.getCookie(smartCookieView.H()));
            materialAlertDialogBuilder.setView(viewInflate);
            materialAlertDialogBuilder.setPositiveButton((CharSequence) "OK", new DialogInterface.OnClickListener() { // from class: t4.k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    u.H(editText, smartCookieView, dialogInterface, i10);
                }
            });
            materialAlertDialogBuilder.show();
        }
        return L0.f217464a;
    }

    public static final void H(EditText editText, SmartCookieView smartCookieView, DialogInterface dialogInterface, int i10) {
        Iterator it = M.r5(editText.getText().toString(), new String[]{";"}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            CookieManager.getInstance().setCookie(smartCookieView.H(), (String) it.next());
        }
    }

    public static final L0 I(final SmartCookieView smartCookieView, final BrowserActivity browserActivity) {
        WebView webView = smartCookieView.f148346k;
        if (webView != null) {
            webView.evaluateJavascript("(function() {\n                        return \"<html>\" + document.getElementsByTagName('html')[0].innerHTML + \"</html>\";\n                     })()", new ValueCallback() { // from class: t4.l
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    u.J(browserActivity, smartCookieView, (String) obj);
                }
            });
        }
        return L0.f217464a;
    }

    public static final void J(BrowserActivity browserActivity, final SmartCookieView smartCookieView, String str) {
        String strSubstring;
        String strB2 = str != null ? F.B2(str, "\\u003C", "<", false, 4, null) : null;
        String strB22 = strB2 != null ? F.B2(strB2, "\\n", System.getProperty("line.separator").toString(), false, 4, null) : null;
        String strB23 = strB22 != null ? F.B2(strB22, "\\t", "", false, 4, null) : null;
        String strB24 = strB23 != null ? F.B2(strB23, "\\\"", "\"", false, 4, null) : null;
        if (strB24 != null) {
            strSubstring = strB24.substring(1, strB24.length() - 1);
            G.o(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
        }
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(browserActivity);
        LayoutInflater layoutInflater = browserActivity.getLayoutInflater();
        G.o(layoutInflater, "getLayoutInflater(...)");
        materialAlertDialogBuilder.setTitle(p.s.f145679Wb);
        View viewInflate = layoutInflater.inflate(p.m.f145290t0, (ViewGroup) null);
        final CodeEditor codeEditor = (CodeEditor) viewInflate.findViewById(p.j.f144631b3);
        codeEditor.P(strSubstring, 1);
        materialAlertDialogBuilder.setView(viewInflate);
        materialAlertDialogBuilder.setPositiveButton((CharSequence) "OK", new DialogInterface.OnClickListener() { // from class: t4.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                u.K(codeEditor, smartCookieView, dialogInterface, i10);
            }
        });
        materialAlertDialogBuilder.show();
    }

    public static final void K(CodeEditor codeEditor, SmartCookieView smartCookieView, DialogInterface dialogInterface, int i10) {
        String string;
        String strQ = codeEditor.q();
        codeEditor.P((strQ == null || (string = strQ.toString()) == null) ? null : F.B2(string, "'", "\\'", false, 4, null), 1);
        smartCookieView.Z("javascript:(function() { document.documentElement.innerHTML = '" + codeEditor.q() + "'; })()");
    }

    public static final L0 L(boolean z10, u uVar, SmartCookieView smartCookieView, BrowserActivity browserActivity) {
        if (z10) {
            uVar.s().a(smartCookieView.H());
        } else {
            uVar.s().b(smartCookieView.H());
        }
        SmartCookieView smartCookieView2 = browserActivity.G2().f140757n;
        if (smartCookieView2 != null) {
            smartCookieView2.g0();
        }
        return L0.f217464a;
    }

    public static final L0 M(SmartCookieView smartCookieView, u uVar, String[] strArr, final BrowserActivity browserActivity) {
        URL url = new URL(smartCookieView.H());
        if (uVar.u().O() == JavaScriptChoice.NONE) {
            uVar.u().V1(JavaScriptChoice.WHITELIST);
        } else if (C4.g.a(smartCookieView.H(), strArr)) {
            if (M.p3(uVar.u().N(), y.a(U6.j.f68738d, url.getHost()), false, 2, null)) {
                uVar.u().U1(F.B2(uVar.u().N(), y.a(U6.j.f68738d, url.getHost()), "", false, 4, null));
            } else {
                u4.e eVarU = uVar.u();
                String strN = uVar.u().N();
                String host = url.getHost();
                G.o(host, "getHost(...)");
                eVarU.U1(F.B2(strN, host, "", false, 4, null));
            }
        } else if (uVar.u().N().equals("")) {
            u4.e eVarU2 = uVar.u();
            String host2 = url.getHost();
            G.o(host2, "getHost(...)");
            eVarU2.U1(host2);
        } else {
            uVar.u().U1(uVar.u().N() + U6.j.f68738d + url.getHost());
        }
        SmartCookieView smartCookieView2 = browserActivity.G2().f140757n;
        if (smartCookieView2 != null) {
            smartCookieView2.g0();
        }
        new Handler().postDelayed(new Runnable() { // from class: t4.t
            @Override // java.lang.Runnable
            public final void run() {
                u.N(browserActivity);
            }
        }, 250L);
        return L0.f217464a;
    }

    public static final void N(BrowserActivity browserActivity) {
        SmartCookieView smartCookieView = browserActivity.G2().f140757n;
        if (smartCookieView != null) {
            smartCookieView.g0();
        }
    }

    public static final void O(BrowserActivity browserActivity, Intent intent, PopupWindow popupWindow, View view) {
        ComponentName[] componentNameArr = {new ComponentName(browserActivity, (Class<?>) BrowserActivity.class)};
        if (Build.VERSION.SDK_INT >= 24) {
            browserActivity.startActivity(Intent.createChooser(intent, null).putExtra("android.intent.extra.EXCLUDE_COMPONENTS", componentNameArr));
        } else {
            browserActivity.startActivity(intent);
        }
        popupWindow.dismiss();
    }

    public static final void P(String str, SmartCookieView smartCookieView, BrowserActivity browserActivity, u uVar, View view) {
        G.m(str);
        G.m(smartCookieView);
        a.C0110a c0110a = new a.C0110a(str, smartCookieView.E(), 0, a.b.C0112b.f68314j);
        LightningDialogBuilder lightningDialogBuilderI2 = browserActivity.i2();
        S3.b bVar = uVar.f239200b;
        G.m(bVar);
        lightningDialogBuilderI2.P(browserActivity, bVar, c0110a);
    }

    public static final boolean Q(Object it) {
        G.p(it, "it");
        return (it instanceof com.cookiegames.smartcookie.browser.h) && !((com.cookiegames.smartcookie.browser.h) it).f141023d;
    }

    public static void n(BrowserActivity browserActivity, View view) {
        browserActivity.finishAndRemoveTask();
    }

    public static final void z(SmartCookieView smartCookieView, View view) {
        if (smartCookieView != null) {
            smartCookieView.L();
        }
    }

    @NotNull
    public final com.cookiegames.smartcookie.adblock.allowlist.a s() {
        com.cookiegames.smartcookie.adblock.allowlist.a aVar = this.f239203e;
        if (aVar != null) {
            return aVar;
        }
        G.S("allowListModel");
        throw null;
    }

    @NotNull
    public final C t() {
        C c10 = this.f239202d;
        if (c10 != null) {
            return c10;
        }
        G.S("tabsManager");
        throw null;
    }

    @NotNull
    public final u4.e u() {
        u4.e eVar = this.f239201c;
        if (eVar != null) {
            return eVar;
        }
        G.S("userPreferences");
        throw null;
    }

    public final void v(@NotNull com.cookiegames.smartcookie.adblock.allowlist.a aVar) {
        G.p(aVar, "<set-?>");
        this.f239203e = aVar;
    }

    public final void w(@NotNull C c10) {
        G.p(c10, "<set-?>");
        this.f239202d = c10;
    }

    public final void x(@NotNull u4.e eVar) {
        G.p(eVar, "<set-?>");
        this.f239201c = eVar;
    }

    public final void y(@NotNull final View view, @NotNull final BrowserActivity activity) {
        char c10;
        G.p(view, "view");
        G.p(activity, "activity");
        Context context = view.getContext();
        G.o(context, "getContext(...)");
        K.b(context).g(this);
        Object systemService = view.getContext().getSystemService("layout_inflater");
        G.n(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        View viewInflate = u().h() ? layoutInflater.inflate(p.m.f145298u3, (ViewGroup) null) : layoutInflater.inflate(p.m.f145293t3, (ViewGroup) null);
        Resources resources = view.getContext().getResources();
        int iL0 = C4806d.L0(TypedValue.applyDimension(1, 228.0f, resources.getDisplayMetrics()));
        Object context2 = view.getContext();
        G.n(context2, "null cannot be cast to non-null type com.cookiegames.smartcookie.controller.UIController");
        this.f239200b = (S3.b) context2;
        final PopupWindow popupWindow = new PopupWindow(viewInflate, iL0, -2, true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(p.j.f144835oc);
        if (activity.b3()) {
            ((ConstraintLayout) viewInflate.findViewById(p.j.f144261Ac)).setBackgroundResource(p.h.f144068e7);
        } else {
            int i10 = a.f239204a[u().b1().ordinal()];
            if (i10 == 1) {
                ((ConstraintLayout) viewInflate.findViewById(p.j.f144261Ac)).setBackgroundResource(p.h.f144068e7);
            } else if (i10 == 2) {
                ((ConstraintLayout) viewInflate.findViewById(p.j.f144261Ac)).setBackgroundResource(p.h.f144050c7);
            }
        }
        final SmartCookieView smartCookieView = activity.G2().f140757n;
        S3.b bVar = this.f239200b;
        G.m(bVar);
        SmartCookieView smartCookieView2 = bVar.n0().f140757n;
        final String strH = smartCookieView2 != null ? smartCookieView2.H() : null;
        ((ImageButton) viewInflate.findViewById(p.j.f144779l1)).setOnClickListener(new View.OnClickListener() { // from class: t4.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                u.z(smartCookieView, view2);
            }
        });
        ((ImageButton) viewInflate.findViewById(p.j.f144449O4)).setOnClickListener(new View.OnClickListener() { // from class: t4.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                u.A(smartCookieView, view2);
            }
        });
        ((ImageButton) viewInflate.findViewById(p.j.f144705g2)).setOnClickListener(new View.OnClickListener() { // from class: t4.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                activity.finishAndRemoveTask();
            }
        });
        final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strH));
        PackageManager packageManager = activity.getPackageManager();
        G.o(packageManager, "getPackageManager(...)");
        if (intent.resolveActivity(packageManager) == null || G.g(intent.resolveActivity(packageManager).getPackageName(), activity.getApplicationContext().getPackageName()) || C4.s.d(strH)) {
            ((ImageButton) viewInflate.findViewById(p.j.f144711g8)).setVisibility(8);
        }
        ((ImageButton) viewInflate.findViewById(p.j.f144711g8)).setOnClickListener(new View.OnClickListener() { // from class: t4.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                u.O(activity, intent, popupWindow, view2);
            }
        });
        ((ImageButton) viewInflate.findViewById(p.j.f144914u1)).setOnClickListener(new View.OnClickListener() { // from class: t4.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                u.P(strH, smartCookieView, activity, this, view2);
            }
        });
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(p.j.f144261Ac);
        if (u().l0()) {
            ((LinearLayout) viewInflate.findViewById(p.j.f144865qc)).setVisibility(8);
            c10 = '\b';
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop() - C4806d.L0(TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics())), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        } else {
            c10 = '\b';
        }
        com.cookiegames.smartcookie.browser.g gVar = new com.cookiegames.smartcookie.browser.g(0, 1, null);
        int i11 = p.s.f145739b0;
        int i12 = p.h.f144029a4;
        com.cookiegames.smartcookie.browser.h hVar = new com.cookiegames.smartcookie.browser.h("new_tab", i11, i12, true, false, 16, null);
        int i13 = p.s.f145681X;
        int i14 = p.h.f144147n5;
        com.cookiegames.smartcookie.browser.h hVar2 = new com.cookiegames.smartcookie.browser.h("new_private_tab", i13, i14, true, false, 16, null);
        com.cookiegames.smartcookie.browser.g gVar2 = new com.cookiegames.smartcookie.browser.g(0, 1, null);
        com.cookiegames.smartcookie.browser.h hVar3 = new com.cookiegames.smartcookie.browser.h(FirebaseAnalytics.Event.SHARE, p.s.f145829h0, p.h.f143997W4, true, false, 16, null);
        com.cookiegames.smartcookie.browser.h hVar4 = new com.cookiegames.smartcookie.browser.h("open_in_app", p.s.f145607Rb, p.h.f144056d4, (!u().l0() || activity.b3() || intent.resolveActivity(packageManager) == null || G.g(intent.resolveActivity(packageManager).getPackageName(), activity.getApplicationContext().getPackageName()) || C4.s.d(strH)) ? false : true, false, 16, null);
        int i15 = p.s.f145799f0;
        int i16 = p.h.f144065e4;
        com.cookiegames.smartcookie.browser.h hVar5 = new com.cookiegames.smartcookie.browser.h("print", i15, i16, true, false, 16, null);
        com.cookiegames.smartcookie.browser.g gVar3 = new com.cookiegames.smartcookie.browser.g(0, 1, null);
        com.cookiegames.smartcookie.browser.h hVar6 = new com.cookiegames.smartcookie.browser.h(Y3.f.f79134g, p.s.f145639U, p.h.f144177r3, true, false, 16, null);
        int i17 = p.s.f145445H;
        int i18 = p.h.f144036b2;
        com.cookiegames.smartcookie.browser.h hVar7 = new com.cookiegames.smartcookie.browser.h("bookmarks", i17, i18, true, false, 16, null);
        com.cookiegames.smartcookie.browser.h hVar8 = new com.cookiegames.smartcookie.browser.h("downloads", p.s.f145550O, p.h.f144118k3, true, false, 16, null);
        com.cookiegames.smartcookie.browser.g gVar4 = new com.cookiegames.smartcookie.browser.g(0, 1, null);
        int i19 = p.s.f145580Q;
        int i20 = p.h.f144170q4;
        com.cookiegames.smartcookie.browser.h hVar9 = new com.cookiegames.smartcookie.browser.h("find_in_page", i19, i20, true, false, 16, null);
        int i21 = p.s.f145613S2;
        int i22 = p.h.f143859F2;
        com.cookiegames.smartcookie.browser.h hVar10 = new com.cookiegames.smartcookie.browser.h("copy_link", i21, i22, true, false, 16, null);
        int i23 = p.s.De;
        int i24 = p.h.f144002X1;
        com.cookiegames.smartcookie.browser.h hVar11 = new com.cookiegames.smartcookie.browser.h("reading_mode", i23, i24, true, false, 16, null);
        com.cookiegames.smartcookie.browser.g gVar5 = new com.cookiegames.smartcookie.browser.g(0, 1, null);
        com.cookiegames.smartcookie.browser.h hVar12 = new com.cookiegames.smartcookie.browser.h("page_tools", p.s.f145569P3, p.h.f143868G3, true, false, 16, null);
        int i25 = p.s.Cf;
        int i26 = p.h.f144074f4;
        com.cookiegames.smartcookie.browser.h hVar13 = new com.cookiegames.smartcookie.browser.h("settings", i25, i26, true, false, 16, null);
        Object[] objArr = new Object[18];
        objArr[0] = gVar;
        objArr[1] = hVar;
        objArr[2] = hVar2;
        objArr[3] = gVar2;
        objArr[4] = hVar3;
        objArr[5] = hVar4;
        objArr[6] = hVar5;
        objArr[7] = gVar3;
        objArr[c10] = hVar6;
        objArr[9] = hVar7;
        objArr[10] = hVar8;
        objArr[11] = gVar4;
        objArr[12] = hVar9;
        objArr[13] = hVar10;
        objArr[14] = hVar11;
        objArr[15] = gVar5;
        objArr[16] = hVar12;
        objArr[17] = hVar13;
        List listU = I.U(objArr);
        com.cookiegames.smartcookie.browser.h hVar14 = new com.cookiegames.smartcookie.browser.h("new_tab", i11, i12, true, false, 16, null);
        com.cookiegames.smartcookie.browser.g gVar6 = new com.cookiegames.smartcookie.browser.g(0, 1, null);
        com.cookiegames.smartcookie.browser.h hVar15 = new com.cookiegames.smartcookie.browser.h("print", i15, i16, true, false, 16, null);
        com.cookiegames.smartcookie.browser.h hVar16 = new com.cookiegames.smartcookie.browser.h("find_in_page", i19, i20, true, false, 16, null);
        com.cookiegames.smartcookie.browser.h hVar17 = new com.cookiegames.smartcookie.browser.h("copy_link", i21, i22, true, false, 16, null);
        com.cookiegames.smartcookie.browser.g gVar7 = new com.cookiegames.smartcookie.browser.g(0, 1, null);
        com.cookiegames.smartcookie.browser.h hVar18 = new com.cookiegames.smartcookie.browser.h("bookmarks", i17, i18, true, false, 16, null);
        com.cookiegames.smartcookie.browser.h hVar19 = new com.cookiegames.smartcookie.browser.h("reading_mode", i23, i24, true, false, 16, null);
        com.cookiegames.smartcookie.browser.g gVar8 = new com.cookiegames.smartcookie.browser.g(0, 1, null);
        com.cookiegames.smartcookie.browser.h hVar20 = new com.cookiegames.smartcookie.browser.h("settings", i25, i26, true, false, 16, null);
        com.cookiegames.smartcookie.browser.h hVar21 = new com.cookiegames.smartcookie.browser.h("exit_private", p.s.ve, i14, true, false, 16, null);
        Object[] objArr2 = new Object[11];
        objArr2[0] = hVar14;
        objArr2[1] = gVar6;
        objArr2[2] = hVar15;
        objArr2[3] = hVar16;
        objArr2[4] = hVar17;
        objArr2[5] = gVar7;
        objArr2[6] = hVar18;
        objArr2[7] = hVar19;
        objArr2[c10] = gVar8;
        objArr2[9] = hVar20;
        objArr2[10] = hVar21;
        List listU2 = I.U(objArr2);
        if (!activity.b3()) {
            listU2 = listU;
        }
        N.N0(listU2, new r());
        if (u().h()) {
            Collections.reverse(listU2);
        }
        if (u().h()) {
            popupWindow.setAnimationStyle(p.t.Fe);
            popupWindow.showAtLocation(view, 8388693, 0, 0);
            relativeLayout.setGravity(80);
        } else {
            popupWindow.setAnimationStyle(p.t.Ee);
            popupWindow.showAtLocation(view, 8388661, 0, 0);
        }
        popupWindow.setBackgroundDrawable(new ColorDrawable(-1));
        Context context3 = view.getContext();
        G.o(context3, "getContext(...)");
        C5603a c5603a = new C5603a(context3, listU2);
        ListView listView = (ListView) viewInflate.findViewById(p.j.f144381J6);
        this.f239199a = listView;
        if (listView != null) {
            listView.setAdapter((ListAdapter) c5603a);
        }
        ListView listView2 = this.f239199a;
        if (listView2 != null) {
            final List list = listU2;
            final String str = strH;
            listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: t4.s
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i27, long j10) {
                    u.C(list, this, view, activity, str, smartCookieView, intent, popupWindow, adapterView, view2, i27, j10);
                }
            });
        }
    }
}
