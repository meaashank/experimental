package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f151310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f151311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f151312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f151313d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f151310a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.f151311b = view.getClass().getCanonicalName();
        this.f151312c = friendlyObstructionPurpose;
        this.f151313d = str;
    }

    public String a() {
        return this.f151313d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f151312c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f151310a;
    }

    public String d() {
        return this.f151311b;
    }
}
