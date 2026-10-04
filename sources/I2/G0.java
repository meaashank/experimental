package I2;

import androidx.annotation.NonNull;
import androidx.webkit.UserAgentMetadata;
import androidx.webkit.WebViewMediaIntegrityApiStatusConfig;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebSettingsBoundaryInterface f50922a;

    public G0(@NonNull WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f50922a = webSettingsBoundaryInterface;
    }

    public void A(int i10) {
        this.f50922a.setWebauthnSupport(i10);
    }

    public void B(@NonNull WebViewMediaIntegrityApiStatusConfig webViewMediaIntegrityApiStatusConfig) {
        this.f50922a.setWebViewMediaIntegrityApiStatus(webViewMediaIntegrityApiStatusConfig.a(), webViewMediaIntegrityApiStatusConfig.b());
    }

    public int a() {
        return this.f50922a.getAttributionBehavior();
    }

    public boolean b() {
        return this.f50922a.getBackForwardCacheEnabled();
    }

    public int c() {
        return this.f50922a.getDisabledActionModeMenuItems();
    }

    public boolean d() {
        return this.f50922a.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int e() {
        return this.f50922a.getForceDark();
    }

    public int f() {
        return this.f50922a.getForceDarkBehavior();
    }

    public boolean g() {
        return this.f50922a.getOffscreenPreRaster();
    }

    @NonNull
    public Set<String> h() {
        return this.f50922a.getRequestedWithHeaderOriginAllowList();
    }

    public boolean i() {
        return this.f50922a.getSafeBrowsingEnabled();
    }

    public int j() {
        return this.f50922a.getSpeculativeLoadingStatus();
    }

    @NonNull
    public UserAgentMetadata k() {
        return x0.c(this.f50922a.getUserAgentMetadataMap());
    }

    public int l() {
        return this.f50922a.getWebauthnSupport();
    }

    @NonNull
    public WebViewMediaIntegrityApiStatusConfig m() {
        return new WebViewMediaIntegrityApiStatusConfig.Builder(this.f50922a.getWebViewMediaIntegrityApiDefaultStatus()).setOverrideRules(this.f50922a.getWebViewMediaIntegrityApiOverrideRules()).build();
    }

    public boolean n() {
        return this.f50922a.isAlgorithmicDarkeningAllowed();
    }

    public void o(boolean z10) {
        this.f50922a.setAlgorithmicDarkeningAllowed(z10);
    }

    public void p(int i10) {
        this.f50922a.setAttributionBehavior(i10);
    }

    public void q(boolean z10) {
        this.f50922a.setBackForwardCacheEnabled(z10);
    }

    public void r(int i10) {
        this.f50922a.setDisabledActionModeMenuItems(i10);
    }

    public void s(boolean z10) {
        this.f50922a.setEnterpriseAuthenticationAppLinkPolicyEnabled(z10);
    }

    public void t(int i10) {
        this.f50922a.setForceDark(i10);
    }

    public void u(int i10) {
        this.f50922a.setForceDarkBehavior(i10);
    }

    public void v(boolean z10) {
        this.f50922a.setOffscreenPreRaster(z10);
    }

    public void w(@NonNull Set<String> set) {
        this.f50922a.setRequestedWithHeaderOriginAllowList(set);
    }

    public void x(boolean z10) {
        this.f50922a.setSafeBrowsingEnabled(z10);
    }

    public void y(int i10) {
        this.f50922a.setSpeculativeLoadingStatus(i10);
    }

    public void z(@NonNull UserAgentMetadata userAgentMetadata) {
        this.f50922a.setUserAgentMetadataFromMap(x0.a(userAgentMetadata));
    }
}
