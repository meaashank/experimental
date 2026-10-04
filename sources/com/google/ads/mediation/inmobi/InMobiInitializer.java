package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.inmobi.sdk.SdkInitializationListener;
import e.Y;
import e.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class InMobiInitializer implements SdkInitializationListener {
    public static final int INITIALIZED = 2;
    public static final int INITIALIZING = 1;
    public static final int UNINITIALIZED = 0;
    private static InMobiInitializer instance;
    private final InMobiSdkWrapper inMobiSdkWrapper;

    @f0
    int initializationStatus;

    @f0
    final ArrayList<Listener> listeners;

    @Retention(RetentionPolicy.SOURCE)
    public @interface InitializationStatus {
    }

    public interface Listener {
        void onInitializeError(@NonNull AdError adError);

        void onInitializeSuccess();
    }

    private InMobiInitializer() {
        this.listeners = new ArrayList<>();
        this.initializationStatus = 0;
        this.inMobiSdkWrapper = new InMobiSdkWrapper();
    }

    public static InMobiInitializer getInstance() {
        if (instance == null) {
            instance = new InMobiInitializer();
        }
        return instance;
    }

    public void init(@NonNull Context context, @NonNull @Y(max = 36, min = 32) String str, @NonNull Listener listener) {
        if (this.initializationStatus == 2) {
            listener.onInitializeSuccess();
            return;
        }
        this.listeners.add(listener);
        if (this.initializationStatus == 1) {
            return;
        }
        this.initializationStatus = 1;
        this.inMobiSdkWrapper.init(context, str, InMobiConsent.getConsentObj(), this);
    }

    @Override // com.inmobi.sdk.SdkInitializationListener
    public void onInitializationComplete(@Nullable Error error) {
        int i10 = 0;
        if (error == null) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi SDK initialized.");
            this.initializationStatus = 2;
            ArrayList<Listener> arrayList = this.listeners;
            int size = arrayList.size();
            while (i10 < size) {
                Listener listener = arrayList.get(i10);
                i10++;
                listener.onInitializeSuccess();
            }
        } else {
            this.initializationStatus = 0;
            AdError adErrorCreateAdapterError = InMobiConstants.createAdapterError(101, error.getLocalizedMessage());
            ArrayList<Listener> arrayList2 = this.listeners;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Listener listener2 = arrayList2.get(i10);
                i10++;
                listener2.onInitializeError(adErrorCreateAdapterError);
            }
        }
        this.listeners.clear();
    }

    @f0
    public InMobiInitializer(InMobiSdkWrapper inMobiSdkWrapper) {
        this.listeners = new ArrayList<>();
        this.initializationStatus = 0;
        this.inMobiSdkWrapper = inMobiSdkWrapper;
    }
}
