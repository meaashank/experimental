package com.prism.bugreport.commons;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public class Bug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f161956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f161957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f161958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ParcelableException f161959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f161960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f161961f = "";

    public static class Builder {
        private ParcelableException exception;
        private String type;
        private String pkgName = "DEFAULT";
        private String processName = "DEFAULT";
        private Bundle bundle = new Bundle();

        public Bug build() {
            String str = this.type;
            if (str == null) {
                throw new IllegalStateException("Bug type can not be null");
            }
            ParcelableException parcelableException = this.exception;
            if (parcelableException != null) {
                return new Bug(parcelableException, this.pkgName, this.processName, str, this.bundle);
            }
            throw new IllegalStateException("Bug exception can not be null");
        }

        public Builder withException(Throwable th) {
            this.exception = new ParcelableException(th);
            return this;
        }

        public Builder withPackageName(Context context) {
            this.pkgName = context.getPackageName();
            return this;
        }

        public Builder withProcessName(String str) {
            this.processName = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }

        public Builder withPackageName(String str) {
            this.pkgName = str;
            return this;
        }
    }

    public Bug(ParcelableException parcelableException, String str, String str2, String str3, Bundle bundle) {
        this.f161959d = parcelableException;
        this.f161956a = str;
        this.f161958c = str2;
        this.f161957b = str3;
        this.f161960e = bundle;
    }
}
