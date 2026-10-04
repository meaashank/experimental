package net.dankito.readability4j.model;

import kotlin.jvm.internal.C4969v;

/* JADX INFO: loaded from: classes5.dex */
public class ArticleGrabberOptions {
    private boolean cleanConditionally;
    private boolean stripUnlikelyCandidates;
    private boolean weightClasses;

    public ArticleGrabberOptions() {
        this(false, false, false, 7, null);
    }

    public final boolean getCleanConditionally() {
        return this.cleanConditionally;
    }

    public final boolean getStripUnlikelyCandidates() {
        return this.stripUnlikelyCandidates;
    }

    public final boolean getWeightClasses() {
        return this.weightClasses;
    }

    public final void setCleanConditionally(boolean z10) {
        this.cleanConditionally = z10;
    }

    public final void setStripUnlikelyCandidates(boolean z10) {
        this.stripUnlikelyCandidates = z10;
    }

    public final void setWeightClasses(boolean z10) {
        this.weightClasses = z10;
    }

    public ArticleGrabberOptions(boolean z10, boolean z11, boolean z12) {
        this.stripUnlikelyCandidates = z10;
        this.weightClasses = z11;
        this.cleanConditionally = z12;
    }

    public /* synthetic */ ArticleGrabberOptions(boolean z10, boolean z11, boolean z12, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }
}
