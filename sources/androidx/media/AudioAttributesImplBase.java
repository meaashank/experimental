package androidx.media;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f114477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114480d;

    public AudioAttributesImplBase() {
        this.f114477a = 0;
        this.f114478b = 0;
        this.f114479c = 0;
        this.f114480d = -1;
    }

    public static AudioAttributesImpl f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new AudioAttributesImplBase(bundle.getInt(AudioAttributesCompat.f114440S, 0), bundle.getInt(AudioAttributesCompat.f114441T, 0), bundle.getInt(AudioAttributesCompat.f114439R, 0), bundle.getInt(AudioAttributesCompat.f114442U, -1));
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i10 = this.f114480d;
        return i10 != -1 ? i10 : AudioAttributesCompat.h(false, this.f114479c, this.f114477a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int b() {
        return this.f114480d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int c() {
        return this.f114477a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int d() {
        return AudioAttributesCompat.h(true, this.f114479c, this.f114477a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f114478b == audioAttributesImplBase.getContentType() && this.f114479c == audioAttributesImplBase.getFlags() && this.f114477a == audioAttributesImplBase.c() && this.f114480d == audioAttributesImplBase.f114480d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f114478b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        int i10 = this.f114479c;
        int iA = a();
        if (iA == 6) {
            i10 |= 4;
        } else if (iA == 7) {
            i10 |= 1;
        }
        return i10 & AudioAttributesCompat.f114436O;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f114478b), Integer.valueOf(this.f114479c), Integer.valueOf(this.f114477a), Integer.valueOf(this.f114480d)});
    }

    @Override // androidx.media.AudioAttributesImpl
    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AudioAttributesCompat.f114439R, this.f114477a);
        bundle.putInt(AudioAttributesCompat.f114440S, this.f114478b);
        bundle.putInt(AudioAttributesCompat.f114441T, this.f114479c);
        int i10 = this.f114480d;
        if (i10 != -1) {
            bundle.putInt(AudioAttributesCompat.f114442U, i10);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f114480d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f114480d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.l(this.f114477a));
        sb2.append(" content=");
        sb2.append(this.f114478b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f114479c).toUpperCase());
        return sb2.toString();
    }

    public AudioAttributesImplBase(int i10, int i11, int i12, int i13) {
        this.f114478b = i10;
        this.f114479c = i11;
        this.f114477a = i12;
        this.f114480d = i13;
    }
}
