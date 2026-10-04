package com.google.ads.mediation.pangle;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public class PangleExtras {

    public static class Builder {
        private String userData;

        public Bundle build() {
            Bundle bundle = new Bundle();
            bundle.putString("user_data", this.userData);
            return bundle;
        }

        public Builder setUserData(String str) {
            this.userData = str;
            return this;
        }
    }

    public static class Keys {
        static final String USER_DATA = "user_data";
    }
}
