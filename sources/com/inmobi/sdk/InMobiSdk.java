package com.inmobi.sdk;

import G0.F;
import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import androidx.room.C2650a;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.media.AbstractC3616kc;
import com.inmobi.media.AbstractC3666o6;
import com.inmobi.media.AbstractC3822z9;
import com.inmobi.media.C3511d5;
import com.inmobi.media.C3635m3;
import com.inmobi.media.C3657nb;
import com.inmobi.media.C3672oc;
import com.inmobi.media.C3745u2;
import com.inmobi.media.C3773w2;
import com.inmobi.media.C3811yc;
import com.inmobi.media.Cb;
import com.inmobi.media.Ib;
import com.inmobi.media.J5;
import com.inmobi.media.K4;
import com.inmobi.media.K5;
import com.inmobi.media.K9;
import com.inmobi.media.Lb;
import com.inmobi.media.M9;
import com.inmobi.media.O5;
import com.inmobi.media.Qb;
import com.inmobi.media.R6;
import com.inmobi.media.U4;
import com.inmobi.media.Z3;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import dd.g;
import dd.o;
import e.Y;
import e.e0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.n0;
import kotlin.enums.c;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nInMobiSdk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InMobiSdk.kt\ncom/inmobi/sdk/InMobiSdk\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,600:1\n107#2:601\n79#2,22:602\n13309#3,2:624\n*S KotlinDebug\n*F\n+ 1 InMobiSdk.kt\ncom/inmobi/sdk/InMobiSdk\n*L\n117#1:601\n117#1:602,22\n287#1:624,2\n*E\n"})
public final class InMobiSdk {

    @g
    @NotNull
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";

    @g
    @NotNull
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";

    @g
    @NotNull
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";

