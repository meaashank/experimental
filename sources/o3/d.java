package O3;

import T3.a;
import T3.h;
import androidx.compose.runtime.internal.r;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.collections.EmptyList;
import kotlin.collections.H;
import kotlin.collections.N;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.F;
import org.jetbrains.annotations.NotNull;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nNetscapeBookmarkFormatImporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetscapeBookmarkFormatImporter.kt\ncom/cookiegames/smartcookie/bookmark/NetscapeBookmarkFormatImporter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n223#2,2:79\n766#2:81\n857#2,2:82\n1360#2:84\n1446#2,5:85\n*S KotlinDebug\n*F\n+ 1 NetscapeBookmarkFormatImporter.kt\ncom/cookiegames/smartcookie/bookmark/NetscapeBookmarkFormatImporter\n*L\n21#1:79,2\n31#1:81\n31#1:82,2\n32#1:84\n32#1:85,5\n*E\n"})
@r(parameters = 1)
public final class d implements O3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f65143a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f65144b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f65145c = "DT";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f65146d = "DL";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f65147e = "A";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f65148f = "H3";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f65149g = "HREF";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f65150h = "";

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @Inject
    public d() {
    }

    @Override // O3.a
    @NotNull
    public List<a.C0110a> a(@NotNull InputStream inputStream) {
        G.p(inputStream, "inputStream");
        Elements elementsChildren = Jsoup.parse(inputStream, "UTF-8", "").body().children();
        G.o(elementsChildren, "children(...)");
        int size = elementsChildren.size();
        int i10 = 0;
        while (i10 < size) {
            Element element = elementsChildren.get(i10);
            i10++;
            Element element2 = element;
            G.m(element2);
            if (F.e2(element2.tagName(), f65146d, true)) {
                G.m(element2);
                return d(element2, "");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final String b(String str, String str2) {
        return str.length() == 0 ? str2 : androidx.concurrent.futures.a.a(str, RemoteSettings.FORWARD_SLASH_STRING, str2);
    }

    public final boolean c(Element element, String str) {
        return F.e2(element.tagName(), str, true);
    }

    public final List<a.C0110a> d(Element element, String str) {
        List<a.C0110a> listL;
        Elements elementsChildren = element.children();
        G.o(elementsChildren, "children(...)");
        ArrayList arrayList = new ArrayList();
        int size = elementsChildren.size();
        int i10 = 0;
        while (i10 < size) {
            Element element2 = elementsChildren.get(i10);
            i10++;
            Element element3 = element2;
            G.m(element3);
            if (F.e2(element3.tagName(), f65145c, true)) {
                arrayList.add(element2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            Element elementChild = ((Element) obj).child(0);
            G.m(elementChild);
            if (F.e2(elementChild.tagName(), f65148f, true)) {
                Element elementNextElementSibling = elementChild.nextElementSibling();
                G.m(elementNextElementSibling);
                String strText = elementChild.text();
                G.o(strText, "text(...)");
                listL = d(elementNextElementSibling, b(str, strText));
            } else if (F.e2(elementChild.tagName(), "A", true)) {
                String strAttr = elementChild.attr(f65149g);
                G.o(strAttr, "attr(...)");
                String strText2 = elementChild.text();
                G.o(strText2, "text(...)");
                listL = H.l(new a.C0110a(strAttr, strText2, 0, h.a(str)));
            } else {
                listL = EmptyList.f217510a;
            }
            N.s0(arrayList2, listL);
        }
        return arrayList2;
    }
}
