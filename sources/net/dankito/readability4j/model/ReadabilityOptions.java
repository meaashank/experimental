package net.dankito.readability4j.model;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class ReadabilityOptions {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_MAX_ELEMS_TO_PARSE = 0;
    public static final int DEFAULT_N_TOP_CANDIDATES = 5;
    public static final int DEFAULT_WORD_THRESHOLD = 500;

    @NotNull
    private final Collection<String> additionalClassesToPreserve;
    private final int maxElemsToParse;
    private final int nbTopCandidates;
    private final int wordThreshold;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }
    }

    public ReadabilityOptions() {
        this(0, 0, 0, null, 15, null);
    }

    @NotNull
    public final Collection<String> getAdditionalClassesToPreserve() {
        return this.additionalClassesToPreserve;
    }

    public final int getMaxElemsToParse() {
        return this.maxElemsToParse;
    }

    public final int getNbTopCandidates() {
        return this.nbTopCandidates;
    }

    public final int getWordThreshold() {
        return this.wordThreshold;
    }

    public ReadabilityOptions(int i10, int i11, int i12, @NotNull Collection<String> additionalClassesToPreserve) {
        G.q(additionalClassesToPreserve, "additionalClassesToPreserve");
        this.maxElemsToParse = i10;
        this.nbTopCandidates = i11;
        this.wordThreshold = i12;
        this.additionalClassesToPreserve = additionalClassesToPreserve;
    }

    public /* synthetic */ ReadabilityOptions(int i10, int i11, int i12, Collection collection, int i13, C4969v c4969v) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 5 : i11, (i13 & 4) != 0 ? 500 : i12, (i13 & 8) != 0 ? new ArrayList() : collection);
    }
}
