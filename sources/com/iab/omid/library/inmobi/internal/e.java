package com.iab.omid.library.inmobi.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.weakreference.a f151439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f151440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f151441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f151442d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f151439a = new com.iab.omid.library.inmobi.weakreference.a(view);
        this.f151440b = view.getClass().getCanonicalName();
        this.f151441c = friendlyObstructionPurpose;
        this.f151442d = str;
    }

    public String a() {
        return this.f151442d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f151441c;
    }

    public com.iab.omid.library.inmobi.weakreference.a c() {
        return this.f151439a;
    }

    public String d() {
        return this.f151440b;
    }
}
