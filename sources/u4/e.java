package u4;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.semantics.s;
import b4.C2781b;
import com.cookiegames.smartcookie.AppTheme;
import com.cookiegames.smartcookie.browser.ChooseNavbarCol;
import com.cookiegames.smartcookie.browser.DrawerLineChoice;
import com.cookiegames.smartcookie.browser.DrawerSizeChoice;
import com.cookiegames.smartcookie.browser.HomepageTypeChoice;
import com.cookiegames.smartcookie.browser.JavaScriptChoice;
import com.cookiegames.smartcookie.browser.PasswordChoice;
import com.cookiegames.smartcookie.browser.ProxyChoice;
import com.cookiegames.smartcookie.browser.SearchBoxDisplayChoice;
import com.cookiegames.smartcookie.browser.SiteBlockChoice;
import com.cookiegames.smartcookie.browser.SuggestionNumChoice;
import com.cookiegames.smartcookie.view.RenderingMode;
import gc.C4470a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kd.InterfaceC4846f;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.V;
import kotlin.reflect.l;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v4.j;
import y4.C5830k;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
@V({"SMAP\nUserPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserPreferences.kt\ncom/cookiegames/smartcookie/preference/UserPreferences\n+ 2 EnumPreference.kt\ncom/cookiegames/smartcookie/preference/delegates/EnumPreferenceKt\n*L\n1#1,529:1\n36#2,6:530\n36#2,6:536\n36#2,6:542\n36#2,6:548\n36#2,6:554\n36#2,6:560\n36#2,6:566\n36#2,6:572\n36#2,6:578\n36#2,6:584\n36#2,6:590\n36#2,6:596\n36#2,6:602\n*S KotlinDebug\n*F\n+ 1 UserPreferences.kt\ncom/cookiegames/smartcookie/preference/UserPreferences\n*L\n26#1:530,6\n29#1:536,6\n32#1:542,6\n36#1:548,6\n39#1:554,6\n202#1:560,6\n221#1:566,6\n243#1:572,6\n295#1:578,6\n300#1:584,6\n353#1:590,6\n356#1:596,6\n416#1:602,6\n*E\n"})
@r(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f239380i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final int f239381j1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239382A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239383A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239384B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239385B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239386C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239387C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239388D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239389D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239390E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239391E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239392F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239393F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239394G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239395G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239396H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239397H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239398I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239399I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239400J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239401J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239402K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239403K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239404L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239405L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239406M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239407M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239408N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239409N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239410O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239411O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239412P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239413P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239414Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239415Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239416R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239417R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239418S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239419S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239420T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239421T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239422U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239423U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239424V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239425V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239426W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239427W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239428X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239429X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239430Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    @NotNull
    public final String[] f239431Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239432Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239433Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239434a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239435a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239436a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239437b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239438b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239439b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239440c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239441c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239442c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239443d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239444d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239445d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239446e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239447e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239448e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239449f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239450f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239451f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239452g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239453g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239454g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239455h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239456h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239457h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239458i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239459i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239460j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239461j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239462k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239463k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239464l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239465l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239466m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239467m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239468n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239469n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239470o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239471o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239472p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239473p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239474q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239475q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239476r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239477r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239478s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239479s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239480t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239481t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239482u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239483u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239484v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239485v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239486w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239487w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239488x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239489x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239490y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239491y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239492z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @NotNull
    public final InterfaceC4846f f239493z0;

    static {
        l lVarK = O.k(new MutablePropertyReference1Impl(e.class, "siteBlockChoice", "getSiteBlockChoice()Lcom/cookiegames/smartcookie/browser/SiteBlockChoice;", 0));
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(e.class, "siteBlockNames", "getSiteBlockNames()Ljava/lang/String;", 0);
        P p10 = O.f217893a;
        f239380i1 = new n[]{lVarK, p10.i(mutablePropertyReference1Impl), s.a(e.class, "javaScriptChoice", "getJavaScriptChoice()Lcom/cookiegames/smartcookie/browser/JavaScriptChoice;", 0, p10), s.a(e.class, "javaScriptBlocked", "getJavaScriptBlocked()Ljava/lang/String;", 0, p10), s.a(e.class, "navbarColChoice", "getNavbarColChoice()Lcom/cookiegames/smartcookie/browser/ChooseNavbarCol;", 0, p10), s.a(e.class, g.f239560e1, "getDrawerOffset()I", 0, p10), s.a(e.class, "passwordChoice", "getPasswordChoice()Lcom/cookiegames/smartcookie/browser/PasswordChoice;", 0, p10), s.a(e.class, "passwordText", "getPasswordText()Ljava/lang/String;", 0, p10), s.a(e.class, "passwordChoiceLock", "getPasswordChoiceLock()Lcom/cookiegames/smartcookie/browser/PasswordChoice;", 0, p10), s.a(e.class, "passwordTextLock", "getPasswordTextLock()Ljava/lang/String;", 0, p10), s.a(e.class, "webRtcEnabled", "getWebRtcEnabled()Z", 0, p10), s.a(e.class, "blockMalwareEnabled", "getBlockMalwareEnabled()Z", 0, p10), s.a(e.class, "startPageThemeEnabled", "getStartPageThemeEnabled()Z", 0, p10), s.a(e.class, "tabsToForegroundEnabled", "getTabsToForegroundEnabled()Z", 0, p10), s.a(e.class, g.f239557d1, "getStackFromBottom()Z", 0, p10), s.a(e.class, "adBlockEnabled", "getAdBlockEnabled()Z", 0, p10), s.a(e.class, "cookieBlockEnabled", "getCookieBlockEnabled()Z", 0, p10), s.a(e.class, "preferHTTPSenabled", "getPreferHTTPSenabled()Z", 0, p10), s.a(e.class, "forceHTTPSenabled", "getForceHTTPSenabled()Z", 0, p10), s.a(e.class, "blockImagesEnabled", "getBlockImagesEnabled()Z", 0, p10), s.a(e.class, "clearCacheExit", "getClearCacheExit()Z", 0, p10), s.a(e.class, "cookiesEnabled", "getCookiesEnabled()Z", 0, p10), s.a(e.class, "downloadDirectory", "getDownloadDirectory()Ljava/lang/String;", 0, p10), s.a(e.class, "fullScreenEnabled", "getFullScreenEnabled()Z", 0, p10), s.a(e.class, "hideStatusBarEnabled", "getHideStatusBarEnabled()Z", 0, p10), s.a(e.class, "homepage", "getHomepage()Ljava/lang/String;", 0, p10), s.a(e.class, "incognitoCookiesEnabled", "getIncognitoCookiesEnabled()Z", 0, p10), s.a(e.class, "javaScriptEnabled", "getJavaScriptEnabled()Z", 0, p10), s.a(e.class, "locationEnabled", "getLocationEnabled()Z", 0, p10), s.a(e.class, "overviewModeEnabled", "getOverviewModeEnabled()Z", 0, p10), s.a(e.class, "popupsEnabled", "getPopupsEnabled()Z", 0, p10), s.a(e.class, "restoreLostTabsEnabled", "getRestoreLostTabsEnabled()Z", 0, p10), s.a(e.class, "savePasswordsEnabled", "getSavePasswordsEnabled()Z", 0, p10), s.a(e.class, "searchChoice", "getSearchChoice()I", 0, p10), s.a(e.class, "searchUrl", "getSearchUrl()Ljava/lang/String;", 0, p10), s.a(e.class, "textReflowEnabled", "getTextReflowEnabled()Z", 0, p10), s.a(e.class, "textSize", "getTextSize()I", 0, p10), s.a(e.class, "useWideViewPortEnabled", "getUseWideViewPortEnabled()Z", 0, p10), s.a(e.class, "userAgentChoice", "getUserAgentChoice()I", 0, p10), s.a(e.class, g.f239494A, "getUserAgentString()Ljava/lang/String;", 0, p10), s.a(e.class, "imageUrlString", "getImageUrlString()Ljava/lang/String;", 0, p10), s.a(e.class, "whatsNewEnabled", "getWhatsNewEnabled()Z", 0, p10), s.a(e.class, "clearHistoryExitEnabled", "getClearHistoryExitEnabled()Z", 0, p10), s.a(e.class, "clearCookiesExitEnabled", "getClearCookiesExitEnabled()Z", 0, p10), s.a(e.class, "renderingMode", "getRenderingMode()Lcom/cookiegames/smartcookie/view/RenderingMode;", 0, p10), s.a(e.class, "blockThirdPartyCookiesEnabled", "getBlockThirdPartyCookiesEnabled()Z", 0, p10), s.a(e.class, "colorModeEnabled", "getColorModeEnabled()Z", 0, p10), s.a(e.class, "urlBoxContentChoice", "getUrlBoxContentChoice()Lcom/cookiegames/smartcookie/browser/SearchBoxDisplayChoice;", 0, p10), s.a(e.class, g.f239508H, "getInvertColors()Z", 0, p10), s.a(e.class, g.f239510I, "getReadingTextSize()I", 0, p10), s.a(e.class, g.f239584q0, "getBottomBar()Z", 0, p10), s.a(e.class, "incognito", "getIncognito()Z", 0, p10), s.a(e.class, "forceZoom", "getForceZoom()Z", 0, p10), s.a(e.class, "useTheme", "getUseTheme()Lcom/cookiegames/smartcookie/AppTheme;", 0, p10), s.a(e.class, g.f239514K, "getTextEncoding()Ljava/lang/String;", 0, p10), s.a(e.class, "clearWebStorageExitEnabled", "getClearWebStorageExitEnabled()Z", 0, p10), s.a(e.class, g.f239518M, "getShowTabsInDrawer()Z", 0, p10), s.a(e.class, "doNotTrackEnabled", "getDoNotTrackEnabled()Z", 0, p10), s.a(e.class, "saveDataEnabled", "getSaveDataEnabled()Z", 0, p10), s.a(e.class, "removeIdentifyingHeadersEnabled", "getRemoveIdentifyingHeadersEnabled()Z", 0, p10), s.a(e.class, "bookmarksAndTabsSwapped", "getBookmarksAndTabsSwapped()Z", 0, p10), s.a(e.class, "useBlackStatusBar", "getUseBlackStatusBar()Z", 0, p10), s.a(e.class, g.f239582p0, "getShowExtraOptions()Z", 0, p10), s.a(e.class, "suggestionChoice", "getSuggestionChoice()Lcom/cookiegames/smartcookie/browser/SuggestionNumChoice;", 0, p10), s.a(e.class, g.f239530S, "getProxyChoice()Lcom/cookiegames/smartcookie/browser/ProxyChoice;", 0, p10), s.a(e.class, "proxyHost", "getProxyHost()Ljava/lang/String;", 0, p10), s.a(e.class, "proxyPort", "getProxyPort()I", 0, p10), s.a(e.class, "searchSuggestionChoice", "getSearchSuggestionChoice()I", 0, p10), s.a(e.class, g.f239540X, "getHostsSource()I", 0, p10), s.a(e.class, g.f239542Y, "getHostsLocalFile()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239544Z, "getHostsRemoteFile()Ljava/lang/String;", 0, p10), s.a(e.class, "darkModeExtension", "getDarkModeExtension()Z", 0, p10), s.a(e.class, "translateExtension", "getTranslateExtension()Z", 0, p10), s.a(e.class, "colorNavbar", "getColorNavbar()I", 0, p10), s.a(e.class, g.f239546a, "getFirstLaunch()Z", 0, p10), s.a(e.class, "closeOnLastTab", "getCloseOnLastTab()Z", 0, p10), s.a(e.class, "blockIntent", "getBlockIntent()Z", 0, p10), s.a(e.class, "onlyForceClose", "getOnlyForceClose()Z", 0, p10), s.a(e.class, "drawerLines", "getDrawerLines()Lcom/cookiegames/smartcookie/browser/DrawerLineChoice;", 0, p10), s.a(e.class, "drawerSize", "getDrawerSize()Lcom/cookiegames/smartcookie/browser/DrawerSizeChoice;", 0, p10), s.a(e.class, g.f239497B0, "getSsl()Z", 0, p10), s.a(e.class, g.f239539W0, "getShowShortcuts()Z", 0, p10), s.a(e.class, g.f239499C0, "getLink1()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239501D0, "getLink2()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239503E0, "getLink3()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239505F0, "getLink4()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239507G0, "getLink5()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239509H0, "getLink6()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239511I0, "getLink7()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239513J0, "getLink8()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239515K0, "getLink9()Ljava/lang/String;", 0, p10), s.a(e.class, "link10", "getLink10()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239517L0, "getLink1_shortcut()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239519M0, "getLink2_shortcut()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239521N0, "getLink3_shortcut()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239523O0, "getLink4_shortcut()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239525P0, "getLink5_shortcut()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239527Q0, "getLink6_shortcut()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239529R0, "getLink7_shortcut()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239531S0, "getLink8_shortcut()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239533T0, "getLink9_shortcut()Ljava/lang/String;", 0, p10), s.a(e.class, "link10_shortcut", "getLink10_shortcut()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239548a1, "getTranslationEndpoint()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239551b1, "getNewsEndpoint()Ljava/lang/String;", 0, p10), s.a(e.class, g.f239535U0, "getUseThirdPartyDownloaderApps()Z", 0, p10), s.a(e.class, "navbar", "getNavbar()Z", 0, p10), s.a(e.class, g.f239537V0, "getAllTabs()Z", 0, p10), s.a(e.class, g.f239543Y0, "getNoAmp()Z", 0, p10), s.a(e.class, g.f239545Z0, "getShowDownloadConfirmation()Z", 0, p10), s.a(e.class, g.f239549b, "getFirstLaunch111()Z", 0, p10), s.a(e.class, g.f239554c1, "getHomepageType()Lcom/cookiegames/smartcookie/browser/HomepageTypeChoice;", 0, p10)};
        f239381j1 = 8;
    }

    @Inject
    public e(@NotNull SharedPreferences preferences, @NotNull C2781b screenSize) {
        G.p(preferences, "preferences");
        G.p(screenSize, "screenSize");
        this.f239434a = new v4.c(g.f239553c0, SiteBlockChoice.NONE, SiteBlockChoice.class, preferences);
        this.f239437b = j.a(preferences, g.f239559e0, "");
        this.f239440c = new v4.c(g.f239562f0, JavaScriptChoice.NONE, JavaScriptChoice.class, preferences);
        this.f239443d = j.a(preferences, g.f239564g0, "");
        this.f239446e = new v4.c(g.f239594v0, ChooseNavbarCol.NONE, ChooseNavbarCol.class, preferences);
        this.f239449f = v4.f.a(preferences, g.f239560e1, 0);
        PasswordChoice passwordChoice = PasswordChoice.NONE;
        this.f239452g = new v4.c("password", passwordChoice, PasswordChoice.class, preferences);
        this.f239455h = j.a(preferences, g.f239568i0, "");
        this.f239458i = new v4.c(g.f239572k0, passwordChoice, PasswordChoice.class, preferences);
        this.f239460j = j.a(preferences, g.f239570j0, "");
        this.f239462k = v4.b.a(preferences, g.f239552c, true);
        this.f239464l = v4.b.a(preferences, g.f239574l0, true);
        this.f239466m = v4.b.a(preferences, g.f239578n0, true);
        this.f239468n = v4.b.a(preferences, g.f239580o0, true);
        this.f239470o = v4.b.a(preferences, g.f239557d1, false);
        this.f239472p = v4.b.a(preferences, g.f239558e, true);
        this.f239474q = v4.b.a(preferences, g.f239576m0, false);
        this.f239476r = v4.b.a(preferences, g.f239547a0, false);
        this.f239478s = v4.b.a(preferences, g.f239550b0, false);
        this.f239480t = v4.b.a(preferences, g.f239563g, false);
        this.f239482u = v4.b.a(preferences, g.f239565h, false);
        this.f239484v = v4.b.a(preferences, g.f239567i, true);
        String DEFAULT_DOWNLOAD_PATH = C4.e.f17551b;
        G.o(DEFAULT_DOWNLOAD_PATH, "DEFAULT_DOWNLOAD_PATH");
        this.f239486w = j.a(preferences, g.f239569j, DEFAULT_DOWNLOAD_PATH);
        this.f239488x = v4.b.a(preferences, "fullscreen", true);
        this.f239490y = v4.b.a(preferences, g.f239573l, false);
        this.f239492z = j.a(preferences, "home", R3.a.f67730h);
        this.f239382A = v4.b.a(preferences, g.f239577n, false);
        this.f239384B = v4.b.a(preferences, g.f239579o, true);
        this.f239386C = v4.b.a(preferences, "location", false);
        this.f239388D = v4.b.a(preferences, g.f239583q, true);
        this.f239390E = v4.b.a(preferences, g.f239585r, true);
        this.f239392F = v4.b.a(preferences, g.f239587s, true);
        this.f239394G = v4.b.a(preferences, g.f239589t, true);
        this.f239396H = v4.f.a(preferences, "search", 1);
        new C5830k();
        this.f239398I = j.a(preferences, g.f239593v, "https://www.google.com/search?client=smartcookieweb&ie=UTF-8&oe=UTF-8&q=");
        this.f239400J = v4.b.a(preferences, g.f239595w, false);
        this.f239402K = v4.f.a(preferences, g.f239597x, 3);
        this.f239404L = v4.b.a(preferences, g.f239599y, true);
        this.f239406M = v4.f.a(preferences, g.f239601z, 1);
        this.f239408N = j.a(preferences, g.f239494A, "");
        this.f239410O = j.a(preferences, g.f239586r0, "");
        this.f239412P = v4.b.a(preferences, g.f239588s0, true);
        this.f239414Q = v4.b.a(preferences, g.f239496B, false);
        this.f239416R = v4.b.a(preferences, g.f239498C, false);
        this.f239418S = new v4.c(g.f239500D, RenderingMode.NORMAL, RenderingMode.class, preferences);
        this.f239420T = v4.b.a(preferences, g.f239502E, false);
        this.f239422U = v4.b.a(preferences, g.f239504F, false);
        this.f239424V = new v4.c(g.f239506G, SearchBoxDisplayChoice.URL, SearchBoxDisplayChoice.class, preferences);
        this.f239426W = v4.b.a(preferences, g.f239508H, false);
        this.f239428X = v4.f.a(preferences, g.f239510I, 2);
        this.f239430Y = v4.b.a(preferences, g.f239584q0, false);
        this.f239432Z = v4.b.a(preferences, g.f239590t0, false);
        this.f239435a0 = v4.b.a(preferences, g.f239592u0, false);
        this.f239438b0 = new v4.c(g.f239512J, AppTheme.LIGHT, AppTheme.class, preferences);
        this.f239441c0 = j.a(preferences, g.f239514K, "UTF-8");
        this.f239444d0 = v4.b.a(preferences, g.f239516L, false);
        this.f239447e0 = v4.b.a(preferences, g.f239518M, !screenSize.a());
        this.f239450f0 = v4.b.a(preferences, g.f239520N, false);
        this.f239453g0 = v4.b.a(preferences, g.f239522O, false);
        this.f239456h0 = v4.b.a(preferences, g.f239524P, false);
        this.f239459i0 = v4.b.a(preferences, g.f239526Q, false);
        this.f239461j0 = v4.b.a(preferences, g.f239528R, false);
        this.f239463k0 = v4.b.a(preferences, g.f239582p0, false);
        this.f239465l0 = new v4.c(g.f239532T, SuggestionNumChoice.FIVE, SuggestionNumChoice.class, preferences);
        this.f239467m0 = new v4.c(g.f239530S, ProxyChoice.NONE, ProxyChoice.class, preferences);
        this.f239469n0 = j.a(preferences, g.f239534U, "localhost");
        this.f239471o0 = v4.f.a(preferences, g.f239536V, C4470a.f202368b);
        this.f239473p0 = v4.f.a(preferences, g.f239538W, 0);
        this.f239475q0 = v4.f.a(preferences, g.f239540X, 0);
        this.f239477r0 = v4.h.b(preferences, g.f239542Y, null, 2, null);
        this.f239479s0 = v4.h.b(preferences, g.f239544Z, null, 2, null);
        this.f239481t0 = v4.b.a(preferences, g.f239596w0, false);
        this.f239483u0 = v4.b.a(preferences, "translate", false);
        this.f239485v0 = v4.f.a(preferences, g.f239556d0, 0);
        this.f239487w0 = v4.b.a(preferences, g.f239546a, true);
        this.f239489x0 = v4.b.a(preferences, g.f239561f, true);
        this.f239491y0 = v4.b.a(preferences, g.f239600y0, true);
        this.f239493z0 = v4.b.a(preferences, g.f239555d, true);
        this.f239383A0 = new v4.c(g.f239602z0, DrawerLineChoice.THREE, DrawerLineChoice.class, preferences);
        this.f239385B0 = new v4.c(g.f239495A0, DrawerSizeChoice.AUTO, DrawerSizeChoice.class, preferences);
        this.f239387C0 = v4.b.a(preferences, g.f239497B0, true);
        this.f239389D0 = v4.b.a(preferences, g.f239539W0, true);
        this.f239391E0 = j.a(preferences, g.f239499C0, "https://www.facebook.com/");
        this.f239393F0 = j.a(preferences, g.f239501D0, "https://www.tiktok.com/");
        this.f239395G0 = j.a(preferences, g.f239503E0, "https://www.instagram.com/");
        this.f239397H0 = j.a(preferences, g.f239505F0, "https://www.messenger.com/");
        this.f239399I0 = j.a(preferences, g.f239507G0, "https://web.whatsapp.com/");
        this.f239401J0 = j.a(preferences, g.f239509H0, "https://web.telegram.org/");
        this.f239403K0 = j.a(preferences, g.f239511I0, "https://www.snapchat.com/download?purpose=snapchat_dot_com&sp=snapchat_dot_com");
        this.f239405L0 = j.a(preferences, g.f239511I0, "https://character.ai/");
        this.f239407M0 = j.a(preferences, g.f239513J0, "https://discord.com/");
        this.f239409N0 = j.a(preferences, g.f239515K0, "https://www.reddit.com/");
        this.f239411O0 = j.a(preferences, g.f239517L0, "https://www.facebook.com/");
        this.f239413P0 = j.a(preferences, g.f239519M0, "https://www.tiktok.com/");
        this.f239415Q0 = j.a(preferences, g.f239521N0, "file:///android_asset/instagram.webp");
        this.f239417R0 = j.a(preferences, g.f239523O0, "file:///android_asset/messenger.webp");
        this.f239419S0 = j.a(preferences, g.f239525P0, "https://web.whatsapp.com/");
        this.f239421T0 = j.a(preferences, g.f239527Q0, "https://web.telegram.org/");
        this.f239423U0 = j.a(preferences, g.f239529R0, "file:///android_asset/snapchat.webp");
        this.f239425V0 = j.a(preferences, g.f239529R0, "https://character.ai/");
        this.f239427W0 = j.a(preferences, g.f239531S0, "file:///android_asset/discord.webp");
        this.f239429X0 = j.a(preferences, g.f239533T0, "https://www.reddit.com/");
        this.f239431Y0 = new String[]{"messenger.com", "whatsapp.com", "snapchat.com", "discord.com", "snapchat.com", "google.com", "reddit.com", "character.ai", "googleapis.com", "youtube.com"};
        this.f239433Z0 = j.a(preferences, g.f239548a1, "");
        this.f239436a1 = j.a(preferences, g.f239551b1, "");
        this.f239439b1 = v4.b.a(preferences, g.f239535U0, false);
        this.f239442c1 = v4.b.a(preferences, g.f239541X0, false);
        this.f239445d1 = v4.b.a(preferences, g.f239537V0, false);
        this.f239448e1 = v4.b.a(preferences, g.f239543Y0, false);
        this.f239451f1 = v4.b.a(preferences, g.f239545Z0, true);
        this.f239454g1 = v4.b.a(preferences, g.f239549b, true);
        this.f239457h1 = new v4.c(g.f239554c1, HomepageTypeChoice.DEFAULT, HomepageTypeChoice.class, preferences);
    }

    public final boolean A() {
        return ((Boolean) this.f239478s.getValue(this, f239380i1[18])).booleanValue();
    }

    public final int A0() {
        return ((Number) this.f239428X.getValue(this, f239380i1[49])).intValue();
    }

    public final void A1(boolean z10) {
        this.f239450f0.setValue(this, f239380i1[57], Boolean.valueOf(z10));
    }

    public final void A2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239455h.setValue(this, f239380i1[7], str);
    }

    public final boolean B() {
        return ((Boolean) this.f239435a0.getValue(this, f239380i1[52])).booleanValue();
    }

    public final boolean B0() {
        return ((Boolean) this.f239456h0.getValue(this, f239380i1[59])).booleanValue();
    }

    public final void B1(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239486w.setValue(this, f239380i1[22], str);
    }

    public final void B2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239460j.setValue(this, f239380i1[9], str);
    }

    public final boolean C() {
        return ((Boolean) this.f239488x.getValue(this, f239380i1[23])).booleanValue();
    }

    @NotNull
    public final RenderingMode C0() {
        return (RenderingMode) this.f239418S.getValue(this, f239380i1[44]);
    }

    public final void C1(@NotNull DrawerLineChoice drawerLineChoice) {
        G.p(drawerLineChoice, "<set-?>");
        this.f239383A0.setValue(this, f239380i1[78], drawerLineChoice);
    }

    public final void C2(boolean z10) {
        this.f239390E.setValue(this, f239380i1[30], Boolean.valueOf(z10));
    }

    public final boolean D() {
        return ((Boolean) this.f239490y.getValue(this, f239380i1[24])).booleanValue();
    }

    public final boolean D0() {
        return ((Boolean) this.f239392F.getValue(this, f239380i1[31])).booleanValue();
    }

    public final void D1(int i10) {
        this.f239449f.setValue(this, f239380i1[5], Integer.valueOf(i10));
    }

    public final void D2(boolean z10) {
        this.f239476r.setValue(this, f239380i1[17], Boolean.valueOf(z10));
    }

    @NotNull
    public final String E() {
        return (String) this.f239492z.getValue(this, f239380i1[25]);
    }

    public final boolean E0() {
        return ((Boolean) this.f239453g0.getValue(this, f239380i1[58])).booleanValue();
    }

    public final void E1(@NotNull DrawerSizeChoice drawerSizeChoice) {
        G.p(drawerSizeChoice, "<set-?>");
        this.f239385B0.setValue(this, f239380i1[79], drawerSizeChoice);
    }

    public final void E2(@NotNull ProxyChoice proxyChoice) {
        G.p(proxyChoice, "<set-?>");
        this.f239467m0.setValue(this, f239380i1[64], proxyChoice);
    }

    @NotNull
    public final HomepageTypeChoice F() {
        return (HomepageTypeChoice) this.f239457h1.getValue(this, f239380i1[110]);
    }

    public final boolean F0() {
        return ((Boolean) this.f239394G.getValue(this, f239380i1[32])).booleanValue();
    }

    public final void F1(boolean z10) {
        this.f239487w0.setValue(this, f239380i1[74], Boolean.valueOf(z10));
    }

    public final void F2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239469n0.setValue(this, f239380i1[65], str);
    }

    @Nullable
    public final String G() {
        return (String) this.f239477r0.getValue(this, f239380i1[69]);
    }

    public final int G0() {
        return ((Number) this.f239396H.getValue(this, f239380i1[33])).intValue();
    }

    public final void G1(boolean z10) {
        this.f239454g1.setValue(this, f239380i1[109], Boolean.valueOf(z10));
    }

    public final void G2(int i10) {
        this.f239471o0.setValue(this, f239380i1[66], Integer.valueOf(i10));
    }

    @Nullable
    public final String H() {
        return (String) this.f239479s0.getValue(this, f239380i1[70]);
    }

    public final int H0() {
        return ((Number) this.f239473p0.getValue(this, f239380i1[67])).intValue();
    }

    public final void H1(boolean z10) {
        this.f239478s.setValue(this, f239380i1[18], Boolean.valueOf(z10));
    }

    public final void H2(int i10) {
        this.f239428X.setValue(this, f239380i1[49], Integer.valueOf(i10));
    }

    public final int I() {
        return ((Number) this.f239475q0.getValue(this, f239380i1[68])).intValue();
    }

    @NotNull
    public final String I0() {
        return (String) this.f239398I.getValue(this, f239380i1[34]);
    }

    public final void I1(boolean z10) {
        this.f239435a0.setValue(this, f239380i1[52], Boolean.valueOf(z10));
    }

    public final void I2(boolean z10) {
        this.f239456h0.setValue(this, f239380i1[59], Boolean.valueOf(z10));
    }

    @NotNull
    public final String J() {
        return (String) this.f239410O.getValue(this, f239380i1[40]);
    }

    public final boolean J0() {
        return ((Boolean) this.f239451f1.getValue(this, f239380i1[108])).booleanValue();
    }

    public final void J1(boolean z10) {
        this.f239488x.setValue(this, f239380i1[23], Boolean.valueOf(z10));
    }

    public final void J2(@NotNull RenderingMode renderingMode) {
        G.p(renderingMode, "<set-?>");
        this.f239418S.setValue(this, f239380i1[44], renderingMode);
    }

    public final boolean K() {
        return ((Boolean) this.f239432Z.getValue(this, f239380i1[51])).booleanValue();
    }

    public final boolean K0() {
        return ((Boolean) this.f239463k0.getValue(this, f239380i1[62])).booleanValue();
    }

    public final void K1(boolean z10) {
        this.f239490y.setValue(this, f239380i1[24], Boolean.valueOf(z10));
    }

    public final void K2(boolean z10) {
        this.f239392F.setValue(this, f239380i1[31], Boolean.valueOf(z10));
    }

    public final boolean L() {
        return ((Boolean) this.f239382A.getValue(this, f239380i1[26])).booleanValue();
    }

    public final boolean L0() {
        return ((Boolean) this.f239389D0.getValue(this, f239380i1[81])).booleanValue();
    }

    public final void L1(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239492z.setValue(this, f239380i1[25], str);
    }

    public final void L2(boolean z10) {
        this.f239453g0.setValue(this, f239380i1[58], Boolean.valueOf(z10));
    }

    public final boolean M() {
        return ((Boolean) this.f239426W.getValue(this, f239380i1[48])).booleanValue();
    }

    public final boolean M0() {
        return ((Boolean) this.f239447e0.getValue(this, f239380i1[56])).booleanValue();
    }

    public final void M1(@NotNull HomepageTypeChoice homepageTypeChoice) {
        G.p(homepageTypeChoice, "<set-?>");
        this.f239457h1.setValue(this, f239380i1[110], homepageTypeChoice);
    }

    public final void M2(boolean z10) {
        this.f239394G.setValue(this, f239380i1[32], Boolean.valueOf(z10));
    }

    @NotNull
    public final String N() {
        return (String) this.f239443d.getValue(this, f239380i1[3]);
    }

    @NotNull
    public final SiteBlockChoice N0() {
        return (SiteBlockChoice) this.f239434a.getValue(this, f239380i1[0]);
    }

    public final void N1(@Nullable String str) {
        this.f239477r0.setValue(this, f239380i1[69], str);
    }

    public final void N2(int i10) {
        this.f239396H.setValue(this, f239380i1[33], Integer.valueOf(i10));
    }

    @NotNull
    public final JavaScriptChoice O() {
        return (JavaScriptChoice) this.f239440c.getValue(this, f239380i1[2]);
    }

    @NotNull
    public final String O0() {
        return (String) this.f239437b.getValue(this, f239380i1[1]);
    }

    public final void O1(@Nullable String str) {
        this.f239479s0.setValue(this, f239380i1[70], str);
    }

    public final void O2(int i10) {
        this.f239473p0.setValue(this, f239380i1[67], Integer.valueOf(i10));
    }

    public final boolean P() {
        return ((Boolean) this.f239384B.getValue(this, f239380i1[27])).booleanValue();
    }

    public final boolean P0() {
        return ((Boolean) this.f239387C0.getValue(this, f239380i1[80])).booleanValue();
    }

    public final void P1(int i10) {
        this.f239475q0.setValue(this, f239380i1[68], Integer.valueOf(i10));
    }

    public final void P2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239398I.setValue(this, f239380i1[34], str);
    }

    @NotNull
    public final String Q() {
        return (String) this.f239391E0.getValue(this, f239380i1[82]);
    }

    public final boolean Q0() {
        return ((Boolean) this.f239470o.getValue(this, f239380i1[14])).booleanValue();
    }

    public final void Q1(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239410O.setValue(this, f239380i1[40], str);
    }

    public final void Q2(boolean z10) {
        this.f239451f1.setValue(this, f239380i1[108], Boolean.valueOf(z10));
    }

    @NotNull
    public final String R() {
        return (String) this.f239409N0.getValue(this, f239380i1[91]);
    }

    public final boolean R0() {
        return ((Boolean) this.f239466m.getValue(this, f239380i1[12])).booleanValue();
    }

    public final void R1(boolean z10) {
        this.f239432Z.setValue(this, f239380i1[51], Boolean.valueOf(z10));
    }

    public final void R2(boolean z10) {
        this.f239463k0.setValue(this, f239380i1[62], Boolean.valueOf(z10));
    }

    @NotNull
    public final String S() {
        return (String) this.f239429X0.getValue(this, f239380i1[101]);
    }

    @NotNull
    public final SuggestionNumChoice S0() {
        return (SuggestionNumChoice) this.f239465l0.getValue(this, f239380i1[63]);
    }

    public final void S1(boolean z10) {
        this.f239382A.setValue(this, f239380i1[26], Boolean.valueOf(z10));
    }

    public final void S2(boolean z10) {
        this.f239389D0.setValue(this, f239380i1[81], Boolean.valueOf(z10));
    }

    @NotNull
    public final String T() {
        return (String) this.f239411O0.getValue(this, f239380i1[92]);
    }

    public final boolean T0() {
        return ((Boolean) this.f239468n.getValue(this, f239380i1[13])).booleanValue();
    }

    public final void T1(boolean z10) {
        this.f239426W.setValue(this, f239380i1[48], Boolean.valueOf(z10));
    }

    public final void T2(boolean z10) {
        this.f239447e0.setValue(this, f239380i1[56], Boolean.valueOf(z10));
    }

    @NotNull
    public final String U() {
        return (String) this.f239393F0.getValue(this, f239380i1[83]);
    }

    @NotNull
    public final String U0() {
        return (String) this.f239441c0.getValue(this, f239380i1[54]);
    }

    public final void U1(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239443d.setValue(this, f239380i1[3], str);
    }

    public final void U2(@NotNull SiteBlockChoice siteBlockChoice) {
        G.p(siteBlockChoice, "<set-?>");
        this.f239434a.setValue(this, f239380i1[0], siteBlockChoice);
    }

    @NotNull
    public final String V() {
        return (String) this.f239413P0.getValue(this, f239380i1[93]);
    }

    public final boolean V0() {
        return ((Boolean) this.f239400J.getValue(this, f239380i1[35])).booleanValue();
    }

    public final void V1(@NotNull JavaScriptChoice javaScriptChoice) {
        G.p(javaScriptChoice, "<set-?>");
        this.f239440c.setValue(this, f239380i1[2], javaScriptChoice);
    }

    public final void V2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239437b.setValue(this, f239380i1[1], str);
    }

    @NotNull
    public final String W() {
        return (String) this.f239395G0.getValue(this, f239380i1[84]);
    }

    public final int W0() {
        return ((Number) this.f239402K.getValue(this, f239380i1[36])).intValue();
    }

    public final void W1(boolean z10) {
        this.f239384B.setValue(this, f239380i1[27], Boolean.valueOf(z10));
    }

    public final void W2(boolean z10) {
        this.f239387C0.setValue(this, f239380i1[80], Boolean.valueOf(z10));
    }

    @NotNull
    public final String X() {
        return (String) this.f239415Q0.getValue(this, f239380i1[94]);
    }

    public final boolean X0() {
        return ((Boolean) this.f239483u0.getValue(this, f239380i1[72])).booleanValue();
    }

    public final void X1(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239391E0.setValue(this, f239380i1[82], str);
    }

    public final void X2(boolean z10) {
        this.f239470o.setValue(this, f239380i1[14], Boolean.valueOf(z10));
    }

    @NotNull
    public final String Y() {
        return (String) this.f239397H0.getValue(this, f239380i1[85]);
    }

    @NotNull
    public final String Y0() {
        return (String) this.f239433Z0.getValue(this, f239380i1[102]);
    }

    public final void Y1(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239409N0.setValue(this, f239380i1[91], str);
    }

    public final void Y2(boolean z10) {
        this.f239466m.setValue(this, f239380i1[12], Boolean.valueOf(z10));
    }

    @NotNull
    public final String Z() {
        return (String) this.f239417R0.getValue(this, f239380i1[95]);
    }

    @NotNull
    public final SearchBoxDisplayChoice Z0() {
        return (SearchBoxDisplayChoice) this.f239424V.getValue(this, f239380i1[47]);
    }

    public final void Z1(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239429X0.setValue(this, f239380i1[101], str);
    }

    public final void Z2(@NotNull SuggestionNumChoice suggestionNumChoice) {
        G.p(suggestionNumChoice, "<set-?>");
        this.f239465l0.setValue(this, f239380i1[63], suggestionNumChoice);
    }

    public final boolean a() {
        return ((Boolean) this.f239472p.getValue(this, f239380i1[15])).booleanValue();
    }

    @NotNull
    public final String a0() {
        return (String) this.f239399I0.getValue(this, f239380i1[86]);
    }

    public final boolean a1() {
        return ((Boolean) this.f239461j0.getValue(this, f239380i1[61])).booleanValue();
    }

    public final void a2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239411O0.setValue(this, f239380i1[92], str);
    }

    public final void a3(boolean z10) {
        this.f239468n.setValue(this, f239380i1[13], Boolean.valueOf(z10));
    }

    public final boolean b() {
        return ((Boolean) this.f239445d1.getValue(this, f239380i1[106])).booleanValue();
    }

    @NotNull
    public final String b0() {
        return (String) this.f239419S0.getValue(this, f239380i1[96]);
    }

    @NotNull
    public final AppTheme b1() {
        return (AppTheme) this.f239438b0.getValue(this, f239380i1[53]);
    }

    public final void b2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239393F0.setValue(this, f239380i1[83], str);
    }

    public final void b3(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239441c0.setValue(this, f239380i1[54], str);
    }

    public final boolean c() {
        return ((Boolean) this.f239480t.getValue(this, f239380i1[19])).booleanValue();
    }

    @NotNull
    public final String c0() {
        return (String) this.f239401J0.getValue(this, f239380i1[87]);
    }

    public final boolean c1() {
        return ((Boolean) this.f239439b1.getValue(this, f239380i1[104])).booleanValue();
    }

    public final void c2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239413P0.setValue(this, f239380i1[93], str);
    }

    public final void c3(boolean z10) {
        this.f239400J.setValue(this, f239380i1[35], Boolean.valueOf(z10));
    }

    public final boolean d() {
        return ((Boolean) this.f239491y0.getValue(this, f239380i1[76])).booleanValue();
    }

    @NotNull
    public final String d0() {
        return (String) this.f239421T0.getValue(this, f239380i1[97]);
    }

    public final boolean d1() {
        return ((Boolean) this.f239404L.getValue(this, f239380i1[37])).booleanValue();
    }

    public final void d2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239395G0.setValue(this, f239380i1[84], str);
    }

    public final void d3(int i10) {
        this.f239402K.setValue(this, f239380i1[36], Integer.valueOf(i10));
    }

    public final boolean e() {
        return ((Boolean) this.f239464l.getValue(this, f239380i1[11])).booleanValue();
    }

    @NotNull
    public final String e0() {
        return (String) this.f239403K0.getValue(this, f239380i1[88]);
    }

    public final int e1() {
        return ((Number) this.f239406M.getValue(this, f239380i1[38])).intValue();
    }

    public final void e2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239415Q0.setValue(this, f239380i1[94], str);
    }

    public final void e3(boolean z10) {
        this.f239483u0.setValue(this, f239380i1[72], Boolean.valueOf(z10));
    }

    public final boolean f() {
        return ((Boolean) this.f239420T.getValue(this, f239380i1[45])).booleanValue();
    }

    @NotNull
    public final String f0() {
        return (String) this.f239423U0.getValue(this, f239380i1[98]);
    }

    @NotNull
    public final String f1() {
        return (String) this.f239408N.getValue(this, f239380i1[39]);
    }

    public final void f2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239397H0.setValue(this, f239380i1[85], str);
    }

    public final void f3(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239433Z0.setValue(this, f239380i1[102], str);
    }

    public final boolean g() {
        return ((Boolean) this.f239459i0.getValue(this, f239380i1[60])).booleanValue();
    }

    @NotNull
    public final String g0() {
        return (String) this.f239405L0.getValue(this, f239380i1[89]);
    }

    public final boolean g1() {
        return ((Boolean) this.f239462k.getValue(this, f239380i1[10])).booleanValue();
    }

    public final void g2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239417R0.setValue(this, f239380i1[95], str);
    }

    public final void g3(@NotNull SearchBoxDisplayChoice searchBoxDisplayChoice) {
        G.p(searchBoxDisplayChoice, "<set-?>");
        this.f239424V.setValue(this, f239380i1[47], searchBoxDisplayChoice);
    }

    public final boolean h() {
        return ((Boolean) this.f239430Y.getValue(this, f239380i1[50])).booleanValue();
    }

    @NotNull
    public final String h0() {
        return (String) this.f239425V0.getValue(this, f239380i1[99]);
    }

    public final boolean h1() {
        return ((Boolean) this.f239412P.getValue(this, f239380i1[41])).booleanValue();
    }

    public final void h2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239399I0.setValue(this, f239380i1[86], str);
    }

    public final void h3(boolean z10) {
        this.f239461j0.setValue(this, f239380i1[61], Boolean.valueOf(z10));
    }

    public final boolean i() {
        return ((Boolean) this.f239482u.getValue(this, f239380i1[20])).booleanValue();
    }

    @NotNull
    public final String i0() {
        return (String) this.f239407M0.getValue(this, f239380i1[90]);
    }

    public final void i1(boolean z10) {
        this.f239472p.setValue(this, f239380i1[15], Boolean.valueOf(z10));
    }

    public final void i2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239419S0.setValue(this, f239380i1[96], str);
    }

    public final void i3(@NotNull AppTheme appTheme) {
        G.p(appTheme, "<set-?>");
        this.f239438b0.setValue(this, f239380i1[53], appTheme);
    }

    public final boolean j() {
        return ((Boolean) this.f239416R.getValue(this, f239380i1[43])).booleanValue();
    }

    @NotNull
    public final String j0() {
        return (String) this.f239427W0.getValue(this, f239380i1[100]);
    }

    public final void j1(boolean z10) {
        this.f239445d1.setValue(this, f239380i1[106], Boolean.valueOf(z10));
    }

    public final void j2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239401J0.setValue(this, f239380i1[87], str);
    }

    public final void j3(boolean z10) {
        this.f239439b1.setValue(this, f239380i1[104], Boolean.valueOf(z10));
    }

    public final boolean k() {
        return ((Boolean) this.f239414Q.getValue(this, f239380i1[42])).booleanValue();
    }

    public final boolean k0() {
        return ((Boolean) this.f239386C.getValue(this, f239380i1[28])).booleanValue();
    }

    public final void k1(boolean z10) {
        this.f239480t.setValue(this, f239380i1[19], Boolean.valueOf(z10));
    }

    public final void k2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239421T0.setValue(this, f239380i1[97], str);
    }

    public final void k3(boolean z10) {
        this.f239404L.setValue(this, f239380i1[37], Boolean.valueOf(z10));
    }

    public final boolean l() {
        return ((Boolean) this.f239444d0.getValue(this, f239380i1[55])).booleanValue();
    }

    public final boolean l0() {
        return ((Boolean) this.f239442c1.getValue(this, f239380i1[105])).booleanValue();
    }

    public final void l1(boolean z10) {
        this.f239491y0.setValue(this, f239380i1[76], Boolean.valueOf(z10));
    }

    public final void l2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239403K0.setValue(this, f239380i1[88], str);
    }

    public final void l3(int i10) {
        this.f239406M.setValue(this, f239380i1[38], Integer.valueOf(i10));
    }

    public final boolean m() {
        return ((Boolean) this.f239489x0.getValue(this, f239380i1[75])).booleanValue();
    }

    @NotNull
    public final ChooseNavbarCol m0() {
        return (ChooseNavbarCol) this.f239446e.getValue(this, f239380i1[4]);
    }

    public final void m1(boolean z10) {
        this.f239464l.setValue(this, f239380i1[11], Boolean.valueOf(z10));
    }

    public final void m2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239423U0.setValue(this, f239380i1[98], str);
    }

    public final void m3(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239408N.setValue(this, f239380i1[39], str);
    }

    public final boolean n() {
        return ((Boolean) this.f239422U.getValue(this, f239380i1[46])).booleanValue();
    }

    @NotNull
    public final String n0() {
        return (String) this.f239436a1.getValue(this, f239380i1[103]);
    }

    public final void n1(boolean z10) {
        this.f239420T.setValue(this, f239380i1[45], Boolean.valueOf(z10));
    }

    public final void n2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239405L0.setValue(this, f239380i1[89], str);
    }

    public final void n3(boolean z10) {
        this.f239462k.setValue(this, f239380i1[10], Boolean.valueOf(z10));
    }

    public final int o() {
        return ((Number) this.f239485v0.getValue(this, f239380i1[73])).intValue();
    }

    public final boolean o0() {
        return ((Boolean) this.f239448e1.getValue(this, f239380i1[107])).booleanValue();
    }

    public final void o1(boolean z10) {
        this.f239459i0.setValue(this, f239380i1[60], Boolean.valueOf(z10));
    }

    public final void o2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239425V0.setValue(this, f239380i1[99], str);
    }

    public final void o3(boolean z10) {
        this.f239412P.setValue(this, f239380i1[41], Boolean.valueOf(z10));
    }

    public final boolean p() {
        return ((Boolean) this.f239474q.getValue(this, f239380i1[16])).booleanValue();
    }

    public final boolean p0() {
        return ((Boolean) this.f239493z0.getValue(this, f239380i1[77])).booleanValue();
    }

    public final void p1(boolean z10) {
        this.f239430Y.setValue(this, f239380i1[50], Boolean.valueOf(z10));
    }

    public final void p2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239407M0.setValue(this, f239380i1[90], str);
    }

    public final boolean q() {
        return ((Boolean) this.f239484v.getValue(this, f239380i1[21])).booleanValue();
    }

    public final boolean q0() {
        return ((Boolean) this.f239388D.getValue(this, f239380i1[29])).booleanValue();
    }

    public final void q1(boolean z10) {
        this.f239482u.setValue(this, f239380i1[20], Boolean.valueOf(z10));
    }

    public final void q2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239427W0.setValue(this, f239380i1[100], str);
    }

    public final boolean r() {
        return ((Boolean) this.f239481t0.getValue(this, f239380i1[71])).booleanValue();
    }

    @NotNull
    public final PasswordChoice r0() {
        return (PasswordChoice) this.f239452g.getValue(this, f239380i1[6]);
    }

    public final void r1(boolean z10) {
        this.f239416R.setValue(this, f239380i1[43], Boolean.valueOf(z10));
    }

    public final void r2(boolean z10) {
        this.f239386C.setValue(this, f239380i1[28], Boolean.valueOf(z10));
    }

    public final boolean s() {
        return ((Boolean) this.f239450f0.getValue(this, f239380i1[57])).booleanValue();
    }

    @NotNull
    public final PasswordChoice s0() {
        return (PasswordChoice) this.f239458i.getValue(this, f239380i1[8]);
    }

    public final void s1(boolean z10) {
        this.f239414Q.setValue(this, f239380i1[42], Boolean.valueOf(z10));
    }

    public final void s2(boolean z10) {
        this.f239442c1.setValue(this, f239380i1[105], Boolean.valueOf(z10));
    }

    @NotNull
    public final String t() {
        return (String) this.f239486w.getValue(this, f239380i1[22]);
    }

    @NotNull
    public final String t0() {
        return (String) this.f239455h.getValue(this, f239380i1[7]);
    }

    public final void t1(boolean z10) {
        this.f239444d0.setValue(this, f239380i1[55], Boolean.valueOf(z10));
    }

    public final void t2(@NotNull ChooseNavbarCol chooseNavbarCol) {
        G.p(chooseNavbarCol, "<set-?>");
        this.f239446e.setValue(this, f239380i1[4], chooseNavbarCol);
    }

    @NotNull
    public final DrawerLineChoice u() {
        return (DrawerLineChoice) this.f239383A0.getValue(this, f239380i1[78]);
    }

    @NotNull
    public final String u0() {
        return (String) this.f239460j.getValue(this, f239380i1[9]);
    }

    public final void u1(boolean z10) {
        this.f239489x0.setValue(this, f239380i1[75], Boolean.valueOf(z10));
    }

    public final void u2(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f239436a1.setValue(this, f239380i1[103], str);
    }

    public final int v() {
        return ((Number) this.f239449f.getValue(this, f239380i1[5])).intValue();
    }

    public final boolean v0() {
        return ((Boolean) this.f239390E.getValue(this, f239380i1[30])).booleanValue();
    }

    public final void v1(boolean z10) {
        this.f239422U.setValue(this, f239380i1[46], Boolean.valueOf(z10));
    }

    public final void v2(boolean z10) {
        this.f239448e1.setValue(this, f239380i1[107], Boolean.valueOf(z10));
    }

    @NotNull
    public final DrawerSizeChoice w() {
        return (DrawerSizeChoice) this.f239385B0.getValue(this, f239380i1[79]);
    }

    public final boolean w0() {
        return ((Boolean) this.f239476r.getValue(this, f239380i1[17])).booleanValue();
    }

    public final void w1(int i10) {
        this.f239485v0.setValue(this, f239380i1[73], Integer.valueOf(i10));
    }

    public final void w2(boolean z10) {
        this.f239493z0.setValue(this, f239380i1[77], Boolean.valueOf(z10));
    }

    public final boolean x() {
        return ((Boolean) this.f239487w0.getValue(this, f239380i1[74])).booleanValue();
    }

    @NotNull
    public final ProxyChoice x0() {
        return (ProxyChoice) this.f239467m0.getValue(this, f239380i1[64]);
    }

    public final void x1(boolean z10) {
        this.f239474q.setValue(this, f239380i1[16], Boolean.valueOf(z10));
    }

    public final void x2(boolean z10) {
        this.f239388D.setValue(this, f239380i1[29], Boolean.valueOf(z10));
    }

    public final boolean y() {
        return ((Boolean) this.f239454g1.getValue(this, f239380i1[109])).booleanValue();
    }

    @NotNull
    public final String y0() {
        return (String) this.f239469n0.getValue(this, f239380i1[65]);
    }

    public final void y1(boolean z10) {
        this.f239484v.setValue(this, f239380i1[21], Boolean.valueOf(z10));
    }

    public final void y2(@NotNull PasswordChoice passwordChoice) {
        G.p(passwordChoice, "<set-?>");
        this.f239452g.setValue(this, f239380i1[6], passwordChoice);
    }

    @NotNull
    public final String[] z() {
        return this.f239431Y0;
    }

    public final int z0() {
        return ((Number) this.f239471o0.getValue(this, f239380i1[66])).intValue();
    }

    public final void z1(boolean z10) {
        this.f239481t0.setValue(this, f239380i1[71], Boolean.valueOf(z10));
    }

    public final void z2(@NotNull PasswordChoice passwordChoice) {
        G.p(passwordChoice, "<set-?>");
        this.f239458i.setValue(this, f239380i1[8], passwordChoice);
    }
}
