package com.cookiegames.smartcookie.html.bookmark;

import B0.C0923g;
import T3.a;
import android.app.Application;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import bc.InterfaceC2859i;
import com.cookiegames.smartcookie.p;
import e4.C4360c;
import e4.C4362e;
import e4.C4363f;
import ed.InterfaceC4376a;
import g4.InterfaceC4451a;
import hc.H;
import hc.O;
import hc.z;
import io.reactivex.internal.functions.Functions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.G;
import kotlin.I;
import kotlin.L0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.J;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.V;
import kotlin.text.M;
import l4.C5145a;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import sc.AbstractC5592b;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nBookmarkPageFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookmarkPageFactory.kt\ncom/cookiegames/smartcookie/html/bookmark/BookmarkPageFactory\n+ 2 CloseableExtensions.kt\ncom/cookiegames/smartcookie/extensions/CloseableExtensionsKt\n+ 3 JsoupExtensions.kt\ncom/cookiegames/smartcookie/html/jsoup/JsoupExtensionsKt\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n10#2,5:171\n9#3:176\n17#3,2:193\n21#3:195\n41#3,5:196\n37#3:202\n33#3:204\n29#3:205\n29#3:206\n37#3:207\n22#3:209\n29#4:177\n800#5,11:178\n1549#5:189\n1620#5,3:190\n1855#5:203\n1856#5:208\n1#6:201\n*S KotlinDebug\n*F\n+ 1 BookmarkPageFactory.kt\ncom/cookiegames/smartcookie/html/bookmark/BookmarkPageFactory\n*L\n79#1:171,5\n85#1:176\n86#1:193,2\n87#1:195\n88#1:196,5\n89#1:202\n91#1:204\n92#1:205\n93#1:206\n94#1:207\n87#1:209\n119#1:177\n53#1:178,11\n60#1:189\n60#1:190,3\n90#1:203\n90#1:208\n88#1:201\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
@InterfaceC2859i
public final class BookmarkPageFactory implements InterfaceC4451a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f141290j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f141291k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f141292l = "bookmark.html";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f141293m = "folder.png";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f141294n = "default.png";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f141295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final W3.s f141296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C4360c f141297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final H f141298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final H f141299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final u f141300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f141301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final G f141302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final G f141303i;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @Inject
    public BookmarkPageFactory(@NotNull Application application, @NotNull W3.s bookmarkModel, @NotNull C4360c faviconModel, @NotNull H databaseScheduler, @NotNull H diskScheduler, @NotNull u bookmarkPageReader) {
        kotlin.jvm.internal.G.p(application, "application");
        kotlin.jvm.internal.G.p(bookmarkModel, "bookmarkModel");
        kotlin.jvm.internal.G.p(faviconModel, "faviconModel");
        kotlin.jvm.internal.G.p(databaseScheduler, "databaseScheduler");
        kotlin.jvm.internal.G.p(diskScheduler, "diskScheduler");
        kotlin.jvm.internal.G.p(bookmarkPageReader, "bookmarkPageReader");
        this.f141295a = application;
        this.f141296b = bookmarkModel;
        this.f141297c = faviconModel;
        this.f141298d = databaseScheduler;
        this.f141299e = diskScheduler;
        this.f141300f = bookmarkPageReader;
        String string = application.getString(p.s.f145445H);
        kotlin.jvm.internal.G.o(string, "getString(...)");
        this.f141301g = string;
        this.f141302h = I.a(new InterfaceC4376a() { // from class: com.cookiegames.smartcookie.html.bookmark.i
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return BookmarkPageFactory.S(this.f141314a);
            }
        });
        this.f141303i = I.a(new InterfaceC4376a() { // from class: com.cookiegames.smartcookie.html.bookmark.j
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return BookmarkPageFactory.R(this.f141315a);
            }
        });
    }

    public static final O A(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (O) lVar.invoke(p02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Pair B(BookmarkPageFactory bookmarkPageFactory, Pair pair) {
        kotlin.jvm.internal.G.p(pair, "<destruct>");
        return new Pair((a.b) pair.f217467a, bookmarkPageFactory.M((List) pair.f217468b));
    }

    public static final Pair C(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (Pair) lVar.invoke(p02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final L0 D(BookmarkPageFactory bookmarkPageFactory, Pair pair) throws IOException {
        a.b bVar = (a.b) pair.f217467a;
        String str = (String) pair.f217468b;
        FileWriter fileWriter = new FileWriter(bookmarkPageFactory.O(bVar), false);
        try {
            fileWriter.write(str);
            fileWriter.close();
            return L0.f217464a;
        } finally {
        }
    }

    public static final void E(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final String F(BookmarkPageFactory bookmarkPageFactory) {
        Bitmap bitmapA = C4.r.a(bookmarkPageFactory.f141295a, p.h.f144169q3, false);
        kotlin.jvm.internal.G.o(bitmapA, "createThemedBitmap(...)");
        bookmarkPageFactory.L(bitmapA, bookmarkPageFactory.U());
        bookmarkPageFactory.L(bookmarkPageFactory.f141297c.f(null), bookmarkPageFactory.T());
        return C0923g.a(R3.a.f67727e, bookmarkPageFactory.O(null));
    }

    public static final Iterable G(List it) {
        kotlin.jvm.internal.G.p(it, "it");
        return it;
    }

    public static final Iterable H(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (Iterable) lVar.invoke(p02);
    }

    public static final a.b I(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (a.b) lVar.invoke(p02);
    }

    public static final T3.a J(a.C0110a it) {
        kotlin.jvm.internal.G.p(it, "it");
        return it;
    }

    public static final T3.a K(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (T3.a) lVar.invoke(p02);
    }

    public static final L0 N(BookmarkPageFactory bookmarkPageFactory, List list, Document andBuild) {
        Element elementMo49clone;
        kotlin.jvm.internal.G.p(andBuild, "$this$andBuild");
        andBuild.title(bookmarkPageFactory.f141301g);
        Element elementBody = andBuild.body();
        kotlin.jvm.internal.G.o(elementBody, "body(...)");
        Element elementById = elementBody.getElementById("repeated");
        if (elementById != null) {
            elementById.remove();
        } else {
            elementById = null;
        }
        Element elementById2 = elementBody.getElementById("content");
        if (elementById2 != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                if (elementById != null) {
                    elementMo49clone = elementById.mo49clone();
                    kotlin.jvm.internal.G.o(elementMo49clone, "clone(...)");
                    Element elementFirst = elementMo49clone.getElementsByTag("a").first();
                    if (elementFirst != null) {
                        elementFirst.attr("href", wVar.f141333b);
                    }
                    Element elementFirst2 = elementMo49clone.getElementsByTag("img").first();
                    if (elementFirst2 != null) {
                        elementFirst2.attr("src", wVar.f141334c);
                    }
                    Element elementById3 = elementMo49clone.getElementById("title");
                    if (elementById3 != null) {
                        elementById3.appendText(wVar.f141332a);
                    }
                } else {
                    elementMo49clone = null;
                }
                elementById2.appendChild(elementMo49clone);
            }
        }
        return L0.f217464a;
    }

    public static final File R(BookmarkPageFactory bookmarkPageFactory) {
        return new File(bookmarkPageFactory.f141295a.getCacheDir(), f141294n);
    }

    public static final File S(BookmarkPageFactory bookmarkPageFactory) {
        return new File(bookmarkPageFactory.f141295a.getCacheDir(), f141293m);
    }

    public static T3.a f(a.C0110a it) {
        kotlin.jvm.internal.G.p(it, "it");
        return it;
    }

    public static void j(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static Iterable o(List it) {
        kotlin.jvm.internal.G.p(it, "it");
        return it;
    }

    public static final O v(final BookmarkPageFactory bookmarkPageFactory, AbstractC5592b bookmarksInFolder) {
        hc.I iO0;
        kotlin.jvm.internal.G.p(bookmarksInFolder, "bookmarksInFolder");
        final a.b bVar = (a.b) bookmarksInFolder.c8();
        O oT6 = bookmarksInFolder.T6(16);
        if (kotlin.jvm.internal.G.g(bVar, a.b.C0112b.f68314j)) {
            hc.I<List<a.b>> iS = bookmarkPageFactory.f141296b.s();
            final e eVar = new e();
            iO0 = iS.q0(new nc.o() { // from class: com.cookiegames.smartcookie.html.bookmark.f
                @Override // nc.o
                public final Object apply(Object obj) {
                    return BookmarkPageFactory.z(eVar, obj);
                }
            });
        } else {
            iO0 = hc.I.o0(EmptyList.f217510a);
        }
        oT6.getClass();
        hc.I iV7 = hc.I.m(oT6, iO0).v7();
        final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.html.bookmark.g
            @Override // ed.l
            public final Object invoke(Object obj) {
                return BookmarkPageFactory.w(bVar, bookmarkPageFactory, (List) obj);
            }
        };
        return iV7.q0(new nc.o() { // from class: com.cookiegames.smartcookie.html.bookmark.h
            @Override // nc.o
            public final Object apply(Object obj) {
                return BookmarkPageFactory.x(lVar, obj);
            }
        });
    }

    public static final Pair w(a.b bVar, BookmarkPageFactory bookmarkPageFactory, List bookmarksAndFolders) {
        kotlin.jvm.internal.G.p(bookmarksAndFolders, "bookmarksAndFolders");
        List<T3.a> listF0 = J.f0(bookmarksAndFolders);
        ArrayList arrayList = new ArrayList(J.d0(listF0, 10));
        for (T3.a aVar : listF0) {
            kotlin.jvm.internal.G.m(aVar);
            arrayList.add(bookmarkPageFactory.u(aVar));
        }
        return new Pair(bVar, arrayList);
    }

    public static final Pair x(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (Pair) lVar.invoke(p02);
    }

    public static final List y(List it) {
        kotlin.jvm.internal.G.p(it, "it");
        ArrayList arrayList = new ArrayList();
        for (Object obj : it) {
            if (obj instanceof a.b.C0111a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List z(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (List) lVar.invoke(p02);
    }

    public final L0 L(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                bitmap.recycle();
                L0 l02 = L0.f217464a;
                fileOutputStream.close();
                return l02;
            } finally {
            }
        } catch (Throwable th) {
            Log.e("Closeable", "Unable to parse results", th);
            return null;
        }
    }

    public final String M(final List<w> list) {
        Document document = Jsoup.parse(this.f141300f.a(this.f141295a));
        kotlin.jvm.internal.G.o(document, "parse(...)");
        return C5145a.b(document, new ed.l() { // from class: com.cookiegames.smartcookie.html.bookmark.a
            @Override // ed.l
            public final Object invoke(Object obj) {
                return BookmarkPageFactory.N(this.f141305a, list, (Document) obj);
            }
        });
    }

    @NotNull
    public final File O(@Nullable a.b bVar) {
        String strA;
        return new File(this.f141295a.getFilesDir(), androidx.compose.runtime.changelist.j.a((bVar == null || (strA = bVar.a()) == null || !(M.Q3(strA) ^ true)) ? "" : androidx.compose.runtime.changelist.j.a(bVar.a(), com.prism.gaia.download.a.f164606q), f141292l));
    }

    public final w P(a.C0110a c0110a) {
        File fileT;
        C4363f c4363fA = C4362e.a(Uri.parse(c0110a.f68304g));
        if (c4363fA != null) {
            fileT = C4360c.f200232f.a(this.f141295a, c4363fA);
            if (!fileT.exists()) {
                this.f141297c.d(this.f141297c.f(c0110a.f68305h), c0110a.f68304g).G0(this.f141299e).C0();
            }
        } else {
            fileT = T();
        }
        if (c4363fA == null) {
            return new w("entry.title", "entry.url", "iconUrl.toString()");
        }
        String str = c0110a.f68305h;
        String str2 = c0110a.f68304g;
        String string = fileT.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return new w(str, str2, string);
    }

    public final w Q(a.b bVar) {
        String strA = C0923g.a(R3.a.f67727e, O(bVar));
        String strA2 = bVar.a();
        String string = U().toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return new w(strA2, strA, string);
    }

    public final File T() {
        return (File) this.f141303i.getValue();
    }

    public final File U() {
        return (File) this.f141302h.getValue();
    }

    @Override // g4.InterfaceC4451a
    @NotNull
    public hc.I<String> a() {
        hc.I<List<a.C0110a>> iD = this.f141296b.d();
        final k kVar = new k();
        z<U> zVarE0 = iD.e0(new nc.o() { // from class: com.cookiegames.smartcookie.html.bookmark.n
            @Override // nc.o
            public final Object apply(Object obj) {
                return BookmarkPageFactory.H(kVar, obj);
            }
        });
        final BookmarkPageFactory$buildPage$2 bookmarkPageFactory$buildPage$2 = new PropertyReference1Impl() { // from class: com.cookiegames.smartcookie.html.bookmark.BookmarkPageFactory$buildPage$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.p
            public Object get(Object obj) {
                return ((a.C0110a) obj).f68307j;
            }
        };
        nc.o oVar = new nc.o() { // from class: com.cookiegames.smartcookie.html.bookmark.o
            @Override // nc.o
            public final Object apply(Object obj) {
                return BookmarkPageFactory.I(bookmarkPageFactory$buildPage$2, obj);
            }
        };
        final p pVar = new p();
        z zVarR2 = zVarE0.R2(oVar, new nc.o() { // from class: com.cookiegames.smartcookie.html.bookmark.q
            @Override // nc.o
            public final Object apply(Object obj) {
                return BookmarkPageFactory.K(pVar, obj);
            }
        });
        final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.html.bookmark.r
            @Override // ed.l
            public final Object invoke(Object obj) {
                return BookmarkPageFactory.v(this.f141321a, (AbstractC5592b) obj);
            }
        };
        z zVarY2 = zVarR2.y2(new nc.o() { // from class: com.cookiegames.smartcookie.html.bookmark.s
            @Override // nc.o
            public final Object apply(Object obj) {
                return BookmarkPageFactory.A(lVar, obj);
            }
        }, false);
        final ed.l lVar2 = new ed.l() { // from class: com.cookiegames.smartcookie.html.bookmark.b
            @Override // ed.l
            public final Object invoke(Object obj) {
                return BookmarkPageFactory.B(this.f141307a, (Pair) obj);
            }
        };
        z zVarV3 = zVarY2.u3(new nc.o() { // from class: com.cookiegames.smartcookie.html.bookmark.c
            @Override // nc.o
            public final Object apply(Object obj) {
                return BookmarkPageFactory.C(lVar2, obj);
            }
        }).D5(this.f141298d).V3(this.f141299e);
        final ed.l lVar3 = new ed.l() { // from class: com.cookiegames.smartcookie.html.bookmark.d
            @Override // ed.l
            public final Object invoke(Object obj) {
                return BookmarkPageFactory.D(this.f141309a, (Pair) obj);
            }
        };
        InterfaceC5271g interfaceC5271g = new InterfaceC5271g() { // from class: com.cookiegames.smartcookie.html.bookmark.l
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                lVar3.invoke(obj);
            }
        };
        InterfaceC5271g<? super Throwable> interfaceC5271g2 = Functions.f202950d;
        InterfaceC5265a interfaceC5265a = Functions.f202949c;
        hc.I<String> iX0 = zVarV3.P1(interfaceC5271g, interfaceC5271g2, interfaceC5265a, interfaceC5265a).X2().X0(new Callable() { // from class: com.cookiegames.smartcookie.html.bookmark.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BookmarkPageFactory.F(this.f141317a);
            }
        });
        kotlin.jvm.internal.G.o(iX0, "toSingle(...)");
        return iX0;
    }

    public final w u(T3.a aVar) {
        if (aVar instanceof a.b) {
            return Q((a.b) aVar);
        }
        if (aVar instanceof a.C0110a) {
            return P((a.C0110a) aVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
