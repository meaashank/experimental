package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.weakreference.a f151568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f151569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f151570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f151571d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f151568a = new com.iab.omid.library.mmadbridge.weakreference.a(view);
        this.f151569b = view.getClass().getCanonicalName();
        this.f151570c = friendlyObstructionPurpose;
        this.f151571d = str;
    }

    public String a() {
        return this.f151571d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f151570c;
    }

    public com.iab.omid.library.mmadbridge.weakreference.a c() {
        return this.f151568a;
    }

    public String d() {
        return this.f151569b;
    }
}
