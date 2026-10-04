package k4;

import B0.C0923g;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Base64;
import android.webkit.URLUtil;
import androidx.compose.runtime.internal.r;
import bc.InterfaceC2859i;
import com.cookiegames.smartcookie.AppTheme;
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
@V({"SMAP\nIncognitoPageFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IncognitoPageFactory.kt\ncom/cookiegames/smartcookie/html/incognito/IncognitoPageFactory\n+ 2 JsoupExtensions.kt\ncom/cookiegames/smartcookie/html/jsoup/JsoupExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,195:1\n17#2,2:196\n25#2,2:198\n21#2:200\n37#2:201\n29#2:202\n37#2:203\n37#2:204\n37#2:205\n37#2:206\n37#2:207\n37#2:208\n37#2:209\n37#2:210\n37#2:211\n37#2:212\n37#2:213\n37#2:214\n37#2:217\n37#2:218\n37#2:219\n37#2:220\n37#2:222\n37#2:223\n22#2:224\n9#2:225\n1864#3,2:215\n1866#3:221\n*S KotlinDebug\n*F\n+ 1 IncognitoPageFactory.kt\ncom/cookiegames/smartcookie/html/incognito/IncognitoPageFactory\n*L\n49#1:196,2\n50#1:198,2\n51#1:200\n52#1:201\n53#1:202\n63#1:203\n64#1:204\n92#1:205\n93#1:206\n94#1:207\n95#1:208\n96#1:209\n97#1:210\n98#1:211\n99#1:212\n100#1:213\n101#1:214\n108#1:217\n117#1:218\n119#1:219\n123#1:220\n127#1:222\n130#1:223\n51#1:224\n48#1:225\n103#1:215,2\n103#1:221\n*E\n"})
@r(parameters = 0)
@InterfaceC2859i
public final class j implements InterfaceC4451a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f214466i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f214467j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f214468k = "private.html";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f214469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C3131a f214470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l f214471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public u4.e f214472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public Resources f214473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Y3.h f214474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final g4.b f214475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f214476h;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @Inject
    public j(@NotNull Application application, @NotNull C3131a searchEngineProvider, @NotNull l incognitoPageReader, @NotNull u4.e userPreferences, @NotNull Resources resources, @NotNull Y3.h historyRepository, @NotNull g4.b listPageReader) {
        G.p(application, "application");
        G.p(searchEngineProvider, "searchEngineProvider");
        G.p(incognitoPageReader, "incognitoPageReader");
        G.p(userPreferences, "userPreferences");
        G.p(resources, "resources");
        G.p(historyRepository, "historyRepository");
        G.p(listPageReader, "listPageReader");
        this.f214469a = application;
        this.f214470b = searchEngineProvider;
        this.f214471c = incognitoPageReader;
        this.f214472d = userPreferences;
        this.f214473e = resources;
        this.f214474f = historyRepository;
        this.f214475g = listPageReader;
        String string = application.getString(p.s.f145702Y6);
        G.o(string, "getString(...)");
        this.f214476h = string;
    }

    public static void d(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final String l(final j jVar, C5822c c5822c) {
        G.p(c5822c, "<destruct>");
        final String str = c5822c.f241093a;
        final String str2 = c5822c.f241094b;
        Document document = Jsoup.parse(jVar.f214471c.a(jVar.f214469a));
        G.o(document, "parse(...)");
        return C5145a.b(document, new ed.l() { // from class: k4.i
            @Override // ed.l
            public final Object invoke(Object obj) {
                return j.m(this.f214463a, str, str2, (Document) obj);
            }
        });
    }

    public static final L0 m(j jVar, String str, String str2, Document andBuild) {
        String str3;
        G.p(andBuild, "$this$andBuild");
        andBuild.title(jVar.f214476h);
        andBuild.outputSettings().charset("UTF-8");
        Element elementBody = andBuild.body();
        G.o(elementBody, "body(...)");
        Element elementById = elementBody.getElementById("search_input");
        if (elementById != null) {
            elementById.attr("style", "background: url('" + str + "') no-repeat scroll 7px 7px;background-size: 22px 22px;");
        }
        Element elementFirst = elementBody.getElementsByTag("script").first();
        if (elementFirst != null) {
            String strHtml = elementFirst.html();
            G.o(strHtml, "html(...)");
            elementFirst.html(F.B2(F.B2(strHtml, "${BASE_URL}", str2, false, 4, null), "&", "\\u0026", false, 4, null));
        }
        Element elementById2 = elementBody.getElementById("title-pm");
        if (elementById2 != null) {
            elementById2.text(jVar.f214473e.getString(p.s.he));
        }
        Element elementById3 = elementBody.getElementById("desc-pm");
        if (elementById3 != null) {
            elementById3.text(jVar.f214473e.getString(p.s.ge));
        }
        if (jVar.f214472d.L0()) {
            ArrayList arrayListT = I.t(jVar.f214472d.Q(), jVar.f214472d.U(), jVar.f214472d.W(), jVar.f214472d.Y(), jVar.f214472d.a0(), jVar.f214472d.c0(), jVar.f214472d.e0(), jVar.f214472d.g0(), jVar.f214472d.i0(), jVar.f214472d.R());
            ArrayList arrayListT2 = I.t(jVar.f214472d.T(), jVar.f214472d.V(), jVar.f214472d.X(), jVar.f214472d.Z(), jVar.f214472d.b0(), jVar.f214472d.d0(), jVar.f214472d.f0(), jVar.f214472d.h0(), jVar.f214472d.j0(), jVar.f214472d.S());
            Element elementById4 = elementBody.getElementById("link1click");
            boolean z10 = false;
            if (elementById4 != null) {
                elementById4.attr("href", (String) arrayListT.get(0));
            }
            Element elementById5 = elementBody.getElementById("link2click");
            if (elementById5 != null) {
                elementById5.attr("href", (String) arrayListT.get(1));
            }
            Element elementById6 = elementBody.getElementById("link3click");
            if (elementById6 != null) {
                elementById6.attr("href", (String) arrayListT.get(2));
            }
            Element elementById7 = elementBody.getElementById("link4click");
            if (elementById7 != null) {
                elementById7.attr("href", (String) arrayListT.get(3));
            }
            Element elementById8 = elementBody.getElementById("link5click");
            if (elementById8 != null) {
                elementById8.attr("href", (String) arrayListT.get(4));
            }
            Element elementById9 = elementBody.getElementById("link6click");
            if (elementById9 != null) {
                elementById9.attr("href", (String) arrayListT.get(5));
            }
            Element elementById10 = elementBody.getElementById("link7click");
            if (elementById10 != null) {
                elementById10.attr("href", (String) arrayListT.get(6));
            }
            Element elementById11 = elementBody.getElementById("link8click");
            if (elementById11 != null) {
                elementById11.attr("href", (String) arrayListT.get(7));
            }
            Element elementById12 = elementBody.getElementById("link9click");
            if (elementById12 != null) {
                elementById12.attr("href", (String) arrayListT.get(8));
            }
            Element elementById13 = elementBody.getElementById("link10click");
            if (elementById13 != null) {
                elementById13.attr("href", (String) arrayListT.get(9));
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
                    String strK = jVar.k(jVar.u(Character.toUpperCase(U.A7(host))));
                    Object obj2 = arrayListT2.get(i10);
                    G.o(obj2, "get(...)");
                    String str5 = (String) obj2;
                    if (M.p3(str5, "file:///android_asset", z10, 2, null)) {
                        str3 = "link";
                        Element elementById14 = elementBody.getElementById(str3 + i12);
                        if (elementById14 != null) {
                            elementById14.attr("src", str5);
                        }
                    } else {
                        str3 = "link";
                        Element elementById15 = elementBody.getElementById(str3 + i12);
                        if (elementById15 != null) {
                            elementById15.attr("src", R3.a.f67726d + new URI(str5).getHost() + "/favicon.ico");
                        }
                    }
                    Element elementById16 = elementBody.getElementById(str3 + i12);
                    if (elementById16 != null) {
                        elementById16.attr("onerror", "this.src = 'data:image/png;base64," + strK + "';");
                    }
                } else {
                    String strK2 = jVar.k(jVar.u('?'));
                    Element elementById17 = elementBody.getElementById("link" + i12);
                    if (elementById17 != null) {
                        elementById17.attr("src", "data:image/png;base64,".concat(strK2));
                    }
                }
                i10 = i12;
                z10 = false;
            }
            Element elementById18 = elementBody.getElementById("search_input");
            if (elementById18 != null) {
                elementById18.attr("placeholder", jVar.f214473e.getString(p.s.pf));
            }
        } else {
            Element elementById19 = elementBody.getElementById("shortcuts");
            if (elementById19 != null) {
                elementById19.attr("style", "display: none;");
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
        return new Pair(jVar.v(), content);
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
            if (jVar.f214472d.R0() && jVar.f214472d.b1() == AppTheme.LIGHT) {
                fileWriter.write(str);
            } else if (jVar.f214472d.R0() && jVar.f214472d.b1() == AppTheme.BLACK) {
                fileWriter.write(str.concat("<style>body {\n    background-color: #000000;\n} .text, .edit{color: #ffffff;fill: #ffffff;}</style>"));
            } else if (jVar.f214472d.R0() && jVar.f214472d.b1() == AppTheme.DARK) {
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
    @NotNull
    public hc.I<String> a() {
        hc.I iO0 = hc.I.o0(this.f214470b.c());
        final ed.l lVar = new ed.l() { // from class: k4.a
            @Override // ed.l
            public final Object invoke(Object obj) {
                return j.l(this.f214456a, (C5822c) obj);
            }
        };
        hc.I iQ0 = iO0.q0(new o() { // from class: k4.b
            @Override // nc.o
            public final Object apply(Object obj) {
                return j.n(lVar, obj);
            }
        });
        final ed.l lVar2 = new ed.l() { // from class: k4.c
            @Override // ed.l
            public final Object invoke(Object obj) {
                return j.o(this.f214458a, (String) obj);
            }
        };
        hc.I iQ02 = iQ0.q0(new o() { // from class: k4.d
            @Override // nc.o
            public final Object apply(Object obj) {
                return j.p(lVar2, obj);
            }
        });
        final ed.l lVar3 = new ed.l() { // from class: k4.e
            @Override // ed.l
            public final Object invoke(Object obj) {
                return j.q(this.f214460a, (Pair) obj);
            }
        };
        hc.I iT = iQ02.T(new InterfaceC5271g() { // from class: k4.f
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                lVar3.invoke(obj);
            }
        });
        final g gVar = new g();
        hc.I<String> iQ03 = iT.q0(new o() { // from class: k4.h
            @Override // nc.o
            public final Object apply(Object obj) {
                return j.t(gVar, obj);
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
    public final Bitmap u(char c10) {
        Bitmap bitmapC = C4.c.c(Character.valueOf(c10), 64, 64, -7829368);
        G.o(bitmapC, "createRoundedLetterImage(...)");
        return bitmapC;
    }

    @NotNull
    public final File v() {
        return new File(this.f214469a.getFilesDir(), f214468k);
    }
}
