package net.dankito.readability4j.util;

import C4.q;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class RegExUtil {

    @NotNull
    public static final String BylineDefaultPattern = "byline|author|dateline|writtenby|p-author";
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ExtraneousDefaultPattern = "print|archive|comment|discuss|e[\\-]?mail|share|reply|all|login|sign|single|utility";

    @NotNull
    public static final String HasContentDefaultPattern = "\\S$";

    @NotNull
    public static final String NegativeDefaultPattern = "hidden|^hid$| hid$| hid |^hid |banner|combx|comment|com-|contact|foot|footer|footnote|masthead|media|meta|outbrain|promo|related|scroll|share|shoutbox|sidebar|skyscraper|sponsor|shopping|tags|tool|widget";

    @NotNull
    public static final String NextLinkDefaultPattern = "(next|weiter|continue|>([^\\|]|$)|»([^\\|]|$))";

    @NotNull
    public static final String NormalizeDefaultPattern = "\\s{2,}";

    @NotNull
    public static final String OkMaybeItsACandidateDefaultPattern = "and|article|body|column|main|shadow";

    @NotNull
    public static final String PositiveDefaultPattern = "article|body|content|entry|hentry|h-entry|main|page|pagination|post|text|blog|story";

    @NotNull
    public static final String PrevLinkDefaultPattern = "(prev|earl|old|new|<|«)";

    @NotNull
    public static final String ReplaceFontsDefaultPattern = "<(/?)font[^>]*>";

    @NotNull
    public static final String UnlikelyCandidatesDefaultPattern = "banner|breadcrumbs|combx|comment|community|cover-wrap|disqus|extra|foot|header|legends|menu|related|remark|replies|rss|shoutbox|sidebar|skyscraper|social|sponsor|supplemental|ad-break|agegate|pagination|pager|popup|yom-remote";

    @NotNull
    public static final String VideosDefaultPattern = "//(www\\.)?(dailymotion|youtube|youtube-nocookie|player\\.vimeo)\\.com";

    @NotNull
    public static final String WhitespaceDefaultPattern = "^\\s*$";

    @NotNull
    private final Pattern byline;

    @NotNull
    private final Pattern extraneous;

    @NotNull
    private final Pattern hasContent;

    @NotNull
    private final Pattern negative;

    @NotNull
    private final Pattern nextLink;

    @NotNull
    private final Pattern normalize;

    @NotNull
    private final Pattern okMaybeItsACandidate;

    @NotNull
    private final Pattern positive;

    @NotNull
    private final Pattern prevLink;

    @NotNull
    private final Pattern replaceFonts;

    @NotNull
    private final Pattern unlikelyCandidates;

    @NotNull
    private final Pattern videos;

    @NotNull
    private final Pattern whitespace;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }
    }

    public /* synthetic */ RegExUtil(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? UnlikelyCandidatesDefaultPattern : str, (i10 & 2) != 0 ? OkMaybeItsACandidateDefaultPattern : str2, (i10 & 4) != 0 ? PositiveDefaultPattern : str3, (i10 & 8) != 0 ? NegativeDefaultPattern : str4, (i10 & 16) != 0 ? ExtraneousDefaultPattern : str5, (i10 & 32) != 0 ? BylineDefaultPattern : str6, (i10 & 64) != 0 ? ReplaceFontsDefaultPattern : str7, (i10 & 128) != 0 ? NormalizeDefaultPattern : str8, (i10 & 256) != 0 ? VideosDefaultPattern : str9, (i10 & 512) != 0 ? NextLinkDefaultPattern : str10, (i10 & 1024) != 0 ? PrevLinkDefaultPattern : str11, (i10 & 2048) != 0 ? WhitespaceDefaultPattern : str12, (i10 & 4096) != 0 ? HasContentDefaultPattern : str13);
    }

    @NotNull
    public final Pattern getByline() {
        return this.byline;
    }

    @NotNull
    public final Pattern getExtraneous() {
        return this.extraneous;
    }

    @NotNull
    public final Pattern getHasContent() {
        return this.hasContent;
    }

    @NotNull
    public final Pattern getNegative() {
        return this.negative;
    }

    @NotNull
    public final Pattern getNextLink() {
        return this.nextLink;
    }

    @NotNull
    public final Pattern getNormalize() {
        return this.normalize;
    }

    @NotNull
    public final Pattern getOkMaybeItsACandidate() {
        return this.okMaybeItsACandidate;
    }

    @NotNull
    public final Pattern getPositive() {
        return this.positive;
    }

    @NotNull
    public final Pattern getPrevLink() {
        return this.prevLink;
    }

    @NotNull
    public final Pattern getReplaceFonts() {
        return this.replaceFonts;
    }

    @NotNull
    public final Pattern getUnlikelyCandidates() {
        return this.unlikelyCandidates;
    }

    @NotNull
    public final Pattern getVideos() {
        return this.videos;
    }

    @NotNull
    public final Pattern getWhitespace() {
        return this.whitespace;
    }

    public boolean hasContent(@NotNull String matchString) {
        G.q(matchString, "matchString");
        return this.hasContent.matcher(matchString).find();
    }

    public boolean isByline(@NotNull String matchString) {
        G.q(matchString, "matchString");
        return this.byline.matcher(matchString).find();
    }

    public boolean isNegative(@NotNull String matchString) {
        G.q(matchString, "matchString");
        return this.negative.matcher(matchString).find();
    }

    public boolean isPositive(@NotNull String matchString) {
        G.q(matchString, "matchString");
        return this.positive.matcher(matchString).find();
    }

    public boolean isUnlikelyCandidate(@NotNull String matchString) {
        G.q(matchString, "matchString");
        return this.unlikelyCandidates.matcher(matchString).find();
    }

    public boolean isVideo(@NotNull String matchString) {
        G.q(matchString, "matchString");
        return this.videos.matcher(matchString).find();
    }

    public boolean isWhitespace(@NotNull String matchString) {
        G.q(matchString, "matchString");
        return this.whitespace.matcher(matchString).find();
    }

    @NotNull
    public String normalize(@NotNull String text) {
        G.q(text, "text");
        String strReplaceAll = this.normalize.matcher(text).replaceAll(q.f17581a);
        G.h(strReplaceAll, "normalize.matcher(text).replaceAll(\" \")");
        return strReplaceAll;
    }

    public boolean okMaybeItsACandidate(@NotNull String matchString) {
        G.q(matchString, "matchString");
        return this.okMaybeItsACandidate.matcher(matchString).find();
    }

    public RegExUtil(@NotNull String unlikelyCandidatesPattern, @NotNull String okMaybeItsACandidatePattern, @NotNull String positivePattern, @NotNull String negativePattern, @NotNull String extraneousPattern, @NotNull String bylinePattern, @NotNull String replaceFontsPattern, @NotNull String normalizePattern, @NotNull String videosPattern, @NotNull String nextLinkPattern, @NotNull String prevLinkPattern, @NotNull String whitespacePattern, @NotNull String hasContentPattern) {
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
        Pattern patternCompile = Pattern.compile(unlikelyCandidatesPattern, 2);
        G.h(patternCompile, "Pattern.compile(unlikely…Pattern.CASE_INSENSITIVE)");
        this.unlikelyCandidates = patternCompile;
        Pattern patternCompile2 = Pattern.compile(okMaybeItsACandidatePattern, 2);
        G.h(patternCompile2, "Pattern.compile(okMaybeI…Pattern.CASE_INSENSITIVE)");
        this.okMaybeItsACandidate = patternCompile2;
        Pattern patternCompile3 = Pattern.compile(positivePattern, 2);
        G.h(patternCompile3, "Pattern.compile(positive…Pattern.CASE_INSENSITIVE)");
        this.positive = patternCompile3;
        Pattern patternCompile4 = Pattern.compile(negativePattern, 2);
        G.h(patternCompile4, "Pattern.compile(negative…Pattern.CASE_INSENSITIVE)");
        this.negative = patternCompile4;
        Pattern patternCompile5 = Pattern.compile(extraneousPattern, 2);
        G.h(patternCompile5, "Pattern.compile(extraneo…Pattern.CASE_INSENSITIVE)");
        this.extraneous = patternCompile5;
        Pattern patternCompile6 = Pattern.compile(bylinePattern, 2);
        G.h(patternCompile6, "Pattern.compile(bylinePa…Pattern.CASE_INSENSITIVE)");
        this.byline = patternCompile6;
        Pattern patternCompile7 = Pattern.compile(replaceFontsPattern, 2);
        G.h(patternCompile7, "Pattern.compile(replaceF…Pattern.CASE_INSENSITIVE)");
        this.replaceFonts = patternCompile7;
        Pattern patternCompile8 = Pattern.compile(normalizePattern);
        G.h(patternCompile8, "Pattern.compile(normalizePattern)");
        this.normalize = patternCompile8;
        Pattern patternCompile9 = Pattern.compile(videosPattern, 2);
        G.h(patternCompile9, "Pattern.compile(videosPa…Pattern.CASE_INSENSITIVE)");
        this.videos = patternCompile9;
        Pattern patternCompile10 = Pattern.compile(nextLinkPattern, 2);
        G.h(patternCompile10, "Pattern.compile(nextLink…Pattern.CASE_INSENSITIVE)");
        this.nextLink = patternCompile10;
        Pattern patternCompile11 = Pattern.compile(prevLinkPattern, 2);
        G.h(patternCompile11, "Pattern.compile(prevLink…Pattern.CASE_INSENSITIVE)");
        this.prevLink = patternCompile11;
        Pattern patternCompile12 = Pattern.compile(whitespacePattern);
        G.h(patternCompile12, "Pattern.compile(whitespacePattern)");
        this.whitespace = patternCompile12;
        Pattern patternCompile13 = Pattern.compile(hasContentPattern);
        G.h(patternCompile13, "Pattern.compile(hasContentPattern)");
        this.hasContent = patternCompile13;
    }
}
