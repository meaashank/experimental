package com.google.firebase.sessions.settings;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.d;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.a;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.ProcessDetailsProvider;
import com.google.firebase.sessions.SessionDataStoreConfigs;
import com.google.firebase.sessions.SessionEvents;
import ed.l;
import j1.b;
import kd.InterfaceC4845e;
import kotlin.coroutines.e;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.reflect.n;
import kotlin.time.C5041h;
import kotlin.time.DurationUnit;
import kotlin.time.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionsSettings {

    @NotNull
    private static final String TAG = "SessionsSettings";

    @NotNull
    private final SettingsProvider localOverrideSettings;

    @NotNull
    private final SettingsProvider remoteSettings;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final InterfaceC4845e<Context, d<a>> dataStore$delegate = PreferenceDataStoreDelegateKt.b(SessionDataStoreConfigs.INSTANCE.getSETTINGS_CONFIG_NAME(), new b(new l<CorruptionException, a>() { // from class: com.google.firebase.sessions.settings.SessionsSettings$Companion$dataStore$2
        @Override // ed.l
        @NotNull
        public final a invoke(@NotNull CorruptionException ex) {
            G.p(ex, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions() + '.', ex);
            return androidx.datastore.preferences.core.b.b();
        }
    }), null, null, 12, null);

    public static final class Companion {
        static final /* synthetic */ n<Object>[] $$delegatedProperties = {O.v(new PropertyReference2Impl(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d<a> getDataStore(Context context) {
            return (d) SessionsSettings.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }

        @NotNull
        public final SessionsSettings getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionsSettings.class);
            G.o(obj, "Firebase.app[SessionsSettings::class.java]");
            return (SessionsSettings) obj;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1, reason: invalid class name */
    @Vc.d(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", i = {0}, l = {138, Opcodes.F2I}, m = "updateSettings", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionsSettings.this.updateSettings(this);
        }
    }

    public SessionsSettings(@NotNull SettingsProvider localOverrideSettings, @NotNull SettingsProvider remoteSettings) {
        G.p(localOverrideSettings, "localOverrideSettings");
        G.p(remoteSettings, "remoteSettings");
        this.localOverrideSettings = localOverrideSettings;
        this.remoteSettings = remoteSettings;
    }

    private final boolean isValidSamplingRate(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    /* JADX INFO: renamed from: isValidSessionRestartTimeout-LRDsOJo, reason: not valid java name */
    private final boolean m15isValidSessionRestartTimeoutLRDsOJo(long j10) {
        return C5041h.T(j10) && C5041h.N(j10);
    }

    public final double getSamplingRate() {
        Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double dDoubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double samplingRate2 = this.remoteSettings.getSamplingRate();
        if (samplingRate2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = samplingRate2.doubleValue();
        if (isValidSamplingRate(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: getSessionRestartTimeout-UwyO8pc, reason: not valid java name */
    public final long m16getSessionRestartTimeoutUwyO8pc() {
        C5041h c5041hMo14getSessionRestartTimeoutFghU774 = this.localOverrideSettings.mo14getSessionRestartTimeoutFghU774();
        if (c5041hMo14getSessionRestartTimeoutFghU774 != null) {
            long j10 = c5041hMo14getSessionRestartTimeoutFghU774.f218424a;
            if (m15isValidSessionRestartTimeoutLRDsOJo(j10)) {
                return j10;
            }
        }
        C5041h c5041hMo14getSessionRestartTimeoutFghU7742 = this.remoteSettings.mo14getSessionRestartTimeoutFghU774();
        if (c5041hMo14getSessionRestartTimeoutFghU7742 != null) {
            long j11 = c5041hMo14getSessionRestartTimeoutFghU7742.f218424a;
            if (m15isValidSessionRestartTimeoutLRDsOJo(j11)) {
                return j11;
            }
        }
        C5041h.a aVar = C5041h.f218418b;
        return j.O(30, DurationUnit.MINUTES);
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r6.updateSettings(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateSettings(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.C4885d0.n(r6)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Object r2 = r0.L$0
            com.google.firebase.sessions.settings.SessionsSettings r2 = (com.google.firebase.sessions.settings.SessionsSettings) r2
            kotlin.C4885d0.n(r6)
            goto L4b
        L3a:
            kotlin.C4885d0.n(r6)
            com.google.firebase.sessions.settings.SettingsProvider r6 = r5.localOverrideSettings
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L4a
            goto L58
        L4a:
            r2 = r5
        L4b:
            com.google.firebase.sessions.settings.SettingsProvider r6 = r2.remoteSettings
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L59
        L58:
            return r1
        L59:
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.updateSettings(kotlin.coroutines.e):java.lang.Object");
    }

    private SessionsSettings(Context context, i iVar, i iVar2, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo) {
        this(new LocalOverrideSettings(context), new RemoteSettings(iVar2, firebaseInstallationsApi, applicationInfo, new RemoteSettingsFetcher(applicationInfo, iVar, null, 4, null), Companion.getDataStore(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionsSettings(@NotNull FirebaseApp firebaseApp, @NotNull i blockingDispatcher, @NotNull i backgroundDispatcher, @NotNull FirebaseInstallationsApi firebaseInstallationsApi) {
        G.p(firebaseApp, "firebaseApp");
        G.p(blockingDispatcher, "blockingDispatcher");
        G.p(backgroundDispatcher, "backgroundDispatcher");
        G.p(firebaseInstallationsApi, "firebaseInstallationsApi");
        Context applicationContext = firebaseApp.getApplicationContext();
        G.o(applicationContext, "firebaseApp.applicationContext");
        this(applicationContext, blockingDispatcher, backgroundDispatcher, firebaseInstallationsApi, SessionEvents.INSTANCE.getApplicationInfo(firebaseApp));
    }
}
