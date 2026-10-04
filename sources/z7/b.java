package z7;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.B;
import c7.C;
import c7.F;
import c7.J;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class b extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f241258i = "asdf-".concat(b.class.getSimpleName());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f241259j = -10000;

    public b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new J("notifyPendingSystemUpdate", null));
        f(new J("getDeviceOwnerComponent", null));
        f(new J("getDeviceOwnerComponentOnUser", null));
        f(new J("getProfileOwnerName", null));
        f(new J("getProfileOwnerNameAsUser", null));
        f(new J("getProfileOwner", null));
        f(new J("getProfileOwnerAsUser", null));
        f(new J("getDeviceOwnerName", null));
        Boolean bool = Boolean.FALSE;
        f(new J("isDeviceManaged", bool));
        f(new J("getUserProvisioningState", 0));
        f(new J("hasDeviceOwner", bool));
        f(new J("getDeviceOwnerUserId", -10000));
        f(new J("getDeviceOwnerOrganizationName", null));
        f(new J("isDeviceProvisioned", Boolean.TRUE));
        f(new J("isDeviceProvisioningConfigApplied", bool));
        f(new J("getPermittedInputMethodsForCurrentUser", null));
        f(new J("getPermittedAccessibilityServicesForUser", null));
        f(new J("isCaCertApproved", bool));
        f(new J("getOwnerInstalledCaCerts", null));
        f(new J("getDoNotAskCredentialsOnBoot", bool));
        f(new J("isNetworkLoggingEnabled", bool));
        f(new J("isUninstallInQueue", bool));
        List list = Collections.EMPTY_LIST;
        f(new J("getAllCrossProfilePackages", list));
        f(new J("getDisallowedSystemApps", list));
        f(new J("isManagedKiosk", bool));
        f(new J("isUnattendedManagedKiosk", bool));
        f(new J("getLastBugReportRequestTime", -1L));
        f(new J("getLastSecurityLogRetrievalTime", -1L));
        f(new J("getLastNetworkLogRetrievalTime", -1L));
        f(new J("getActiveAdmins", null));
        f(new J("getDelegatedScopes", list));
        f(new J("getDeviceOwnerLockScreenInfo", null));
        f(new J("isCurrentInputMethodSetByOwner", bool));
        f(new J("getWifiSsidPolicy", null));
        f(new J("getDefaultCrossProfilePackages", list));
        f(new J("getPasswordQuality", 0));
        f(new J("getCameraDisabled", bool));
        f(new C("isActivePasswordSufficient"));
        f(new C("setRequiredPasswordComplexity"));
        f(new C("getRequiredPasswordComplexity"));
        f(new C("getCurrentFailedPasswordAttempts"));
        f(new C("setMaximumFailedPasswordsForWipe"));
        f(new C("setMaximumTimeToLock"));
        f(new C("setRequiredStrongAuthTimeout"));
        f(new C("lockNow"));
        f(new J("wipeDataWithReason", null));
        f(new J("setFactoryResetProtectionPolicy", null));
        f(new C("getStorageEncryptionStatus"));
        f(new C("setCameraDisabled"));
        f(new C("setScreenCaptureDisabled"));
        f(new C("setKeyguardDisabledFeatures"));
        f(new C("checkDeviceIdentifierAccess"));
        f(new C("installKeyPair"));
        f(new C("hasKeyPair"));
        f(new C("setKeyPairCertificate"));
        f(new C("setStatusBarDisabled"));
        f(new C("isStatusBarDisabled"));
        f(new B("getWifiMacAddress"));
        f(new J("getSubscriptionIds", new int[0]));
        f(new B("getAccountTypesWithManagementDisabled"));
        f(new B("getAccountTypesWithManagementDisabledAsUser"));
        f(new B("getAppFunctionsPolicy"));
        f(new B("getApplicationRestrictions"));
        f(new B("getAutoTimePolicy"));
        f(new B("getAutoTimeZonePolicy"));
        f(new B("getContentProtectionPolicy"));
        f(new B("getCrossProfileWidgetProviders"));
        f(new B("getEnrollmentSpecificId"));
        f(new B("getFinancedDeviceKioskRoleHolder"));
        f(new B("getHeadlessDeviceOwnerMode"));
        f(new B("getKeepUninstalledPackages"));
        f(new B("getKeyPairGrants"));
        f(new B("getLockTaskFeatures"));
        f(new B("getLockTaskPackages"));
        f(new B("getMaxPolicyStorageLimit"));
        f(new B("getMtePolicy"));
        f(new B("getPendingSystemUpdate"));
        f(new B("getPermissionGrantState"));
        f(new B("getPermittedInputMethods"));
        f(new B("getUserControlDisabledPackages"));
        f(new B("getUserRestrictions"));
        f(new B("getUserRestrictionsGlobally"));
        f(new B("isApplicationHidden"));
        f(new B("isAuditLogEnabled"));
        f(new B("isDeviceFinanced"));
        f(new B("isDevicePotentiallyStolen"));
        f(new B("isKeyPairGrantedToWifiAuth"));
        f(new B("isPackageSuspended"));
        f(new F("isProvisioningAllowed", 1));
        f(new B("isResetPasswordTokenActive"));
        f(new B("isSecurityLoggingEnabled"));
        f(new B("isUsbDataSignalingEnabled"));
    }
}
