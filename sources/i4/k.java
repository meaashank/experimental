package i4;

import B0.C0923g;
import C4.q;
import android.app.Application;
import android.content.res.Resources;
import androidx.compose.runtime.internal.r;
import bc.InterfaceC2859i;
import com.cookiegames.smartcookie.p;
import com.tonyodev.fetch2core.server.FileResponse;
import g4.InterfaceC4451a;
import hc.AbstractC4521a;
import hc.I;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.L0;
import kotlin.Pair;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import l4.C5145a;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;
import nc.o;
import org.jetbrains.annotations.NotNull;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nHistoryPageFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryPageFactory.kt\ncom/cookiegames/smartcookie/html/history/HistoryPageFactory\n+ 2 JsoupExtensions.kt\ncom/cookiegames/smartcookie/html/jsoup/JsoupExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n17#2,2:91\n21#2:93\n41#2,5:94\n37#2:100\n33#2:102\n29#2:103\n37#2:104\n37#2:105\n37#2:106\n22#2:108\n9#2:109\n1#3:99\n1#3:110\n1855#4:101\n1856#4:107\n*S KotlinDebug\n*F\n+ 1 HistoryPageFactory.kt\ncom/cookiegames/smartcookie/html/history/HistoryPageFactory\n*L\n37#1:91,2\n38#1:93\n39#1:94,5\n40#1:100\n42#1:102\n43#1:103\n44#1:104\n45#1:105\n46#1:106\n38#1:108\n36#1:109\n39#1:99\n41#1:101\n41#1:107\n*E\n"})
@r(parameters = 0)
@InterfaceC2859i
public final class k implements InterfaceC4451a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f202835f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f202836g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f202837h = "history.html";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g4.b f202838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Application f202839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Y3.h f202840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public Resources f202841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f202842e;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @Inject
    public k(@NotNull g4.b listPageReader, @NotNull Application application, @NotNull Y3.h historyRepository, @NotNull Resources resources) {
        G.p(listPageReader, "listPageReader");
        G.p(application, "application");
        G.p(historyRepository, "historyRepository");
        G.p(resources, "resources");
        this.f202838a = listPageReader;
        this.f202839b = application;
        this.f202840c = historyRepository;
        this.f202841d = resources;
        String string = application.getString(p.s.f145639U);
        G.o(string, "getString(...)");
        this.f202842e = string;
    }

    public static void e(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final String l(final k kVar, final List list) {
        G.p(list, "list");
        Document document = Jsoup.parse(kVar.f202838a.a(kVar.f202839b));
        G.o(document, "parse(...)");
        return C5145a.b(document, new ed.l() { // from class: i4.j
            @Override // ed.l
            public final Object invoke(Object obj) {
                return k.m(this.f202833a, list, (Document) obj);
            }
        });
    }

    public static final L0 m(k kVar, List list, Document andBuild) {
        Element elementMo49clone;
        G.p(andBuild, "$this$andBuild");
        andBuild.title(kVar.f202842e);
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
                T3.d dVar = (T3.d) it.next();
                if (elementById != null) {
                    elementMo49clone = elementById.mo49clone();
                    G.o(elementMo49clone, "clone(...)");
                    Element elementFirst = elementMo49clone.getElementsByTag("a").first();
                    if (elementFirst != null) {
                        elementFirst.attr("href", dVar.f68318d);
                    }
                    Element elementById3 = elementMo49clone.getElementById("title");
                    if (elementById3 != null) {
                        elementById3.text(dVar.f68319e);
                    }
                    Element elementById4 = elementMo49clone.getElementById("url");
                    if (elementById4 != null) {
                        elementById4.text(dVar.f68318d);
                    }
                    Element elementById5 = elementMo49clone.getElementById(FileResponse.FIELD_DATE);
                    if (elementById5 != null) {
                        elementById5.text(kVar.f202841d.getString(p.s.f145498K7) + q.f17581a + kVar.x(dVar.f68320f));
                    }
                } else {
                    elementMo49clone = null;
                }
                elementById2.appendChild(elementMo49clone);
            }
        }
        return L0.f217464a;
    }

    public static final String n(ed.l lVar, Object p02) {
        G.p(p02, "p0");
        return (String) lVar.invoke(p02);
    }

    public static final Pair o(k kVar, String content) {
        G.p(content, "content");
        return new Pair(kVar.u(), content);
    }

    public static final Pair p(ed.l lVar, Object p02) {
        G.p(p02, "p0");
        return (Pair) lVar.invoke(p02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final L0 q(Pair pair) throws IOException {
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

    public static final void w(k kVar) {
        File fileU = kVar.u();
        if (fileU.exists()) {
            fileU.delete();
        }
    }

    @Override // g4.InterfaceC4451a
    @NotNull
    public I<String> a() {
        I<List<T3.d>> iK = this.f202840c.k();
        final ed.l lVar = new ed.l() { // from class: i4.b
            @Override // ed.l
            public final Object invoke(Object obj) {
                return k.l(this.f202827a, (List) obj);
            }
        };
        I<R> iQ0 = iK.q0(new o() { // from class: i4.c
            @Override // nc.o
            public final Object apply(Object obj) {
                return k.n(lVar, obj);
            }
        });
        final ed.l lVar2 = new ed.l() { // from class: i4.d
            @Override // ed.l
            public final Object invoke(Object obj) {
                return k.o(this.f202829a, (String) obj);
            }
        };
        I iQ02 = iQ0.q0(new o() { // from class: i4.e
            @Override // nc.o
            public final Object apply(Object obj) {
                return k.p(lVar2, obj);
            }
        });
        final C4552f c4552f = new C4552f();
        I iT = iQ02.T(new InterfaceC5271g() { // from class: i4.g
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                c4552f.invoke(obj);
            }
        });
        final C4554h c4554h = new C4554h();
        I<String> iQ03 = iT.q0(new o() { // from class: i4.i
            @Override // nc.o
            public final Object apply(Object obj) {
                return k.t(c4554h, obj);
            }
        });
        G.o(iQ03, "map(...)");
        return iQ03;
    }

    public final File u() {
        return new File(this.f202839b.getFilesDir(), f202837h);
    }

    @NotNull
    public final AbstractC4521a v() {
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: i4.a
            @Override // nc.InterfaceC5265a
            public final void run() {
                k.w(this.f202826a);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    public final String x(long j10) {
        try {
            return DateFormat.getDateTimeInstance().format(new Date(j10));
        } catch (Exception e10) {
            return e10.toString();
        }
    }
}
