package androidx.compose.ui.text;

import android.text.Editable;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: renamed from: androidx.compose.ui.text.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nHtml.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/AnnotationContentHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,292:1\n1#2:293\n3792#3:294\n4307#3,2:295\n33#4,6:297\n*S KotlinDebug\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/AnnotationContentHandler\n*L\n265#1:294\n265#1:295,2\n266#1:297,6\n*E\n"})
public final class C2301d implements ContentHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ContentHandler f104417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Editable f104418b;

    public C2301d(@NotNull ContentHandler contentHandler, @NotNull Editable editable) {
        this.f104417a = contentHandler;
        this.f104418b = editable;
    }

    public final void a() {
        Editable editable = this.f104418b;
        Object[] spans = editable.getSpans(0, editable.length(), C2302e.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (this.f104418b.getSpanFlags((C2302e) obj) == 17) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2302e c2302e = (C2302e) arrayList.get(i10);
            int spanStart = this.f104418b.getSpanStart(c2302e);
            int length = this.f104418b.length();
            this.f104418b.removeSpan(c2302e);
            if (spanStart != length) {
                this.f104418b.setSpan(c2302e, spanStart, length, 33);
            }
        }
    }

    public final void b(Attributes attributes) {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            String localName = attributes.getLocalName(i10);
            if (localName == null) {
                localName = "";
            }
            String value = attributes.getValue(i10);
            String str = value != null ? value : "";
            if (localName.length() > 0 && str.length() > 0) {
                int length2 = this.f104418b.length();
                this.f104418b.setSpan(new C2302e(localName, str), length2, length2, 17);
            }
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) throws SAXException {
        this.f104417a.characters(cArr, i10, i11);
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        this.f104417a.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(@Nullable String str, @Nullable String str2, @Nullable String str3) throws SAXException {
        if (kotlin.jvm.internal.G.g(str2, C2357j.f104863c)) {
            a();
        } else {
            this.f104417a.endElement(str, str2, str3);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
        this.f104417a.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i10, int i11) throws SAXException {
        this.f104417a.ignorableWhitespace(cArr, i10, i11);
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
        this.f104417a.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.f104417a.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
        this.f104417a.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        this.f104417a.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Attributes attributes) throws SAXException {
        if (!kotlin.jvm.internal.G.g(str2, C2357j.f104863c)) {
            this.f104417a.startElement(str, str2, str3, attributes);
        } else if (attributes != null) {
            b(attributes);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
        this.f104417a.startPrefixMapping(str, str2);
    }
}
