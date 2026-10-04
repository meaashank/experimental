package net.dankito.readability4j.model;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class ArticleMetadata {

    @Nullable
    private String byline;

    @Nullable
    private String dir;

    @Nullable
    private String excerpt;

    @Nullable
    private String title;

    public ArticleMetadata() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final String getByline() {
        return this.byline;
    }

    @Nullable
    public final String getDir() {
        return this.dir;
    }

    @Nullable
    public final String getExcerpt() {
        return this.excerpt;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
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

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public ArticleMetadata(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.title = str;
        this.byline = str2;
        this.excerpt = str3;
        this.dir = str4;
    }

    public /* synthetic */ ArticleMetadata(String str, String str2, String str3, String str4, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
