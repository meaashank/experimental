package com.prism.fads.admob;

import android.app.Activity;
import android.content.Context;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f162211b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentInformation f162212a;

    /* JADX INFO: renamed from: com.prism.fads.admob.a$a, reason: collision with other inner class name */
    public interface InterfaceC0663a {
        void a(FormError formError);
    }

    public a(Context context) {
        this.f162212a = UserMessagingPlatform.getConsentInformation(context);
    }

    public static a f(Context context) {
        if (f162211b == null) {
            f162211b = new a(context);
        }
        return f162211b;
    }

    public boolean d() {
        return this.f162212a.canRequestAds();
    }

    public void e(final Activity activity, final InterfaceC0663a interfaceC0663a) {
        new ConsentDebugSettings.Builder(activity).setDebugGeography(1).addTestDeviceHashedId("B6070347C8365A108C71538079974A3D").addTestDeviceHashedId("5795FE6D75F7A8AD1F9DF57ECF26F2F1").build();
        this.f162212a.requestConsentInfoUpdate(activity, new ConsentRequestParameters.Builder().build(), new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: C6.c
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: C6.b
                    @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                    public final void onConsentFormDismissed(FormError formError) {
                        interfaceC0663a.a(formError);
                    }
                });
            }
        }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: C6.d
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
            public final void onConsentInfoUpdateFailure(FormError formError) {
                interfaceC0663a.a(formError);
            }
        });
    }

    public boolean g() {
        return this.f162212a.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
    }

    public void h(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        UserMessagingPlatform.showPrivacyOptionsForm(activity, onConsentFormDismissedListener);
    }
}
