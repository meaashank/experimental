package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.N0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesCompat implements C2.f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f114422A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static boolean f114423B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f114424C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f114425D = 1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f114426E = 2;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f114427F = 4;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f114428G = 8;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f114429H = 16;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f114430I = 32;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f114431J = 64;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f114432K = 128;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f114433L = 256;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f114434M = 512;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f114435N = 1023;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f114436O = 273;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f114437P = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f114438Q = "androidx.media.audio_attrs.FRAMEWORKS";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f114439R = "androidx.media.audio_attrs.USAGE";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f114440S = "androidx.media.audio_attrs.CONTENT_TYPE";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final String f114441T = "androidx.media.audio_attrs.FLAGS";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f114442U = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f114443b = "AudioAttributesCompat";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f114444c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f114445d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f114446e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f114447f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f114448g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f114449h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f114450i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f114451j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f114452k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f114453l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f114454m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f114455n = 6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f114456o = 7;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f114457p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f114458q = 9;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f114459r = 10;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f114460s = 11;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f114461t = 12;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f114462u = 13;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f114463v = 14;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f114464w = 15;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f114465x = 16;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f114466y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f114467z = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f114468a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface b {
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f114469a = 6;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f114470b = 7;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f114471c = 9;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f114472d = 10;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f114422A = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f114424C = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static AudioAttributesCompat f(Bundle bundle) {
        AudioAttributesImpl audioAttributesImplF = AudioAttributesImplApi21.f(bundle);
        if (audioAttributesImplF == null) {
            return null;
        }
        return new AudioAttributesCompat(audioAttributesImplF);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void g(boolean z10) {
        f114423B = z10;
    }

    public static int h(boolean z10, int i10, int i11) {
        if ((i10 & 1) == 1) {
            return z10 ? 1 : 7;
        }
        if ((i10 & 4) == 4) {
            return z10 ? 0 : 6;
        }
        switch (i11) {
            case 0:
                return z10 ? Integer.MIN_VALUE : 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z10 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (z10) {
                    throw new IllegalArgumentException(N0.a("Unknown usage value ", i11, " in audio attributes"));
                }
                return 3;
        }
    }

    public static int i(boolean z10, AudioAttributesCompat audioAttributesCompat) {
        return h(z10, audioAttributesCompat.getFlags(), audioAttributesCompat.c());
    }

    public static int k(int i10) {
        switch (i10) {
        }
        return 2;
    }

    public static String l(int i10) {
        switch (i10) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return android.support.v4.media.c.a("unknown usage ", i10);
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    @Nullable
    public static AudioAttributesCompat m(@NonNull Object obj) {
        if (f114423B) {
            return null;
        }
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21((AudioAttributes) obj, -1);
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f114468a = audioAttributesImplApi21;
        return audioAttributesCompat;
    }

    public int a() {
        return this.f114468a.a();
    }

    public int b() {
        return this.f114468a.b();
    }

    public int c() {
        return this.f114468a.c();
    }

    public int d() {
        return this.f114468a.d();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f114468a;
        return audioAttributesImpl == null ? audioAttributesCompat.f114468a == null : audioAttributesImpl.equals(audioAttributesCompat.f114468a);
    }

    public int getContentType() {
        return this.f114468a.getContentType();
    }

    public int getFlags() {
        return this.f114468a.getFlags();
    }

    public int hashCode() {
        return this.f114468a.hashCode();
    }

    @Nullable
    public Object j() {
        return this.f114468a.e();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Bundle toBundle() {
        return this.f114468a.toBundle();
    }

    public String toString() {
        return this.f114468a.toString();
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f114468a = audioAttributesImpl;
    }

    public static class Builder {
        private int mContentType;
        private int mFlags;
        private int mLegacyStream;
        private int mUsage;

        public Builder() {
            this.mUsage = 0;
            this.mContentType = 0;
            this.mFlags = 0;
            this.mLegacyStream = -1;
        }

        public AudioAttributesCompat build() {
            AudioAttributesImpl audioAttributesImplBase;
            if (AudioAttributesCompat.f114423B) {
                audioAttributesImplBase = new AudioAttributesImplBase(this.mContentType, this.mFlags, this.mUsage, this.mLegacyStream);
            } else {
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.mContentType).setFlags(this.mFlags).setUsage(this.mUsage);
                int i10 = this.mLegacyStream;
                if (i10 != -1) {
                    usage.setLegacyStreamType(i10);
                }
                audioAttributesImplBase = new AudioAttributesImplApi21(usage.build(), this.mLegacyStream);
            }
            return new AudioAttributesCompat(audioAttributesImplBase);
        }

        public Builder setContentType(int i10) {
            if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                this.mContentType = i10;
                return this;
            }
            this.mUsage = 0;
            return this;
        }

        public Builder setFlags(int i10) {
            this.mFlags = (i10 & 1023) | this.mFlags;
            return this;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public Builder setInternalLegacyStreamType(int i10) {
            switch (i10) {
                case 0:
                    this.mContentType = 1;
                    break;
                case 1:
                    this.mContentType = 4;
                    break;
                case 2:
                    this.mContentType = 4;
                    break;
                case 3:
                    this.mContentType = 2;
                    break;
                case 4:
                    this.mContentType = 4;
                    break;
                case 5:
                    this.mContentType = 4;
                    break;
                case 6:
                    this.mContentType = 1;
                    this.mFlags |= 4;
                    break;
                case 7:
                    this.mFlags = 1 | this.mFlags;
                    this.mContentType = 4;
                    break;
                case 8:
                    this.mContentType = 4;
                    break;
                case 9:
                    this.mContentType = 4;
                    break;
                case 10:
                    this.mContentType = 1;
                    break;
                default:
                    Log.e(AudioAttributesCompat.f114443b, "Invalid stream type " + i10 + " for AudioAttributesCompat");
                    break;
            }
            this.mUsage = AudioAttributesCompat.k(i10);
            return this;
        }

        public Builder setLegacyStreamType(int i10) {
            if (i10 == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.mLegacyStream = i10;
            return setInternalLegacyStreamType(i10);
        }

        public Builder setUsage(int i10) {
            switch (i10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.mUsage = i10;
                    break;
                case 16:
                    if (!AudioAttributesCompat.f114423B && Build.VERSION.SDK_INT > 25) {
                        this.mUsage = i10;
                    } else {
                        this.mUsage = 12;
                    }
                    break;
                default:
                    this.mUsage = 0;
                    break;
            }
            return this;
        }

        public Builder(AudioAttributesCompat audioAttributesCompat) {
            this.mUsage = 0;
            this.mContentType = 0;
            this.mFlags = 0;
            this.mLegacyStream = -1;
            this.mUsage = audioAttributesCompat.c();
            this.mContentType = audioAttributesCompat.getContentType();
            this.mFlags = audioAttributesCompat.getFlags();
            this.mLegacyStream = audioAttributesCompat.b();
        }
    }
}
