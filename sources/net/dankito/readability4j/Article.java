package net.dankito.readability4j;

import androidx.constraintlayout.motion.widget.s;
import com.prism.commons.utils.C3843g;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jsoup.nodes.Element;

/* JADX INFO: loaded from: classes5.dex */
public class Article {

    @Nullable
    private Element articleContent;

    @Nullable
    private String byline;

    @Nullable
    private String dir;

    @Nullable
    private String excerpt;
    private int length;

    @Nullable
    private String title;

    @NotNull
    private final String uri;

    public Article(@NotNull String uri) {
        G.q(uri, "uri");
        this.uri = uri;
        this.length = -1;
    }

    @Nullable
    public final Element getArticleContent() {
        return this.articleContent;
    }

    @Nullable
    public final String getByline() {
        return this.byline;
    }

    @Nullable
    public final String getContent() {
        Element element = this.articleContent;
        if (element != null) {
            return element.html();
        }
        return null;
    }

    @Nullable
    public final String getContentWithEncoding(@NotNull String encoding) {
        G.q(encoding, "encoding");
        String content = getContent();
        if (content != null) {
            return s.a("<html>\n  <head>\n    <meta charset=\"", encoding, "\"/>\n  </head>\n  <body>\n    ", content, "\n  </body>\n<html>");
        }
        return null;
    }

    @Nullable
    public final String getContentWithUtf8Encoding() {
        return getContentWithEncoding(C3843g.f162098b);
    }

    @Nullable
    public final String getDir() {
        return this.dir;
    }

    @Nullable
    public final String getExcerpt() {
        return this.excerpt;
    }

    public final int getLength() {
        String textContent = getTextContent();
        if (textContent != null) {
            return textContent.length();
        }
        return -1;
    }

    @Nullable
    public final String getTextContent() {
        Element element = this.articleContent;
        if (element != null) {
            return element.text();
        }
        return null;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public final void setArticleContent(@Nullable Element element) {
        this.articleContent = element;
    }

    public final void setByline(@Nullable String str) {
        this.byline = str;
    }

    public final void setDir(@Nullable String str) {
        this.dir = str;
    }

    public final void setExcerpt(@Nullable String str) {
        this.excerpt = str;
    }

    public final void setLength(int i10) {
        this.length = i10;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
