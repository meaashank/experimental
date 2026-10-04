package r5;

import W0.j;
import W3.o;
import X3.i;
import Z3.f;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.core.app.NotificationCompat;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.regex.Pattern;
import kotlinx.coroutines.N;
import l.g;
import s0.x;
import v5.C5685a;

/* JADX INFO: renamed from: r5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5529a extends AbstractC5532d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f227175a = Pattern.compile("(\\b(\\d*[.]?\\d+)\\b)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f227176b = Pattern.compile("(!|\\+|-|\\*|<|>|=|\\?|\\||:|%|&)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f227177c = Pattern.compile("(\\(|\\)|\\{|\\}|\\[|\\])");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f227178d = Pattern.compile("([^\\r\\n,{}]+)(,(?=[^}]*\\{)|\\s*(?=\\{))");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f227179e = Pattern.compile("(?<=(function) )(\\w+)", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f227180f = Pattern.compile("\"(.*?)\"|'(.*?)'");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f227181g = Pattern.compile("/\\*(?:.|[\\n\\r])*?\\*/|//.*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char[] f227182h = {'{', '[', '(', '}', ']', ')'};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f227183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f227184j;

    static {
        String[] strArr = {":active", ":after", ":before", ":first", ":first-child", ":first-letter", ":first-line", ":focus", ":hover", ":lang", ":left", ":link", ":right", ":visited", "@charset", "@font-face", "@import", "@media", "@page", "above", "absolute", "ActiveBorder", "ActiveCaption", "always", "AppWorkspace", "aqua", "armenian", "attr", N.f218775c, "avoid", "azimuth", NotificationCompat.w.f110895C, "background-attachment", "background-color", "background-image", "background-position", "background-repeat", "baseline", "behind", "below", "bidi-override", "black", "blink", "block", "blue", "bold", "bolder", OutlinedTextFieldKt.f96719c, "border-bottom", "border-bottom-color", "border-bottom-style", "border-bottom-width", "border-collapse", "border-color", "border-left", "border-left-color", "border-left-style", "border-left-width", "border-right", "border-right-color", "border-right-style", "border-right-width", "border-spacing", "border-style", "border-top", "border-top-color", "border-top-style", "border-top-width", "border-width", "both", "bottom", "ButtonFace", "ButtonHighlight", "ButtonShadow", "ButtonText", "capitalize", "caption", "caption-side", "CaptionText", "center", "center-left", "center-right", "circle", "cjk-ideographic", "clear", "clip", "close-quote", f.f79422s, "collapse", "color", "compact", "condensed", "content", "continuous", "counter-increment", "counter-reset", "crop", "cros", "crosshair", "cue", "cue-after", "cue-before", "cursor", "decimal", "decimal-leading-zero", "default", "deg", "digits", "direction", "disc", "display", "e-resize", "elevation", "em", "embed", "empty-cells", "ex", "expanded", "extra-condensed", "extra-expanded", "far-left", "far-right", "fast", "faster", "fixed", x.b.f238262c, "font", "font-family", "font-size", "font-size-adjust", "font-stretch", "font-style", "font-variant", "font-weight", "fuchsia", "georgian", "grad", "gray", "GrayText", "green", j.d.f76481e, InMobiNetworkValues.HEIGHT, "help", "hidden", "hide", "high", "higher", "Highlight", "HighlightText", "hiragana", "hiragana-iroha", "hz", "icon", "InactiveBorder", "InactiveCaption", "InactiveCaptionText", "InfoBackground", "InfoText", "inherit", "inline", "inline-table", "inside", "italic", "justify", "katakana", "katakana-iroha", "khz", "landscape", "left", "left-side", "leftwards", "letter-spacing", FirebaseAnalytics.Param.LEVEL, "lighter", "lime", "line-height", "line-through", "list-item", "list-style", "list-style-image", "list-style-position", "list-style-type", "loud", "low", "lower", "lower-alpha", "lower-greek", "lower-latin", "lower-roman", "lowercase", "ltr", "margin", "margin-bottom", "margin-left", "margin-right", "margin-top", "marker", "marker-offset", "marks", "maroon", "max-height", "max-width", FirebaseAnalytics.Param.MEDIUM, g.f220834f, "MenuText", "message-box", "middle", "min-height", "min-width", "mix", "move", "ms", "n-resize", "narrower", "navy", "ne-resize", "no-close-quote", "no-open-quote", "no-repeat", "none", "normal", "nowrap", "nw-resize", "oblique", "olive", "once", "open-quote", "orphans", "outline", "outline-color", "outline-style", "outline-width", "outside", "overflow", "overline", "padding", "padding-bottom", "padding-left", "padding-right", "padding-top", "page", "page-break-after", "page-break-before", "page-break-inside", CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "pause-after", "pause-before", "pitch", "pitch-range", "play-during", "pointer", "portrait", o.f76584m, "pre", "pt", "purple", "px", "quotes", "rad", "red", "relative", "repeat", "repeat-x", "repeat-y", "richness", "right", "right-side", "rightwards", "rtl", "run-in", "s-resize", "scroll", "Scrollbar", "se-resize", "semi-condensed", "semi-expanded", "separate", "show", NotificationCompat.GROUP_KEY_SILENT, "silver", i.f76775k, "slow", "slower", "small-caps", "small-caption", "soft", "speak", "speak-header", "speak-numeral", "speak-ponctuation", "speech-rate", "spell-out", "square", "static", "status-bar", "stress", "sub", "super", "sw-resize", "table", "table-caption", "table-cell", "table-column", "table-column-group", "table-footer-group", "table-header-group", "table-layout", "table-row", "table-row-group", "teal", "text", "text-align", "text-bottom", "text-decoration", "text-indent", "text-shadow", "text-top", "text-transform", "ThreeDDarkShadow", "ThreeDFace", "ThreeDHighlight", "ThreeDLightShadow", "ThreeDShadow", "top", "transparent", "ultra-condensed", "ultra-expanded", "underline", "unicode-bidi", "upper-alpha", "upper-latin", "upper-roman", "uppercase", "vertical-align", "visibility", "visible", "voice-family", "volume", "w-resize", "wait", "white", "white-space", "wider", "widows", InMobiNetworkValues.WIDTH, "Window", "WindowFrame", "WindowText", "word-spacing", "x-fast", "x-high", "x-loud", "x-low", "x-slow", "x-soft", "yellow", "z-index"};
        f227183i = strArr;
        f227184j = (String[]) C5685a.a(String.class, strArr);
    }

    @Override // r5.AbstractC5532d
    public final String[] a() {
        return f227184j;
    }

    @Override // r5.AbstractC5532d
    public final char[] b() {
        return f227182h;
    }

    @Override // r5.AbstractC5532d
    public final Pattern c() {
        return f227177c;
    }

    @Override // r5.AbstractC5532d
    public final Pattern d() {
        return f227181g;
    }

    @Override // r5.AbstractC5532d
    public final Pattern e() {
        return f227178d;
    }

    @Override // r5.AbstractC5532d
    public final Pattern f() {
        return f227179e;
    }

    @Override // r5.AbstractC5532d
    public final Pattern g() {
        return f227175a;
    }

    @Override // r5.AbstractC5532d
    public final Pattern h() {
        return f227180f;
    }

    @Override // r5.AbstractC5532d
    public final Pattern i() {
        return f227176b;
    }
}
