package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f114473c = "AudioAttributesCompat21";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f114474d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f114475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114476b;

    public AudioAttributesImplApi21() {
        this.f114476b = -1;
    }

    public static AudioAttributesImpl f(Bundle bundle) {
        AudioAttributes audioAttributes;
        if (bundle == null || (audioAttributes = (AudioAttributes) bundle.getParcelable(AudioAttributesCompat.f114438Q)) == null) {
            return null;
        }
        return new AudioAttributesImplApi21(audioAttributes, bundle.getInt(AudioAttributesCompat.f114442U, -1));
    }

    public static Method g() {
        try {
            if (f114474d == null) {
                f114474d = AudioAttributes.class.getMethod("toLegacyStreamType", AudioAttributes.class);
            }
            return f114474d;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i10 = this.f114476b;
        if (i10 != -1) {
            return i10;
        }
        Method methodG = g();
        if (methodG == null) {
            Log.w(f114473c, "No AudioAttributes#toLegacyStreamType() on API: " + Build.VERSION.SDK_INT);
            return -1;
        }
        try {
            return ((Integer) methodG.invoke(null, this.f114475a)).intValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            Log.w(f114473c, "getLegacyStreamType() failed on API: " + Build.VERSION.SDK_INT, e10);
            return -1;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public int b() {
        return this.f114476b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int c() {
        return this.f114475a.getUsage();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int d() {
        return Build.VERSION.SDK_INT >= 26 ? this.f114475a.getVolumeControlStream() : AudioAttributesCompat.h(true, getFlags(), c());
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object e() {
        return this.f114475a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f114475a.equals(((AudioAttributesImplApi21) obj).f114475a);
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f114475a.getContentType();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        return this.f114475a.getFlags();
    }

    public int hashCode() {
        return this.f114475a.hashCode();
    }

    @Override // androidx.media.AudioAttributesImpl
    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(AudioAttributesCompat.f114438Q, this.f114475a);
        int i10 = this.f114476b;
        if (i10 != -1) {
            bundle.putInt(AudioAttributesCompat.f114442U, i10);
        }
        return bundle;
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f114475a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f114475a = audioAttributes;
        this.f114476b = i10;
    }
}
