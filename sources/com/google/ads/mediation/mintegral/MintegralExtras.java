package com.google.ads.mediation.mintegral;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MintegralExtras {

    public static class Builder {
        private boolean muteAudio;

        @NonNull
        public Bundle build() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("mute_audio", this.muteAudio);
            return bundle;
        }

        @NonNull
        public Builder setMuteAudio(boolean z10) {
            this.muteAudio = z10;
            return this;
        }
    }

    public static class Keys {
        static final String MUTE_AUDIO = "mute_audio";
    }
}