    @NotNull
    public static final InMobiSdk INSTANCE = new InMobiSdk();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AgeGroup {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ AgeGroup[] $VALUES;

        @NotNull
        private final String value;
        public static final AgeGroup BELOW_18 = new AgeGroup(InMobiNetworkValues.BELOW_18, 0, "below18");
        public static final AgeGroup BETWEEN_18_AND_24 = new AgeGroup(InMobiNetworkValues.BETWEEN_18_AND_24, 1, "between18and24");
        public static final AgeGroup BETWEEN_25_AND_29 = new AgeGroup(InMobiNetworkValues.BETWEEN_25_AND_29, 2, "between25and29");
        public static final AgeGroup BETWEEN_30_AND_34 = new AgeGroup(InMobiNetworkValues.BETWEEN_30_AND_34, 3, "between30and34");
        public static final AgeGroup BETWEEN_35_AND_44 = new AgeGroup(InMobiNetworkValues.BETWEEN_35_AND_44, 4, "between35and44");
        public static final AgeGroup BETWEEN_45_AND_54 = new AgeGroup(InMobiNetworkValues.BETWEEN_45_AND_54, 5, "between45and54");
        public static final AgeGroup BETWEEN_55_AND_65 = new AgeGroup(InMobiNetworkValues.BETWEEN_55_AND_65, 6, "between55and65");
        public static final AgeGroup ABOVE_65 = new AgeGroup(InMobiNetworkValues.ABOVE_65, 7, "above65");

        private static final /* synthetic */ AgeGroup[] $values() {
            return new AgeGroup[]{BELOW_18, BETWEEN_18_AND_24, BETWEEN_25_AND_29, BETWEEN_30_AND_34, BETWEEN_35_AND_44, BETWEEN_45_AND_54, BETWEEN_55_AND_65, ABOVE_65};
        }

        static {
            AgeGroup[] ageGroupArr$values = $values();
            $VALUES = ageGroupArr$values;
            $ENTRIES = c.c(ageGroupArr$values);
        }

        private AgeGroup(String str, int i10, String str2) {
            this.value = str2;
        }

        @NotNull
        public static kotlin.enums.a<AgeGroup> getEntries() {
            return $ENTRIES;
        }

        public static AgeGroup valueOf(String str) {
            return (AgeGroup) Enum.valueOf(AgeGroup.class, str);
        }

        public static AgeGroup[] values() {
            return (AgeGroup[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Education {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Education[] $VALUES;

        @NotNull
        private final String value;
        public static final Education HIGH_SCHOOL_OR_LESS = new Education("HIGH_SCHOOL_OR_LESS", 0, "highschoolorless");
        public static final Education COLLEGE_OR_GRADUATE = new Education("COLLEGE_OR_GRADUATE", 1, "collegeorgraduate");
        public static final Education POST_GRADUATE_OR_ABOVE = new Education("POST_GRADUATE_OR_ABOVE", 2, "postgraduateorabove");

        private static final /* synthetic */ Education[] $values() {
            return new Education[]{HIGH_SCHOOL_OR_LESS, COLLEGE_OR_GRADUATE, POST_GRADUATE_OR_ABOVE};
        }

        static {
            Education[] educationArr$values = $values();
            $VALUES = educationArr$values;
            $ENTRIES = c.c(educationArr$values);
        }

        private Education(String str, int i10, String str2) {
            this.value = str2;
        }

        @NotNull
        public static kotlin.enums.a<Education> getEntries() {
            return $ENTRIES;
        }

        public static Education valueOf(String str) {
            return (Education) Enum.valueOf(Education.class, str);
        }

        public static Education[] values() {
            return (Education[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Gender {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Gender[] $VALUES;
        public static final Gender FEMALE = new Gender("FEMALE", 0, "f");
        public static final Gender MALE = new Gender("MALE", 1, F.f40036b);

        @NotNull
        private final String value;

        private static final /* synthetic */ Gender[] $values() {
            return new Gender[]{FEMALE, MALE};
        }

        static {
            Gender[] genderArr$values = $values();
            $VALUES = genderArr$values;
            $ENTRIES = c.c(genderArr$values);
        }

        private Gender(String str, int i10, String str2) {
            this.value = str2;
        }

        @NotNull
        public static kotlin.enums.a<Gender> getEntries() {
            return $ENTRIES;
        }

        public static Gender valueOf(String str) {
            return (Gender) Enum.valueOf(Gender.class, str);
        }

        public static Gender[] values() {
            return (Gender[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LogLevel {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ LogLevel[] $VALUES;
        public static final LogLevel NONE = new LogLevel("NONE", 0);
        public static final LogLevel ERROR = new LogLevel("ERROR", 1);
        public static final LogLevel DEBUG = new LogLevel("DEBUG", 2);

        private static final /* synthetic */ LogLevel[] $values() {
            return new LogLevel[]{NONE, ERROR, DEBUG};
        }

        static {
            LogLevel[] logLevelArr$values = $values();
            $VALUES = logLevelArr$values;
            $ENTRIES = c.c(logLevelArr$values);
        }

        private LogLevel(String str, int i10) {
        }

        @NotNull
        public static kotlin.enums.a<LogLevel> getEntries() {
            return $ENTRIES;
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) $VALUES.clone();
        }
    }

    public static final class PublisherSignals {

        @NotNull
        public static final PublisherSignals INSTANCE = new PublisherSignals();

        @Nullable
        public final Map<String, Object> getPublisherSignals() {
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                G.o(strAccess$getTAG$p, "access$getTAG$p(...)");
                AbstractC3666o6.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot get publisher signals.");
                return null;
            }
            K9 k92 = K9.f152171a;
            k92.getClass();
            try {
                LinkedHashMap linkedHashMap = C3773w2.f153489a;
                Config configA = C3745u2.a("signals", C3657nb.b(), null);
                G.n(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
                SignalsConfig.PublisherConfig publisherConfig = ((SignalsConfig) configA).getPublisherConfig();
                if (!publisherConfig.getEnableMCO() && !publisherConfig.getEnableAB()) {
                    return n0.z();
                }
                return k92.a();
            } catch (Exception e10) {
                C3511d5 c3511d5 = C3511d5.f152815a;
                C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
                AbstractC3666o6.a((byte) 1, "PubSignalsStore", "Publisher signals could not be retrieved.");
                return n0.z();
            }
        }

        public final void putPublisherSignals(@Nullable Map<String, ? extends Object> map) {
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                G.o(strAccess$getTAG$p, "access$getTAG$p(...)");
                AbstractC3666o6.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot set publisher signals.");
                return;
            }
            if (map != null) {
                K9 k92 = K9.f152171a;
                k92.getClass();
                try {
                    LinkedHashMap linkedHashMap = C3773w2.f153489a;
                    Config configA = C3745u2.a("signals", C3657nb.b(), null);
                    G.n(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
                    SignalsConfig.PublisherConfig publisherConfig = ((SignalsConfig) configA).getPublisherConfig();
                    if (!publisherConfig.getEnableMCO() && !publisherConfig.getEnableAB()) {
                        AbstractC3666o6.a((byte) 1, "PubSignalsStore", "Publisher signals are disabled from InMobi");
                        return;
                    }
                    LinkedHashMap linkedHashMapA = k92.a();
                    G.p(linkedHashMapA, "<this>");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(linkedHashMapA);
                    linkedHashMap2.putAll(map);
                    JSONObject jSONObjectA = K9.a(K9.a(K9.a(linkedHashMap2, publisherConfig)), publisherConfig);
                    if (jSONObjectA != null) {
                        K9.a(jSONObjectA);
                    }
                } catch (Exception e10) {
                    C3511d5 c3511d5 = C3511d5.f152815a;
                    C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
                    AbstractC3666o6.a((byte) 1, "PubSignalsStore", "Publisher signals could not be saved.");
                }
            }
        }

        public final void resetPublisherSignals() {
            if (InMobiSdk.isSDKInitialized()) {
                K9.f152171a.getClass();
                K9.b();
            } else {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                G.o(strAccess$getTAG$p, "access$getTAG$p(...)");
                AbstractC3666o6.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot reset publisher signals.");
            }
        }
    }

    public static void a(final Context context, final String str, final JSONObject jSONObject, final SdkInitializationListener sdkInitializationListener) {
        Ib.a(new Runnable() { // from class: G5.a
            @Override // java.lang.Runnable
            public final void run() {
                InMobiSdk.a(context, sdkInitializationListener, str, jSONObject);
            }
        });
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return "InMobiSdk";
    }

    public static void b(final SdkInitializationListener sdkInitializationListener, final String str) {
        if (sdkInitializationListener != null) {
            Ib.a(new Runnable() { // from class: G5.b
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiSdk.c(sdkInitializationListener, str);
                }
            });
        }
        if (str != null) {
            AbstractC3666o6.a((byte) 1, "InMobiSdk", str);
            return;
        }
        StringBuilder sbA = O5.a("InMobiSdk", "TAG", "InMobi SDK initialized with account id: ");
        sbA.append(C3657nb.b());
        AbstractC3666o6.a((byte) 2, "InMobiSdk", sbA.toString());
    }

    public static final void c(SdkInitializationListener sdkInitializationListener, String str) {
        INSTANCE.a(sdkInitializationListener, str);
    }

    @o
    @Nullable
    public static final String getToken() {
        return getToken(null, null);
    }

    @o
    @NotNull
    public static final String getVersion() {
        return "10.8.0";
    }

    @o
    @e0
    public static final void init(@Nullable Context context, @Y(max = 36, min = 32) @Nullable String str, @Nullable JSONObject jSONObject, @Nullable SdkInitializationListener sdkInitializationListener) {
        INSTANCE.getClass();
        a(context, str, jSONObject, sdkInitializationListener);
    }

    @o
    public static final boolean isSDKInitialized() {
        return C3657nb.q();
    }

    @o
    public static final void setAge(int i10) {
        Context contextD = C3657nb.d();
        if (i10 != Integer.MIN_VALUE) {
            M9.f152231a = i10;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = K5.f152164b;
                J5.a(contextD, "user_info_store").a("user_age", i10);
            }
        }
    }

    @o
    public static final void setAgeGroup(@NotNull AgeGroup group) {
        G.p(group, "group");
        String string = group.toString();
        Locale locale = Locale.ENGLISH;
        String strA = C2650a.a(locale, "ENGLISH", string, locale, "this as java.lang.String).toLowerCase(locale)");
        Context contextD = C3657nb.d();
        M9.f152233c = strA;
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = K5.f152164b;
            J5.a(contextD, "user_info_store").a("user_age_group", strA);
        }
    }

    @o
    public static final void setApplicationMuted(boolean z10) {
        C3657nb.b(z10);
    }

    @o
    public static final void setAreaCode(@Nullable String str) {
        Context contextD = C3657nb.d();
        M9.f152234d = str;
        if (contextD == null || str == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = K5.f152164b;
        J5.a(contextD, "user_info_store").a("user_area_code", str);
    }

    @o
    public static final void setEducation(@NotNull Education education) {
        G.p(education, "education");
        String string = education.toString();
        Locale locale = Locale.ENGLISH;
        String strA = C2650a.a(locale, "ENGLISH", string, locale, "this as java.lang.String).toLowerCase(locale)");
        Context contextD = C3657nb.d();
        M9.f152241k = strA;
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = K5.f152164b;
            J5.a(contextD, "user_info_store").a("user_education", strA);
        }
    }

    @o
    public static final void setGender(@NotNull Gender gender) {
        G.p(gender, "gender");
        String string = gender.toString();
        Locale locale = Locale.ENGLISH;
        String strA = C2650a.a(locale, "ENGLISH", string, locale, "this as java.lang.String).toLowerCase(locale)");
        Context contextD = C3657nb.d();
        M9.f152240j = strA;
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = K5.f152164b;
            J5.a(contextD, "user_info_store").a("user_gender", strA);
        }
    }

    @o
    public static final void setInterests(@Nullable String str) {
        Context contextD = C3657nb.d();
        if (str != null) {
            M9.f152243m = str;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = K5.f152164b;
                J5.a(contextD, "user_info_store").a("user_interest", str);
            }
        }
    }

    @o
    public static final void setIsAgeRestricted(boolean z10) {
        M9.a(z10);
        C3672oc.f153249a.a(z10);
        if (z10) {
            InMobiUnifiedIdService.reset();
        }
    }

    @o
    public static final void setLanguage(@Nullable String str) {
        Context contextD = C3657nb.d();
        if (str != null) {
            M9.f152242l = str;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = K5.f152164b;
                J5.a(contextD, "user_info_store").a("user_language", str);
            }
        }
    }

    @o
    public static final void setLocation(@Nullable Location location) {
        Context contextD = C3657nb.d();
        if (location != null) {
            M9.f152244n = location;
            if (contextD != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(location.getLatitude());
                sb2.append(',');
                sb2.append(location.getLongitude());
                sb2.append(',');
                sb2.append((int) location.getAccuracy());
                sb2.append(',');
                sb2.append(location.getTime());
                String string = sb2.toString();
                ConcurrentHashMap concurrentHashMap = K5.f152164b;
                J5.a(contextD, "user_info_store").a("user_location", string);
            }
        }
    }

    @o
    public static final void setLocationWithCityStateCountry(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        Context contextD = C3657nb.d();
        if (str != null) {
            M9.f152236f = str;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = K5.f152164b;
                J5.a(contextD, "user_info_store").a("user_city_code", str);
            }
        }
        Context contextD2 = C3657nb.d();
        if (str2 != null) {
            M9.f152237g = str2;
            if (contextD2 != null) {
                ConcurrentHashMap concurrentHashMap2 = K5.f152164b;
                J5.a(contextD2, "user_info_store").a("user_state_code", str2);
            }
        }
        Context contextD3 = C3657nb.d();
        if (str3 != null) {
            M9.f152238h = str3;
            if (contextD3 != null) {
                ConcurrentHashMap concurrentHashMap3 = K5.f152164b;
                J5.a(contextD3, "user_info_store").a("user_country_code", str3);
            }
        }
    }

    @o
    public static final void setLogLevel(@Nullable LogLevel logLevel) {
        int i10 = logLevel == null ? -1 : a.f153698a[logLevel.ordinal()];
        if (i10 == 1) {
            AbstractC3666o6.a((byte) 0);
            return;
        }
        if (i10 == 2) {
            AbstractC3666o6.a((byte) 1);
        } else if (i10 != 3) {
            AbstractC3666o6.a((byte) 2);
        } else {
            AbstractC3666o6.a((byte) 2);
        }
    }

    @o
    public static final void setPartnerGDPRConsent(@Nullable JSONObject jSONObject) {
        Z3.c(jSONObject);
    }

    @o
    public static final void setPostalCode(@Nullable String str) {
        Context contextD = C3657nb.d();
        if (str != null) {
            M9.f152235e = str;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = K5.f152164b;
                J5.a(contextD, "user_info_store").a("user_post_code", str);
            }
        }
    }

    @o
    public static final void setPublisherProvidedUnifiedId(@Nullable JSONObject jSONObject) {
        Objects.toString(jSONObject);
        C3657nb.a(new U4(jSONObject));
    }

    @o
    public static final void setYearOfBirth(int i10) {
        Context contextD = C3657nb.d();
        if (i10 != Integer.MIN_VALUE) {
            M9.f152239i = i10;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = K5.f152164b;
                J5.a(contextD, "user_info_store").a("user_yob", i10);
            }
        }
    }

    @o
    public static final void updateGDPRConsent(@Nullable JSONObject jSONObject) {
        Z3.b(jSONObject);
    }

    public static final void a(final Context context, SdkInitializationListener sdkInitializationListener, String str, JSONObject jSONObject) {
        final SdkInitializationListener sdkInitializationListener2;
        if (context == null) {
            INSTANCE.getClass();
            b(sdkInitializationListener, SdkInitializationListener.MISSING_CONTEXT);
            return;
        }
        if (str == null) {
            INSTANCE.getClass();
            b(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Cb.f151825a.a();
        if (C3811yc.f153656a.c()) {
            INSTANCE.getClass();
            b(sdkInitializationListener, "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = G.t(str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        final String strA = R6.a(length, 1, str, i10);
        try {
            Z3.b(jSONObject);
            if (strA.length() == 0) {
                INSTANCE.getClass();
                b(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
                return;
            }
            if (!AbstractC3822z9.a(context, "android.permission.ACCESS_COARSE_LOCATION") && !AbstractC3822z9.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                AbstractC3666o6.a((byte) 1, "InMobiSdk", "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (C3657nb.q()) {
                INSTANCE.getClass();
                b(sdkInitializationListener, null);
                return;
            }
            C3657nb c3657nb = C3657nb.f153207a;
            if (c3657nb.i() == 1) {
                return;
            }
            if (!C3657nb.b(context, strA)) {
                c3657nb.s();
                INSTANCE.getClass();
                b(sdkInitializationListener, SdkInitializationListener.MISSING_WEBVIEW_DEPENDENCY);
                return;
            }
            C3811yc.f153656a.e(context);
            INSTANCE.getClass();
            a();
            sdkInitializationListener2 = sdkInitializationListener;
            try {
                C3657nb.a(new Runnable() { // from class: G5.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        InMobiSdk.a(context, strA, sdkInitializationListener2, jElapsedRealtime);
                    }
                });
            } catch (Exception unused) {
                C3657nb.f153207a.s();
                INSTANCE.getClass();
                b(sdkInitializationListener2, "SDK could not be initialized; an unexpected error was encountered.");
            }
        } catch (Exception unused2) {
            sdkInitializationListener2 = sdkInitializationListener;
        }
    }

    @o
    @e0
    @Nullable
    public static final String getToken(@Nullable Map<String, String> map, @Nullable String str) {
        return AbstractC3616kc.a(map, str);
    }

    public static final void b() {
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
        StringBuilder sb2 = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
        for (int i10 = 0; i10 < 4; i10++) {
            String str = strArr[i10];
            if (AbstractC3822z9.a(C3657nb.d(), str)) {
                sb2.append("\n");
                sb2.append(str);
            }
        }
        AbstractC3666o6.a((byte) 2, "InMobiSdk", sb2.toString());
    }

    public static final void a(Context context, String str, SdkInitializationListener sdkInitializationListener, long j10) {
        try {
            C3811yc c3811yc = C3811yc.f153656a;
            c3811yc.a(context);
            C3657nb c3657nb = C3657nb.f153207a;
            c3657nb.a();
            c3657nb.b(str);
            c3811yc.c(context);
            c3657nb.t();
            INSTANCE.getClass();
            b(sdkInitializationListener, null);
            LinkedHashMap linkedHashMapA = a(j10);
            Lb lb2 = Lb.f152196a;
            Lb.b("SdkInitialized", linkedHashMapA, Qb.f152402a);
            InMobiUnifiedIdService.push(null);
        } catch (Exception unused) {
            C3657nb.f153207a.s();
            INSTANCE.getClass();
            b(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
        }
    }

    public final void a(SdkInitializationListener sdkInitializationListener, String str) {
        sdkInitializationListener.onInitializationComplete(str == null ? null : new Error(str));
    }

    public static LinkedHashMap a(long j10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        Objects.toString(linkedHashMap.get("latency"));
        linkedHashMap.put("networkType", C3635m3.q());
        linkedHashMap.put("integrationType", "InMobi");
        return linkedHashMap;
    }

    public static void a() {
        C3657nb.a(new G5.c());
    }
}
