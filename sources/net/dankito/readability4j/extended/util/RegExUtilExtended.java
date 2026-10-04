package net.dankito.readability4j.extended.util;

import java.util.regex.Pattern;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import net.dankito.readability4j.util.RegExUtil;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class RegExUtilExtended extends RegExUtil {
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String NegativeDefaultPatternExtended = "|float";

    @NotNull
    public static final String RemoveImageDefaultPattern = "author|avatar|thumbnail";

    @NotNull
    private final Pattern removeImage;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }
    }

    public /* synthetic */ RegExUtilExtended(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? RegExUtil.UnlikelyCandidatesDefaultPattern : str, (i10 & 2) != 0 ? RegExUtil.OkMaybeItsACandidateDefaultPattern : str2, (i10 & 4) != 0 ? RegExUtil.PositiveDefaultPattern : str3, (i10 & 8) != 0 ? "hidden|^hid$| hid$| hid |^hid |banner|combx|comment|com-|contact|foot|footer|footnote|masthead|media|meta|outbrain|promo|related|scroll|share|shoutbox|sidebar|skyscraper|sponsor|shopping|tags|tool|widget|float" : str4, (i10 & 16) != 0 ? RegExUtil.ExtraneousDefaultPattern : str5, (i10 & 32) != 0 ? RegExUtil.BylineDefaultPattern : str6, (i10 & 64) != 0 ? RegExUtil.ReplaceFontsDefaultPattern : str7, (i10 & 128) != 0 ? RegExUtil.NormalizeDefaultPattern : str8, (i10 & 256) != 0 ? RegExUtil.VideosDefaultPattern : str9, (i10 & 512) != 0 ? RegExUtil.NextLinkDefaultPattern : str10, (i10 & 1024) != 0 ? RegExUtil.PrevLinkDefaultPattern : str11, (i10 & 2048) != 0 ? RegExUtil.WhitespaceDefaultPattern : str12, (i10 & 4096) != 0 ? RegExUtil.HasContentDefaultPattern : str13, (i10 & 8192) != 0 ? RemoveImageDefaultPattern : str14);
    }

    @NotNull
    public final Pattern getRemoveImage() {
        return this.removeImage;
    }

    public boolean keepImage(@NotNull String matchString) {
        G.q(matchString, "matchString");
        return (!isNegative(matchString) || isPositive(matchString)) && !this.removeImage.matcher(matchString).find();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegExUtilExtended(@NotNull String unlikelyCandidatesPattern, @NotNull String okMaybeItsACandidatePattern, @NotNull String positivePattern, @NotNull String negativePattern, @NotNull String extraneousPattern, @NotNull String bylinePattern, @NotNull String replaceFontsPattern, @NotNull String normalizePattern, @NotNull String videosPattern, @NotNull String nextLinkPattern, @NotNull String prevLinkPattern, @NotNull String whitespacePattern, @NotNull String hasContentPattern, @NotNull String removeImagePattern) {
        super(unlikelyCandidatesPattern, okMaybeItsACandidatePattern, positivePattern, negativePattern, extraneousPattern, bylinePattern, replaceFontsPattern, normalizePattern, videosPattern, nextLinkPattern, prevLinkPattern, whitespacePattern, hasContentPattern);
        G.q(unlikelyCandidatesPattern, "unlikelyCandidatesPattern");
        G.q(okMaybeItsACandidatePattern, "okMaybeItsACandidatePattern");
        G.q(positivePattern, "positivePattern");
        G.q(negativePattern, "negativePattern");
        G.q(extraneousPattern, "extraneousPattern");
        G.q(bylinePattern, "bylinePattern");
        G.q(replaceFontsPattern, "replaceFontsPattern");
        G.q(normalizePattern, "normalizePattern");
        G.q(videosPattern, "videosPattern");
        G.q(nextLinkPattern, "nextLinkPattern");
        G.q(prevLinkPattern, "prevLinkPattern");
        G.q(whitespacePattern, "whitespacePattern");
        G.q(hasContentPattern, "hasContentPattern");
        G.q(removeImagePattern, "removeImagePattern");
        Pattern patternCompile = Pattern.compile(removeImagePattern);
        G.h(patternCompile, "Pattern.compile(removeImagePattern)");
        this.removeImage = patternCompile;
    }
}
