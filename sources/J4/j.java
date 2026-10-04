package j4;

import B0.C0923g;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Base64;
import android.webkit.URLUtil;
import androidx.compose.runtime.internal.r;
import bc.InterfaceC2859i;
import com.cookiegames.smartcookie.AppTheme;
import com.cookiegames.smartcookie.browser.HomepageTypeChoice;
import com.cookiegames.smartcookie.p;
import com.cookiegames.smartcookie.search.C3131a;
import g4.InterfaceC4451a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.L0;
import kotlin.Pair;
import kotlin.collections.I;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.F;
import kotlin.text.M;
import kotlin.text.U;
import l4.C5145a;
import nc.InterfaceC5271g;
import nc.o;
import org.jetbrains.annotations.NotNull;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import y4.C5822c;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nHomePageFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePageFactory.kt\ncom/cookiegames/smartcookie/html/homepage/HomePageFactory\n+ 2 JsoupExtensions.kt\ncom/cookiegames/smartcookie/html/jsoup/JsoupExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,249:1\n17#2,2:250\n25#2,2:252\n21#2:254\n29#2:255\n37#2:256\n29#2:257\n41#2:258\n37#2:259\n37#2:260\n37#2:261\n37#2:262\n37#2:263\n37#2:264\n37#2:265\n37#2:266\n37#2:267\n37#2:268\n37#2:271\n37#2:272\n37#2:273\n37#2:274\n37#2:276\n37#2:277\n22#2:278\n9#2:279\n1864#3,2:269\n1866#3:275\n*S KotlinDebug\n*F\n+ 1 HomePageFactory.kt\ncom/cookiegames/smartcookie/html/homepage/HomePageFactory\n*L\n54#1:250,2\n55#1:252,2\n56#1:254\n59#1:255\n68#1:256\n76#1:257\n92#1:258\n126#1:259\n127#1:260\n128#1:261\n129#1:262\n130#1:263\n131#1:264\n132#1:265\n133#1:266\n134#1:267\n135#1:268\n142#1:271\n156#1:272\n158#1:273\n167#1:274\n176#1:276\n183#1:277\n56#1:278\n53#1:279\n137#1:269,2\n137#1:275\n*E\n"})
@r(parameters = 0)
@InterfaceC2859i
public final class j implements InterfaceC4451a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f212542i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f212543j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f212544k = "homepage.html";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f212545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C3131a f212546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l f212547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public u4.e f212548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public Resources f212549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Y3.h f212550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final g4.b f212551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f212552h;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @Inject
    public j(@NotNull Application application, @NotNull C3131a searchEngineProvider, @NotNull l homePageReader, @NotNull u4.e userPreferences, @NotNull Resources resources, @NotNull Y3.h historyRepository, @NotNull g4.b listPageReader) {
        G.p(application, "application");
        G.p(searchEngineProvider, "searchEngineProvider");
        G.p(homePageReader, "homePageReader");
        G.p(userPreferences, "userPreferences");
        G.p(resources, "resources");
        G.p(historyRepository, "historyRepository");
        G.p(listPageReader, "listPageReader");
        this.f212545a = application;
        this.f212546b = searchEngineProvider;
        this.f212547c = homePageReader;
        this.f212548d = userPreferences;
        this.f212549e = resources;
        this.f212550f = historyRepository;
        this.f212551g = listPageReader;
        String string = application.getString(p.s.f145702Y6);
        G.o(string, "getString(...)");
        this.f212552h = string;
    }

    public static void c(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final String l(final j jVar, C5822c c5822c) {
        G.p(c5822c, "<destruct>");
        final String str = c5822c.f241093a;
        final String str2 = c5822c.f241094b;
        Document document = Jsoup.parse(jVar.f212547c.a(jVar.f212545a));
        G.o(document, "parse(...)");
        return C5145a.b(document, new ed.l() { // from class: j4.a
            @Override // ed.l
            public final Object invoke(Object obj) {
                return j.m(this.f212532a, str, str2, (Document) obj);
            }
        });
    }

    public static final L0 m(j jVar, String str, String str2, Document andBuild) {
        String str3;
        Element elementById;
        String strB2;
        Element elementFirst;
        G.p(andBuild, "$this$andBuild");
        andBuild.title(jVar.f212552h);
        andBuild.outputSettings().charset("UTF-8");
        Element elementBody = andBuild.body();
        G.o(elementBody, "body(...)");
        if (!G.g(jVar.f212548d.J(), "") && (elementFirst = elementBody.getElementsByTag("body").first()) != null) {
            elementFirst.attr("style", "background: url('" + jVar.f212548d.J() + "') no-repeat scroll;");
        }
        Element elementById2 = elementBody.getElementById("search_input");
        if (elementById2 != null) {
            elementById2.attr("style", "background: url('" + str + "') no-repeat scroll 7px 7px;background-size: 22px 22px;");
        }
        Element elementFirst2 = elementBody.getElementsByTag("script").first();
        if (elementFirst2 != null) {
            if (jVar.f212548d.F() == HomepageTypeChoice.INFORMATIVE) {
                String strHtml = elementFirst2.html();
                G.o(strHtml, "html(...)");
                strB2 = F.B2(F.B2(F.B2(strHtml, "${ENDPOINT}", jVar.f212548d.n0(), false, 4, null), "${BASE_URL}", str2, false, 4, null), "&", "\\u0026", false, 4, null);
            } else {
                String strHtml2 = elementFirst2.html();
                G.o(strHtml2, "html(...)");
                strB2 = F.B2(F.B2(strHtml2, "${BASE_URL}", str2, false, 4, null), "&", "\\u0026", false, 4, null);
            }
            elementFirst2.html(strB2);
        }
        if (jVar.f212548d.F() == HomepageTypeChoice.FOCUSED && (elementById = elementBody.getElementById("image_url")) != null) {
            elementById.remove();
        }
        if (jVar.f212548d.L0()) {
            ArrayList arrayListT = I.t(jVar.f212548d.Q(), jVar.f212548d.U(), jVar.f212548d.W(), jVar.f212548d.Y(), jVar.f212548d.a0(), jVar.f212548d.c0(), jVar.f212548d.e0(), jVar.f212548d.g0(), jVar.f212548d.i0(), jVar.f212548d.R());
            ArrayList arrayListT2 = I.t(jVar.f212548d.T(), jVar.f212548d.V(), jVar.f212548d.X(), jVar.f212548d.Z(), jVar.f212548d.b0(), jVar.f212548d.d0(), jVar.f212548d.f0(), jVar.f212548d.h0(), jVar.f212548d.j0(), jVar.f212548d.S());
            Element elementById3 = elementBody.getElementById("link1click");
            boolean z10 = false;
            if (elementById3 != null) {
                elementById3.attr("href", (String) arrayListT.get(0));
            }
            Element elementById4 = elementBody.getElementById("link2click");
            if (elementById4 != null) {
                elementById4.attr("href", (String) arrayListT.get(1));
            }
            Element elementById5 = elementBody.getElementById("link3click");
            if (elementById5 != null) {
                elementById5.attr("href", (String) arrayListT.get(2));
            }
            Element elementById6 = elementBody.getElementById("link4click");
            if (elementById6 != null) {
                elementById6.attr("href", (String) arrayListT.get(3));
            }
            Element elementById7 = elementBody.getElementById("link5click");
            if (elementById7 != null) {
                elementById7.attr("href", (String) arrayListT.get(4));
            }
            Element elementById8 = elementBody.getElementById("link6click");
            if (elementById8 != null) {
                elementById8.attr("href", (String) arrayListT.get(5));
            }
            Element elementById9 = elementBody.getElementById("link7click");
            if (elementById9 != null) {
                elementById9.attr("href", (String) arrayListT.get(6));
            }
            Element elementById10 = elementBody.getElementById("link8click");
            if (elementById10 != null) {
                elementById10.attr("href", (String) arrayListT.get(7));
            }
            Element elementById11 = elementBody.getElementById("link9click");
            if (elementById11 != null) {
                elementById11.attr("href", (String) arrayListT.get(8));
            }
            Element elementById12 = elementBody.getElementById("link10click");
            if (elementById12 != null) {
                elementById12.attr("href", (String) arrayListT.get(9));
            }
            int size = arrayListT.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListT.get(i11);
                i11++;
                int i12 = i10 + 1;
                if (i10 < 0) {
                    I.b0();
                    throw null;
                }
                String str4 = (String) obj;
                if (URLUtil.isValidUrl(str4)) {
                    String host = new URI(F.F2(str4, "www.", "", false, 4, null)).getHost();
                    G.o(host, "getHost(...)");
                    String strK = jVar.k(jVar.v(Character.toUpperCase(U.A7(host))));
                    Object obj2 = arrayListT2.get(i10);
                    G.o(obj2, "get(...)");
                    String str5 = (String) obj2;
                    if (M.p3(str5, "file:///android_asset", z10, 2, null)) {
                        str3 = "link";
                        Element elementById13 = elementBody.getElementById(str3 + i12);
                        if (elementById13 != null) {
                            elementById13.attr("src", str5);
                        }
                    } else {
                        str3 = "link";
                        Element elementById14 = elementBody.getElementById(str3 + i12);
                        if (elementById14 != null) {
                            elementById14.attr("src", R3.a.f67726d + new URI(str5).getHost() + "/favicon.ico");
                        }
                    }
                    Element elementById15 = elementBody.getElementById(str3 + i12);
                    if (elementById15 != null) {
                        elementById15.attr("onerror", "this.src = 'data:image/png;base64," + strK + "';");
                    }
                } else {
                    String strK2 = jVar.k(jVar.v('?'));
                    Element elementById16 = elementBody.getElementById("link" + i12);
                    if (elementById16 != null) {
                        elementById16.attr("src", "data:image/png;base64,".concat(strK2));
                    }
                }
                i10 = i12;
                z10 = false;
            }
            Element elementById17 = elementBody.getElementById("search_input");
            if (elementById17 != null) {
                elementById17.attr("placeholder", jVar.f212549e.getString(p.s.pf));
            }
        } else {
            Element elementById18 = elementBody.getElementById("shortcuts");
            if (elementById18 != null) {
                elementById18.attr("style", "display: none;");
            }
        }
        return L0.f217464a;
    }

    public static final String n(ed.l lVar, Object p02) {
        G.p(p02, "p0");
        return (String) lVar.invoke(p02);
    }

    public static final Pair o(j jVar, String content) {
        G.p(content, "content");
        return new Pair(jVar.u(), content);
    }

    public static final Pair p(ed.l lVar, Object p02) {
        G.p(p02, "p0");
        return (Pair) lVar.invoke(p02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final L0 q(j jVar, Pair pair) throws IOException {
        File file = (File) pair.f217467a;
        B b10 = pair.f217468b;
        G.o(b10, "component2(...)");
        String str = (String) b10;
        FileWriter fileWriter = new FileWriter(file, false);
        try {
            if (jVar.f212548d.R0() && jVar.f212548d.b1() == AppTheme.LIGHT) {
                fileWriter.write(str);
            } else if (jVar.f212548d.R0() && jVar.f212548d.b1() == AppTheme.BLACK) {
                fileWriter.write(str.concat("<style>body {\n    background-color: #000000;\n} .text, .edit{color: #ffffff;fill: #ffffff;}</style>"));
            } else if (jVar.f212548d.R0() && jVar.f212548d.b1() == AppTheme.DARK) {
                fileWriter.write(str.concat("<style>body {\n    background-color: #2a2a2a;\n} .text, .edit{color: #ffffff;fill: #ffffff;}</style>"));
            } else {
                fileWriter.write(str);
            }
            fileWriter.close();
            return L0.f217464a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.io.b.a(fileWriter, th);
                throw th2;
            }
        }
    }

    public static final void r(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String s(Pair pair) {
        G.p(pair, "<destruct>");
        return C0923g.a(R3.a.f67727e, (File) pair.f217467a);
    }

    public static final String t(ed.l lVar, Object p02) {
        G.p(p02, "p0");
        return (String) lVar.invoke(p02);
    }

    @Override // g4.InterfaceC4451a
    @SuppressLint({"SuspiciousIndentation"})
    @NotNull
    public hc.I<String> a() {
        hc.I iO0 = hc.I.o0(this.f212546b.c());
        final ed.l lVar = new ed.l() { // from class: j4.b
            @Override // ed.l
            public final Object invoke(Object obj) {
                return j.l(this.f212535a, (C5822c) obj);
            }
        };
        hc.I iQ0 = iO0.q0(new o() { // from class: j4.c
            @Override // nc.o
            public final Object apply(Object obj) {
                return j.n(lVar, obj);
            }
        });
        final ed.l lVar2 = new ed.l() { // from class: j4.d
            @Override // ed.l
            public final Object invoke(Object obj) {
                return j.o(this.f212537a, (String) obj);
            }
        };
        hc.I iQ02 = iQ0.q0(new o() { // from class: j4.e
            @Override // nc.o
            public final Object apply(Object obj) {
                return j.p(lVar2, obj);
            }
        });
        final ed.l lVar3 = new ed.l() { // from class: j4.f
            @Override // ed.l
            public final Object invoke(Object obj) {
                return j.q(this.f212539a, (Pair) obj);
            }
        };
        hc.I iT = iQ02.T(new InterfaceC5271g() { // from class: j4.g
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                lVar3.invoke(obj);
            }
        });
        final h hVar = new h();
        hc.I<String> iQ03 = iT.q0(new o() { // from class: j4.i
            @Override // nc.o
            public final Object apply(Object obj) {
                return j.t(hVar, obj);
            }
        });
        G.o(iQ03, "map(...)");
        return iQ03;
    }

    @NotNull
    public final String k(@NotNull Bitmap bitmap) {
        G.p(bitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        G.o(byteArray, "toByteArray(...)");
        String strEncodeToString = Base64.encodeToString(byteArray, 2);
        G.o(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @NotNull
    public final File u() {
        return new File(this.f212545a.getFilesDir(), f212544k);
    }

    @NotNull
    public final Bitmap v(char c10) {
        Bitmap bitmapC = C4.c.c(Character.valueOf(c10), 64, 64, -7829368);
        G.o(bitmapC, "createRoundedLetterImage(...)");
        return bitmapC;
    }
}
