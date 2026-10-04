package com.google.firebase.crashlytics.internal.common;

import androidx.compose.runtime.R0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseInstallationId {

    @Nullable
    private final String authToken;

    @Nullable
    private final String fid;

    public FirebaseInstallationId(@Nullable String str, @Nullable String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    public static /* synthetic */ FirebaseInstallationId copy$default(FirebaseInstallationId firebaseInstallationId, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = firebaseInstallationId.fid;
        }
        if ((i10 & 2) != 0) {
            str2 = firebaseInstallationId.authToken;
        }
        return firebaseInstallationId.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.fid;
    }

    @Nullable
    public final String component2() {
        return this.authToken;
    }

    @NotNull
    public final FirebaseInstallationId copy(@Nullable String str, @Nullable String str2) {
        return new FirebaseInstallationId(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseInstallationId)) {
            return false;
        }
        FirebaseInstallationId firebaseInstallationId = (FirebaseInstallationId) obj;
        return G.g(this.fid, firebaseInstallationId.fid) && G.g(this.authToken, firebaseInstallationId.authToken);
    }

    @Nullable
    public final String getAuthToken() {
        return this.authToken;
    }

    @Nullable
    public final String getFid() {
        return this.fid;
    }

    public int hashCode() {
        String str = this.fid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authToken;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.fid);
        sb2.append(", authToken=");
        return R0.a(sb2, this.authToken, ')');
    }
}
