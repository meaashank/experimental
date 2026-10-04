package com.google.firebase.sessions.settings;

import androidx.datastore.core.d;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.a;
import androidx.datastore.preferences.core.c;
import ed.p;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlinx.coroutines.C5065i;
import kotlinx.coroutines.L;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class SettingsCache {

    @Deprecated
    @NotNull
    public static final String TAG = "SettingsCache";

    @NotNull
    private final d<a> dataStore;
    private SessionConfigs sessionConfigs;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final a.C0292a<Boolean> SESSIONS_ENABLED = c.a(LocalOverrideSettings.SESSIONS_ENABLED);

    @NotNull
    private static final a.C0292a<Double> SAMPLING_RATE = c.b(LocalOverrideSettings.SAMPLING_RATE);

    @NotNull
    private static final a.C0292a<Integer> RESTART_TIMEOUT_SECONDS = c.d("firebase_sessions_restart_timeout");

    @NotNull
    private static final a.C0292a<Integer> CACHE_DURATION_SECONDS = c.d("firebase_sessions_cache_duration");

    @NotNull
    private static final a.C0292a<Long> CACHE_UPDATED_TIME = c.e("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCache$1, reason: invalid class name */
    @Vc.d(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<L, e<? super L0>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final e<L0> create(@Nullable Object obj, @NotNull e<?> eVar) {
            return SettingsCache.this.new AnonymousClass1(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            SettingsCache settingsCache;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                C4885d0.n(obj);
                SettingsCache settingsCache2 = SettingsCache.this;
                kotlinx.coroutines.flow.e data = settingsCache2.dataStore.getData();
                this.L$0 = settingsCache2;
                this.label = 1;
                Object objB = FlowKt__ReduceKt.b(data, this);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                settingsCache = settingsCache2;
                obj = objB;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                settingsCache = (SettingsCache) this.L$0;
                C4885d0.n(obj);
            }
            settingsCache.updateSessionConfigs(((a) obj).e());
            return L0.f217464a;
        }

        @Override // ed.p
        @Nullable
        public final Object invoke(@NotNull L l10, @Nullable e<? super L0> eVar) {
            return ((AnonymousClass1) create(l10, eVar)).invokeSuspend(L0.f217464a);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }

        @NotNull
        public final a.C0292a<Integer> getCACHE_DURATION_SECONDS() {
            return SettingsCache.CACHE_DURATION_SECONDS;
        }

        @NotNull
        public final a.C0292a<Long> getCACHE_UPDATED_TIME() {
            return SettingsCache.CACHE_UPDATED_TIME;
        }

        @NotNull
        public final a.C0292a<Integer> getRESTART_TIMEOUT_SECONDS() {
            return SettingsCache.RESTART_TIMEOUT_SECONDS;
        }

        @NotNull
        public final a.C0292a<Double> getSAMPLING_RATE() {
            return SettingsCache.SAMPLING_RATE;
        }

        @NotNull
        public final a.C0292a<Boolean> getSESSIONS_ENABLED() {
            return SettingsCache.SESSIONS_ENABLED;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1, reason: invalid class name and case insensitive filesystem */
    @Vc.d(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", i = {}, l = {119}, m = "updateConfigValue", n = {}, s = {})
    public static final class C34621<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C34621(e<? super C34621> eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingsCache.this.updateConfigValue(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2, reason: invalid class name */
    @Vc.d(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements p<MutablePreferences, e<? super L0>, Object> {
        final /* synthetic */ a.C0292a<T> $key;
        final /* synthetic */ T $value;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SettingsCache this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(T t10, a.C0292a<T> c0292a, SettingsCache settingsCache, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$value = t10;
            this.$key = c0292a;
            this.this$0 = settingsCache;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final e<L0> create(@Nullable Object obj, @NotNull e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$value, this.$key, this.this$0, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // ed.p
        @Nullable
        public final Object invoke(@NotNull MutablePreferences mutablePreferences, @Nullable e<? super L0> eVar) {
            return ((AnonymousClass2) create(mutablePreferences, eVar)).invokeSuspend(L0.f217464a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            T t10 = this.$value;
            if (t10 != 0) {
                mutablePreferences.o(this.$key, t10);
            } else {
                mutablePreferences.n(this.$key);
            }
            this.this$0.updateSessionConfigs(mutablePreferences);
            return L0.f217464a;
        }
    }

    public SettingsCache(@NotNull d<a> dataStore) throws InterruptedException {
        G.p(dataStore, "dataStore");
        this.dataStore = dataStore;
        C5065i.b(null, new AnonymousClass1(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object updateConfigValue(androidx.datastore.preferences.core.a.C0292a<T> r6, T r7, kotlin.coroutines.e<? super kotlin.L0> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.firebase.sessions.settings.SettingsCache.C34621
            if (r0 == 0) goto L13
            r0 = r8
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = (com.google.firebase.sessions.settings.SettingsCache.C34621) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C4885d0.n(r8)     // Catch: java.io.IOException -> L27
            goto L58
        L27:
            r6 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.C4885d0.n(r8)
            androidx.datastore.core.d<androidx.datastore.preferences.core.a> r8 = r5.dataStore     // Catch: java.io.IOException -> L27
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2 r2 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L27
            r0.label = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.a(r8, r2, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L58
            return r1
        L45:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to update cache config value: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L58:
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCache.updateConfigValue(androidx.datastore.preferences.core.a$a, java.lang.Object, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSessionConfigs(a aVar) {
        this.sessionConfigs = new SessionConfigs((Boolean) aVar.c(SESSIONS_ENABLED), (Double) aVar.c(SAMPLING_RATE), (Integer) aVar.c(RESTART_TIMEOUT_SECONDS), (Integer) aVar.c(CACHE_DURATION_SECONDS), (Long) aVar.c(CACHE_UPDATED_TIME));
    }

    public final boolean hasCacheExpired$com_google_firebase_firebase_sessions() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            G.S("sessionConfigs");
            throw null;
        }
        Long cacheUpdatedTime = sessionConfigs.getCacheUpdatedTime();
        SessionConfigs sessionConfigs2 = this.sessionConfigs;
        if (sessionConfigs2 != null) {
            Integer cacheDuration = sessionConfigs2.getCacheDuration();
            return cacheUpdatedTime == null || cacheDuration == null || (System.currentTimeMillis() - cacheUpdatedTime.longValue()) / ((long) 1000) >= ((long) cacheDuration.intValue());
        }
        G.S("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @e.f0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object removeConfigs$com_google_firebase_firebase_sessions(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1 r0 = (com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1 r0 = new com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C4885d0.n(r6)     // Catch: java.io.IOException -> L27
            goto L58
        L27:
            r6 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.C4885d0.n(r6)
            androidx.datastore.core.d<androidx.datastore.preferences.core.a> r6 = r5.dataStore     // Catch: java.io.IOException -> L27
            com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2 r2 = new com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r5, r4)     // Catch: java.io.IOException -> L27
            r0.label = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.a(r6, r2, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L58
            return r1
        L45:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to remove config values: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "SettingsCache"
            android.util.Log.w(r0, r6)
        L58:
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCache.removeConfigs$com_google_firebase_firebase_sessions(kotlin.coroutines.e):java.lang.Object");
    }

    @Nullable
    public final Integer sessionRestartTimeout() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs != null) {
            return sessionConfigs.getSessionRestartTimeout();
        }
        G.S("sessionConfigs");
        throw null;
    }

    @Nullable
    public final Double sessionSamplingRate() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs != null) {
            return sessionConfigs.getSessionSamplingRate();
        }
        G.S("sessionConfigs");
        throw null;
    }

    @Nullable
    public final Boolean sessionsEnabled() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs != null) {
            return sessionConfigs.getSessionEnabled();
        }
        G.S("sessionConfigs");
        throw null;
    }

    @Nullable
    public final Object updateSamplingRate(@Nullable Double d10, @NotNull e<? super L0> eVar) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(SAMPLING_RATE, d10, eVar);
        return objUpdateConfigValue == CoroutineSingletons.COROUTINE_SUSPENDED ? objUpdateConfigValue : L0.f217464a;
    }

    @Nullable
    public final Object updateSessionCacheDuration(@Nullable Integer num, @NotNull e<? super L0> eVar) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(CACHE_DURATION_SECONDS, num, eVar);
        return objUpdateConfigValue == CoroutineSingletons.COROUTINE_SUSPENDED ? objUpdateConfigValue : L0.f217464a;
    }

    @Nullable
    public final Object updateSessionCacheUpdatedTime(@Nullable Long l10, @NotNull e<? super L0> eVar) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(CACHE_UPDATED_TIME, l10, eVar);
        return objUpdateConfigValue == CoroutineSingletons.COROUTINE_SUSPENDED ? objUpdateConfigValue : L0.f217464a;
    }

    @Nullable
    public final Object updateSessionRestartTimeout(@Nullable Integer num, @NotNull e<? super L0> eVar) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(RESTART_TIMEOUT_SECONDS, num, eVar);
        return objUpdateConfigValue == CoroutineSingletons.COROUTINE_SUSPENDED ? objUpdateConfigValue : L0.f217464a;
    }

    @Nullable
    public final Object updateSettingsEnabled(@Nullable Boolean bool, @NotNull e<? super L0> eVar) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(SESSIONS_ENABLED, bool, eVar);
        return objUpdateConfigValue == CoroutineSingletons.COROUTINE_SUSPENDED ? objUpdateConfigValue : L0.f217464a;
    }
}
