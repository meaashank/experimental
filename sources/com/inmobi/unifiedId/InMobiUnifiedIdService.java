package com.inmobi.unifiedId;

import H5.a;
import android.content.Context;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.media.AbstractC3469a5;
import com.inmobi.media.AbstractC3727sc;
import com.inmobi.media.AbstractC3755uc;
import com.inmobi.media.C3538f4;
import com.inmobi.media.C3657nb;
import com.inmobi.media.C3672oc;
import com.inmobi.media.C3773w2;
import com.inmobi.media.D4;
import com.inmobi.media.J5;
import com.inmobi.media.K5;
import com.inmobi.media.Lb;
import com.inmobi.media.M9;
import com.inmobi.media.Qb;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import dd.o;
import e.f0;
import e.g0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class InMobiUnifiedIdService {

    @NotNull
    public static final InMobiUnifiedIdService INSTANCE = new InMobiUnifiedIdService();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f153700a = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.inmobi.unifiedId.InMobiUnifiedIdInterface r14) {
        /*
            org.json.JSONObject r0 = com.inmobi.media.AbstractC3469a5.b()
            r1 = 0
            java.lang.String r2 = "ufids"
            if (r0 != 0) goto Lb
            goto L6d
        Lb:
            boolean r3 = r0.has(r2)     // Catch: org.json.JSONException -> L6d
            if (r3 == 0) goto L16
            org.json.JSONArray r3 = r0.getJSONArray(r2)     // Catch: org.json.JSONException -> L6d
            goto L17
        L16:
            r3 = r1
        L17:
            if (r3 == 0) goto L6d
            int r3 = r3.length()
            if (r3 != 0) goto L20
            goto L6d
        L20:
            r3 = 1
            boolean r4 = r0.has(r2)     // Catch: org.json.JSONException -> L51
            if (r4 == 0) goto L54
            org.json.JSONArray r4 = r0.getJSONArray(r2)     // Catch: org.json.JSONException -> L51
            int r5 = r4.length()     // Catch: org.json.JSONException -> L51
            r6 = 0
            r8 = r3
            r7 = r6
        L32:
            if (r7 >= r5) goto L4f
            org.json.JSONObject r9 = r4.getJSONObject(r7)     // Catch: org.json.JSONException -> L4d
            long r10 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L4d
            java.lang.String r12 = "expiry"
            long r12 = r9.getLong(r12)     // Catch: org.json.JSONException -> L4d
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 > 0) goto L48
            r9 = r3
            goto L49
        L48:
            r9 = r6
        L49:
            r8 = r8 & r9
            int r7 = r7 + 1
            goto L32
        L4d:
            r3 = r8
            goto L51
        L4f:
            r3 = r8
            goto L54
        L51:
            java.util.Objects.toString(r0)
        L54:
            if (r3 != 0) goto L6d
            org.json.JSONObject r0 = com.inmobi.media.AbstractC3727sc.f153367a
            if (r14 == 0) goto L5f
            java.util.LinkedHashSet r0 = com.inmobi.media.AbstractC3727sc.f153368b
            r0.add(r14)
        L5f:
            boolean r0 = com.inmobi.media.AbstractC3727sc.b()
            if (r0 == 0) goto L69
            java.util.Objects.toString(r14)
            goto Lb0
        L69:
            com.inmobi.media.AbstractC3727sc.d()
            goto Lb0
        L6d:
            if (r14 == 0) goto Lb0
            if (r0 != 0) goto L72
            goto L8b
        L72:
            boolean r3 = r0.has(r2)     // Catch: org.json.JSONException -> L8b
            if (r3 == 0) goto L7d
            org.json.JSONArray r2 = r0.getJSONArray(r2)     // Catch: org.json.JSONException -> L8b
            goto L7e
        L7d:
            r2 = r1
        L7e:
            if (r2 == 0) goto L8b
            int r2 = r2.length()
            if (r2 != 0) goto L87
            goto L8b
        L87:
            com.inmobi.media.AbstractC3755uc.a(r14, r0, r1)
            goto Lb0
        L8b:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.inmobi.unifiedId.InMobiUnifiedIdService.f153700a
            boolean r0 = r0.get()
            if (r0 == 0) goto La6
            java.util.LinkedHashSet r0 = com.inmobi.media.AbstractC3727sc.f153368b
            r0.add(r14)
            boolean r0 = com.inmobi.media.AbstractC3727sc.b()
            if (r0 == 0) goto La2
            java.util.Objects.toString(r14)
            goto Lb0
        La2:
            com.inmobi.media.AbstractC3727sc.d()
            goto Lb0
        La6:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r2 = "Push api needs to called prior to fetch"
            r0.<init>(r2)
            com.inmobi.media.AbstractC3755uc.a(r14, r1, r0)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.a(com.inmobi.unifiedId.InMobiUnifiedIdInterface):void");
    }

    public static final void b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        fetchUnifiedIdsInternal$media_release(inMobiUnifiedIdInterface);
    }

    @o
    public static final void fetchUnifiedIds(@Nullable final InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        if (!C3657nb.q()) {
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
        C3657nb.a(new Runnable() { // from class: H5.c
            @Override // java.lang.Runnable
            public final void run() {
                InMobiUnifiedIdService.b(inMobiUnifiedIdInterface);
            }
        });
    }

    @o
    @g0
    public static final void fetchUnifiedIdsInternal$media_release(@Nullable InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        boolean zBooleanValue;
        HashMap map = new HashMap();
        Lb lb2 = Lb.f152196a;
        Lb.b("FetchApiInvoked", map, Qb.f152402a);
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        boolean zIsEnabled = ((SignalsConfig) D4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getUnifiedIdServiceConfig().isEnabled();
        if (!zIsEnabled) {
            reset();
        }
        if (!zIsEnabled) {
            AbstractC3755uc.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.UNIFIED_SERVICE_IS_NOT_ENABLED));
            return;
        }
        Boolean boolC = C3672oc.f153249a.c();
        boolean zBooleanValue2 = boolC != null ? boolC.booleanValue() : true;
        if (zBooleanValue2) {
            reset();
        }
        if (zBooleanValue2) {
            AbstractC3755uc.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_OPTED_OUT));
            return;
        }
        Boolean bool = M9.f152232b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context contextD = C3657nb.d();
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = K5.f152164b;
                M9.f152232b = Boolean.valueOf(J5.a(contextD, "user_info_store").f152165a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = M9.f152232b;
            zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (zBooleanValue) {
            AbstractC3755uc.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_AGE_RESTRICTION));
            return;
        }
        synchronized (AbstractC3727sc.class) {
            try {
                if (AbstractC3727sc.b()) {
                    if (inMobiUnifiedIdInterface != null) {
                        AbstractC3727sc.f153368b.add(inMobiUnifiedIdInterface);
                    }
                    if (AbstractC3727sc.b()) {
                        Objects.toString(inMobiUnifiedIdInterface);
                    } else {
                        AbstractC3727sc.d();
                    }
                } else {
                    a(inMobiUnifiedIdInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @f0(otherwise = 5)
    public static /* synthetic */ void isPushCalled$annotations() {
    }

    @o
    public static final void push(@Nullable final InMobiUserDataModel inMobiUserDataModel) {
        Objects.toString(inMobiUserDataModel);
        if (!C3657nb.q()) {
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
        C3657nb.a(new Runnable() { // from class: H5.b
            @Override // java.lang.Runnable
            public final void run() {
                InMobiUnifiedIdService.a(inMobiUserDataModel);
            }
        });
    }

    @o
    public static final void reset() {
        if (!C3657nb.q()) {
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
        C3657nb.a(new a());
    }

    @NotNull
    public final AtomicBoolean isPushCalled() {
        return f153700a;
    }

    public static final void a(InMobiUserDataModel inMobiUserDataModel) {
        boolean zBooleanValue;
        InMobiUserDataModel inMobiUserDataModel2;
        Objects.toString(inMobiUserDataModel);
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        boolean zIsEnabled = ((SignalsConfig) D4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getUnifiedIdServiceConfig().isEnabled();
        if (!zIsEnabled) {
            reset();
        }
        if (zIsEnabled) {
            Boolean boolC = C3672oc.f153249a.c();
            boolean zBooleanValue2 = boolC != null ? boolC.booleanValue() : true;
            if (zBooleanValue2) {
                reset();
            }
            if (zBooleanValue2) {
                return;
            }
            Boolean bool = M9.f152232b;
            boolean zEquals = false;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                Context contextD = C3657nb.d();
                if (contextD != null) {
                    ConcurrentHashMap concurrentHashMap = K5.f152164b;
                    M9.f152232b = Boolean.valueOf(J5.a(contextD, "user_info_store").f152165a.getBoolean("user_age_restricted", false));
                }
                Boolean bool2 = M9.f152232b;
                zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
            }
            if (zBooleanValue) {
                return;
            }
            if (inMobiUserDataModel == null && C3538f4.f152909a == null) {
                zEquals = true;
            } else if (inMobiUserDataModel != null && (inMobiUserDataModel2 = C3538f4.f152909a) != null) {
                zEquals = inMobiUserDataModel.equals(inMobiUserDataModel2);
            }
            if (zEquals && f153700a.get()) {
                return;
            }
            synchronized (C3538f4.class) {
                Objects.toString(C3538f4.f152909a);
                Objects.toString(inMobiUserDataModel);
                C3538f4.f152909a = inMobiUserDataModel;
            }
            f153700a.set(true);
            AbstractC3727sc.c();
        }
    }

    public static final void a() {
        f153700a.set(false);
        synchronized (C3538f4.class) {
            Objects.toString(C3538f4.f152909a);
            C3538f4.f152909a = null;
        }
        AbstractC3727sc.e();
        AbstractC3469a5.b(null);
        AbstractC3469a5.a(null);
        AbstractC3469a5.f152689d = false;
        AbstractC3469a5.f152688c = false;
    }
}
