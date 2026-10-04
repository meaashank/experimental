package h4;

import B0.C0923g;
import C4.q;
import android.app.Application;
import androidx.compose.runtime.internal.r;
import bc.InterfaceC2859i;
import com.cookiegames.smartcookie.p;
import com.google.firebase.sessions.settings.RemoteSettings;
import ed.l;
import g4.InterfaceC4451a;
import hc.I;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.L0;
import kotlin.Pair;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.M;
import l4.C5145a;
import nc.InterfaceC5271g;
import nc.o;
import org.jetbrains.annotations.NotNull;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nDownloadPageFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadPageFactory.kt\ncom/cookiegames/smartcookie/html/download/DownloadPageFactory\n+ 2 JsoupExtensions.kt\ncom/cookiegames/smartcookie/html/jsoup/JsoupExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n17#2,2:77\n21#2:79\n41#2,5:80\n37#2:86\n33#2:88\n29#2:89\n37#2:90\n37#2:91\n22#2:93\n9#2:94\n1#3:85\n1#3:95\n1855#4:87\n1856#4:92\n*S KotlinDebug\n*F\n+ 1 DownloadPageFactory.kt\ncom/cookiegames/smartcookie/html/download/DownloadPageFactory\n*L\n33#1:77,2\n34#1:79\n35#1:80,5\n36#1:86\n38#1:88\n39#1:89\n40#1:90\n41#1:91\n34#1:93\n32#1:94\n35#1:85\n37#1:87\n37#1:92\n*E\n"})
@r(parameters = 0)
@InterfaceC2859i
public final class j implements InterfaceC4451a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f202416e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f202417f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f202418g = "downloads.html";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f202419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final u4.e f202420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final X3.k f202421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final g4.b f202422d;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @Inject
    public j(@NotNull Application application, @NotNull u4.e userPreferences, @NotNull X3.k manager, @NotNull g4.b listPageReader) {
        G.p(application, "application");
        G.p(userPreferences, "userPreferences");
        G.p(manager, "manager");
        G.p(listPageReader, "listPageReader");
        this.f202419a = application;
        this.f202420b = userPreferences;
        this.f202421c = manager;
        this.f202422d = listPageReader;
    }

    public static void h(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final String k(l lVar, Object p02) {
        G.p(p02, "p0");
        return (String) lVar.invoke(p02);
    }

    public static final Pair l(j jVar, String content) {
        G.p(content, "content");
        return new Pair(jVar.t(), content);
    }

    public static final Pair m(l lVar, Object p02) {
        G.p(p02, "p0");
        return (Pair) lVar.invoke(p02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final L0 n(Pair pair) throws IOException {
        File file = (File) pair.f217467a;
        B b10 = pair.f217468b;
        G.o(b10, "component2(...)");
        String str = (String) b10;
        FileWriter fileWriter = new FileWriter(file, false);
        try {
            fileWriter.write(str);
            fileWriter.close();
            return L0.f217464a;
        } finally {
        }
    }

    public static final void o(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String p(Pair pair) {
        G.p(pair, "<destruct>");
        return C0923g.a(R3.a.f67727e, (File) pair.f217467a);
    }

    public static final String q(l lVar, Object p02) {
        G.p(p02, "p0");
        return (String) lVar.invoke(p02);
    }

    public static final String r(final j jVar, final List list) {
        G.p(list, "list");
        Document document = Jsoup.parse(jVar.f202422d.a(jVar.f202419a));
        G.o(document, "parse(...)");
        return C5145a.b(document, new l() { // from class: h4.a
            @Override // ed.l
            public final Object invoke(Object obj) {
                return j.s(this.f202408a, list, (Document) obj);
            }
        });
    }

    public static final L0 s(j jVar, List list, Document andBuild) {
        Element elementMo49clone;
        G.p(andBuild, "$this$andBuild");
        String string = jVar.f202419a.getString(p.s.f145550O);
        G.o(string, "getString(...)");
        andBuild.title(string);
        Element elementBody = andBuild.body();
        G.o(elementBody, "body(...)");
        Element elementById = elementBody.getElementById("repeated");
        if (elementById != null) {
            elementById.remove();
        } else {
            elementById = null;
        }
        Element elementById2 = elementBody.getElementById("content");
        if (elementById2 != null) {
            G.m(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                X3.a aVar = (X3.a) it.next();
                if (elementById != null) {
                    elementMo49clone = elementById.mo49clone();
                    G.o(elementMo49clone, "clone(...)");
                    Element elementFirst = elementMo49clone.getElementsByTag("a").first();
                    if (elementFirst != null) {
                        elementFirst.attr("href", jVar.v(aVar.f76752b));
                    }
                    Element elementById3 = elementMo49clone.getElementById("title");
                    if (elementById3 != null) {
                        elementById3.text(jVar.u(aVar));
                    }
                    Element elementById4 = elementMo49clone.getElementById("url");
                    if (elementById4 != null) {
                        elementById4.text(aVar.f76751a);
                    }
                } else {
                    elementMo49clone = null;
                }
                elementById2.appendChild(elementMo49clone);
            }
        }
        return L0.f217464a;
    }

    @Override // g4.InterfaceC4451a
    @NotNull
    public I<String> a() {
        I<List<X3.a>> iK = this.f202421c.k();
        final l lVar = new l() { // from class: h4.b
            @Override // ed.l
            public final Object invoke(Object obj) {
                return j.r(this.f202410a, (List) obj);
            }
        };
        I<R> iQ0 = iK.q0(new o() { // from class: h4.c
            @Override // nc.o
            public final Object apply(Object obj) {
                return j.k(lVar, obj);
            }
        });
        final l lVar2 = new l() { // from class: h4.d
            @Override // ed.l
            public final Object invoke(Object obj) {
                return j.l(this.f202412a, (String) obj);
            }
        };
        I iQ02 = iQ0.q0(new o() { // from class: h4.e
            @Override // nc.o
            public final Object apply(Object obj) {
                return j.m(lVar2, obj);
            }
        });
        final f fVar = new f();
        I iT = iQ02.T(new InterfaceC5271g() { // from class: h4.g
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                fVar.invoke(obj);
            }
        });
        final h hVar = new h();
        I<String> iQ03 = iT.q0(new o() { // from class: h4.i
            @Override // nc.o
            public final Object apply(Object obj) {
                return j.q(hVar, obj);
            }
        });
        G.o(iQ03, "map(...)");
        return iQ03;
    }

    public final File t() {
        return new File(this.f202419a.getFilesDir(), f202418g);
    }

    public final String u(X3.a aVar) {
        return androidx.concurrent.futures.a.a(aVar.f76752b, q.f17581a, !M.Q3(aVar.f76753c) ? android.support.v4.media.i.a("[", aVar.f76753c, "]") : "");
    }

    public final String v(String str) {
        return androidx.fragment.app.G.a(R3.a.f67727e, this.f202420b.t(), RemoteSettings.FORWARD_SLASH_STRING, str);
    }
}
