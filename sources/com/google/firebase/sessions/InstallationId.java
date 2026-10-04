package com.google.firebase.sessions;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class InstallationId {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "InstallationId";

    @NotNull
    private final String authToken;

    @NotNull
    private final String fid;

    public static final class Companion {
        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
        
            if (r11 == r1) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r10v0, types: [com.google.firebase.installations.FirebaseInstallationsApi, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v1 */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v16 */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v18 */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5, types: [com.google.firebase.installations.FirebaseInstallationsApi] */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object create(@org.jetbrains.annotations.NotNull com.google.firebase.installations.FirebaseInstallationsApi r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super com.google.firebase.sessions.InstallationId> r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.google.firebase.sessions.InstallationId$Companion$create$1
                if (r0 == 0) goto L13
                r0 = r11
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = (com.google.firebase.sessions.InstallationId$Companion$create$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = new com.google.firebase.sessions.InstallationId$Companion$create$1
                r0.<init>(r9, r11)
            L18:
                java.lang.Object r11 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                java.lang.String r3 = ""
                java.lang.String r4 = "InstallationId"
                r5 = 2
                r6 = 1
                r7 = 0
                if (r2 == 0) goto L47
                if (r2 == r6) goto L3d
                if (r2 != r5) goto L35
                java.lang.Object r10 = r0.L$0
                java.lang.String r10 = (java.lang.String) r10
                kotlin.C4885d0.n(r11)     // Catch: java.lang.Exception -> L33
                goto L89
            L33:
                r11 = move-exception
                goto L92
            L35:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L3d:
                java.lang.Object r10 = r0.L$0
                com.google.firebase.installations.FirebaseInstallationsApi r10 = (com.google.firebase.installations.FirebaseInstallationsApi) r10
                kotlin.C4885d0.n(r11)     // Catch: java.lang.Exception -> L45
                goto L5f
            L45:
                r11 = move-exception
                goto L6e
            L47:
                kotlin.C4885d0.n(r11)
                r11 = 0
                com.google.android.gms.tasks.Task r11 = r10.getToken(r11)     // Catch: java.lang.Exception -> L45
                java.lang.String r2 = "firebaseInstallations.getToken(false)"
                kotlin.jvm.internal.G.o(r11, r2)     // Catch: java.lang.Exception -> L45
                r0.L$0 = r10     // Catch: java.lang.Exception -> L45
                r0.label = r6     // Catch: java.lang.Exception -> L45
                java.lang.Object r11 = kotlinx.coroutines.tasks.TasksKt.j(r11, r7, r0)     // Catch: java.lang.Exception -> L45
                if (r11 != r1) goto L5f
                goto L88
            L5f:
                com.google.firebase.installations.InstallationTokenResult r11 = (com.google.firebase.installations.InstallationTokenResult) r11     // Catch: java.lang.Exception -> L45
                java.lang.String r11 = r11.getToken()     // Catch: java.lang.Exception -> L45
                java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
                kotlin.jvm.internal.G.o(r11, r2)     // Catch: java.lang.Exception -> L45
                r8 = r11
                r11 = r10
                r10 = r8
                goto L75
            L6e:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r4, r2, r11)
                r11 = r10
                r10 = r3
            L75:
                com.google.android.gms.tasks.Task r11 = r11.getId()     // Catch: java.lang.Exception -> L33
                java.lang.String r2 = "firebaseInstallations.id"
                kotlin.jvm.internal.G.o(r11, r2)     // Catch: java.lang.Exception -> L33
                r0.L$0 = r10     // Catch: java.lang.Exception -> L33
                r0.label = r5     // Catch: java.lang.Exception -> L33
                java.lang.Object r11 = kotlinx.coroutines.tasks.TasksKt.j(r11, r7, r0)     // Catch: java.lang.Exception -> L33
                if (r11 != r1) goto L89
            L88:
                return r1
            L89:
                java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
                kotlin.jvm.internal.G.o(r11, r0)     // Catch: java.lang.Exception -> L33
                java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Exception -> L33
                r3 = r11
                goto L97
            L92:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r4, r0, r11)
            L97:
                com.google.firebase.sessions.InstallationId r11 = new com.google.firebase.sessions.InstallationId
                r11.<init>(r3, r10, r7)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.InstallationId.Companion.create(com.google.firebase.installations.FirebaseInstallationsApi, kotlin.coroutines.e):java.lang.Object");
        }

        private Companion() {
        }
    }

    public /* synthetic */ InstallationId(String str, String str2, C4969v c4969v) {
        this(str, str2);
    }

    @NotNull
    public final String getAuthToken() {
        return this.authToken;
    }

    @NotNull
    public final String getFid() {
        return this.fid;
    }

    private InstallationId(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }
}
