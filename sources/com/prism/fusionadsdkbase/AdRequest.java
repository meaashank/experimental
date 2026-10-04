package com.prism.fusionadsdkbase;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class AdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f162361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T6.a f162362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<String> f162363c;

    public static class Builder {
        T6.a adListener;
        String adid;
        ArrayList<String> testDevice;

        public AdRequest build() {
            AdRequest adRequest = new AdRequest();
            adRequest.f162361a = this.adid;
            adRequest.f162362b = this.adListener;
            adRequest.f162363c = this.testDevice;
            return adRequest;
        }

        public Builder setAdListener(T6.a aVar) {
            this.adListener = aVar;
            return this;
        }

        public Builder setAdid(String str) {
            this.adid = str;
            return this;
        }

        public Builder setTestDevice(ArrayList<String> arrayList) {
            this.testDevice = arrayList;
            return this;
        }
    }
}
