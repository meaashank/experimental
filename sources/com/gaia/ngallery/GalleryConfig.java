package com.gaia.ngallery;

import V5.c;
import Z5.a;
import android.content.Context;
import android.util.Pair;
import i5.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GalleryConfig {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f150313j = b.g(GalleryConfig.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f150314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f150316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f150317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f150318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f150319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.a f150320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<Pair<String, String>> f150321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList<Pair<String, String>> f150322i;

    public static final class Builder {
        private final Context appContext;
        private a bugReporter;
        private c.a eventLoggerFactory;
        private ArrayList<Pair<String, String>> mMainBoardBannerAdConfigs;
        private ArrayList<Pair<String, String>> mOpenAlbumInterstitialAdConfig;
        private String proVersionPkg;
        private String root;
        private boolean standAlone;
        private boolean useCloudStorage;

        public GalleryConfig build() {
            return new GalleryConfig(this);
        }

        public Builder setMainBoardBannerAdConfigs(List<Pair<String, String>> list) {
            b.a(GalleryConfig.f150313j, "gallery banner adsize=" + list.size());
            this.mMainBoardBannerAdConfigs = new ArrayList<>(list);
            return this;
        }

        public Builder setOpenAlbumInterstitialAdConfigs(ArrayList<Pair<String, String>> arrayList) {
            b.a(GalleryConfig.f150313j, "gallery banner adsize=" + arrayList.size());
            this.mOpenAlbumInterstitialAdConfig = new ArrayList<>(arrayList);
            return this;
        }

        public Builder setRoot(String str) {
            this.root = str;
            return this;
        }

        public Builder standAlone(boolean z10) {
            this.standAlone = z10;
            return this;
        }

        public Builder useCloudStorage(boolean z10) {
            this.useCloudStorage = z10;
            return this;
        }

        public Builder withBugReporter(a aVar) {
            this.bugReporter = aVar;
            return this;
        }

        public Builder withEventLoggerFactory(c.a aVar) {
            this.eventLoggerFactory = aVar;
            return this;
        }

        public Builder withProVersionPkg(String str) {
            this.proVersionPkg = str;
            return this;
        }

        private Builder(Context context) {
            this.standAlone = false;
            this.useCloudStorage = false;
            this.mMainBoardBannerAdConfigs = null;
            this.mOpenAlbumInterstitialAdConfig = null;
            this.appContext = context;
        }
    }

    public static Builder i(Context context) {
        return new Builder(context);
    }

    public String b() {
        return this.f150315b;
    }

    public Context c() {
        return this.f150314a;
    }

    public a d() {
        return this.f150319f;
    }

    public c.a e() {
        return this.f150320g;
    }

    public String f() {
        return this.f150318e;
    }

    public boolean g() {
        return this.f150316c;
    }

    public boolean h() {
        return this.f150317d;
    }

    public GalleryConfig(Builder builder) {
        this.f150314a = builder.appContext;
        this.f150315b = builder.root;
        this.f150316c = builder.standAlone;
        this.f150317d = builder.useCloudStorage;
        this.f150318e = builder.proVersionPkg;
        this.f150319f = builder.bugReporter;
        this.f150320g = builder.eventLoggerFactory;
        this.f150321h = builder.mMainBoardBannerAdConfigs;
        this.f150322i = builder.mOpenAlbumInterstitialAdConfig;
    }
}
