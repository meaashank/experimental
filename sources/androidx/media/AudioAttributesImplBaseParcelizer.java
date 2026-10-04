package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f114477a = versionedParcel.M(audioAttributesImplBase.f114477a, 1);
        audioAttributesImplBase.f114478b = versionedParcel.M(audioAttributesImplBase.f114478b, 2);
        audioAttributesImplBase.f114479c = versionedParcel.M(audioAttributesImplBase.f114479c, 3);
        audioAttributesImplBase.f114480d = versionedParcel.M(audioAttributesImplBase.f114480d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.j0(false, false);
        versionedParcel.M0(audioAttributesImplBase.f114477a, 1);
        versionedParcel.M0(audioAttributesImplBase.f114478b, 2);
        versionedParcel.M0(audioAttributesImplBase.f114479c, 3);
        versionedParcel.M0(audioAttributesImplBase.f114480d, 4);
    }
}
